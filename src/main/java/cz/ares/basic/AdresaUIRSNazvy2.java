
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adresa_UIR_s_nazvy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresa_UIR_s_nazvy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}kod_kraje" minOccurs="0"/>
 *         &lt;element name="Nazev_kraje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CZNUTS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}cznuts" minOccurs="0"/>
 *         &lt;element name="KOK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_okresu" minOccurs="0"/>
 *         &lt;element name="NOK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="KO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_obce" minOccurs="0"/>
 *         &lt;element name="N" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce" minOccurs="0"/>
 *         &lt;element name="KPO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nazev_prazskeho_obvodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KMC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_mestske_casti" minOccurs="0"/>
 *         &lt;element name="NMC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_mestske_casti" minOccurs="0"/>
 *         &lt;element name="KCO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_casti_obce" minOccurs="0"/>
 *         &lt;element name="NCO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_casti_obce" minOccurs="0"/>
 *         &lt;element name="KUL" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_ulice" minOccurs="0"/>
 *         &lt;element name="NU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="CD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}cis_dom" minOccurs="0"/>
 *         &lt;element name="TCD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}typ_cis_dom" minOccurs="0"/>
 *         &lt;element name="CO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}cis_or" minOccurs="0"/>
 *         &lt;element name="PCO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}pism_cislo_orientacni" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}psc" minOccurs="0"/>
 *         &lt;element name="KOB" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_objektu" minOccurs="0"/>
 *         &lt;element name="KA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_adresy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresa_UIR_s_nazvy", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "kk",
    "nazevKraje",
    "cznuts",
    "kok",
    "nok",
    "ko",
    "n",
    "kpo",
    "nazevPrazskehoObvodu",
    "kmc",
    "nmc",
    "kco",
    "nco",
    "kul",
    "nu",
    "cd",
    "tcd",
    "co",
    "pco",
    "psc",
    "kob",
    "ka"
})
public class AdresaUIRSNazvy2 {

    @XmlElement(name = "KK")
    protected Short kk;
    @XmlElement(name = "Nazev_kraje")
    protected String nazevKraje;
    @XmlElement(name = "CZNUTS")
    protected String cznuts;
    @XmlElement(name = "KOK")
    protected Integer kok;
    @XmlElement(name = "NOK")
    protected String nok;
    @XmlElement(name = "KO")
    protected String ko;
    @XmlElement(name = "N")
    protected String n;
    @XmlElement(name = "KPO")
    protected Integer kpo;
    @XmlElement(name = "Nazev_prazskeho_obvodu")
    protected String nazevPrazskehoObvodu;
    @XmlElement(name = "KMC")
    protected String kmc;
    @XmlElement(name = "NMC")
    protected String nmc;
    @XmlElement(name = "KCO")
    protected String kco;
    @XmlElement(name = "NCO")
    protected String nco;
    @XmlElement(name = "KUL")
    protected String kul;
    @XmlElement(name = "NU")
    protected String nu;
    @XmlElement(name = "CD")
    protected Integer cd;
    @XmlElement(name = "TCD")
    protected Byte tcd;
    @XmlElement(name = "CO")
    protected String co;
    @XmlElement(name = "PCO")
    protected String pco;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "KOB")
    protected String kob;
    @XmlElement(name = "KA")
    protected String ka;

    /**
     * Gets the value of the kk property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKK() {
        return kk;
    }

    /**
     * Sets the value of the kk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKK(Short value) {
        this.kk = value;
    }

    /**
     * Gets the value of the nazevKraje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevKraje() {
        return nazevKraje;
    }

    /**
     * Sets the value of the nazevKraje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevKraje(String value) {
        this.nazevKraje = value;
    }

    /**
     * Gets the value of the cznuts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCZNUTS() {
        return cznuts;
    }

    /**
     * Sets the value of the cznuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCZNUTS(String value) {
        this.cznuts = value;
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
     * Gets the value of the nok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOK() {
        return nok;
    }

    /**
     * Sets the value of the nok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOK(String value) {
        this.nok = value;
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
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Gets the value of the kpo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKPO() {
        return kpo;
    }

    /**
     * Sets the value of the kpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKPO(Integer value) {
        this.kpo = value;
    }

    /**
     * Gets the value of the nazevPrazskehoObvodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevPrazskehoObvodu() {
        return nazevPrazskehoObvodu;
    }

    /**
     * Sets the value of the nazevPrazskehoObvodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevPrazskehoObvodu(String value) {
        this.nazevPrazskehoObvodu = value;
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
     * Gets the value of the nmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMC() {
        return nmc;
    }

    /**
     * Sets the value of the nmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMC(String value) {
        this.nmc = value;
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
     * Gets the value of the nco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCO() {
        return nco;
    }

    /**
     * Sets the value of the nco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCO(String value) {
        this.nco = value;
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
     * Gets the value of the nu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNU() {
        return nu;
    }

    /**
     * Sets the value of the nu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNU(String value) {
        this.nu = value;
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

}
