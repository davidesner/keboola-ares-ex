
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
 *         &lt;element name="Uvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}uvod" minOccurs="0"/>
 *         &lt;element name="Zakladni_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zakladni_udaje_RZP"/>
 *         &lt;element name="Registrace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}registrace_RZP" minOccurs="0"/>
 *         &lt;element name="Pocet_zivnosti" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Zivnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zivnosti_RZP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_RZP", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "uvod",
    "zakladniUdaje",
    "registrace",
    "pocetZivnosti",
    "zivnosti"
})
public class VypisRZP {

    @XmlElement(name = "Uvod")
    protected Uvod uvod;
    @XmlElement(name = "Zakladni_udaje", required = true)
    protected ZakladniUdajeRZP zakladniUdaje;
    @XmlElement(name = "Registrace")
    protected RegistraceRZP registrace;
    @XmlElement(name = "Pocet_zivnosti")
    protected BigInteger pocetZivnosti;
    @XmlElement(name = "Zivnosti")
    protected ZivnostiRZP zivnosti;

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod }
     *     
     */
    public Uvod getUvod() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod }
     *     
     */
    public void setUvod(Uvod value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the zakladniUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeRZP }
     *     
     */
    public ZakladniUdajeRZP getZakladniUdaje() {
        return zakladniUdaje;
    }

    /**
     * Sets the value of the zakladniUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRZP }
     *     
     */
    public void setZakladniUdaje(ZakladniUdajeRZP value) {
        this.zakladniUdaje = value;
    }

    /**
     * Gets the value of the registrace property.
     * 
     * @return
     *     possible object is
     *     {@link RegistraceRZP }
     *     
     */
    public RegistraceRZP getRegistrace() {
        return registrace;
    }

    /**
     * Sets the value of the registrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistraceRZP }
     *     
     */
    public void setRegistrace(RegistraceRZP value) {
        this.registrace = value;
    }

    /**
     * Gets the value of the pocetZivnosti property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPocetZivnosti() {
        return pocetZivnosti;
    }

    /**
     * Sets the value of the pocetZivnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPocetZivnosti(BigInteger value) {
        this.pocetZivnosti = value;
    }

    /**
     * Gets the value of the zivnosti property.
     * 
     * @return
     *     possible object is
     *     {@link ZivnostiRZP }
     *     
     */
    public ZivnostiRZP getZivnosti() {
        return zivnosti;
    }

    /**
     * Sets the value of the zivnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZivnostiRZP }
     *     
     */
    public void setZivnosti(ZivnostiRZP value) {
        this.zivnosti = value;
    }

}
