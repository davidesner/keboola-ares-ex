
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
 *         &lt;element name="VK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vklad" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SPL" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}splaceno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TSP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" minOccurs="0"/>
 *         &lt;element name="ZP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" minOccurs="0"/>
 *         &lt;element name="OP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" minOccurs="0"/>
 *         &lt;element name="KOM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" minOccurs="0"/>
 *         &lt;element name="TUP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" minOccurs="0"/>
 *         &lt;element name="T" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" minOccurs="0"/>
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
@XmlType(name = "vklad_spolecnika", propOrder = {
    "vk",
    "spl",
    "tsp",
    "zp",
    "op",
    "kom",
    "tup",
    "t"
})
public class VkladSpolecnika3 {

    @XmlElement(name = "VK")
    protected List<Vklad3> vk;
    @XmlElement(name = "SPL")
    protected List<Splaceno3> spl;
    @XmlElement(name = "TSP")
    protected Texty3 tsp;
    @XmlElement(name = "ZP")
    protected Texty3 zp;
    @XmlElement(name = "OP")
    protected Texty3 op;
    @XmlElement(name = "KOM")
    protected Texty3 kom;
    @XmlElement(name = "TUP")
    protected Texty3 tup;
    @XmlElement(name = "T")
    protected Texty3 t;
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
     * {@link Vklad3 }
     * 
     * 
     */
    public List<Vklad3> getVK() {
        if (vk == null) {
            vk = new ArrayList<Vklad3>();
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
     * {@link Splaceno3 }
     * 
     * 
     */
    public List<Splaceno3> getSPL() {
        if (spl == null) {
            spl = new ArrayList<Splaceno3>();
        }
        return this.spl;
    }

    /**
     * Gets the value of the tsp property.
     * 
     * @return
     *     possible object is
     *     {@link Texty3 }
     *     
     */
    public Texty3 getTSP() {
        return tsp;
    }

    /**
     * Sets the value of the tsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty3 }
     *     
     */
    public void setTSP(Texty3 value) {
        this.tsp = value;
    }

    /**
     * Gets the value of the zp property.
     * 
     * @return
     *     possible object is
     *     {@link Texty3 }
     *     
     */
    public Texty3 getZP() {
        return zp;
    }

    /**
     * Sets the value of the zp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty3 }
     *     
     */
    public void setZP(Texty3 value) {
        this.zp = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link Texty3 }
     *     
     */
    public Texty3 getOP() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty3 }
     *     
     */
    public void setOP(Texty3 value) {
        this.op = value;
    }

    /**
     * Gets the value of the kom property.
     * 
     * @return
     *     possible object is
     *     {@link Texty3 }
     *     
     */
    public Texty3 getKOM() {
        return kom;
    }

    /**
     * Sets the value of the kom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty3 }
     *     
     */
    public void setKOM(Texty3 value) {
        this.kom = value;
    }

    /**
     * Gets the value of the tup property.
     * 
     * @return
     *     possible object is
     *     {@link Texty3 }
     *     
     */
    public Texty3 getTUP() {
        return tup;
    }

    /**
     * Sets the value of the tup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty3 }
     *     
     */
    public void setTUP(Texty3 value) {
        this.tup = value;
    }

    /**
     * Gets the value of the t property.
     * 
     * @return
     *     possible object is
     *     {@link Texty3 }
     *     
     */
    public Texty3 getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty3 }
     *     
     */
    public void setT(Texty3 value) {
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
