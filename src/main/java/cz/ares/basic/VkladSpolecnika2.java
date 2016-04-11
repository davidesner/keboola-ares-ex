
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
 * VK a jeho splacení
 * 
 * <p>Java class for vklad_spolecnika complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vklad_spolecnika">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vklad" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SPL" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}splaceno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TSP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" minOccurs="0"/>
 *         &lt;element name="ZP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" minOccurs="0"/>
 *         &lt;element name="OP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" minOccurs="0"/>
 *         &lt;element name="KOM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" minOccurs="0"/>
 *         &lt;element name="TUP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" minOccurs="0"/>
 *         &lt;element name="T" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" minOccurs="0"/>
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
@XmlType(name = "vklad_spolecnika", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "vk",
    "spl",
    "tsp",
    "zp",
    "op",
    "kom",
    "tup",
    "t"
})
public class VkladSpolecnika2 {

    @XmlElement(name = "VK")
    protected List<Vklad2> vk;
    @XmlElement(name = "SPL")
    protected List<Splaceno2> spl;
    @XmlElement(name = "TSP")
    protected Texty2 tsp;
    @XmlElement(name = "ZP")
    protected Texty2 zp;
    @XmlElement(name = "OP")
    protected Texty2 op;
    @XmlElement(name = "KOM")
    protected Texty2 kom;
    @XmlElement(name = "TUP")
    protected Texty2 tup;
    @XmlElement(name = "T")
    protected Texty2 t;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;

    /**
     * Gets the value of the vk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vklad2 }
     * 
     * 
     */
    public List<Vklad2> getVK() {
        if (vk == null) {
            vk = new ArrayList<Vklad2>();
        }
        return this.vk;
    }

    /**
     * Gets the value of the spl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Splaceno2 }
     * 
     * 
     */
    public List<Splaceno2> getSPL() {
        if (spl == null) {
            spl = new ArrayList<Splaceno2>();
        }
        return this.spl;
    }

    /**
     * Gets the value of the tsp property.
     * 
     * @return
     *     possible object is
     *     {@link Texty2 }
     *     
     */
    public Texty2 getTSP() {
        return tsp;
    }

    /**
     * Sets the value of the tsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty2 }
     *     
     */
    public void setTSP(Texty2 value) {
        this.tsp = value;
    }

    /**
     * Gets the value of the zp property.
     * 
     * @return
     *     possible object is
     *     {@link Texty2 }
     *     
     */
    public Texty2 getZP() {
        return zp;
    }

    /**
     * Sets the value of the zp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty2 }
     *     
     */
    public void setZP(Texty2 value) {
        this.zp = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link Texty2 }
     *     
     */
    public Texty2 getOP() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty2 }
     *     
     */
    public void setOP(Texty2 value) {
        this.op = value;
    }

    /**
     * Gets the value of the kom property.
     * 
     * @return
     *     possible object is
     *     {@link Texty2 }
     *     
     */
    public Texty2 getKOM() {
        return kom;
    }

    /**
     * Sets the value of the kom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty2 }
     *     
     */
    public void setKOM(Texty2 value) {
        this.kom = value;
    }

    /**
     * Gets the value of the tup property.
     * 
     * @return
     *     possible object is
     *     {@link Texty2 }
     *     
     */
    public Texty2 getTUP() {
        return tup;
    }

    /**
     * Sets the value of the tup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty2 }
     *     
     */
    public void setTUP(Texty2 value) {
        this.tup = value;
    }

    /**
     * Gets the value of the t property.
     * 
     * @return
     *     possible object is
     *     {@link Texty2 }
     *     
     */
    public Texty2 getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty2 }
     *     
     */
    public void setT(Texty2 value) {
        this.t = value;
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
