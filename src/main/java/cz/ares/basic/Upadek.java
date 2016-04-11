
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Údaje o jedné živnosti
 * 
 * <p>Java class for upadek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="upadek">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Zapis" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Platnost" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Typ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}typ_upadku"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upadek", propOrder = {
    "zapis",
    "platnost",
    "typ"
})
public class Upadek {

    @XmlElement(name = "Zapis", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zapis;
    @XmlElement(name = "Platnost")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar platnost;
    @XmlElement(name = "Typ", required = true)
    protected TypUpadku typ;

    /**
     * Gets the value of the zapis property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZapis() {
        return zapis;
    }

    /**
     * Sets the value of the zapis property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZapis(XMLGregorianCalendar value) {
        this.zapis = value;
    }

    /**
     * Gets the value of the platnost property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlatnost() {
        return platnost;
    }

    /**
     * Sets the value of the platnost property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlatnost(XMLGregorianCalendar value) {
        this.platnost = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link TypUpadku }
     *     
     */
    public TypUpadku getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypUpadku }
     *     
     */
    public void setTyp(TypUpadku value) {
        this.typ = value;
    }

}
