
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
 * <p>Java class for zakladni_udaje_IR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_IR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="S" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}spisova_znacka_IR"/>
 *         &lt;element name="Osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}osoba_IR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_IR", propOrder = {
    "pod",
    "la",
    "s",
    "sz",
    "osoba"
})
public class ZakladniUdajeIR {

    @XmlElement(name = "POD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pod;
    @XmlElement(name = "LA")
    protected int la;
    @XmlElement(name = "S")
    protected Integer s;
    @XmlElement(name = "SZ", required = true)
    protected SpisovaZnackaIR sz;
    @XmlElement(name = "Osoba")
    protected OsobaIR osoba;

    /**
     * Gets the value of the pod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPOD() {
        return pod;
    }

    /**
     * Sets the value of the pod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPOD(XMLGregorianCalendar value) {
        this.pod = value;
    }

    /**
     * Gets the value of the la property.
     * 
     */
    public int getLA() {
        return la;
    }

    /**
     * Sets the value of the la property.
     * 
     */
    public void setLA(int value) {
        this.la = value;
    }

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setS(Integer value) {
        this.s = value;
    }

    /**
     * Gets the value of the sz property.
     * 
     * @return
     *     possible object is
     *     {@link SpisovaZnackaIR }
     *     
     */
    public SpisovaZnackaIR getSZ() {
        return sz;
    }

    /**
     * Sets the value of the sz property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpisovaZnackaIR }
     *     
     */
    public void setSZ(SpisovaZnackaIR value) {
        this.sz = value;
    }

    /**
     * Gets the value of the osoba property.
     * 
     * @return
     *     possible object is
     *     {@link OsobaIR }
     *     
     */
    public OsobaIR getOsoba() {
        return osoba;
    }

    /**
     * Sets the value of the osoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaIR }
     *     
     */
    public void setOsoba(OsobaIR value) {
        this.osoba = value;
    }

}
