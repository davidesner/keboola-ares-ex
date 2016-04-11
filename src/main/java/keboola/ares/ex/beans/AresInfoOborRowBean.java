/*
 */
package keboola.ares.ex.beans;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2016
 */
public class AresInfoOborRowBean {

    private String ico;
    private String kod_oboru;
    private String obor_nazev;

    public AresInfoOborRowBean(String ico, String kod_oboru, String obor_nazev) {
        this.ico = ico;
        this.kod_oboru = kod_oboru;
        this.obor_nazev = obor_nazev;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getKod_oboru() {
        return kod_oboru;
    }

    public void setKod_oboru(String kod_oboru) {
        this.kod_oboru = kod_oboru;
    }

    public String getObor_nazev() {
        return obor_nazev;
    }

    public void setObor_nazev(String obor_nazev) {
        this.obor_nazev = obor_nazev;
    }

}
