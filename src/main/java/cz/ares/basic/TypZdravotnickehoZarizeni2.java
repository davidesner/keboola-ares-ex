
package cz.ares.basic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typ_zdravotnickeho_zarizeni", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "zzk",
    "zzn"
})
public class TypZdravotnickehoZarizeni2 {

    @XmlElement(name = "ZZK")
    protected BigInteger zzk;
    @XmlElement(name = "ZZN")
    protected String zzn;

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

}
