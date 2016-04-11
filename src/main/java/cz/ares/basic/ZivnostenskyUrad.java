
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Živnostenský úøad (vz_ciurady)
 * 
 * <p>Java class for zivnostensky_urad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zivnostensky_urad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kod_ZU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nazev_ZU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}nazev_ZU"/>
 *         &lt;element name="Nazev_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_obce" minOccurs="0"/>
 *         &lt;element name="Nazev_ulice" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}psc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zivnostensky_urad", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kodZU",
    "nazevZU",
    "nazevObce",
    "nazevUlice",
    "psc"
})
public class ZivnostenskyUrad {

    @XmlElement(name = "Kod_ZU")
    protected int kodZU;
    @XmlElement(name = "Nazev_ZU", required = true)
    protected String nazevZU;
    @XmlElement(name = "Nazev_obce")
    protected String nazevObce;
    @XmlElement(name = "Nazev_ulice")
    protected String nazevUlice;
    @XmlElement(name = "PSC")
    protected String psc;

    /**
     * Gets the value of the kodZU property.
     * 
     */
    public int getKodZU() {
        return kodZU;
    }

    /**
     * Sets the value of the kodZU property.
     * 
     */
    public void setKodZU(int value) {
        this.kodZU = value;
    }

    /**
     * Gets the value of the nazevZU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevZU() {
        return nazevZU;
    }

    /**
     * Sets the value of the nazevZU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevZU(String value) {
        this.nazevZU = value;
    }

    /**
     * Gets the value of the nazevObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevObce() {
        return nazevObce;
    }

    /**
     * Sets the value of the nazevObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevObce(String value) {
        this.nazevObce = value;
    }

    /**
     * Gets the value of the nazevUlice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevUlice() {
        return nazevUlice;
    }

    /**
     * Sets the value of the nazevUlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevUlice(String value) {
        this.nazevUlice = value;
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

}
