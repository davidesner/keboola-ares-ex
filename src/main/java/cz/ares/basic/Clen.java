
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
 * Èlen statutárního a jiných orgánù
 * 
 * <p>Java class for clen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Clen" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}angazma" minOccurs="0"/>
 *         &lt;element name="Clenstvi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}trvani" minOccurs="0"/>
 *         &lt;element name="Ve_funkci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}trvani" minOccurs="0"/>
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
@XmlType(name = "clen", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "clen",
    "clenstvi",
    "veFunkci",
    "text"
})
public class Clen {

    @XmlElement(name = "Clen")
    protected Angazma clen;
    @XmlElement(name = "Clenstvi")
    protected Trvani clenstvi;
    @XmlElement(name = "Ve_funkci")
    protected Trvani veFunkci;
    @XmlElement(name = "Text")
    protected List<TextType> text;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;

    /**
     * Gets the value of the clen property.
     * 
     * @return
     *     possible object is
     *     {@link Angazma }
     *     
     */
    public Angazma getClen() {
        return clen;
    }

    /**
     * Sets the value of the clen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Angazma }
     *     
     */
    public void setClen(Angazma value) {
        this.clen = value;
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
