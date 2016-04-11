
package cz.ares.basic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Výpis jedné vìty z historie z insolvenèního rejstøíku podle ARES
 * 
 * <p>Java class for veta_IR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="veta_IR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Poradi" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Vznik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Popis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Uri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platnost_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "veta_IR", propOrder = {
    "poradi",
    "vznik",
    "popis",
    "id",
    "uri",
    "platnostDo"
})
public class VetaIR {

    @XmlElement(name = "Poradi")
    protected BigInteger poradi;
    @XmlElement(name = "Vznik")
    protected String vznik;
    @XmlElement(name = "Popis")
    protected String popis;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "Uri")
    protected String uri;
    @XmlElement(name = "Platnost_do")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar platnostDo;

    /**
     * Gets the value of the poradi property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPoradi() {
        return poradi;
    }

    /**
     * Sets the value of the poradi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPoradi(BigInteger value) {
        this.poradi = value;
    }

    /**
     * Gets the value of the vznik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVznik() {
        return vznik;
    }

    /**
     * Sets the value of the vznik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVznik(String value) {
        this.vznik = value;
    }

    /**
     * Gets the value of the popis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopis() {
        return popis;
    }

    /**
     * Sets the value of the popis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopis(String value) {
        this.popis = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
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
     * Gets the value of the platnostDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlatnostDo() {
        return platnostDo;
    }

    /**
     * Sets the value of the platnostDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlatnostDo(XMLGregorianCalendar value) {
        this.platnostDo = value;
    }

}
