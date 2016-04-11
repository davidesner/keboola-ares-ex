
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
 * Jmeni z Kapitálu, nové v 1.0.2 (D:T znovu od 26.1.2010)
 * 
 * <p>Java class for jmeni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jmeni">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PIK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}angazma" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vklad" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SPL" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}splaceno" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TSP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ZP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KOM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TUP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="T" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}text" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "jmeni", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "pik",
    "vk",
    "spl",
    "tsp",
    "zp",
    "op",
    "kom",
    "tup",
    "t"
})
public class Jmeni2 {

    @XmlElement(name = "PIK")
    protected List<Angazma2> pik;
    @XmlElement(name = "VK")
    protected List<Vklad2> vk;
    @XmlElement(name = "SPL")
    protected List<Splaceno2> spl;
    @XmlElement(name = "TSP")
    protected List<Texty2> tsp;
    @XmlElement(name = "ZP")
    protected List<Texty2> zp;
    @XmlElement(name = "OP")
    protected List<Texty2> op;
    @XmlElement(name = "KOM")
    protected List<Texty2> kom;
    @XmlElement(name = "TUP")
    protected List<Texty2> tup;
    @XmlElement(name = "T")
    protected List<String> t;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;

    /**
     * Gets the value of the pik property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pik property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Angazma2 }
     * 
     * 
     */
    public List<Angazma2> getPIK() {
        if (pik == null) {
            pik = new ArrayList<Angazma2>();
        }
        return this.pik;
    }

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tsp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTSP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty2 }
     * 
     * 
     */
    public List<Texty2> getTSP() {
        if (tsp == null) {
            tsp = new ArrayList<Texty2>();
        }
        return this.tsp;
    }

    /**
     * Gets the value of the zp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty2 }
     * 
     * 
     */
    public List<Texty2> getZP() {
        if (zp == null) {
            zp = new ArrayList<Texty2>();
        }
        return this.zp;
    }

    /**
     * Gets the value of the op property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the op property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty2 }
     * 
     * 
     */
    public List<Texty2> getOP() {
        if (op == null) {
            op = new ArrayList<Texty2>();
        }
        return this.op;
    }

    /**
     * Gets the value of the kom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKOM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty2 }
     * 
     * 
     */
    public List<Texty2> getKOM() {
        if (kom == null) {
            kom = new ArrayList<Texty2>();
        }
        return this.kom;
    }

    /**
     * Gets the value of the tup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty2 }
     * 
     * 
     */
    public List<Texty2> getTUP() {
        if (tup == null) {
            tup = new ArrayList<Texty2>();
        }
        return this.tup;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getT() {
        if (t == null) {
            t = new ArrayList<String>();
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
