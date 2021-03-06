
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Základní identifikační a alokační údaje ekonomického subjektu
 * 
 * <p>Java class for zakladni_udaje_RES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_RES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="OF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}pravni_forma" minOccurs="0"/>
 *         &lt;element name="FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}financni_urad" minOccurs="0"/>
 *         &lt;element name="DV" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DZ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Zpusob_vzniku" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zpusob_vzniku_res" minOccurs="0"/>
 *         &lt;element name="Zpusob_zaniku" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zpusob_zaniku_res" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_RES", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "ico",
    "of",
    "pf",
    "fu",
    "dv",
    "dz",
    "zpusobVzniku",
    "zpusobZaniku"
})
public class ZakladniUdajeRES2 {

    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "OF")
    protected String of;
    @XmlElement(name = "PF")
    protected PravniForma2 pf;
    @XmlElement(name = "FU")
    protected FinancniUrad2 fu;
    @XmlElement(name = "DV")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dv;
    @XmlElement(name = "DZ")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dz;
    @XmlElement(name = "Zpusob_vzniku")
    protected Short zpusobVzniku;
    @XmlElement(name = "Zpusob_zaniku")
    protected Short zpusobZaniku;

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
     * Gets the value of the pf property.
     * 
     * @return
     *     possible object is
     *     {@link PravniForma2 }
     *     
     */
    public PravniForma2 getPF() {
        return pf;
    }

    /**
     * Sets the value of the pf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniForma2 }
     *     
     */
    public void setPF(PravniForma2 value) {
        this.pf = value;
    }

    /**
     * Gets the value of the fu property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad2 }
     *     
     */
    public FinancniUrad2 getFU() {
        return fu;
    }

    /**
     * Sets the value of the fu property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad2 }
     *     
     */
    public void setFU(FinancniUrad2 value) {
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

    /**
     * Gets the value of the zpusobVzniku property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getZpusobVzniku() {
        return zpusobVzniku;
    }

    /**
     * Sets the value of the zpusobVzniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setZpusobVzniku(Short value) {
        this.zpusobVzniku = value;
    }

    /**
     * Gets the value of the zpusobZaniku property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getZpusobZaniku() {
        return zpusobZaniku;
    }

    /**
     * Sets the value of the zpusobZaniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setZpusobZaniku(Short value) {
        this.zpusobZaniku = value;
    }

}
