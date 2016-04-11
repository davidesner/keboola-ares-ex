
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
 *         &lt;element name="Platnost_od" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Typ_datumu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}text" minOccurs="0"/>
 *         &lt;element name="Typ_zmeny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}typ_zmeny" minOccurs="0"/>
 *         &lt;element name="Usneseni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ID_usneseni" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Stav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "udalost", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "platnostOd",
    "typDatumu",
    "typZmeny",
    "usneseni",
    "idUsneseni",
    "stav"
})
public class Udalost {

    @XmlElement(name = "Platnost_od")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar platnostOd;
    @XmlElement(name = "Typ_datumu")
    protected String typDatumu;
    @XmlElement(name = "Typ_zmeny")
    protected TypZmeny typZmeny;
    @XmlElement(name = "Usneseni")
    protected Boolean usneseni;
    @XmlElement(name = "ID_usneseni")
    protected BigInteger idUsneseni;
    @XmlElement(name = "Stav")
    protected Stav stav;

    /**
     * Gets the value of the platnostOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlatnostOd() {
        return platnostOd;
    }

    /**
     * Sets the value of the platnostOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlatnostOd(XMLGregorianCalendar value) {
        this.platnostOd = value;
    }

    /**
     * Gets the value of the typDatumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypDatumu() {
        return typDatumu;
    }

    /**
     * Sets the value of the typDatumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypDatumu(String value) {
        this.typDatumu = value;
    }

    /**
     * Gets the value of the typZmeny property.
     * 
     * @return
     *     possible object is
     *     {@link TypZmeny }
     *     
     */
    public TypZmeny getTypZmeny() {
        return typZmeny;
    }

    /**
     * Sets the value of the typZmeny property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypZmeny }
     *     
     */
    public void setTypZmeny(TypZmeny value) {
        this.typZmeny = value;
    }

    /**
     * Gets the value of the usneseni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsneseni() {
        return usneseni;
    }

    /**
     * Sets the value of the usneseni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsneseni(Boolean value) {
        this.usneseni = value;
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
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link Stav }
     *     
     */
    public Stav getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stav }
     *     
     */
    public void setStav(Stav value) {
        this.stav = value;
    }

}
