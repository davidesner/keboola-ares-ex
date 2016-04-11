
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Údaje k registraci, zrušení, likvidaci dle èíselníku rozhodnutí
 * 
 * <p>Java class for rozhodnuti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rozhodnuti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Typ_rozhodnuti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cislo_rozhodnuti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Datum_rozhodnuti" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Pravni_moc" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rozhodnuti", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "typRozhodnuti",
    "cisloRozhodnuti",
    "datumRozhodnuti",
    "pravniMoc"
})
public class Rozhodnuti {

    @XmlElement(name = "Typ_rozhodnuti")
    protected String typRozhodnuti;
    @XmlElement(name = "Cislo_rozhodnuti")
    protected String cisloRozhodnuti;
    @XmlElement(name = "Datum_rozhodnuti")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumRozhodnuti;
    @XmlElement(name = "Pravni_moc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pravniMoc;

    /**
     * Gets the value of the typRozhodnuti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypRozhodnuti() {
        return typRozhodnuti;
    }

    /**
     * Sets the value of the typRozhodnuti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypRozhodnuti(String value) {
        this.typRozhodnuti = value;
    }

    /**
     * Gets the value of the cisloRozhodnuti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloRozhodnuti() {
        return cisloRozhodnuti;
    }

    /**
     * Sets the value of the cisloRozhodnuti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloRozhodnuti(String value) {
        this.cisloRozhodnuti = value;
    }

    /**
     * Gets the value of the datumRozhodnuti property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumRozhodnuti() {
        return datumRozhodnuti;
    }

    /**
     * Sets the value of the datumRozhodnuti property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumRozhodnuti(XMLGregorianCalendar value) {
        this.datumRozhodnuti = value;
    }

    /**
     * Gets the value of the pravniMoc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPravniMoc() {
        return pravniMoc;
    }

    /**
     * Sets the value of the pravniMoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPravniMoc(XMLGregorianCalendar value) {
        this.pravniMoc = value;
    }

}
