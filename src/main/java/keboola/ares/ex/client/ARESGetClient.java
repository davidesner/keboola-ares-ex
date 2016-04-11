/*
 */
package keboola.ares.ex.client;

import cz.ares.basic.AresOdpovedi;
import cz.ares.basic.AresOdpovedi2;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2016
 */
public class ARESGetClient {

    private static final String STANDARD_REQUEST_URL = "http://wwwinfo.mfcr.cz/cgi-bin/ares/darv_std.cgi";
    private static final String BASIC_REQUEST_URL = "http://wwwinfo.mfcr.cz/cgi-bin/ares/darv_bas.cgi";
    private final HttpClient client;

    public ARESGetClient() {
        this.client = HttpClients.createDefault();
    }

    public AresOdpovedi getBasicInfoByIco(String ico) throws ClientException {

        //get more verbose version
        HttpGet httpGet = new HttpGet(BASIC_REQUEST_URL + "?ico=" + ico);
        httpGet.setHeader("Accept", "application/json");

        //disable redirects
        RequestConfig requestConfig = RequestConfig.custom().setRedirectsEnabled(false).build();
        httpGet.setConfig(requestConfig);
        try {
            HttpResponse response = client.execute(httpGet);

            //check response code
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new ClientException("Connection error. Http Response code:" + statusCode + " - " + response.getStatusLine().getReasonPhrase());
            }

            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            StringBuilder result = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }

            /*Unmarshall response*/
            JAXBContext jc = JAXBContext.newInstance(AresOdpovedi.class);

            Unmarshaller unmarshaller = jc.createUnmarshaller();
            AresOdpovedi aresResult = (AresOdpovedi) unmarshaller.unmarshal(new StringReader(result.toString()));
            if (aresResult.getOdpoved().get(0).getVH() == null) {
                if (!aresResult.getOdpoved().get(0).getE().getET().equals("Chyba 61 - subjekt zanikl")) {
                    throw new ClientException(("Error getting ARES result. " + aresResult.getOdpoved().get(0).getE().getET()));
                }
            }
            return aresResult;

        } catch (IOException ex) {
            Logger.getLogger(ARESGetClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(ARESGetClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
