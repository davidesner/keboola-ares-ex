
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o registraci subjektu
 * 
 * <p>Java class for registrace_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrace_RZP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zivnostensky_urad" minOccurs="0"/>
 *         &lt;element name="VJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ano_ne" minOccurs="0"/>
 *         &lt;element name="OR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ano_ne" minOccurs="0"/>
 *         &lt;element name="FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}financni_urad" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="aktivni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ano_ne" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrace_RZP", propOrder = {
    "zu",
    "vj",
    "or",
    "fu"
})
public class RegistraceRZP3 {

    @XmlElement(name = "ZU")
    protected ZivnostenskyUrad3 zu;
    @XmlElement(name = "VJ")
    protected String vj;
    @XmlElement(name = "OR")
    protected String or;
    @XmlElement(name = "FU")
    protected FinancniUrad3 fu;
    @XmlAttribute
    protected String aktivni;

    /**
     * Gets the value of the zu property.
     * 
     * @return
     *     possible object is
     *     {@link ZivnostenskyUrad3 }
     *     
     */
    public ZivnostenskyUrad3 getZU() {
        return zu;
    }

    /**
     * Sets the value of the zu property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZivnostenskyUrad3 }
     *     
     */
    public void setZU(ZivnostenskyUrad3 value) {
        this.zu = value;
    }

    /**
     * Gets the value of the vj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVJ() {
        return vj;
    }

    /**
     * Sets the value of the vj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVJ(String value) {
        this.vj = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOR() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOR(String value) {
        this.or = value;
    }

    /**
     * Gets the value of the fu property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad3 }
     *     
     */
    public FinancniUrad3 getFU() {
        return fu;
    }

    /**
     * Sets the value of the fu property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad3 }
     *     
     */
    public void setFU(FinancniUrad3 value) {
        this.fu = value;
    }

    /**
     * Gets the value of the aktivni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktivni() {
        return aktivni;
    }

    /**
     * Sets the value of the aktivni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktivni(String value) {
        this.aktivni = value;
    }

}
