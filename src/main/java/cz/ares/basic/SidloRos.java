
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sidlo_ros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sidlo_ros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Priznak" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}priznak_ros"/>
 *         &lt;element name="SI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sidlo_ros", propOrder = {
    "priznak",
    "si"
})
public class SidloRos {

    @XmlElement(name = "Priznak")
    protected byte priznak;
    @XmlElement(name = "SI")
    protected AdresaARES3 si;

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
     * Gets the value of the si property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getSI() {
        return si;
    }

    /**
     * Sets the value of the si property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setSI(AdresaARES3 value) {
        this.si = value;
    }

}
