
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
 *         &lt;element name="KAN" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="F" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="Oznaceni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="PO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}pravnicka_osoba" minOccurs="0"/>
 *         &lt;element name="FO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}fyzicka_osoba" minOccurs="0"/>
 *         &lt;element name="CLE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}trvani" minOccurs="0"/>
 *         &lt;element name="VF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}trvani" minOccurs="0"/>
 *         &lt;element name="VKS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vklad_spolecnika" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="T" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}textType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "angazma", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "kan",
    "f",
    "oznaceni",
    "po",
    "fo",
    "cle",
    "vf",
    "vks",
    "t"
})
public class Angazma2 {

    @XmlElement(name = "KAN")
    protected Short kan;
    @XmlElement(name = "F")
    protected String f;
    @XmlElement(name = "Oznaceni")
    protected String oznaceni;
    @XmlElement(name = "PO")
    protected PravnickaOsoba2 po;
    @XmlElement(name = "FO")
    protected FyzickaOsoba2 fo;
    @XmlElement(name = "CLE")
    protected Trvani2 cle;
    @XmlElement(name = "VF")
    protected Trvani2 vf;
    @XmlElement(name = "VKS")
    protected List<VkladSpolecnika2> vks;
    @XmlElement(name = "T")
    protected List<TextType2> t;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;

    /**
     * Gets the value of the kan property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKAN() {
        return kan;
    }

    /**
     * Sets the value of the kan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKAN(Short value) {
        this.kan = value;
    }

    /**
     * Gets the value of the f property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF() {
        return f;
    }

    /**
     * Sets the value of the f property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF(String value) {
        this.f = value;
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
     * Gets the value of the po property.
     * 
     * @return
     *     possible object is
     *     {@link PravnickaOsoba2 }
     *     
     */
    public PravnickaOsoba2 getPO() {
        return po;
    }

    /**
     * Sets the value of the po property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravnickaOsoba2 }
     *     
     */
    public void setPO(PravnickaOsoba2 value) {
        this.po = value;
    }

    /**
     * Gets the value of the fo property.
     * 
     * @return
     *     possible object is
     *     {@link FyzickaOsoba2 }
     *     
     */
    public FyzickaOsoba2 getFO() {
        return fo;
    }

    /**
     * Sets the value of the fo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FyzickaOsoba2 }
     *     
     */
    public void setFO(FyzickaOsoba2 value) {
        this.fo = value;
    }

    /**
     * Gets the value of the cle property.
     * 
     * @return
     *     possible object is
     *     {@link Trvani2 }
     *     
     */
    public Trvani2 getCLE() {
        return cle;
    }

    /**
     * Sets the value of the cle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trvani2 }
     *     
     */
    public void setCLE(Trvani2 value) {
        this.cle = value;
    }

    /**
     * Gets the value of the vf property.
     * 
     * @return
     *     possible object is
     *     {@link Trvani2 }
     *     
     */
    public Trvani2 getVF() {
        return vf;
    }

    /**
     * Sets the value of the vf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trvani2 }
     *     
     */
    public void setVF(Trvani2 value) {
        this.vf = value;
    }

    /**
     * Gets the value of the vks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVKS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VkladSpolecnika2 }
     * 
     * 
     */
    public List<VkladSpolecnika2> getVKS() {
        if (vks == null) {
            vks = new ArrayList<VkladSpolecnika2>();
        }
        return this.vks;
    }

    /**
     * Gets the value of the t property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType2 }
     * 
     * 
     */
    public List<TextType2> getT() {
        if (t == null) {
            t = new ArrayList<TextType2>();
        }
        return this.t;
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
