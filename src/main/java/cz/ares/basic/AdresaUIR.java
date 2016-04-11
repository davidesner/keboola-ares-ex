
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
 *         &lt;element name="Kod_oblasti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_oblasti" minOccurs="0"/>
 *         &lt;element name="Kod_kraje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_kraje" minOccurs="0"/>
 *         &lt;element name="Kod_okresu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_okresu" minOccurs="0"/>
 *         &lt;element name="Kod_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_obce" minOccurs="0"/>
 *         &lt;element name="Kod_pobvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_pobvod" minOccurs="0"/>
 *         &lt;element name="Kod_sobvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_sobvod" minOccurs="0"/>
 *         &lt;element name="Kod_nobvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_nobvod" minOccurs="0"/>
 *         &lt;element name="Kod_casti_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_casti_obce" minOccurs="0"/>
 *         &lt;element name="Kod_mestske_casti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_mestske_casti" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}psc" minOccurs="0"/>
 *         &lt;element name="Kod_ulice" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_ulice" minOccurs="0"/>
 *         &lt;element name="Cislo_domovni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}cis_dom" minOccurs="0"/>
 *         &lt;element name="Typ_cislo_domovni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}typ_cis_dom" minOccurs="0"/>
 *         &lt;element name="Cislo_orientacni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}cis_or" minOccurs="0"/>
 *         &lt;element name="Pism_cislo_orientacni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}pism_cislo_orientacni" minOccurs="0"/>
 *         &lt;element name="Kod_adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_adresy" minOccurs="0"/>
 *         &lt;element name="Kod_objektu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_objektu" minOccurs="0"/>
 *         &lt;element name="PCD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}pcd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresa_UIR", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1", propOrder = {
    "kodOblasti",
    "kodKraje",
    "kodOkresu",
    "kodObce",
    "kodPobvod",
    "kodSobvod",
    "kodNobvod",
    "kodCastiObce",
    "kodMestskeCasti",
    "psc",
    "kodUlice",
    "cisloDomovni",
    "typCisloDomovni",
    "cisloOrientacni",
    "pismCisloOrientacni",
    "kodAdresy",
    "kodObjektu",
    "pcd"
})
public class AdresaUIR {

    @XmlElement(name = "Kod_oblasti")
    protected String kodOblasti;
    @XmlElement(name = "Kod_kraje")
    protected String kodKraje;
    @XmlElement(name = "Kod_okresu")
    protected Integer kodOkresu;
    @XmlElement(name = "Kod_obce")
    protected String kodObce;
    @XmlElement(name = "Kod_pobvod")
    protected String kodPobvod;
    @XmlElement(name = "Kod_sobvod")
    protected String kodSobvod;
    @XmlElement(name = "Kod_nobvod")
    protected String kodNobvod;
    @XmlElement(name = "Kod_casti_obce")
    protected String kodCastiObce;
    @XmlElement(name = "Kod_mestske_casti")
    protected String kodMestskeCasti;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "Kod_ulice")
    protected String kodUlice;
    @XmlElement(name = "Cislo_domovni")
    protected Integer cisloDomovni;
    @XmlElement(name = "Typ_cislo_domovni")
    protected Byte typCisloDomovni;
    @XmlElement(name = "Cislo_orientacni")
    protected String cisloOrientacni;
    @XmlElement(name = "Pism_cislo_orientacni")
    protected String pismCisloOrientacni;
    @XmlElement(name = "Kod_adresy")
    protected String kodAdresy;
    @XmlElement(name = "Kod_objektu")
    protected String kodObjektu;
    @XmlElement(name = "PCD")
    protected String pcd;

    /**
     * Gets the value of the kodOblasti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodOblasti() {
        return kodOblasti;
    }

    /**
     * Sets the value of the kodOblasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodOblasti(String value) {
        this.kodOblasti = value;
    }

    /**
     * Gets the value of the kodKraje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodKraje() {
        return kodKraje;
    }

    /**
     * Sets the value of the kodKraje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodKraje(String value) {
        this.kodKraje = value;
    }

    /**
     * Gets the value of the kodOkresu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKodOkresu() {
        return kodOkresu;
    }

    /**
     * Sets the value of the kodOkresu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKodOkresu(Integer value) {
        this.kodOkresu = value;
    }

    /**
     * Gets the value of the kodObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodObce() {
        return kodObce;
    }

    /**
     * Sets the value of the kodObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodObce(String value) {
        this.kodObce = value;
    }

    /**
     * Gets the value of the kodPobvod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodPobvod() {
        return kodPobvod;
    }

    /**
     * Sets the value of the kodPobvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodPobvod(String value) {
        this.kodPobvod = value;
    }

    /**
     * Gets the value of the kodSobvod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodSobvod() {
        return kodSobvod;
    }

    /**
     * Sets the value of the kodSobvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodSobvod(String value) {
        this.kodSobvod = value;
    }

    /**
     * Gets the value of the kodNobvod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodNobvod() {
        return kodNobvod;
    }

    /**
     * Sets the value of the kodNobvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodNobvod(String value) {
        this.kodNobvod = value;
    }

    /**
     * Gets the value of the kodCastiObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodCastiObce() {
        return kodCastiObce;
    }

    /**
     * Sets the value of the kodCastiObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodCastiObce(String value) {
        this.kodCastiObce = value;
    }

    /**
     * Gets the value of the kodMestskeCasti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodMestskeCasti() {
        return kodMestskeCasti;
    }

    /**
     * Sets the value of the kodMestskeCasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodMestskeCasti(String value) {
        this.kodMestskeCasti = value;
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
     * Gets the value of the kodUlice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodUlice() {
        return kodUlice;
    }

    /**
     * Sets the value of the kodUlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodUlice(String value) {
        this.kodUlice = value;
    }

    /**
     * Gets the value of the cisloDomovni property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCisloDomovni() {
        return cisloDomovni;
    }

    /**
     * Sets the value of the cisloDomovni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCisloDomovni(Integer value) {
        this.cisloDomovni = value;
    }

    /**
     * Gets the value of the typCisloDomovni property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTypCisloDomovni() {
        return typCisloDomovni;
    }

    /**
     * Sets the value of the typCisloDomovni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTypCisloDomovni(Byte value) {
        this.typCisloDomovni = value;
    }

    /**
     * Gets the value of the cisloOrientacni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloOrientacni() {
        return cisloOrientacni;
    }

    /**
     * Sets the value of the cisloOrientacni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloOrientacni(String value) {
        this.cisloOrientacni = value;
    }

    /**
     * Gets the value of the pismCisloOrientacni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPismCisloOrientacni() {
        return pismCisloOrientacni;
    }

    /**
     * Sets the value of the pismCisloOrientacni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPismCisloOrientacni(String value) {
        this.pismCisloOrientacni = value;
    }

    /**
     * Gets the value of the kodAdresy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodAdresy() {
        return kodAdresy;
    }

    /**
     * Sets the value of the kodAdresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodAdresy(String value) {
        this.kodAdresy = value;
    }

    /**
     * Gets the value of the kodObjektu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodObjektu() {
        return kodObjektu;
    }

    /**
     * Sets the value of the kodObjektu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodObjektu(String value) {
        this.kodObjektu = value;
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
