
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
 * Kombinované angažmá - kombinace údajù  PO a FO, vèetnì vkladu spoleèníka (v id je slovo vklad)
 * 
 * <p>Java class for angazma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="angazma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kod_angm" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Funkce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Oznaceni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Pravnicka_osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}pravnicka_osoba" minOccurs="0"/>
 *         &lt;element name="Fyzicka_osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}fyzicka_osoba" minOccurs="0"/>
 *         &lt;element name="Clenstvi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}trvani" minOccurs="0"/>
 *         &lt;element name="Ve_funkci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}trvani" minOccurs="0"/>
 *         &lt;element name="Vklad_spolecnika" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}vklad_spolecnika" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}textType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "angazma", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kodAngm",
    "funkce",
    "oznaceni",
    "pravnickaOsoba",
    "fyzickaOsoba",
    "clenstvi",
    "veFunkci",
    "vkladSpolecnika",
    "text"
})
public class Angazma {

    @XmlElement(name = "Kod_angm")
    protected Short kodAngm;
    @XmlElement(name = "Funkce")
    protected String funkce;
    @XmlElement(name = "Oznaceni")
    protected String oznaceni;
    @XmlElement(name = "Pravnicka_osoba")
    protected PravnickaOsoba pravnickaOsoba;
    @XmlElement(name = "Fyzicka_osoba")
    protected FyzickaOsoba fyzickaOsoba;
    @XmlElement(name = "Clenstvi")
    protected Trvani clenstvi;
    @XmlElement(name = "Ve_funkci")
    protected Trvani veFunkci;
    @XmlElement(name = "Vklad_spolecnika")
    protected List<VkladSpolecnika> vkladSpolecnika;
    @XmlElement(name = "Text")
    protected List<TextType> text;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;

    /**
     * Gets the value of the kodAngm property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKodAngm() {
        return kodAngm;
    }

    /**
     * Sets the value of the kodAngm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKodAngm(Short value) {
        this.kodAngm = value;
    }

    /**
     * Gets the value of the funkce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunkce() {
        return funkce;
    }

    /**
     * Sets the value of the funkce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunkce(String value) {
        this.funkce = value;
    }

    /**
     * Gets the value of the oznaceni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOznaceni() {
        return oznaceni;
    }

    /**
     * Sets the value of the oznaceni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOznaceni(String value) {
        this.oznaceni = value;
    }

    /**
     * Gets the value of the pravnickaOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link PravnickaOsoba }
     *     
     */
    public PravnickaOsoba getPravnickaOsoba() {
        return pravnickaOsoba;
    }

    /**
     * Sets the value of the pravnickaOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravnickaOsoba }
     *     
     */
    public void setPravnickaOsoba(PravnickaOsoba value) {
        this.pravnickaOsoba = value;
    }

    /**
     * Gets the value of the fyzickaOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link FyzickaOsoba }
     *     
     */
    public FyzickaOsoba getFyzickaOsoba() {
        return fyzickaOsoba;
    }

    /**
     * Sets the value of the fyzickaOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link FyzickaOsoba }
     *     
     */
    public void setFyzickaOsoba(FyzickaOsoba value) {
        this.fyzickaOsoba = value;
    }

    /**
     * Gets the value of the clenstvi property.
     * 
     * @return
     *     possible object is
     *     {@link Trvani }
     *     
     */
    public Trvani getClenstvi() {
        return clenstvi;
    }

    /**
     * Sets the value of the clenstvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trvani }
     *     
     */
    public void setClenstvi(Trvani value) {
        this.clenstvi = value;
    }

    /**
     * Gets the value of the veFunkci property.
     * 
     * @return
     *     possible object is
     *     {@link Trvani }
     *     
     */
    public Trvani getVeFunkci() {
        return veFunkci;
    }

    /**
     * Sets the value of the veFunkci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trvani }
     *     
     */
    public void setVeFunkci(Trvani value) {
        this.veFunkci = value;
    }

    /**
     * Gets the value of the vkladSpolecnika property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vkladSpolecnika property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVkladSpolecnika().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VkladSpolecnika }
     * 
     * 
     */
    public List<VkladSpolecnika> getVkladSpolecnika() {
        if (vkladSpolecnika == null) {
            vkladSpolecnika = new ArrayList<VkladSpolecnika>();
        }
        return this.vkladSpolecnika;
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

}
