
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Právní forma vèetnì popisných položek
 * 
 * <p>Java class for pravni_forma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pravni_forma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kod_PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_pravni_formy" minOccurs="0"/>
 *         &lt;element name="Nazev_PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_pravni_formy" minOccurs="0"/>
 *         &lt;element name="PF_osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}pf_osoba" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}textType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TZU_osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}tzu_osoba" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="zdroj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zdroj_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pravni_forma", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kodPF",
    "nazevPF",
    "pfOsoba",
    "text",
    "tzuOsoba"
})
public class PravniForma {

    @XmlElement(name = "Kod_PF")
    protected Short kodPF;
    @XmlElement(name = "Nazev_PF")
    protected String nazevPF;
    @XmlElement(name = "PF_osoba")
    protected PfOsoba pfOsoba;
    @XmlElement(name = "Text")
    protected List<TextType> text;
    @XmlElement(name = "TZU_osoba")
    protected TzuOsoba tzuOsoba;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;
    @XmlAttribute
    protected ZdrojType zdroj;

    /**
     * Gets the value of the kodPF property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKodPF() {
        return kodPF;
    }

    /**
     * Sets the value of the kodPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKodPF(Short value) {
        this.kodPF = value;
    }

    /**
     * Gets the value of the nazevPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevPF() {
        return nazevPF;
    }

    /**
     * Sets the value of the nazevPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevPF(String value) {
        this.nazevPF = value;
    }

    /**
     * Gets the value of the pfOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link PfOsoba }
     *     
     */
    public PfOsoba getPFOsoba() {
        return pfOsoba;
    }

    /**
     * Sets the value of the pfOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link PfOsoba }
     *     
     */
    public void setPFOsoba(PfOsoba value) {
        this.pfOsoba = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getText() {
        if (text == null) {
            text = new ArrayList<TextType>();
        }
        return this.text;
    }

    /**
     * Gets the value of the tzuOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link TzuOsoba }
     *     
     */
    public TzuOsoba getTZUOsoba() {
        return tzuOsoba;
    }

    /**
     * Sets the value of the tzuOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link TzuOsoba }
     *     
     */
    public void setTZUOsoba(TzuOsoba value) {
        this.tzuOsoba = value;
    }

    /**
     * Gets the value of the dod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDod() {
        return dod;
    }

    /**
     * Sets the value of the dod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDod(XMLGregorianCalendar value) {
        this.dod = value;
    }

    /**
     * Gets the value of the ddo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDdo() {
        return ddo;
    }

    /**
     * Sets the value of the ddo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDdo(XMLGregorianCalendar value) {
        this.ddo = value;
    }

    /**
     * Gets the value of the zdroj property.
     * 
     * @return
     *     possible object is
     *     {@link ZdrojType }
     *     
     */
    public ZdrojType getZdroj() {
        return zdroj;
    }

    /**
     * Sets the value of the zdroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZdrojType }
     *     
     */
    public void setZdroj(ZdrojType value) {
        this.zdroj = value;
    }

}
