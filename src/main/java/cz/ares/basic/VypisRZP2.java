
package cz.ares.basic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis z rejstøíku živnostenského podnikání v ARES
 * 
 * <p>Java class for vypis_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_RZP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UVOD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}uvod" minOccurs="0"/>
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zakladni_udaje_RZP"/>
 *         &lt;element name="REG" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}registrace_RZP" minOccurs="0"/>
 *         &lt;element name="PZI" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ZI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zivnosti_RZP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_RZP", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "uvod",
    "zau",
    "reg",
    "pzi",
    "zi"
})
public class VypisRZP2 {

    @XmlElement(name = "UVOD")
    protected Uvod2 uvod;
    @XmlElement(name = "ZAU", required = true)
    protected ZakladniUdajeRZP2 zau;
    @XmlElement(name = "REG")
    protected RegistraceRZP2 reg;
    @XmlElement(name = "PZI")
    protected BigInteger pzi;
    @XmlElement(name = "ZI")
    protected ZivnostiRZP2 zi;

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod2 }
     *     
     */
    public Uvod2 getUVOD() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod2 }
     *     
     */
    public void setUVOD(Uvod2 value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the zau property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeRZP2 }
     *     
     */
    public ZakladniUdajeRZP2 getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRZP2 }
     *     
     */
    public void setZAU(ZakladniUdajeRZP2 value) {
        this.zau = value;
    }

    /**
     * Gets the value of the reg property.
     * 
     * @return
     *     possible object is
     *     {@link RegistraceRZP2 }
     *     
     */
    public RegistraceRZP2 getREG() {
        return reg;
    }

    /**
     * Sets the value of the reg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistraceRZP2 }
     *     
     */
    public void setREG(RegistraceRZP2 value) {
        this.reg = value;
    }

    /**
     * Gets the value of the pzi property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPZI() {
        return pzi;
    }

    /**
     * Sets the value of the pzi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPZI(BigInteger value) {
        this.pzi = value;
    }

    /**
     * Gets the value of the zi property.
     * 
     * @return
     *     possible object is
     *     {@link ZivnostiRZP2 }
     *     
     */
    public ZivnostiRZP2 getZI() {
        return zi;
    }

    /**
     * Sets the value of the zi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZivnostiRZP2 }
     *     
     */
    public void setZI(ZivnostiRZP2 value) {
        this.zi = value;
    }

}
