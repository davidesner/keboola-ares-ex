/*
 */
package keboola.ares.ex.beans;

import cz.ares.basic.AresOdpovedi;
import cz.ares.basic.VypisBasic2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
    private String lastUpdated;
    private String kodOblasti;
    private String kodKraje;
    private Integer kodOkresu;
    private String kodObce;
    private String kodPrazskehoObvodu;
    private String kodNobvod;
    private String kodCastiObce;
    private String kodMestskeCasti;
    private String kodUlice;
    private String kodAdresy;
    private String kodObjektu;

    private String pravniForma;
    private String dic;

    public AresInfoBasicRowBean(AresOdpovedi basicOdpoved, String ico) throws ClientException {
        if (basicOdpoved.getOdpoved().isEmpty()) {
            throw new ClientException("The result is empty!");
        }
        this.initAllVariables();
        this.setLastUpdatedToCurrent();
        this.ico = ico;
        if (basicOdpoved.getOdpoved().get(0).getVBAS() == null || basicOdpoved.getOdpoved().get(0).getVBAS().isEmpty()) {
            if (basicOdpoved.getOdpoved().get(0).getE().getET().equals("Chyba 61 - subjekt zanikl")) {
                this.zanikl = 1;

            } else {
                System.out.println("WARNING: Cannot retrieve information for IC: " + ico + ". " + basicOdpoved.getOdpoved().get(0).getE().getET());
            }
        } else {
            VypisBasic2 res = basicOdpoved.getOdpoved().get(0).getVBAS().get(0);
            this.zanikl = 0;
            if (res.getOF() != null) {
                this.obchodniFirma = res.getOF().getValue();
            } else {
                this.obchodniFirma = null;
            }
            if (res.getAA() != null) {
                this.stat = res.getAA().getNS();
                this.obec = res.getAA().getN();
                this.okres = res.getAA().getNOK();
                this.mestskaCast = res.getAA().getNMC();
                this.ulice = res.getAA().getNU();
                this.psc = res.getAA().getPSC();
                this.zahrPsc = res.getAA().getZahrPSC();
                if (res.getAA().getAU() != null) {
                    this.kodKraje = res.getAA().getAU().getKK();
                    this.kodOkresu = res.getAA().getAU().getKOK();
                    this.kodObce = res.getAA().getAU().getKO();
                    this.kodPrazskehoObvodu = res.getAA().getAU().getKPO();
                    this.kodNobvod = res.getAA().getAU().getKN();
                    this.kodCastiObce = res.getAA().getAU().getKCO();
                    this.kodMestskeCasti = res.getAA().getAU().getKMC();
                    this.kodUlice = res.getAA().getAU().getKUL();
                    this.kodAdresy = res.getAA().getAU().getKA();
                    this.kodObjektu = res.getAA().getAU().getKOB();
                    this.kodOblasti = res.getAA().getAU().getKOL();
                }

            }

            if (res.getKPP() != null) {
                this.pocetPrac = res.getKPP().getValue();
            } else {
                this.pocetPrac = null;
            }
            if (res.getDIC() != null) {
                this.dic = res.getDIC().getValue();
                this.platceDPH = 1;
            } else {
                this.dic = null;
                this.platceDPH = 0;
            }
            if (res.getDV() != null) {
                this.datumVzniku = res.getDV().toString();
            } else {
                this.datumVzniku = null;
            }

            if (res.getPF() != null) {
                this.pravniForma = res.getPF().getNPF();
            } else {
                this.pravniForma = null;
            }
        }
    }

    private void initAllVariables() {
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
        this.kodKraje = null;
        this.kodOkresu = null;
        this.kodObce = null;
        this.kodOblasti = null;
        this.kodPrazskehoObvodu = null;
        this.kodNobvod = null;
        this.kodCastiObce = null;
        this.kodMestskeCasti = null;
        this.kodUlice = null;
        this.kodAdresy = null;
        this.kodObjektu = null;
        this.datumVzniku = null;
        this.pravniForma = null;
        this.platceDPH = null;
        this.dic = null;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    private void setLastUpdatedToCurrent() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.lastUpdated = format.format(Calendar.getInstance().getTime());
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

    public String getKodOblasti() {
        return kodOblasti;
    }

    public void setKodOblasti(String kodOblasti) {
        this.kodOblasti = kodOblasti;
    }

    public String getKodKraje() {
        return kodKraje;
    }

    public void setKodKraje(String kodKraje) {
        this.kodKraje = kodKraje;
    }

    public Integer getKodOkresu() {
        return kodOkresu;
    }

    public void setKodOkresu(Integer kodOkresu) {
        this.kodOkresu = kodOkresu;
    }

    public String getKodObce() {
        return kodObce;
    }

    public void setKodObce(String kodObce) {
        this.kodObce = kodObce;
    }

    public String getKodPrazskehoObvodu() {
        return kodPrazskehoObvodu;
    }

    public void setKodPrazskehoObvodu(String kodPrazskehoObvodu) {
        this.kodPrazskehoObvodu = kodPrazskehoObvodu;
    }

    public String getKodNobvod() {
        return kodNobvod;
    }

    public void setKodNobvod(String kodNobvod) {
        this.kodNobvod = kodNobvod;
    }

    public String getKodCastiObce() {
        return kodCastiObce;
    }

    public void setKodCastiObce(String kodCastiObce) {
        this.kodCastiObce = kodCastiObce;
    }

    public String getKodMestskeCasti() {
        return kodMestskeCasti;
    }

    public void setKodMestskeCasti(String kodMestskeCasti) {
        this.kodMestskeCasti = kodMestskeCasti;
    }

    public String getKodUlice() {
        return kodUlice;
    }

    public void setKodUlice(String kodUlice) {
        this.kodUlice = kodUlice;
    }

    public String getKodAdresy() {
        return kodAdresy;
    }

    public void setKodAdresy(String kodAdresy) {
        this.kodAdresy = kodAdresy;
    }

    public String getKodObjektu() {
        return kodObjektu;
    }

    public void setKodObjektu(String kodObjektu) {
        this.kodObjektu = kodObjektu;
    }

}
