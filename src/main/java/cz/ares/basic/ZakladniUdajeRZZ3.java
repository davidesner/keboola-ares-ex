
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
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="Zaclenene_zarizeni" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Detasovane_pracoviste" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="DRZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="ZZT" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}typ_zdravotnickeho_zarizeni" minOccurs="0"/>
 *         &lt;element name="FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}financni_urad" minOccurs="0"/>
 *         &lt;element name="DV" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DZ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_RZZ", propOrder = {
    "ico",
    "zacleneneZarizeni",
    "detasovanePracoviste",
    "drz",
    "zzt",
    "fu",
    "dv",
    "dz"
})
public class ZakladniUdajeRZZ3 {

    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Zaclenene_zarizeni")
    protected Short zacleneneZarizeni;
    @XmlElement(name = "Detasovane_pracoviste")
    protected Short detasovanePracoviste;
    @XmlElement(name = "DRZ")
    protected String drz;
    @XmlElement(name = "ZZT")
    protected TypZdravotnickehoZarizeni3 zzt;
    @XmlElement(name = "FU")
    protected FinancniUrad3 fu;
    @XmlElement(name = "DV")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dv;
    @XmlElement(name = "DZ")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dz;

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
     * Gets the value of the zacleneneZarizeni property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getZacleneneZarizeni() {
        return zacleneneZarizeni;
    }

    /**
     * Sets the value of the zacleneneZarizeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setZacleneneZarizeni(Short value) {
        this.zacleneneZarizeni = value;
    }

    /**
     * Gets the value of the detasovanePracoviste property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDetasovanePracoviste() {
        return detasovanePracoviste;
    }

    /**
     * Sets the value of the detasovanePracoviste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDetasovanePracoviste(Short value) {
        this.detasovanePracoviste = value;
    }

    /**
     * Gets the value of the drz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRZ() {
        return drz;
    }

    /**
     * Sets the value of the drz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRZ(String value) {
        this.drz = value;
    }

    /**
     * Gets the value of the zzt property.
     * 
     * @return
     *     possible object is
     *     {@link TypZdravotnickehoZarizeni3 }
     *     
     */
    public TypZdravotnickehoZarizeni3 getZZT() {
        return zzt;
    }

    /**
     * Sets the value of the zzt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypZdravotnickehoZarizeni3 }
     *     
     */
    public void setZZT(TypZdravotnickehoZarizeni3 value) {
        this.zzt = value;
    }

    /**
     * Gets the value of the fu property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad3 }
     *     
     */
    public FinancniUrad3 getFU() {
        return fu;
    }

    /**
     * Sets the value of the fu property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad3 }
     *     
     */
    public void setFU(FinancniUrad3 value) {
        this.fu = value;
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

}
