
package cz.ares.basic;

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
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zakladni_udaje_RZP"/>
 *         &lt;element name="Adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresy_RZP" minOccurs="0"/>
 *         &lt;element name="Osoby" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}osoby_RZP" minOccurs="0"/>
 *         &lt;element name="ZI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zivnosti_RZP" minOccurs="0"/>
 *         &lt;element name="Upadky" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}upadky_RZP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_RZP", propOrder = {
    "zau",
    "adresy",
    "osoby",
    "zi",
    "upadky"
})
public class VypisRZP3 {

    @XmlElement(name = "ZAU", required = true)
    protected ZakladniUdajeRZP3 zau;
    @XmlElement(name = "Adresy")
    protected AdresyRZP adresy;
    @XmlElement(name = "Osoby")
    protected OsobyRZP osoby;
    @XmlElement(name = "ZI")
    protected ZivnostiRZP3 zi;
    @XmlElement(name = "Upadky")
    protected UpadkyRZP upadky;

    /**
     * Gets the value of the zau property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeRZP3 }
     *     
     */
    public ZakladniUdajeRZP3 getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRZP3 }
     *     
     */
    public void setZAU(ZakladniUdajeRZP3 value) {
        this.zau = value;
    }

    /**
     * Gets the value of the adresy property.
     * 
     * @return
     *     possible object is
     *     {@link AdresyRZP }
     *     
     */
    public AdresyRZP getAdresy() {
        return adresy;
    }

    /**
     * Sets the value of the adresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresyRZP }
     *     
     */
    public void setAdresy(AdresyRZP value) {
        this.adresy = value;
    }

    /**
     * Gets the value of the osoby property.
     * 
     * @return
     *     possible object is
     *     {@link OsobyRZP }
     *     
     */
    public OsobyRZP getOsoby() {
        return osoby;
    }

    /**
     * Sets the value of the osoby property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobyRZP }
     *     
     */
    public void setOsoby(OsobyRZP value) {
        this.osoby = value;
    }

    /**
     * Gets the value of the zi property.
     * 
     * @return
     *     possible object is
     *     {@link ZivnostiRZP3 }
     *     
     */
    public ZivnostiRZP3 getZI() {
        return zi;
    }

    /**
     * Sets the value of the zi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZivnostiRZP3 }
     *     
     */
    public void setZI(ZivnostiRZP3 value) {
        this.zi = value;
    }

    /**
     * Gets the value of the upadky property.
     * 
     * @return
     *     possible object is
     *     {@link UpadkyRZP }
     *     
     */
    public UpadkyRZP getUpadky() {
        return upadky;
    }

    /**
     * Sets the value of the upadky property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpadkyRZP }
     *     
     */
    public void setUpadky(UpadkyRZP value) {
        this.upadky = value;
    }

}
