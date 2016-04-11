
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
 *         &lt;element name="Cele_jmeno_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis"/>
 *         &lt;element name="Adresa_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="Bydliste_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spravce_konkurzu_CEU", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "celeJmenoSpravce",
    "adresaSpravce",
    "bydlisteSpravce"
})
public class SpravceKonkurzuCEU {

    @XmlElement(name = "Cele_jmeno_spravce", required = true)
    protected String celeJmenoSpravce;
    @XmlElement(name = "Adresa_spravce")
    protected AdresaARES adresaSpravce;
    @XmlElement(name = "Bydliste_spravce")
    protected AdresaARES bydlisteSpravce;

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
     * Gets the value of the adresaSpravce property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getAdresaSpravce() {
        return adresaSpravce;
    }

    /**
     * Sets the value of the adresaSpravce property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setAdresaSpravce(AdresaARES value) {
        this.adresaSpravce = value;
    }

    /**
     * Gets the value of the bydlisteSpravce property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getBydlisteSpravce() {
        return bydlisteSpravce;
    }

    /**
     * Sets the value of the bydlisteSpravce property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setBydlisteSpravce(AdresaARES value) {
        this.bydlisteSpravce = value;
    }

}
