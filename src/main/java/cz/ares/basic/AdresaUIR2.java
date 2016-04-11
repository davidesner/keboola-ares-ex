
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definice elementu obecné adresy 
 * 
 * <p>Java class for adresa_UIR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresa_UIR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KOL" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_oblasti" minOccurs="0"/>
 *         &lt;element name="KK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_kraje" minOccurs="0"/>
 *         &lt;element name="KOK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_okresu" minOccurs="0"/>
 *         &lt;element name="KO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_obce" minOccurs="0"/>
 *         &lt;element name="KPO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_pobvod" minOccurs="0"/>
 *         &lt;element name="KSO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_sobvod" minOccurs="0"/>
 *         &lt;element name="KN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_nobvod" minOccurs="0"/>
 *         &lt;element name="KCO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_casti_obce" minOccurs="0"/>
 *         &lt;element name="KMC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_mestske_casti" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}psc" minOccurs="0"/>
 *         &lt;element name="KUL" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_ulice" minOccurs="0"/>
 *         &lt;element name="CD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}cis_dom" minOccurs="0"/>
 *         &lt;element name="TCD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}typ_cis_dom" minOccurs="0"/>
 *         &lt;element name="CO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}cis_or" minOccurs="0"/>
 *         &lt;element name="PCO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}pism_cislo_orientacni" minOccurs="0"/>
 *         &lt;element name="KA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_adresy" minOccurs="0"/>
 *         &lt;element name="KOB" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_objektu" minOccurs="0"/>
 *         &lt;element name="PCD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}pcd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresa_UIR", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3", propOrder = {
    "kol",
    "kk",
    "kok",
    "ko",
    "kpo",
    "kso",
    "kn",
    "kco",
    "kmc",
    "psc",
    "kul",
    "cd",
    "tcd",
    "co",
    "pco",
    "ka",
    "kob",
    "pcd"
})
public class AdresaUIR2 {

    @XmlElement(name = "KOL")
    protected String kol;
    @XmlElement(name = "KK")
    protected String kk;
    @XmlElement(name = "KOK")
    protected Integer kok;
    @XmlElement(name = "KO")
    protected String ko;
    @XmlElement(name = "KPO")
    protected String kpo;
    @XmlElement(name = "KSO")
    protected String kso;
    @XmlElement(name = "KN")
    protected String kn;
    @XmlElement(name = "KCO")
    protected String kco;
    @XmlElement(name = "KMC")
    protected String kmc;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "KUL")
    protected String kul;
    @XmlElement(name = "CD")
    protected Integer cd;
    @XmlElement(name = "TCD")
    protected Byte tcd;
    @XmlElement(name = "CO")
    protected String co;
    @XmlElement(name = "PCO")
    protected String pco;
    @XmlElement(name = "KA")
    protected String ka;
    @XmlElement(name = "KOB")
    protected String kob;
    @XmlElement(name = "PCD")
    protected String pcd;

    /**
     * Gets the value of the kol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOL() {
        return kol;
    }

    /**
     * Sets the value of the kol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOL(String value) {
        this.kol = value;
    }

    /**
     * Gets the value of the kk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKK() {
        return kk;
    }

    /**
     * Sets the value of the kk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKK(String value) {
        this.kk = value;
    }

    /**
     * Gets the value of the kok property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKOK() {
        return kok;
    }

    /**
     * Sets the value of the kok property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKOK(Integer value) {
        this.kok = value;
    }

    /**
     * Gets the value of the ko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKO() {
        return ko;
    }

    /**
     * Sets the value of the ko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKO(String value) {
        this.ko = value;
    }

    /**
     * Gets the value of the kpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPO() {
        return kpo;
    }

    /**
     * Sets the value of the kpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPO(String value) {
        this.kpo = value;
    }

    /**
     * Gets the value of the kso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKSO() {
        return kso;
    }

    /**
     * Sets the value of the kso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKSO(String value) {
        this.kso = value;
    }

    /**
     * Gets the value of the kn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKN() {
        return kn;
    }

    /**
     * Sets the value of the kn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKN(String value) {
        this.kn = value;
    }

    /**
     * Gets the value of the kco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKCO() {
        return kco;
    }

    /**
     * Sets the value of the kco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCO(String value) {
        this.kco = value;
    }

    /**
     * Gets the value of the kmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKMC() {
        return kmc;
    }

    /**
     * Sets the value of the kmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKMC(String value) {
        this.kmc = value;
    }

    /**
     * Gets the value of the psc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSC() {
        return psc;
    }

    /**
     * Sets the value of the psc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSC(String value) {
        this.psc = value;
    }

    /**
     * Gets the value of the kul property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKUL() {
        return kul;
    }

    /**
     * Sets the value of the kul property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKUL(String value) {
        this.kul = value;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCD() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCD(Integer value) {
        this.cd = value;
    }

    /**
     * Gets the value of the tcd property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTCD() {
        return tcd;
    }

    /**
     * Sets the value of the tcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTCD(Byte value) {
        this.tcd = value;
    }

    /**
     * Gets the value of the co property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCO() {
        return co;
    }

    /**
     * Sets the value of the co property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCO(String value) {
        this.co = value;
    }

    /**
     * Gets the value of the pco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCO() {
        return pco;
    }

    /**
     * Sets the value of the pco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCO(String value) {
        this.pco = value;
    }

    /**
     * Gets the value of the ka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKA() {
        return ka;
    }

    /**
     * Sets the value of the ka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKA(String value) {
        this.ka = value;
    }

    /**
     * Gets the value of the kob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOB() {
        return kob;
    }

    /**
     * Sets the value of the kob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOB(String value) {
        this.kob = value;
    }

    /**
     * Gets the value of the pcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCD() {
        return pcd;
    }

    /**
     * Sets the value of the pcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCD(String value) {
        this.pcd = value;
    }

}
