
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Informace o registraci církve
 * 
 * <p>Java class for registrace_RCNS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrace_RCNS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Datum_reg_prav" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Cislo_reg_prav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}cislo_registrace" minOccurs="0"/>
 *         &lt;element name="Datum_zrus_reg_prav" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Cislo_zrus_reg_prav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}cislo_registrace" minOccurs="0"/>
 *         &lt;element name="DV" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Cislo_registrace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}cislo_registrace" minOccurs="0"/>
 *         &lt;element name="Datum_zrus_reg" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Cislo_zrus_reg" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}cislo_registrace" minOccurs="0"/>
 *         &lt;element name="Datum_likvidace" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Datum_konkurzu" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DZ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Zpusob_vymazu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zpusob_vymazu" minOccurs="0"/>
 *         &lt;element name="Nastupce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="Zrizovatel" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrace_RCNS", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "datumRegPrav",
    "cisloRegPrav",
    "datumZrusRegPrav",
    "cisloZrusRegPrav",
    "dv",
    "cisloRegistrace",
    "datumZrusReg",
    "cisloZrusReg",
    "datumLikvidace",
    "datumKonkurzu",
    "dz",
    "zpusobVymazu",
    "nastupce",
    "zrizovatel"
})
public class RegistraceRCNS2 {

    @XmlElement(name = "Datum_reg_prav")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumRegPrav;
    @XmlElement(name = "Cislo_reg_prav")
    protected String cisloRegPrav;
    @XmlElement(name = "Datum_zrus_reg_prav")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZrusRegPrav;
    @XmlElement(name = "Cislo_zrus_reg_prav")
    protected String cisloZrusRegPrav;
    @XmlElement(name = "DV")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dv;
    @XmlElement(name = "Cislo_registrace")
    protected String cisloRegistrace;
    @XmlElement(name = "Datum_zrus_reg")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZrusReg;
    @XmlElement(name = "Cislo_zrus_reg")
    protected String cisloZrusReg;
    @XmlElement(name = "Datum_likvidace")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumLikvidace;
    @XmlElement(name = "Datum_konkurzu")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumKonkurzu;
    @XmlElement(name = "DZ")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dz;
    @XmlElement(name = "Zpusob_vymazu")
    protected String zpusobVymazu;
    @XmlElement(name = "Nastupce")
    protected String nastupce;
    @XmlElement(name = "Zrizovatel")
    protected String zrizovatel;

    /**
     * Gets the value of the datumRegPrav property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumRegPrav() {
        return datumRegPrav;
    }

    /**
     * Sets the value of the datumRegPrav property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumRegPrav(XMLGregorianCalendar value) {
        this.datumRegPrav = value;
    }

    /**
     * Gets the value of the cisloRegPrav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloRegPrav() {
        return cisloRegPrav;
    }

    /**
     * Sets the value of the cisloRegPrav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloRegPrav(String value) {
        this.cisloRegPrav = value;
    }

    /**
     * Gets the value of the datumZrusRegPrav property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZrusRegPrav() {
        return datumZrusRegPrav;
    }

    /**
     * Sets the value of the datumZrusRegPrav property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZrusRegPrav(XMLGregorianCalendar value) {
        this.datumZrusRegPrav = value;
    }

    /**
     * Gets the value of the cisloZrusRegPrav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloZrusRegPrav() {
        return cisloZrusRegPrav;
    }

    /**
     * Sets the value of the cisloZrusRegPrav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloZrusRegPrav(String value) {
        this.cisloZrusRegPrav = value;
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
     * Gets the value of the cisloRegistrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloRegistrace() {
        return cisloRegistrace;
    }

    /**
     * Sets the value of the cisloRegistrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloRegistrace(String value) {
        this.cisloRegistrace = value;
    }

    /**
     * Gets the value of the datumZrusReg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZrusReg() {
        return datumZrusReg;
    }

    /**
     * Sets the value of the datumZrusReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZrusReg(XMLGregorianCalendar value) {
        this.datumZrusReg = value;
    }

    /**
     * Gets the value of the cisloZrusReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloZrusReg() {
        return cisloZrusReg;
    }

    /**
     * Sets the value of the cisloZrusReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloZrusReg(String value) {
        this.cisloZrusReg = value;
    }

    /**
     * Gets the value of the datumLikvidace property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumLikvidace() {
        return datumLikvidace;
    }

    /**
     * Sets the value of the datumLikvidace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumLikvidace(XMLGregorianCalendar value) {
        this.datumLikvidace = value;
    }

    /**
     * Gets the value of the datumKonkurzu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumKonkurzu() {
        return datumKonkurzu;
    }

    /**
     * Sets the value of the datumKonkurzu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumKonkurzu(XMLGregorianCalendar value) {
        this.datumKonkurzu = value;
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
     * Gets the value of the zpusobVymazu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZpusobVymazu() {
        return zpusobVymazu;
    }

    /**
     * Sets the value of the zpusobVymazu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZpusobVymazu(String value) {
        this.zpusobVymazu = value;
    }

    /**
     * Gets the value of the nastupce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNastupce() {
        return nastupce;
    }

    /**
     * Sets the value of the nastupce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNastupce(String value) {
        this.nastupce = value;
    }

    /**
     * Gets the value of the zrizovatel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZrizovatel() {
        return zrizovatel;
    }

    /**
     * Sets the value of the zrizovatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZrizovatel(String value) {
        this.zrizovatel = value;
    }

}
