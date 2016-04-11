
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * údaje o provozovne v SZR
 * 
 * <p>Java class for provozovna_szr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provozovna_szr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Klic" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_jednotky" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nazev_jednotky" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Zkratka_jednotky" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Osoba_szr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}osoba_szr" minOccurs="0"/>
 *         &lt;element name="Kontakty" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kontakty_szr" minOccurs="0"/>
 *         &lt;element name="Adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresy_szr" minOccurs="0"/>
 *         &lt;element name="Obory" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}obory_rvp" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provozovna_szr", propOrder = {
    "klic",
    "idJednotky",
    "nazevJednotky",
    "zkratkaJednotky",
    "osobaSzr",
    "kontakty",
    "adresy",
    "obory"
})
public class ProvozovnaSzr {

    @XmlElement(name = "Klic")
    protected int klic;
    @XmlElement(name = "Id_jednotky")
    protected Integer idJednotky;
    @XmlElement(name = "Nazev_jednotky")
    protected String nazevJednotky;
    @XmlElement(name = "Zkratka_jednotky")
    protected String zkratkaJednotky;
    @XmlElement(name = "Osoba_szr")
    protected OsobaSzr osobaSzr;
    @XmlElement(name = "Kontakty")
    protected KontaktySzr kontakty;
    @XmlElement(name = "Adresy")
    protected AdresySzr adresy;
    @XmlElement(name = "Obory")
    protected OboryRvp obory;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;

    /**
     * Gets the value of the klic property.
     * 
     */
    public int getKlic() {
        return klic;
    }

    /**
     * Sets the value of the klic property.
     * 
     */
    public void setKlic(int value) {
        this.klic = value;
    }

    /**
     * Gets the value of the idJednotky property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdJednotky() {
        return idJednotky;
    }

    /**
     * Sets the value of the idJednotky property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdJednotky(Integer value) {
        this.idJednotky = value;
    }

    /**
     * Gets the value of the nazevJednotky property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevJednotky() {
        return nazevJednotky;
    }

    /**
     * Sets the value of the nazevJednotky property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevJednotky(String value) {
        this.nazevJednotky = value;
    }

    /**
     * Gets the value of the zkratkaJednotky property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZkratkaJednotky() {
        return zkratkaJednotky;
    }

    /**
     * Sets the value of the zkratkaJednotky property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZkratkaJednotky(String value) {
        this.zkratkaJednotky = value;
    }

    /**
     * Gets the value of the osobaSzr property.
     * 
     * @return
     *     possible object is
     *     {@link OsobaSzr }
     *     
     */
    public OsobaSzr getOsobaSzr() {
        return osobaSzr;
    }

    /**
     * Sets the value of the osobaSzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaSzr }
     *     
     */
    public void setOsobaSzr(OsobaSzr value) {
        this.osobaSzr = value;
    }

    /**
     * Gets the value of the kontakty property.
     * 
     * @return
     *     possible object is
     *     {@link KontaktySzr }
     *     
     */
    public KontaktySzr getKontakty() {
        return kontakty;
    }

    /**
     * Sets the value of the kontakty property.
     * 
     * @param value
     *     allowed object is
     *     {@link KontaktySzr }
     *     
     */
    public void setKontakty(KontaktySzr value) {
        this.kontakty = value;
    }

    /**
     * Gets the value of the adresy property.
     * 
     * @return
     *     possible object is
     *     {@link AdresySzr }
     *     
     */
    public AdresySzr getAdresy() {
        return adresy;
    }

    /**
     * Sets the value of the adresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresySzr }
     *     
     */
    public void setAdresy(AdresySzr value) {
        this.adresy = value;
    }

    /**
     * Gets the value of the obory property.
     * 
     * @return
     *     possible object is
     *     {@link OboryRvp }
     *     
     */
    public OboryRvp getObory() {
        return obory;
    }

    /**
     * Sets the value of the obory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OboryRvp }
     *     
     */
    public void setObory(OboryRvp value) {
        this.obory = value;
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

}
