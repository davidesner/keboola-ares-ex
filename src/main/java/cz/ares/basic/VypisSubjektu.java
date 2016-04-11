
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis jednoho subjektu na str. Pøehledu
 * 
 * <p>Java class for vypis_subjektu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_subjektu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="b" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="ico" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="LA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pf" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_pravni_formy" minOccurs="0"/>
 *         &lt;element name="ojm" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="jmn" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="or" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="res" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="rzp" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="rzz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="dph" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="p_dph" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parametry_odkazu" minOccurs="0"/>
 *         &lt;element name="sd" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="p_sd" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parametry_odkazu" minOccurs="0"/>
 *         &lt;element name="ceu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="p_ceu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parametry_odkazu" minOccurs="0"/>
 *         &lt;element name="scp" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="p_scp" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parametry_odkazu" minOccurs="0"/>
 *         &lt;element name="cedr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="p_cedr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parametry_odkazu" minOccurs="0"/>
 *         &lt;element name="aris" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="p_aris" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parametry_odkazu" minOccurs="0"/>
 *         &lt;element name="sdml" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="p_sdml" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parametry_odkazu" minOccurs="0"/>
 *         &lt;element name="rcns" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="psh" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="p_psh" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parametry_odkazu" minOccurs="0"/>
 *         &lt;element name="pz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="p_pz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parametry_odkazu" minOccurs="0"/>
 *         &lt;element name="opm" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="p_opm" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parametry_odkazu" minOccurs="0"/>
 *         &lt;element name="poz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="nno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="p_nno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parametry_odkazu" minOccurs="0"/>
 *         &lt;element name="oss" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="szr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="ir" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="sko" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="rc" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="j" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}jazyk_odkazu" minOccurs="0"/>
 *         &lt;element name="cuzk" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *         &lt;element name="sh" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_odkazu" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_subjektu", propOrder = {
    "b",
    "ico",
    "la",
    "pf",
    "ojm",
    "jmn",
    "or",
    "res",
    "rzp",
    "rzz",
    "dph",
    "pDph",
    "sd",
    "pSd",
    "ceu",
    "pCeu",
    "scp",
    "pScp",
    "cedr",
    "pCedr",
    "aris",
    "pAris",
    "sdml",
    "pSdml",
    "rcns",
    "psh",
    "pPsh",
    "pz",
    "pPz",
    "opm",
    "pOpm",
    "poz",
    "nno",
    "pNno",
    "oss",
    "szr",
    "ir",
    "sko",
    "rc",
    "j",
    "cuzk",
    "sh"
})
public class VypisSubjektu {

    protected String b;
    protected String ico;
    @XmlElement(name = "LA")
    protected Integer la;
    protected Short pf;
    protected String ojm;
    protected String jmn;
    protected Short or;
    protected Short res;
    protected Short rzp;
    protected Short rzz;
    protected Short dph;
    @XmlElement(name = "p_dph")
    protected String pDph;
    protected Short sd;
    @XmlElement(name = "p_sd")
    protected String pSd;
    protected Short ceu;
    @XmlElement(name = "p_ceu")
    protected String pCeu;
    protected Short scp;
    @XmlElement(name = "p_scp")
    protected String pScp;
    protected Short cedr;
    @XmlElement(name = "p_cedr")
    protected String pCedr;
    protected Short aris;
    @XmlElement(name = "p_aris")
    protected String pAris;
    protected Short sdml;
    @XmlElement(name = "p_sdml")
    protected String pSdml;
    protected Short rcns;
    protected Short psh;
    @XmlElement(name = "p_psh")
    protected String pPsh;
    protected Short pz;
    @XmlElement(name = "p_pz")
    protected String pPz;
    protected Short opm;
    @XmlElement(name = "p_opm")
    protected String pOpm;
    protected Short poz;
    protected Short nno;
    @XmlElement(name = "p_nno")
    protected String pNno;
    protected Short oss;
    protected Short szr;
    protected Short ir;
    protected Short sko;
    protected String rc;
    protected JazykOdkazu j;
    protected Short cuzk;
    protected Short sh;

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB(String value) {
        this.b = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIco() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIco(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the la property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLA() {
        return la;
    }

    /**
     * Sets the value of the la property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLA(Integer value) {
        this.la = value;
    }

    /**
     * Gets the value of the pf property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPf() {
        return pf;
    }

    /**
     * Sets the value of the pf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPf(Short value) {
        this.pf = value;
    }

    /**
     * Gets the value of the ojm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjm() {
        return ojm;
    }

    /**
     * Sets the value of the ojm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjm(String value) {
        this.ojm = value;
    }

    /**
     * Gets the value of the jmn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmn() {
        return jmn;
    }

    /**
     * Sets the value of the jmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmn(String value) {
        this.jmn = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOr() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOr(Short value) {
        this.or = value;
    }

    /**
     * Gets the value of the res property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRes() {
        return res;
    }

    /**
     * Sets the value of the res property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRes(Short value) {
        this.res = value;
    }

    /**
     * Gets the value of the rzp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRzp() {
        return rzp;
    }

    /**
     * Sets the value of the rzp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRzp(Short value) {
        this.rzp = value;
    }

    /**
     * Gets the value of the rzz property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRzz() {
        return rzz;
    }

    /**
     * Sets the value of the rzz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRzz(Short value) {
        this.rzz = value;
    }

    /**
     * Gets the value of the dph property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDph() {
        return dph;
    }

    /**
     * Sets the value of the dph property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDph(Short value) {
        this.dph = value;
    }

    /**
     * Gets the value of the pDph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDph() {
        return pDph;
    }

    /**
     * Sets the value of the pDph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDph(String value) {
        this.pDph = value;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSd(Short value) {
        this.sd = value;
    }

    /**
     * Gets the value of the pSd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSd() {
        return pSd;
    }

    /**
     * Sets the value of the pSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSd(String value) {
        this.pSd = value;
    }

    /**
     * Gets the value of the ceu property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCeu() {
        return ceu;
    }

    /**
     * Sets the value of the ceu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCeu(Short value) {
        this.ceu = value;
    }

    /**
     * Gets the value of the pCeu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCeu() {
        return pCeu;
    }

    /**
     * Sets the value of the pCeu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCeu(String value) {
        this.pCeu = value;
    }

    /**
     * Gets the value of the scp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getScp() {
        return scp;
    }

    /**
     * Sets the value of the scp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setScp(Short value) {
        this.scp = value;
    }

    /**
     * Gets the value of the pScp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPScp() {
        return pScp;
    }

    /**
     * Sets the value of the pScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPScp(String value) {
        this.pScp = value;
    }

    /**
     * Gets the value of the cedr property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCedr() {
        return cedr;
    }

    /**
     * Sets the value of the cedr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCedr(Short value) {
        this.cedr = value;
    }

    /**
     * Gets the value of the pCedr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCedr() {
        return pCedr;
    }

    /**
     * Sets the value of the pCedr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCedr(String value) {
        this.pCedr = value;
    }

    /**
     * Gets the value of the aris property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAris() {
        return aris;
    }

    /**
     * Sets the value of the aris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAris(Short value) {
        this.aris = value;
    }

    /**
     * Gets the value of the pAris property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAris() {
        return pAris;
    }

    /**
     * Sets the value of the pAris property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAris(String value) {
        this.pAris = value;
    }

    /**
     * Gets the value of the sdml property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSdml() {
        return sdml;
    }

    /**
     * Sets the value of the sdml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSdml(Short value) {
        this.sdml = value;
    }

    /**
     * Gets the value of the pSdml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSdml() {
        return pSdml;
    }

    /**
     * Sets the value of the pSdml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSdml(String value) {
        this.pSdml = value;
    }

    /**
     * Gets the value of the rcns property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRcns() {
        return rcns;
    }

    /**
     * Sets the value of the rcns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRcns(Short value) {
        this.rcns = value;
    }

    /**
     * Gets the value of the psh property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPsh() {
        return psh;
    }

    /**
     * Sets the value of the psh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPsh(Short value) {
        this.psh = value;
    }

    /**
     * Gets the value of the pPsh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPsh() {
        return pPsh;
    }

    /**
     * Sets the value of the pPsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPsh(String value) {
        this.pPsh = value;
    }

    /**
     * Gets the value of the pz property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPz() {
        return pz;
    }

    /**
     * Sets the value of the pz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPz(Short value) {
        this.pz = value;
    }

    /**
     * Gets the value of the pPz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPz() {
        return pPz;
    }

    /**
     * Sets the value of the pPz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPz(String value) {
        this.pPz = value;
    }

    /**
     * Gets the value of the opm property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOpm() {
        return opm;
    }

    /**
     * Sets the value of the opm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOpm(Short value) {
        this.opm = value;
    }

    /**
     * Gets the value of the pOpm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOpm() {
        return pOpm;
    }

    /**
     * Sets the value of the pOpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOpm(String value) {
        this.pOpm = value;
    }

    /**
     * Gets the value of the poz property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPoz() {
        return poz;
    }

    /**
     * Sets the value of the poz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPoz(Short value) {
        this.poz = value;
    }

    /**
     * Gets the value of the nno property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNno() {
        return nno;
    }

    /**
     * Sets the value of the nno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNno(Short value) {
        this.nno = value;
    }

    /**
     * Gets the value of the pNno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNno() {
        return pNno;
    }

    /**
     * Sets the value of the pNno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNno(String value) {
        this.pNno = value;
    }

    /**
     * Gets the value of the oss property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOss() {
        return oss;
    }

    /**
     * Sets the value of the oss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOss(Short value) {
        this.oss = value;
    }

    /**
     * Gets the value of the szr property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSzr() {
        return szr;
    }

    /**
     * Sets the value of the szr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSzr(Short value) {
        this.szr = value;
    }

    /**
     * Gets the value of the ir property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIr() {
        return ir;
    }

    /**
     * Sets the value of the ir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIr(Short value) {
        this.ir = value;
    }

    /**
     * Gets the value of the sko property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSko() {
        return sko;
    }

    /**
     * Sets the value of the sko property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSko(Short value) {
        this.sko = value;
    }

    /**
     * Gets the value of the rc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRc() {
        return rc;
    }

    /**
     * Sets the value of the rc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRc(String value) {
        this.rc = value;
    }

    /**
     * Gets the value of the j property.
     * 
     * @return
     *     possible object is
     *     {@link JazykOdkazu }
     *     
     */
    public JazykOdkazu getJ() {
        return j;
    }

    /**
     * Sets the value of the j property.
     * 
     * @param value
     *     allowed object is
     *     {@link JazykOdkazu }
     *     
     */
    public void setJ(JazykOdkazu value) {
        this.j = value;
    }

    /**
     * Gets the value of the cuzk property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCuzk() {
        return cuzk;
    }

    /**
     * Sets the value of the cuzk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCuzk(Short value) {
        this.cuzk = value;
    }

    /**
     * Gets the value of the sh property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSh() {
        return sh;
    }

    /**
     * Sets the value of the sh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSh(Short value) {
        this.sh = value;
    }

}
