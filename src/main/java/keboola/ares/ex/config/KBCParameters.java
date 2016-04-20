/*
 */
package keboola.ares.ex.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2015
 */
public class KBCParameters {

    private final static String[] REQUIRED_FIELDS = {"aresColumns"};
    private final Map<String, Object> parametersMap;

    //default icoColumn
    @JsonProperty("idColumn")
    private String idColumn;
    @JsonProperty("icoColumn")
    private String icoColumn;
    @JsonProperty("bucket")
    private String bucket;
    //default false
    @JsonProperty("incremental")
    private Boolean incremental;
    //default true
    @JsonProperty("nace")
    private Boolean nace;
    //default true
    @JsonProperty("obor")
    private Boolean obor;
    @JsonProperty("aresColumns")
    private List<String> columnList;

    public enum SupportedColumns {
        obchodniFirma,
        obec,
        okres,
        mestskaCast,
        stat,
        ulice,
        psc,
        zahrPsc,
        pocetPrac,
        zanikl,
        platceDPH,
        datumVzniku,
        pravniForma,
        dic,
        nace,
        oboryCinnosti;
    }

    public KBCParameters() {
        parametersMap = new HashMap<>();

    }

    @JsonCreator
    public KBCParameters(@JsonProperty("bucket") String bucket, @JsonProperty("idColumn") String idColumn,
            @JsonProperty("icoColumn") String icoColumn, @JsonProperty("incremental") Boolean incremental,
            @JsonProperty("nace") Boolean nace, @JsonProperty("obor") Boolean obor,
            @JsonProperty("aresColumns") List<String> columnList) throws ParseException {
        parametersMap = new HashMap<>();

        if (columnList == null) {
            this.columnList = new ArrayList();
            for (SupportedColumns sc : SupportedColumns.values()) {
                this.columnList.add(sc.name());
            }
        } else if (columnList.contains("ALL")) {
            this.columnList = new ArrayList();
            for (SupportedColumns sc : SupportedColumns.values()) {
                this.columnList.add(sc.name());
            }
        } else {
            this.columnList = columnList;
        }
        if (nace == null) {
            this.nace = true;
        } else {
            this.nace = nace;
        }
        if (obor == null) {
            this.obor = true;
        } else {
            this.obor = nace;
        }
        if (incremental == null) {
            this.incremental = false;
        } else {
            this.incremental = incremental;
        }

        this.idColumn = idColumn;
        this.icoColumn = icoColumn;
        this.bucket = bucket;

        //set param map
        // parametersMap.put("dateFrom", dateFrom);
        parametersMap.put("aresColumns", columnList);

        if (this.incremental == true && idColumn == null) {
            this.idColumn = icoColumn;
        }

    }

    /**
     * Returns list of required fields missing in config
     *
     * @return
     */
    public List<String> getMissingFields() {
        List<String> missing = new ArrayList<String>();
        for (int i = 0; i < REQUIRED_FIELDS.length; i++) {
            Object value = parametersMap.get(REQUIRED_FIELDS[i]);
            if (value == null) {
                missing.add(REQUIRED_FIELDS[i]);
            }
        }

        return missing;
    }

    public boolean validateColumnList() throws ValidationException {
        List<String> invalidCols = new ArrayList();
        if (columnList != null) {
            for (String colName : columnList) {
                if (!isValidColumn(colName)) {
                    invalidCols.add(colName);
                }
            }
        }
        if (!invalidCols.isEmpty()) {
            throw new ValidationException("Some query columns are not supported: " + invalidCols.toString());
        }
        return true;
    }

    private boolean isValidColumn(String col) {
        for (SupportedColumns c : SupportedColumns.values()) {
            if (c.name().equals(col)) {
                return true;
            }
        }
        return false;
    }

    public Boolean getNace() {
        return nace;
    }

    public void setNace(Boolean nace) {
        this.nace = nace;
    }

    public Boolean getObor() {
        return obor;
    }

    public void setObor(Boolean obor) {
        this.obor = obor;
    }

    public List<String> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<String> columnList) {
        this.columnList = columnList;
    }

    public Map<String, Object> getParametersMap() {
        return parametersMap;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getIdColumn() {
        return idColumn;
    }

    public void setIdColumn(String idColumn) {
        this.idColumn = idColumn;
    }

    public String getIcoColumn() {
        return icoColumn;
    }

    public void setIcoColumn(String icoColumn) {
        this.icoColumn = icoColumn;
    }

    public Boolean getIncremental() {
        return incremental;
    }

    public void setIncremental(Boolean incremental) {
        this.incremental = incremental;
    }

}
