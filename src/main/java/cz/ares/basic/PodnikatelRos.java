
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for podnikatel_ros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="podnikatel_ros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Priznak" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}priznak_ros"/>
 *         &lt;element name="J" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}jmeno" minOccurs="0"/>
 *         &lt;element name="P" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}prijmeni" minOccurs="0"/>
 *         &lt;element name="Narozeni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Umrti" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TOsoby" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}osoba_textem" minOccurs="0"/>
 *         &lt;element name="B" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "podnikatel_ros", propOrder = {
    "priznak",
    "j",
    "p",
    "narozeni",
    "umrti",
    "tOsoby",
    "b"
})
public class PodnikatelRos {

    @XmlElement(name = "Priznak")
    protected byte priznak;
    @XmlElement(name = "J")
    protected String j;
    @XmlElement(name = "P")
    protected String p;
    @XmlElement(name = "Narozeni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar narozeni;
    @XmlElement(name = "Umrti")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar umrti;
    @XmlElement(name = "TOsoby")
    protected String tOsoby;
    @XmlElement(name = "B")
    protected AdresaARES3 b;

    /**
     * Gets the value of the priznak property.
     * 
     */
    public byte getPriznak() {
        return priznak;
    }

    /**
     * Sets the value of the priznak property.
     * 
     */
    public void setPriznak(byte value) {
        this.priznak = value;
    }

    /**
     * Gets the value of the j property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJ() {
        return j;
    }

    /**
     * Sets the value of the j property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJ(String value) {
        this.j = value;
    }

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP(String value) {
        this.p = value;
    }

    /**
     * Gets the value of the narozeni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNarozeni() {
        return narozeni;
    }

    /**
     * Sets the value of the narozeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNarozeni(XMLGregorianCalendar value) {
        this.narozeni = value;
    }

    /**
     * Gets the value of the umrti property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUmrti() {
        return umrti;
    }

    /**
     * Sets the value of the umrti property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUmrti(XMLGregorianCalendar value) {
        this.umrti = value;
    }

    /**
     * Gets the value of the tOsoby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOsoby() {
        return tOsoby;
    }

    /**
     * Sets the value of the tOsoby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOsoby(String value) {
        this.tOsoby = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setB(AdresaARES3 value) {
        this.b = value;
    }

}
