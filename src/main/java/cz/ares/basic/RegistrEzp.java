
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Registr zemìdìlských podnikatelù.
 * 
 * <p>Java class for registr_ezp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registr_ezp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_zdroj" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Uri" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Kod_uradu" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Nazev_uradu" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Vyrazen" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ano_ne" minOccurs="0"/>
 *         &lt;element name="Podnikatel" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}podnikatel_ezp"/>
 *         &lt;element name="Ukony" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ukony_ezp" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="zdroj" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registr_ezp", propOrder = {
    "idZdroj",
    "uri",
    "kodUradu",
    "nazevUradu",
    "vyrazen",
    "podnikatel",
    "ukony"
})
public class RegistrEzp {

    @XmlElement(name = "Id_zdroj")
    protected String idZdroj;
    @XmlElement(name = "Uri")
    protected String uri;
    @XmlElement(name = "Kod_uradu")
    protected String kodUradu;
    @XmlElement(name = "Nazev_uradu")
    protected String nazevUradu;
    @XmlElement(name = "Vyrazen")
    protected String vyrazen;
    @XmlElement(name = "Podnikatel", required = true)
    protected PodnikatelEzp podnikatel;
    @XmlElement(name = "Ukony")
    protected UkonyEzp ukony;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;
    @XmlAttribute
    protected Integer zdroj;

    /**
     * Gets the value of the idZdroj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdZdroj() {
        return idZdroj;
    }

    /**
     * Sets the value of the idZdroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdZdroj(String value) {
        this.idZdroj = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the kodUradu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodUradu() {
        return kodUradu;
    }

    /**
     * Sets the value of the kodUradu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodUradu(String value) {
        this.kodUradu = value;
    }

    /**
     * Gets the value of the nazevUradu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevUradu() {
        return nazevUradu;
    }

    /**
     * Sets the value of the nazevUradu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevUradu(String value) {
        this.nazevUradu = value;
    }

    /**
     * Gets the value of the vyrazen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyrazen() {
        return vyrazen;
    }

    /**
     * Sets the value of the vyrazen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyrazen(String value) {
        this.vyrazen = value;
    }

    /**
     * Gets the value of the podnikatel property.
     * 
     * @return
     *     possible object is
     *     {@link PodnikatelEzp }
     *     
     */
    public PodnikatelEzp getPodnikatel() {
        return podnikatel;
    }

    /**
     * Sets the value of the podnikatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodnikatelEzp }
     *     
     */
    public void setPodnikatel(PodnikatelEzp value) {
        this.podnikatel = value;
    }

    /**
     * Gets the value of the ukony property.
     * 
     * @return
     *     possible object is
     *     {@link UkonyEzp }
     *     
     */
    public UkonyEzp getUkony() {
        return ukony;
    }

    /**
     * Sets the value of the ukony property.
     * 
     * @param value
     *     allowed object is
     *     {@link UkonyEzp }
     *     
     */
    public void setUkony(UkonyEzp value) {
        this.ukony = value;
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

    /**
     * Gets the value of the zdroj property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZdroj() {
        return zdroj;
    }

    /**
     * Sets the value of the zdroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZdroj(Integer value) {
        this.zdroj = value;
    }

}
