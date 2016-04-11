
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agenda_kod_nazev complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agenda_kod_nazev">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kagendy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="Nagendy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agenda_kod_nazev", propOrder = {
    "kagendy",
    "nagendy"
})
public class AgendaKodNazev {

    @XmlElement(name = "Kagendy")
    protected String kagendy;
    @XmlElement(name = "Nagendy")
    protected String nagendy;

    /**
     * Gets the value of the kagendy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKagendy() {
        return kagendy;
    }

    /**
     * Sets the value of the kagendy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKagendy(String value) {
        this.kagendy = value;
    }

    /**
     * Gets the value of the nagendy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNagendy() {
        return nagendy;
    }

    /**
     * Sets the value of the nagendy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNagendy(String value) {
        this.nagendy = value;
    }

}
