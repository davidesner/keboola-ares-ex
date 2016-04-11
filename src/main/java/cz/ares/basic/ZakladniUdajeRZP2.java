
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Základní identifikaèní a alokaèní údaje ekonomického subjektu
 * 
 * <p>Java class for zakladni_udaje_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_RZP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="ZIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="PFR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}pravni_forma_RZP" minOccurs="0"/>
 *         &lt;element name="DV" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DZ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="SI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="MP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_RZP", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "s",
    "ico",
    "zic",
    "of",
    "pfr",
    "dv",
    "dz",
    "si",
    "mp"
})
public class ZakladniUdajeRZP2 {

    @XmlElement(name = "S")
    protected String s;
    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "ZIC")
    protected String zic;
    @XmlElement(name = "OF")
    protected String of;
    @XmlElement(name = "PFR")
    protected PravniFormaRZP2 pfr;
    @XmlElement(name = "DV")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dv;
    @XmlElement(name = "DZ")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dz;
    @XmlElement(name = "SI")
    protected AdresaARES2 si;
    @XmlElement(name = "MP")
    protected AdresaARES2 mp;

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS(String value) {
        this.s = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICO() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICO(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the zic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIC() {
        return zic;
    }

    /**
     * Sets the value of the zic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIC(String value) {
        this.zic = value;
    }

    /**
     * Gets the value of the of property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOF() {
        return of;
    }

    /**
     * Sets the value of the of property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOF(String value) {
        this.of = value;
    }

    /**
     * Gets the value of the pfr property.
     * 
     * @return
     *     possible object is
     *     {@link PravniFormaRZP2 }
     *     
     */
    public PravniFormaRZP2 getPFR() {
        return pfr;
    }

    /**
     * Sets the value of the pfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniFormaRZP2 }
     *     
     */
    public void setPFR(PravniFormaRZP2 value) {
        this.pfr = value;
    }

    /**
     * Gets the value of the dv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDV() {
        return dv;
    }

    /**
     * Sets the value of the dv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDV(XMLGregorianCalendar value) {
        this.dv = value;
    }

    /**
     * Gets the value of the dz property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDZ() {
        return dz;
    }

    /**
     * Sets the value of the dz property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDZ(XMLGregorianCalendar value) {
        this.dz = value;
    }

    /**
     * Gets the value of the si property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getSI() {
        return si;
    }

    /**
     * Sets the value of the si property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setSI(AdresaARES2 value) {
        this.si = value;
    }

    /**
     * Gets the value of the mp property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getMP() {
        return mp;
    }

    /**
     * Sets the value of the mp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setMP(AdresaARES2 value) {
        this.mp = value;
    }

}
