/*
 */
package keboola.ares.ex.beans;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2016
 */
public class AresInfoNaceRowBean {

    private String ico;
    private String kod_nace;

    public AresInfoNaceRowBean(String ico, String kod_nace) {
        this.ico = ico;
        this.kod_nace = kod_nace;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getKod_nace() {
        return kod_nace;
    }

    public void setKod_nace(String kod_nace) {
        this.kod_nace = kod_nace;
    }

}
