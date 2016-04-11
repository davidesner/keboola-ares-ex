
package cz.ares.basic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for udalost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="udalost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TDA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}text" minOccurs="0"/>
 *         &lt;element name="TZM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}typ_zmeny" minOccurs="0"/>
 *         &lt;element name="US" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ID_usneseni" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="S" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stav" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "udalost", propOrder = {
    "pod",
    "tda",
    "tzm",
    "us",
    "idUsneseni",
    "s"
})
public class Udalost3 {

    @XmlElement(name = "POD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pod;
    @XmlElement(name = "TDA")
    protected String tda;
    @XmlElement(name = "TZM")
    protected TypZmeny3 tzm;
    @XmlElement(name = "US")
    protected Boolean us;
    @XmlElement(name = "ID_usneseni")
    protected BigInteger idUsneseni;
    @XmlElement(name = "S")
    protected Stav3 s;

    /**
     * Gets the value of the pod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPOD() {
        return pod;
    }

    /**
     * Sets the value of the pod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPOD(XMLGregorianCalendar value) {
        this.pod = value;
    }

    /**
     * Gets the value of the tda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDA() {
        return tda;
    }

    /**
     * Sets the value of the tda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDA(String value) {
        this.tda = value;
    }

    /**
     * Gets the value of the tzm property.
     * 
     * @return
     *     possible object is
     *     {@link TypZmeny3 }
     *     
     */
    public TypZmeny3 getTZM() {
        return tzm;
    }

    /**
     * Sets the value of the tzm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypZmeny3 }
     *     
     */
    public void setTZM(TypZmeny3 value) {
        this.tzm = value;
    }

    /**
     * Gets the value of the us property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUS() {
        return us;
    }

    /**
     * Sets the value of the us property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUS(Boolean value) {
        this.us = value;
    }

    /**
     * Gets the value of the idUsneseni property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDUsneseni() {
        return idUsneseni;
    }

    /**
     * Sets the value of the idUsneseni property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDUsneseni(BigInteger value) {
        this.idUsneseni = value;
    }

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link Stav3 }
     *     
     */
    public Stav3 getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stav3 }
     *     
     */
    public void setS(Stav3 value) {
        this.s = value;
    }

}
