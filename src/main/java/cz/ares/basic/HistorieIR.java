
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis historie z insolvenèního rejstøíku podle ARES
 * 
 * <p>Java class for historie_IR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="historie_IR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="A" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vety_IR" minOccurs="0"/>
 *         &lt;element name="B" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vety_IR" minOccurs="0"/>
 *         &lt;element name="C" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vety_IR" minOccurs="0"/>
 *         &lt;element name="D" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vety_IR" minOccurs="0"/>
 *         &lt;element name="P" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vety_IR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historie_IR", propOrder = {
    "a",
    "b",
    "c",
    "d",
    "p"
})
public class HistorieIR {

    @XmlElement(name = "A")
    protected VetyIR a;
    @XmlElement(name = "B")
    protected VetyIR b;
    @XmlElement(name = "C")
    protected VetyIR c;
    @XmlElement(name = "D")
    protected VetyIR d;
    @XmlElement(name = "P")
    protected VetyIR p;

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link VetyIR }
     *     
     */
    public VetyIR getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetyIR }
     *     
     */
    public void setA(VetyIR value) {
        this.a = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link VetyIR }
     *     
     */
    public VetyIR getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetyIR }
     *     
     */
    public void setB(VetyIR value) {
        this.b = value;
    }

    /**
     * Gets the value of the c property.
     * 
     * @return
     *     possible object is
     *     {@link VetyIR }
     *     
     */
    public VetyIR getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetyIR }
     *     
     */
    public void setC(VetyIR value) {
        this.c = value;
    }

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link VetyIR }
     *     
     */
    public VetyIR getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetyIR }
     *     
     */
    public void setD(VetyIR value) {
        this.d = value;
    }

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link VetyIR }
     *     
     */
    public VetyIR getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetyIR }
     *     
     */
    public void setP(VetyIR value) {
        this.p = value;
    }

}
