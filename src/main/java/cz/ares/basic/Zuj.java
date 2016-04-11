
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
 *         &lt;element name="Zuj_kod_orig" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="NZUJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_obce" minOccurs="0"/>
 *         &lt;element name="Kod_okresu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_okresu" minOccurs="0"/>
 *         &lt;element name="Nazev_okresu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="NUTS4" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}cznuts" minOccurs="0"/>
 *         &lt;element name="Nazev_NUTS4" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="Obec_zuj_kod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_obce" minOccurs="0"/>
 *         &lt;element name="Obec_zuj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Cast_zuj_kod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_casti_obce" minOccurs="0"/>
 *         &lt;element name="Cast_zuj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Mestska_cast_zuj_kod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_mestske_casti" minOccurs="0"/>
 *         &lt;element name="Mestska_cast_zuj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zuj", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "zujKodOrig",
    "nzuj",
    "kodOkresu",
    "nazevOkresu",
    "nuts4",
    "nazevNUTS4",
    "obecZujKod",
    "obecZuj",
    "castZujKod",
    "castZuj",
    "mestskaCastZujKod",
    "mestskaCastZuj"
})
public class Zuj {

    @XmlElement(name = "Zuj_kod_orig")
    protected String zujKodOrig;
    @XmlElement(name = "NZUJ")
    protected String nzuj;
    @XmlElement(name = "Kod_okresu")
    protected Integer kodOkresu;
    @XmlElement(name = "Nazev_okresu")
    protected String nazevOkresu;
    @XmlElement(name = "NUTS4")
    protected String nuts4;
    @XmlElement(name = "Nazev_NUTS4")
    protected String nazevNUTS4;
    @XmlElement(name = "Obec_zuj_kod")
    protected String obecZujKod;
    @XmlElement(name = "Obec_zuj")
    protected String obecZuj;
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
     * Gets the value of the nazevOkresu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevOkresu() {
        return nazevOkresu;
    }

    /**
     * Sets the value of the nazevOkresu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevOkresu(String value) {
        this.nazevOkresu = value;
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
     * Gets the value of the obecZujKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObecZujKod() {
        return obecZujKod;
    }

    /**
     * Sets the value of the obecZujKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObecZujKod(String value) {
        this.obecZujKod = value;
    }

    /**
     * Gets the value of the obecZuj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObecZuj() {
        return obecZuj;
    }

    /**
     * Sets the value of the obecZuj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObecZuj(String value) {
        this.obecZuj = value;
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
