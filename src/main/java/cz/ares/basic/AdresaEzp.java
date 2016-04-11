
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * údaje o adrese osoby, podnikatele v EZP
 * 
 * <p>Java class for adresa_ezp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresa_ezp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="N" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce" minOccurs="0"/>
 *         &lt;element name="NCO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_casti_obce" minOccurs="0"/>
 *         &lt;element name="NU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="CD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}cis_dom" minOccurs="0"/>
 *         &lt;element name="TCD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}typ_cis_dom" minOccurs="0"/>
 *         &lt;element name="CO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}cis_or_sp" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}psc" minOccurs="0"/>
 *         &lt;element name="Nazev_posty" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="48"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresa_ezp", propOrder = {
    "ida",
    "n",
    "nco",
    "nu",
    "cd",
    "tcd",
    "co",
    "psc",
    "nazevPosty"
})
public class AdresaEzp {

    @XmlElement(name = "IDA")
    protected String ida;
    @XmlElement(name = "N")
    protected String n;
    @XmlElement(name = "NCO")
    protected String nco;
    @XmlElement(name = "NU")
    protected String nu;
    @XmlElement(name = "CD")
    protected Integer cd;
    @XmlElement(name = "TCD")
    protected Byte tcd;
    @XmlElement(name = "CO")
    protected String co;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "Nazev_posty")
    protected String nazevPosty;

    /**
     * Gets the value of the ida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDA() {
        return ida;
    }

    /**
     * Sets the value of the ida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDA(String value) {
        this.ida = value;
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
     * Gets the value of the nazevPosty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevPosty() {
        return nazevPosty;
    }

    /**
     * Sets the value of the nazevPosty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevPosty(String value) {
        this.nazevPosty = value;
    }

}
