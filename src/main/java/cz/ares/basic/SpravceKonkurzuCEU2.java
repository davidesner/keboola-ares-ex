
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Správci konkurzu
 * 
 * <p>Java class for spravce_konkurzu_CEU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spravce_konkurzu_CEU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cele_jmeno_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis"/>
 *         &lt;element name="A_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="B_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spravce_konkurzu_CEU", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "celeJmenoSpravce",
    "aSpravce",
    "bSpravce"
})
public class SpravceKonkurzuCEU2 {

    @XmlElement(name = "Cele_jmeno_spravce", required = true)
    protected String celeJmenoSpravce;
    @XmlElement(name = "A_spravce")
    protected AdresaARES2 aSpravce;
    @XmlElement(name = "B_spravce")
    protected AdresaARES2 bSpravce;

    /**
     * Gets the value of the celeJmenoSpravce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeleJmenoSpravce() {
        return celeJmenoSpravce;
    }

    /**
     * Sets the value of the celeJmenoSpravce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeleJmenoSpravce(String value) {
        this.celeJmenoSpravce = value;
    }

    /**
     * Gets the value of the aSpravce property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getASpravce() {
        return aSpravce;
    }

    /**
     * Sets the value of the aSpravce property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setASpravce(AdresaARES2 value) {
        this.aSpravce = value;
    }

    /**
     * Gets the value of the bSpravce property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getBSpravce() {
        return bSpravce;
    }

    /**
     * Sets the value of the bSpravce property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setBSpravce(AdresaARES2 value) {
        this.bSpravce = value;
    }

}
