
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odpoved_stdadr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odpoved_stdadr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Stdadr_dotaz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stdadr_dotaz" minOccurs="0"/>
 *         &lt;element name="Stdadr_odpoved" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stdadr_odpoved" minOccurs="0"/>
 *         &lt;element name="E" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}error_ARES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odpoved_stdadr", propOrder = {
    "pid",
    "stdadrDotaz",
    "stdadrOdpoved",
    "e"
})
public class OdpovedStdadr {

    @XmlElement(name = "PID")
    protected Integer pid;
    @XmlElement(name = "Stdadr_dotaz")
    protected StdadrDotaz stdadrDotaz;
    @XmlElement(name = "Stdadr_odpoved")
    protected StdadrOdpoved stdadrOdpoved;
    @XmlElement(name = "E")
    protected ErrorARES3 e;

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPID() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPID(Integer value) {
        this.pid = value;
    }

    /**
     * Gets the value of the stdadrDotaz property.
     * 
     * @return
     *     possible object is
     *     {@link StdadrDotaz }
     *     
     */
    public StdadrDotaz getStdadrDotaz() {
        return stdadrDotaz;
    }

    /**
     * Sets the value of the stdadrDotaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdadrDotaz }
     *     
     */
    public void setStdadrDotaz(StdadrDotaz value) {
        this.stdadrDotaz = value;
    }

    /**
     * Gets the value of the stdadrOdpoved property.
     * 
     * @return
     *     possible object is
     *     {@link StdadrOdpoved }
     *     
     */
    public StdadrOdpoved getStdadrOdpoved() {
        return stdadrOdpoved;
    }

    /**
     * Sets the value of the stdadrOdpoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdadrOdpoved }
     *     
     */
    public void setStdadrOdpoved(StdadrOdpoved value) {
        this.stdadrOdpoved = value;
    }

    /**
     * Gets the value of the e property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorARES3 }
     *     
     */
    public ErrorARES3 getE() {
        return e;
    }

    /**
     * Sets the value of the e property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorARES3 }
     *     
     */
    public void setE(ErrorARES3 value) {
        this.e = value;
    }

}
