
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Datová schránka subjektu, Typ_DS je dvoumístný èíselný kód jehož textový popis je v Nazev_typds
 * 
 * <p>Java class for datova_schranka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datova_schranka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Priznak" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}priznak_ros"/>
 *         &lt;element name="DS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ds" minOccurs="0"/>
 *         &lt;element name="Typ_DS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="Nazev_typds" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datova_schranka", propOrder = {
    "priznak",
    "ds",
    "typDS",
    "nazevTypds"
})
public class DatovaSchranka {

    @XmlElement(name = "Priznak")
    protected byte priznak;
    @XmlElement(name = "DS")
    protected String ds;
    @XmlElement(name = "Typ_DS")
    protected String typDS;
    @XmlElement(name = "Nazev_typds")
    protected String nazevTypds;

    /**
     * Gets the value of the priznak property.
     * 
     */
    public byte getPriznak() {
        return priznak;
    }

    /**
     * Sets the value of the priznak property.
     * 
     */
    public void setPriznak(byte value) {
        this.priznak = value;
    }

    /**
     * Gets the value of the ds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS() {
        return ds;
    }

    /**
     * Sets the value of the ds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS(String value) {
        this.ds = value;
    }

    /**
     * Gets the value of the typDS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypDS() {
        return typDS;
    }

    /**
     * Sets the value of the typDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypDS(String value) {
        this.typDS = value;
    }

    /**
     * Gets the value of the nazevTypds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevTypds() {
        return nazevTypds;
    }

    /**
     * Sets the value of the nazevTypds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevTypds(String value) {
        this.nazevTypds = value;
    }

}
