
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Výpis detailu jednoho subjektu v CEU po odkazu ze str. Pøehledu
 * 
 * <p>Java class for jednotlive_ukony complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jednotlive_ukony">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ukon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="spzn" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}detailni_spisova_znacka" minOccurs="0"/>
 *         &lt;element name="SD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}soud" minOccurs="0"/>
 *         &lt;element name="url_det" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jednotlive_ukony", propOrder = {
    "ukon",
    "d",
    "spzn",
    "sd",
    "urlDet"
})
public class JednotliveUkony {

    protected String ukon;
    @XmlElement(name = "D")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    protected DetailniSpisovaZnacka spzn;
    @XmlElement(name = "SD")
    protected Soud3 sd;
    @XmlElement(name = "url_det")
    protected String urlDet;

    /**
     * Gets the value of the ukon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUkon() {
        return ukon;
    }

    /**
     * Sets the value of the ukon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUkon(String value) {
        this.ukon = value;
    }

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setD(XMLGregorianCalendar value) {
        this.d = value;
    }

    /**
     * Gets the value of the spzn property.
     * 
     * @return
     *     possible object is
     *     {@link DetailniSpisovaZnacka }
     *     
     */
    public DetailniSpisovaZnacka getSpzn() {
        return spzn;
    }

    /**
     * Sets the value of the spzn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailniSpisovaZnacka }
     *     
     */
    public void setSpzn(DetailniSpisovaZnacka value) {
        this.spzn = value;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Soud3 }
     *     
     */
    public Soud3 getSD() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soud3 }
     *     
     */
    public void setSD(Soud3 value) {
        this.sd = value;
    }

    /**
     * Gets the value of the urlDet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlDet() {
        return urlDet;
    }

    /**
     * Sets the value of the urlDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlDet(String value) {
        this.urlDet = value;
    }

}
