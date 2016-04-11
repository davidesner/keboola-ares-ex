
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Standardizace adres pro rejstøíkové soudy opíše došlý dotaz a pøidá k nìmu nalezenou odpovìï
 * 
 * <p>Java class for stadrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stadrs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Stadrs_dotaz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stadrs_dotaz"/>
 *         &lt;element name="Stadrs_odpoved" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stadrs_odpoved"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stadrs", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "stadrsDotaz",
    "stadrsOdpoved"
})
public class Stadrs {

    @XmlElement(name = "Stadrs_dotaz", required = true)
    protected StadrsDotaz stadrsDotaz;
    @XmlElement(name = "Stadrs_odpoved", required = true)
    protected StadrsOdpoved stadrsOdpoved;

    /**
     * Gets the value of the stadrsDotaz property.
     * 
     * @return
     *     possible object is
     *     {@link StadrsDotaz }
     *     
     */
    public StadrsDotaz getStadrsDotaz() {
        return stadrsDotaz;
    }

    /**
     * Sets the value of the stadrsDotaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StadrsDotaz }
     *     
     */
    public void setStadrsDotaz(StadrsDotaz value) {
        this.stadrsDotaz = value;
    }

    /**
     * Gets the value of the stadrsOdpoved property.
     * 
     * @return
     *     possible object is
     *     {@link StadrsOdpoved }
     *     
     */
    public StadrsOdpoved getStadrsOdpoved() {
        return stadrsOdpoved;
    }

    /**
     * Sets the value of the stadrsOdpoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link StadrsOdpoved }
     *     
     */
    public void setStadrsOdpoved(StadrsOdpoved value) {
        this.stadrsOdpoved = value;
    }

}
