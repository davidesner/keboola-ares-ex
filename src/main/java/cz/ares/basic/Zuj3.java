
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zuj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zuj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Zuj_kod_orig" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_obce" minOccurs="0"/>
 *         &lt;element name="NZUJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce" minOccurs="0"/>
 *         &lt;element name="KOK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_okresu" minOccurs="0"/>
 *         &lt;element name="NOK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="NUTS4" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}cznuts" minOccurs="0"/>
 *         &lt;element name="Nazev_NUTS4" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="OZK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_obce" minOccurs="0"/>
 *         &lt;element name="OZU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="Cast_zuj_kod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_casti_obce" minOccurs="0"/>
 *         &lt;element name="Cast_zuj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="Mestska_cast_zuj_kod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_mestske_casti" minOccurs="0"/>
 *         &lt;element name="Mestska_cast_zuj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zuj", propOrder = {
    "zujKodOrig",
    "nzuj",
    "kok",
    "nok",
    "nuts4",
    "nazevNUTS4",
    "ozk",
    "ozu",
    "castZujKod",
    "castZuj",
    "mestskaCastZujKod",
    "mestskaCastZuj"
})
public class Zuj3 {

    @XmlElement(name = "Zuj_kod_orig")
    protected String zujKodOrig;
    @XmlElement(name = "NZUJ")
    protected String nzuj;
    @XmlElement(name = "KOK")
    protected Integer kok;
    @XmlElement(name = "NOK")
    protected String nok;
    @XmlElement(name = "NUTS4")
    protected String nuts4;
    @XmlElement(name = "Nazev_NUTS4")
    protected String nazevNUTS4;
    @XmlElement(name = "OZK")
    protected String ozk;
    @XmlElement(name = "OZU")
    protected String ozu;
    @XmlElement(name = "Cast_zuj_kod")
    protected String castZujKod;
    @XmlElement(name = "Cast_zuj")
    protected String castZuj;
    @XmlElement(name = "Mestska_cast_zuj_kod")
    protected String mestskaCastZujKod;
    @XmlElement(name = "Mestska_cast_zuj")
    protected String mestskaCastZuj;

    /**
     * Gets the value of the zujKodOrig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZujKodOrig() {
        return zujKodOrig;
    }

    /**
     * Sets the value of the zujKodOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZujKodOrig(String value) {
        this.zujKodOrig = value;
    }

    /**
     * Gets the value of the nzuj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNZUJ() {
        return nzuj;
    }

    /**
     * Sets the value of the nzuj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNZUJ(String value) {
        this.nzuj = value;
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
     * Gets the value of the nuts4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUTS4() {
        return nuts4;
    }

    /**
     * Sets the value of the nuts4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUTS4(String value) {
        this.nuts4 = value;
    }

    /**
     * Gets the value of the nazevNUTS4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevNUTS4() {
        return nazevNUTS4;
    }

    /**
     * Sets the value of the nazevNUTS4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevNUTS4(String value) {
        this.nazevNUTS4 = value;
    }

    /**
     * Gets the value of the ozk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOZK() {
        return ozk;
    }

    /**
     * Sets the value of the ozk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOZK(String value) {
        this.ozk = value;
    }

    /**
     * Gets the value of the ozu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOZU() {
        return ozu;
    }

    /**
     * Sets the value of the ozu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOZU(String value) {
        this.ozu = value;
    }

    /**
     * Gets the value of the castZujKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCastZujKod() {
        return castZujKod;
    }

    /**
     * Sets the value of the castZujKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCastZujKod(String value) {
        this.castZujKod = value;
    }

    /**
     * Gets the value of the castZuj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCastZuj() {
        return castZuj;
    }

    /**
     * Sets the value of the castZuj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCastZuj(String value) {
        this.castZuj = value;
    }

    /**
     * Gets the value of the mestskaCastZujKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMestskaCastZujKod() {
        return mestskaCastZujKod;
    }

    /**
     * Sets the value of the mestskaCastZujKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMestskaCastZujKod(String value) {
        this.mestskaCastZujKod = value;
    }

    /**
     * Gets the value of the mestskaCastZuj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMestskaCastZuj() {
        return mestskaCastZuj;
    }

    /**
     * Sets the value of the mestskaCastZuj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMestskaCastZuj(String value) {
        this.mestskaCastZuj = value;
    }

}
