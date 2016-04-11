
package cz.ares.basic;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for zadani complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zadani">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="C_zdroje" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Zdroj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zdroj_type" minOccurs="0"/>
 *         &lt;element name="C_davky_od" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="C_davky_do" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="D_davky_od" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="D_davky_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="p" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}priznak_zmeny" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="C_davky" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}cislo_davky" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zadani", propOrder = {
    "cZdroje",
    "zdroj",
    "cDavkyOd",
    "cDavkyDo",
    "dDavkyOd",
    "dDavkyDo",
    "p",
    "cDavky"
})
public class Zadani {

    @XmlElement(name = "C_zdroje")
    protected Short cZdroje;
    @XmlElement(name = "Zdroj")
    protected ZdrojType3 zdroj;
    @XmlElement(name = "C_davky_od")
    protected BigInteger cDavkyOd;
    @XmlElement(name = "C_davky_do")
    protected BigInteger cDavkyDo;
    @XmlElement(name = "D_davky_od")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dDavkyOd;
    @XmlElement(name = "D_davky_do")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dDavkyDo;
    protected List<PriznakZmeny> p;
    @XmlElement(name = "C_davky")
    protected List<CisloDavky> cDavky;

    /**
     * Gets the value of the cZdroje property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCZdroje() {
        return cZdroje;
    }

    /**
     * Sets the value of the cZdroje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCZdroje(Short value) {
        this.cZdroje = value;
    }

    /**
     * Gets the value of the zdroj property.
     * 
     * @return
     *     possible object is
     *     {@link ZdrojType3 }
     *     
     */
    public ZdrojType3 getZdroj() {
        return zdroj;
    }

    /**
     * Sets the value of the zdroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZdrojType3 }
     *     
     */
    public void setZdroj(ZdrojType3 value) {
        this.zdroj = value;
    }

    /**
     * Gets the value of the cDavkyOd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCDavkyOd() {
        return cDavkyOd;
    }

    /**
     * Sets the value of the cDavkyOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCDavkyOd(BigInteger value) {
        this.cDavkyOd = value;
    }

    /**
     * Gets the value of the cDavkyDo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCDavkyDo() {
        return cDavkyDo;
    }

    /**
     * Sets the value of the cDavkyDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCDavkyDo(BigInteger value) {
        this.cDavkyDo = value;
    }

    /**
     * Gets the value of the dDavkyOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDDavkyOd() {
        return dDavkyOd;
    }

    /**
     * Sets the value of the dDavkyOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDDavkyOd(XMLGregorianCalendar value) {
        this.dDavkyOd = value;
    }

    /**
     * Gets the value of the dDavkyDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDDavkyDo() {
        return dDavkyDo;
    }

    /**
     * Sets the value of the dDavkyDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDDavkyDo(XMLGregorianCalendar value) {
        this.dDavkyDo = value;
    }

    /**
     * Gets the value of the p property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the p property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriznakZmeny }
     * 
     * 
     */
    public List<PriznakZmeny> getP() {
        if (p == null) {
            p = new ArrayList<PriznakZmeny>();
        }
        return this.p;
    }

    /**
     * Gets the value of the cDavky property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cDavky property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDavky().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CisloDavky }
     * 
     * 
     */
    public List<CisloDavky> getCDavky() {
        if (cDavky == null) {
            cDavky = new ArrayList<CisloDavky>();
        }
        return this.cDavky;
    }

}
