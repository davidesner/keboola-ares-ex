
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * úvod dokumentu
 * 
 * <p>Java class for uvod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uvod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ND" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="ADB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DVY" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CAS" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="TV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="PDP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Typ_odkazu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="Typ_odpovedi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uvod", propOrder = {
    "nd",
    "adb",
    "dvy",
    "cas",
    "tv",
    "pdp",
    "typOdkazu",
    "typOdpovedi"
})
public class Uvod3 {

    @XmlElement(name = "ND")
    protected String nd;
    @XmlElement(name = "ADB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adb;
    @XmlElement(name = "DVY")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dvy;
    @XmlElement(name = "CAS")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar cas;
    @XmlElement(name = "TV")
    protected String tv;
    @XmlElement(name = "PDP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pdp;
    @XmlElement(name = "Typ_odkazu")
    protected String typOdkazu;
    @XmlElement(name = "Typ_odpovedi")
    protected String typOdpovedi;

    /**
     * Gets the value of the nd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getND() {
        return nd;
    }

    /**
     * Sets the value of the nd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setND(String value) {
        this.nd = value;
    }

    /**
     * Gets the value of the adb property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getADB() {
        return adb;
    }

    /**
     * Sets the value of the adb property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setADB(XMLGregorianCalendar value) {
        this.adb = value;
    }

    /**
     * Gets the value of the dvy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDVY() {
        return dvy;
    }

    /**
     * Sets the value of the dvy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDVY(XMLGregorianCalendar value) {
        this.dvy = value;
    }

    /**
     * Gets the value of the cas property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCAS() {
        return cas;
    }

    /**
     * Sets the value of the cas property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCAS(XMLGregorianCalendar value) {
        this.cas = value;
    }

    /**
     * Gets the value of the tv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTV() {
        return tv;
    }

    /**
     * Sets the value of the tv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTV(String value) {
        this.tv = value;
    }

    /**
     * Gets the value of the pdp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPDP() {
        return pdp;
    }

    /**
     * Sets the value of the pdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPDP(XMLGregorianCalendar value) {
        this.pdp = value;
    }

    /**
     * Gets the value of the typOdkazu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypOdkazu() {
        return typOdkazu;
    }

    /**
     * Sets the value of the typOdkazu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypOdkazu(String value) {
        this.typOdkazu = value;
    }

    /**
     * Gets the value of the typOdpovedi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypOdpovedi() {
        return typOdpovedi;
    }

    /**
     * Sets the value of the typOdpovedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypOdpovedi(String value) {
        this.typOdpovedi = value;
    }

}
