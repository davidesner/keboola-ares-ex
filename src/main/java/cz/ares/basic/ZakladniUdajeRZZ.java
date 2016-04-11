
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
 * <p>Java class for zakladni_udaje_RZZ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_RZZ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/>
 *         &lt;element name="Druh_zarizeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="Typ_ZZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}typ_zdravotnickeho_zarizeni" minOccurs="0"/>
 *         &lt;element name="Financni_urad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}financni_urad" minOccurs="0"/>
 *         &lt;element name="Datum_vzniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Datum_zaniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_RZZ", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "ico",
    "druhZarizeni",
    "typZZ",
    "financniUrad",
    "datumVzniku",
    "datumZaniku"
})
public class ZakladniUdajeRZZ {

    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Druh_zarizeni")
    protected String druhZarizeni;
    @XmlElement(name = "Typ_ZZ")
    protected TypZdravotnickehoZarizeni typZZ;
    @XmlElement(name = "Financni_urad")
    protected FinancniUrad financniUrad;
    @XmlElement(name = "Datum_vzniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVzniku;
    @XmlElement(name = "Datum_zaniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZaniku;

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
     * Gets the value of the druhZarizeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDruhZarizeni() {
        return druhZarizeni;
    }

    /**
     * Sets the value of the druhZarizeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDruhZarizeni(String value) {
        this.druhZarizeni = value;
    }

    /**
     * Gets the value of the typZZ property.
     * 
     * @return
     *     possible object is
     *     {@link TypZdravotnickehoZarizeni }
     *     
     */
    public TypZdravotnickehoZarizeni getTypZZ() {
        return typZZ;
    }

    /**
     * Sets the value of the typZZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypZdravotnickehoZarizeni }
     *     
     */
    public void setTypZZ(TypZdravotnickehoZarizeni value) {
        this.typZZ = value;
    }

    /**
     * Gets the value of the financniUrad property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad }
     *     
     */
    public FinancniUrad getFinancniUrad() {
        return financniUrad;
    }

    /**
     * Sets the value of the financniUrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad }
     *     
     */
    public void setFinancniUrad(FinancniUrad value) {
        this.financniUrad = value;
    }

    /**
     * Gets the value of the datumVzniku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVzniku() {
        return datumVzniku;
    }

    /**
     * Sets the value of the datumVzniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVzniku(XMLGregorianCalendar value) {
        this.datumVzniku = value;
    }

    /**
     * Gets the value of the datumZaniku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZaniku() {
        return datumZaniku;
    }

    /**
     * Sets the value of the datumZaniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZaniku(XMLGregorianCalendar value) {
        this.datumZaniku = value;
    }

}
