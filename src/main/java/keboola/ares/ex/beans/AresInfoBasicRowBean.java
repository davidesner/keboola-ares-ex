/*
 */
package keboola.ares.ex.beans;

import cz.ares.basic.AresOdpovedi;
import cz.ares.basic.VypisBasic2;
import keboola.ares.ex.client.ClientException;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2016
 */
public class AresInfoBasicRowBean {

    private String ico;
    private String obchodniFirma;
    private String obec;
    private String okres;
    private String mestskaCast;
    private String stat;
    private String ulice;
    private String psc;
    private String zahrPsc;
    private String pocetPrac;
    private Integer zanikl;
    private Integer platceDPH;
    private String datumVzniku;

    private String pravniForma;
    private String dic;

    public AresInfoBasicRowBean(AresOdpovedi basicOdpoved, String ico) throws ClientException {
        if (basicOdpoved.getOdpoved().isEmpty()) {
            throw new ClientException("The result is empty!");
        }
        this.ico = ico;
        if (basicOdpoved.getOdpoved().get(0).getVBAS() == null || basicOdpoved.getOdpoved().get(0).getVBAS().isEmpty()) {
            if (basicOdpoved.getOdpoved().get(0).getE().getET().equals("Chyba 61 - subjekt zanikl")) {
                this.zanikl = 1;
                this.obchodniFirma = null;
                this.stat = null;
                this.obec = null;
                this.okres = null;
                this.mestskaCast = null;
                this.ulice = null;
                this.psc = null;
                this.zahrPsc = null;
                this.pocetPrac = null;

            } else {
                System.out.println("WARNING: Cannot retrieve information for IC: " + ico + ". " + basicOdpoved.getOdpoved().get(0).getE().getET());
                this.zanikl = null;
                this.obchodniFirma = null;
                this.stat = null;
                this.obec = null;
                this.okres = null;
                this.mestskaCast = null;
                this.ulice = null;
                this.psc = null;
                this.zahrPsc = null;
                this.pocetPrac = null;
            }
        } else {
            VypisBasic2 res = basicOdpoved.getOdpoved().get(0).getVBAS().get(0);
            this.zanikl = 0;
            this.obchodniFirma = res.getOF().getValue();
            this.stat = res.getAA().getNS();
            this.obec = res.getAA().getN();
            this.okres = res.getAA().getNOK();
            this.mestskaCast = res.getAA().getNMC();
            this.ulice = res.getAA().getNU();
            this.psc = res.getAA().getPSC();
            this.zahrPsc = res.getAA().getZahrPSC();
            this.pocetPrac = res.getKPP().getValue();
            if (res.getDIC() != null) {
                this.dic = res.getDIC().getValue();
                this.platceDPH = 1;
            } else {
                this.dic = null;
                this.platceDPH = 0;
            }
            this.datumVzniku = res.getDV().toString();
            this.pravniForma = res.getPF().getNPF();
        }
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getMestskaCast() {
        return mestskaCast;
    }

    public void setMestskaCast(String mestskaCast) {
        this.mestskaCast = mestskaCast;
    }

    public String getZahrPsc() {
        return zahrPsc;
    }

    public void setZahrPsc(String zahrPsc) {
        this.zahrPsc = zahrPsc;
    }

    public void setObchodniFirma(String obchodniFirma) {
        this.obchodniFirma = obchodniFirma;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public void setOkres(String okres) {
        this.okres = okres;
    }

    public void setMestska_cast(String mestskaCast) {
        this.mestskaCast = mestskaCast;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public void setZahr_psc(String zahrPsc) {
        this.zahrPsc = zahrPsc;
    }

    public void setPocetPrac(String pocetPrac) {
        this.pocetPrac = pocetPrac;
    }

    public void setZanikl(Integer zanikl) {
        this.zanikl = zanikl;
    }

    public void setPlatceDPH(Integer platceDPH) {
        this.platceDPH = platceDPH;
    }

    public void setDatumVzniku(String datumVzniku) {
        this.datumVzniku = datumVzniku;
    }

    public void setPravniForma(String pravniForma) {
        this.pravniForma = pravniForma;
    }

    public void setDic(String dic) {
        this.dic = dic;
    }

    public String getObchodniFirma() {
        return obchodniFirma;
    }

    public String getObec() {
        return obec;
    }

    public String getOkres() {
        return okres;
    }

    public String getMestska_cast() {
        return mestskaCast;
    }

    public String getStat() {
        return stat;
    }

    public String getUlice() {
        return ulice;
    }

    public String getPsc() {
        return psc;
    }

    public String getZahr_psc() {
        return zahrPsc;
    }

    public String getPocetPrac() {
        return pocetPrac;
    }

    public Integer getZanikl() {
        return zanikl;
    }

    public Integer getPlatceDPH() {
        return platceDPH;
    }

    public String getDatumVzniku() {
        return datumVzniku;
    }

    public String getPravniForma() {
        return pravniForma;
    }

    public String getDic() {
        return dic;
    }

}
