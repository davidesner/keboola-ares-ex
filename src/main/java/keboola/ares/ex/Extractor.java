/*
 */
package keboola.ares.ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import cz.ares.basic.AresOdpovedi;
import cz.ares.basic.Nace2;
import cz.ares.basic.OboryCinnosti2;
import keboola.ares.ex.beans.AresInfoBasicRowBean;
import keboola.ares.ex.beans.AresInfoNaceRowBean;
import keboola.ares.ex.beans.AresInfoNaceRowBeanList;
import keboola.ares.ex.beans.AresInfoOborRowBean;
import keboola.ares.ex.beans.AresInfoOborRowBeanList;
import keboola.ares.ex.client.ARESGetClient;
import keboola.ares.ex.client.ClientException;
import keboola.ares.ex.config.JsonConfigParser;
import keboola.ares.ex.config.KBCConfig;
import keboola.ares.ex.config.YamlConfigParser;
import keboola.ares.ex.config.tableconfig.ManifestBuilder;
import keboola.ares.ex.config.tableconfig.ManifestFile;
import keboola.ares.ex.config.tableconfig.ManifestParser;
import keboola.ares.ex.state.JsonStateWriter;
import keboola.ares.ex.state.LastState;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2016
 */
public class Extractor {

    private static final int REQUEST_LIMIT_DAY = 900;
    private static final int REQUEST_LIMIT_NIGHT = 4500;
    private static final long REQUEST_SLEEP_INTERVAL = 2000;
    private static final List<String> ALLOWED_PROJECTS = Arrays.asList(new String[]{"1124", "395", "1047", "1048", "2440", "2855", "646"});

    private static int getRequestLimitByDate() {
        Calendar currDate = Calendar.getInstance(TimeZone.getTimeZone("Europe/Prague"));
        if (currDate.get(Calendar.HOUR_OF_DAY) <= 18 && currDate.get(Calendar.HOUR_OF_DAY) >= 8) {
            return REQUEST_LIMIT_DAY;
        } else {
            return REQUEST_LIMIT_NIGHT;
        }
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.print("No parameters provided.");
            System.exit(1);
        }
        /*Check if allowed project*/
        Map<String, String> env = System.getenv();
        String pr = env.get("KBC_PROJECTID");
        if (!ALLOWED_PROJECTS.contains(pr)) {
            System.err.println("The KBC project is not allowed to use this extractor!");
            System.exit(1);
        }
        String dataPath = args[0];
        String outTablesPath = dataPath + File.separator + "out" + File.separator + "tables";
        String inTablesPath = dataPath + File.separator + "in" + File.separator + "tables"; //parse config
        KBCConfig config = null;
        File confFile = new File(args[0] + File.separator + "config.json");
        if (!confFile.exists()) {
            System.out.println("config.json does not exist!");
            System.err.println("config.json does not exist!");
            System.exit(1);
        }
        //Parse config file
        try {
            if (confFile.exists() && !confFile.isDirectory()) {
                config = JsonConfigParser.parseFile(confFile);
            }
        } catch (Exception ex) {
            System.out.println("Failed to parse config file");
            System.err.println(ex.getMessage());
            System.exit(1);
        }
        if (!config.validate()) {
            System.out.println(config.getValidationError());
            System.err.println(config.getValidationError());
            System.exit(1);
        }
        //get source file
        if (config.getStorage().getInputTables().getTables().isEmpty()) {
            System.out.println("No input tables found. Have you specified input mapping?");
            System.err.println("No input tables found. Have you specified input mapping?");
            System.exit(1);
        }
        String sourceFileName = config.getStorage().getInputTables().getTables().get(0).getDestination();
        File sourceFile = new File(inTablesPath + File.separator + sourceFileName);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + sourceFileName + " does not exist!");
            System.err.println("Source file " + sourceFileName + " does not exist!");
            System.exit(1);
        }
        //retrieve stateFile
        File stateFile = new File(dataPath + File.separator + "in" + File.separator + "state.json");
        LastState lastState = null;
        if (stateFile.exists()) {
            try {
                lastState = (LastState) YamlConfigParser.parseFile(stateFile, LastState.class);
            } catch (IOException ex) {
                System.out.println("Unable to parse state file!");
            }
        } else {
            System.out.println("State file does not exist. (first run?)");
        }

        /*check limits*/
        ManifestFile sourceMf;
        int rowNumber = 0;

        //rowNumber = sourceMf.getRows_count();
        /*Get accurate row number*/
        BufferedReader bf;
        try {
            bf = new BufferedReader(new FileReader(sourceFile));
            while (bf.readLine() != null) {
                rowNumber++;
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Source file " + sourceFileName + " does not exist!");
            System.exit(1);
        } catch (IOException ex) {
            System.err.println("Unable to read source file: " + sourceFileName);
            System.exit(1);
        }

        try {
            File smf = new File(sourceFile.getAbsolutePath() + ".manifest");
            sourceMf = ManifestParser.parseFile(smf);
            if (sourceMf.getColumns().length > 1) {
                //System.out.println("Source file must contain only one column! " + sourceMf.getColumns().length + " columns found instead.");
                System.err.println("Source file must contain only one column!" + sourceMf.getColumns().length + " columns found instead.");
                System.exit(1);
            }
            if (rowNumber > getRequestLimitByDate()) {
                System.out.println("Maximum row number in source file exceeded! The limit is " + getRequestLimitByDate());
                System.err.println("Maximum row number in source file exceeded! The limit is " + getRequestLimitByDate());
                System.exit(1);
            }
            if (sourceMf.getPrimaryKey() != null) {
                if (sourceMf.getPrimaryKey().length == 0) {
                    System.out.println("Source file must contain primary key column with ICO!");
                    System.err.println("Source file must contain primary column with ICO!!");
                    System.exit(1);
                }
            } else {
                System.out.println("Source file must contain primary key column with ICO!");
                System.err.println("Source file must contain primary column with ICO!!");
                System.exit(1);
            }
        } catch (IOException ex) {
            System.err.println("Unable to read source file manifest! " + ex.getMessage());
            System.exit(1);
        }
//get last state
        Date lastRun = null;
        int lastRqCount = 0;
        Calendar currDate = Calendar.getInstance(TimeZone.getTimeZone("Europe/Prague"));
        Calendar lastRunDate = Calendar.getInstance(TimeZone.getTimeZone("Europe/Prague"));
        if (lastState != null) {

            try {
                if (lastState.getLastRunDate() != null) {
                    lastRunDate.setTime(lastState.getLastRunDate());
                    lastRqCount = lastState.getRqCount();
                }

            } catch (NullPointerException ex) {
                System.out.println("No matching state.");
            }
        }
//check request limit
        boolean limitReset = false;

        //limit reset
        int lastRunHour = lastRunDate.get(Calendar.HOUR_OF_DAY);
        int currDateHour = currDate.get(Calendar.HOUR_OF_DAY);

        DateTime currDateTime = new DateTime(currDate.getTime());
        DateTime lastRunDateTime = new DateTime(lastRunDate.getTime());

        if (currDateHour > 18 || currDateHour < 8) {
            if (Hours.hoursBetween(lastRunDateTime, currDateTime).getHours() > 13) {
                limitReset = true;
            }
            if (lastRunHour <= 18 && lastRunHour >= 8) {
                limitReset = true;
            }
        }

        if (currDateHour <= 18 && currDateHour >= 8) {
            if (Hours.hoursBetween(lastRunDateTime, currDateTime).getHours() > 11) {
                limitReset = true;
            }
            if (lastRunHour > 18 || lastRunHour < 8) {
                limitReset = true;
            }
        }
        if (!limitReset && lastRqCount + rowNumber > getRequestLimitByDate()) {
            System.err.println("Request limit exceeded!(" + (lastRqCount + rowNumber) + ") The limit is " + getRequestLimitByDate() + " Limit resets after 6pm UTC+1.");
            System.exit(1);
        }
        //set new state
        LastState ls = null;
        if (!limitReset) {
            ls = new LastState(currDate.getTime(), lastRqCount + rowNumber);
        } else {
            ls = new LastState(currDate.getTime(), rowNumber);
        }

        try {
            JsonStateWriter.writeStateFile(dataPath + File.separator + "out", ls);
        } catch (IOException ex) {
            System.err.println("Error building state file " + ex.getMessage());
            System.exit(1);
        }

        System.out.println("Downloading ARES info. Request limit: " + (ls.getRqCount()) + " out of " + getRequestLimitByDate());
        ARESGetClient client = new ARESGetClient();
        Map<String, Integer> header = new HashMap();
        Map<String, Integer> newHeader = new HashMap();
        String[] line;
        BufferedReader reader = null;

        ICsvBeanWriter aresInfoWriter = null;
        ICsvBeanWriter naceWriter = null;
        ICsvBeanWriter oboryWriter = null;
        try {
            /*Init csv writers*/
            File aresInfoFile = new File(outTablesPath + File.separator + "aresInfo.csv");
            File naceFile = new File(outTablesPath + File.separator + "nace_x_ico.csv");
            File oboryFile = new File(outTablesPath + File.separator + "obor_x_ico.csv");
            aresInfoWriter = new CsvBeanWriter(new BufferedWriter(new FileWriter(aresInfoFile)), CsvPreference.STANDARD_PREFERENCE);
            //nace intersection table
            boolean downloadNace = false;
            if (config.getParams().getColumnList().contains("nace")) {
                naceWriter = new CsvBeanWriter(new BufferedWriter(new FileWriter(naceFile)), CsvPreference.STANDARD_PREFERENCE);
                downloadNace = true;
            }
            //obory intersection table
            boolean downloadObory = false;
            if (config.getParams().getColumnList().contains("oboryCinnosti")) {
                oboryWriter = new CsvBeanWriter(new BufferedWriter(new FileWriter(oboryFile)), CsvPreference.STANDARD_PREFERENCE);
                downloadObory = true;
            }

            /*Set mapping according to chosen columns*/
            Set<String> columnMapping = new HashSet();
            columnMapping.add("ico");
            columnMapping.add("lastUpdated");
            for (String colName : config.getParams().getColumnList()) {
                columnMapping.add(colName);
            }
            //cleanup
            columnMapping.remove("nace");
            columnMapping.remove("oboryCinnosti");

//prepare cell processors
            CellProcessor[] infoProcessors = getProcessors(columnMapping.size());
            CellProcessor[] naceProcess = getProcessors(2);
            CellProcessor[] oboryProcess = getProcessors(3);

            /*setup csv reader*/
            reader = new BufferedReader(new FileReader(sourceFile));
            CSVReader csvreader = new CSVReader(reader, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.DEFAULT_QUOTE_CHARACTER);
            csvreader.readNext();//skip the header line
            String currIco;

            /*Retrieve ARES info for ICOs*/
            boolean firstRun = true;
            List<AresInfoBasicRowBean> infoRows = new ArrayList();
            while ((line = csvreader.readNext()) != null) {
                Thread.sleep(REQUEST_SLEEP_INTERVAL);
                currIco = line[0];
                AresOdpovedi resp = client.getBasicInfoByIco(currIco);
                AresInfoBasicRowBean infoRow = new AresInfoBasicRowBean(resp, currIco);
                infoRows.add(infoRow);
                if (infoRow.getZanikl() == null) {
                    continue;//failed to get IC info
                }
                //write NACE
                if (firstRun && downloadNace) {//write header
                    naceWriter.writeHeader(new String[]{"ico", "kod_nace"});
                    //build manifest file
                    ManifestFile naceMan = new ManifestFile(null, true, new String[]{"ico", "kod_nace"}, ",", "\"");
                    ManifestBuilder.buildManifestFile(naceMan, outTablesPath, naceFile.getName());
                }
                if (downloadNace && infoRow.getZanikl() == 0) {
                    List<Nace2> naces = resp.getOdpoved().get(0).getVBAS().get(0).getNace();
                    AresInfoNaceRowBeanList nacesRows = new AresInfoNaceRowBeanList(naces, currIco);
                    for (AresInfoNaceRowBean b : nacesRows.getNaceRowList()) {
                        naceWriter.write(b, new String[]{"ico", "kod_nace"}, naceProcess);
                    }
                }
                //write obory
                if (firstRun && downloadObory) {//write header
                    oboryWriter.writeHeader(new String[]{"ico", "kod_oboru", "obor_nazev"});
                    //build manifest file
                    ManifestFile oboryMan = new ManifestFile(null, true, new String[]{"ico", "kod_oboru"}, ",", "\"");
                    ManifestBuilder.buildManifestFile(oboryMan, outTablesPath, oboryFile.getName());
                }
                if (downloadObory && infoRow.getZanikl() == 0) {
                    OboryCinnosti2 obory = resp.getOdpoved().get(0).getVBAS().get(0).getOboryCinnosti();
                    if (obory != null) {
                        AresInfoOborRowBeanList oboryRows = new AresInfoOborRowBeanList(obory, currIco);

                        for (AresInfoOborRowBean b : oboryRows.getNaceRowList()) {
                            oboryWriter.write(b, new String[]{"ico", "kod_oboru", "obor_nazev"}, oboryProcess);
                        }
                    }
                }
                firstRun = false;
            }

            //write all info rows   
            aresInfoWriter.writeHeader(columnMapping.toArray(new String[0]));
            for (AresInfoBasicRowBean info : infoRows) {
                aresInfoWriter.write(info, columnMapping.toArray(new String[0]), infoProcessors);
            }

            //build manifest aresInfo file
            ManifestFile aresMan = new ManifestFile(null, true, new String[]{"ico"}, ",", "\"");
            ManifestBuilder.buildManifestFile(aresMan, outTablesPath, aresInfoFile.getName());
            System.out.println("Download successful!");
        } catch (FileNotFoundException ex) {
            System.err.println("Error retrieving ARES info. " + ex.getMessage());
            System.exit(1);
        } catch (ClientException ex) {
            System.err.println("Error retrieving ARES info. " + ex.getMessage());
            System.exit(ex.getSeverity());
        } catch (IOException ex) {
            System.err.println("Error retrieving ARES info. " + ex.getMessage());
            System.exit(1);
        } catch (Exception ex) {
            System.err.println("Error retrieving ARES info. " + ex.getMessage());
            ex.printStackTrace();
            System.exit(1);
        } finally {
            try {
                if (aresInfoWriter != null) {
                    aresInfoWriter.close();
                }
                if (naceWriter != null) {
                    naceWriter.close();
                }
                if (oboryWriter != null) {
                    oboryWriter.close();
                }
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(Extractor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }


    /*get cell processors with dynamic size*/
    private static CellProcessor[] getProcessors(int length) {
        CellProcessor[] processors = new CellProcessor[length];
        for (int i = 0; i < length; i++) {
            processors[i] = new Optional();

        }

        return processors;
    }

}
