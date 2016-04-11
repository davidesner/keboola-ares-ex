
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
 *         &lt;element name="Typ_ZZ_kod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Typ_ZZ_nazev" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typ_zdravotnickeho_zarizeni", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "typZZKod",
    "typZZNazev"
})
public class TypZdravotnickehoZarizeni {

    @XmlElement(name = "Typ_ZZ_kod")
    protected BigInteger typZZKod;
    @XmlElement(name = "Typ_ZZ_nazev")
    protected String typZZNazev;

    /**
     * Gets the value of the typZZKod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypZZKod() {
        return typZZKod;
    }

    /**
     * Sets the value of the typZZKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypZZKod(BigInteger value) {
        this.typZZKod = value;
    }

    /**
     * Gets the value of the typZZNazev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypZZNazev() {
        return typZZNazev;
    }

    /**
     * Sets the value of the typZZNazev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypZZNazev(String value) {
        this.typZZNazev = value;
    }

}
