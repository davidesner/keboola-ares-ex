
package cz.ares.basic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * údaje o adrese v SZR
 * 
 * <p>Java class for adresa_szr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresa_szr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="Typ_adr_kod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Orp_kod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Pou_kod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Nazev_posty" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="48"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Adr_kod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Pcd_kc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Radek_adr_1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Radek_adr_2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Radek_adr_3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PostCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Radek_adr_4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Zdroj_dat" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="adresaid">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *             &lt;maxInclusive value="999"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="orgjedid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresa_szr", propOrder = {
    "aa",
    "typAdrKod",
    "orpKod",
    "pouKod",
    "nazevPosty",
    "adrKod",
    "pcdKc",
    "radekAdr1",
    "radekAdr2",
    "radekAdr3",
    "postCode",
    "radekAdr4",
    "zdrojDat"
})
public class AdresaSzr {

    @XmlElement(name = "AA")
    protected AdresaARES3 aa;
    @XmlElement(name = "Typ_adr_kod")
    protected Integer typAdrKod;
    @XmlElement(name = "Orp_kod")
    protected Integer orpKod;
    @XmlElement(name = "Pou_kod")
    protected Integer pouKod;
    @XmlElement(name = "Nazev_posty")
    protected String nazevPosty;
    @XmlElement(name = "Adr_kod")
    protected Integer adrKod;
    @XmlElement(name = "Pcd_kc")
    protected Integer pcdKc;
    @XmlElement(name = "Radek_adr_1")
    protected String radekAdr1;
    @XmlElement(name = "Radek_adr_2")
    protected String radekAdr2;
    @XmlElement(name = "Radek_adr_3")
    protected String radekAdr3;
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "Radek_adr_4")
    protected String radekAdr4;
    @XmlElement(name = "Zdroj_dat")
    protected Integer zdrojDat;
    @XmlAttribute
    protected Integer adresaid;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;
    @XmlAttribute
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger orgjedid;

    /**
     * Gets the value of the aa property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getAA() {
        return aa;
    }

    /**
     * Sets the value of the aa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setAA(AdresaARES3 value) {
        this.aa = value;
    }

    /**
     * Gets the value of the typAdrKod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypAdrKod() {
        return typAdrKod;
    }

    /**
     * Sets the value of the typAdrKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypAdrKod(Integer value) {
        this.typAdrKod = value;
    }

    /**
     * Gets the value of the orpKod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrpKod() {
        return orpKod;
    }

    /**
     * Sets the value of the orpKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrpKod(Integer value) {
        this.orpKod = value;
    }

    /**
     * Gets the value of the pouKod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPouKod() {
        return pouKod;
    }

    /**
     * Sets the value of the pouKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPouKod(Integer value) {
        this.pouKod = value;
    }

    /**
     * Gets the value of the nazevPosty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevPosty() {
        return nazevPosty;
    }

    /**
     * Sets the value of the nazevPosty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevPosty(String value) {
        this.nazevPosty = value;
    }

    /**
     * Gets the value of the adrKod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdrKod() {
        return adrKod;
    }

    /**
     * Sets the value of the adrKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdrKod(Integer value) {
        this.adrKod = value;
    }

    /**
     * Gets the value of the pcdKc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPcdKc() {
        return pcdKc;
    }

    /**
     * Sets the value of the pcdKc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPcdKc(Integer value) {
        this.pcdKc = value;
    }

    /**
     * Gets the value of the radekAdr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadekAdr1() {
        return radekAdr1;
    }

    /**
     * Sets the value of the radekAdr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadekAdr1(String value) {
        this.radekAdr1 = value;
    }

    /**
     * Gets the value of the radekAdr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadekAdr2() {
        return radekAdr2;
    }

    /**
     * Sets the value of the radekAdr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadekAdr2(String value) {
        this.radekAdr2 = value;
    }

    /**
     * Gets the value of the radekAdr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadekAdr3() {
        return radekAdr3;
    }

    /**
     * Sets the value of the radekAdr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadekAdr3(String value) {
        this.radekAdr3 = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the radekAdr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadekAdr4() {
        return radekAdr4;
    }

    /**
     * Sets the value of the radekAdr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadekAdr4(String value) {
        this.radekAdr4 = value;
    }

    /**
     * Gets the value of the zdrojDat property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZdrojDat() {
        return zdrojDat;
    }

    /**
     * Sets the value of the zdrojDat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZdrojDat(Integer value) {
        this.zdrojDat = value;
    }

    /**
     * Gets the value of the adresaid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdresaid() {
        return adresaid;
    }

    /**
     * Sets the value of the adresaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdresaid(Integer value) {
        this.adresaid = value;
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

    /**
     * Gets the value of the orgjedid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrgjedid() {
        return orgjedid;
    }

    /**
     * Sets the value of the orgjedid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrgjedid(BigInteger value) {
        this.orgjedid = value;
    }

}
