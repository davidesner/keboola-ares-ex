
package cz.ares.basic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Údaje o provozovnách subjektu
 * 
 * <p>Java class for provozovna complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provozovna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Zahajeni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Ukonceni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Typ_provozovny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}typ_provozovny" minOccurs="0"/>
 *         &lt;element name="NPR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}nazev_provozovny" minOccurs="0"/>
 *         &lt;element name="AP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES"/>
 *         &lt;element name="ICP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}icp" minOccurs="0"/>
 *         &lt;element name="Obory_cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}obory_cinnosti" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provozovna", propOrder = {
    "zahajeni",
    "ukonceni",
    "typProvozovny",
    "npr",
    "ap",
    "icp",
    "oboryCinnosti"
})
public class Provozovna {

    @XmlElement(name = "Zahajeni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zahajeni;
    @XmlElement(name = "Ukonceni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ukonceni;
    @XmlElement(name = "Typ_provozovny")
    protected String typProvozovny;
    @XmlElement(name = "NPR")
    protected String npr;
    @XmlElement(name = "AP", required = true)
    protected AdresaARES3 ap;
    @XmlElement(name = "ICP")
    protected BigDecimal icp;
    @XmlElement(name = "Obory_cinnosti")
    protected OboryCinnosti3 oboryCinnosti;

    /**
     * Gets the value of the zahajeni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZahajeni() {
        return zahajeni;
    }

    /**
     * Sets the value of the zahajeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZahajeni(XMLGregorianCalendar value) {
        this.zahajeni = value;
    }

    /**
     * Gets the value of the ukonceni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUkonceni() {
        return ukonceni;
    }

    /**
     * Sets the value of the ukonceni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUkonceni(XMLGregorianCalendar value) {
        this.ukonceni = value;
    }

    /**
     * Gets the value of the typProvozovny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypProvozovny() {
        return typProvozovny;
    }

    /**
     * Sets the value of the typProvozovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypProvozovny(String value) {
        this.typProvozovny = value;
    }

    /**
     * Gets the value of the npr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPR() {
        return npr;
    }

    /**
     * Sets the value of the npr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPR(String value) {
        this.npr = value;
    }

    /**
     * Gets the value of the ap property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getAP() {
        return ap;
    }

    /**
     * Sets the value of the ap property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setAP(AdresaARES3 value) {
        this.ap = value;
    }

    /**
     * Gets the value of the icp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getICP() {
        return icp;
    }

    /**
     * Sets the value of the icp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setICP(BigDecimal value) {
        this.icp = value;
    }

    /**
     * Gets the value of the oboryCinnosti property.
     * 
     * @return
     *     possible object is
     *     {@link OboryCinnosti3 }
     *     
     */
    public OboryCinnosti3 getOboryCinnosti() {
        return oboryCinnosti;
    }

    /**
     * Sets the value of the oboryCinnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link OboryCinnosti3 }
     *     
     */
    public void setOboryCinnosti(OboryCinnosti3 value) {
        this.oboryCinnosti = value;
    }

}
