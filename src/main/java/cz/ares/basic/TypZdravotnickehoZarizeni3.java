
package cz.ares.basic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Typ zdr. zaøízení, vèetnì tel., faxu, e-mailu a www stránek (od øíjna 2009)
 * 
 * <p>Java class for typ_zdravotnickeho_zarizeni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typ_zdravotnickeho_zarizeni">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZZK" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ZZN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="TEL" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}telefon" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}telefon" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="WWW" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typ_zdravotnickeho_zarizeni", propOrder = {
    "zzk",
    "zzn",
    "tel",
    "fax",
    "email",
    "www"
})
public class TypZdravotnickehoZarizeni3 {

    @XmlElement(name = "ZZK")
    protected BigInteger zzk;
    @XmlElement(name = "ZZN")
    protected String zzn;
    @XmlElement(name = "TEL")
    protected String tel;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "WWW")
    protected String www;

    /**
     * Gets the value of the zzk property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZZK() {
        return zzk;
    }

    /**
     * Sets the value of the zzk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZZK(BigInteger value) {
        this.zzk = value;
    }

    /**
     * Gets the value of the zzn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZN() {
        return zzn;
    }

    /**
     * Sets the value of the zzn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZN(String value) {
        this.zzn = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEL() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEL(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the www property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWWW() {
        return www;
    }

    /**
     * Sets the value of the www property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWWW(String value) {
        this.www = value;
    }

}
