
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * údaje o angažované fyzické osobì v SKO
 * 
 * <p>Java class for fyzicka_osoba_sko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fyzicka_osoba_sko">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Osobni_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}osobni_udaje_sko" minOccurs="0"/>
 *         &lt;element name="A" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fyzicka_osoba_sko", propOrder = {
    "osobniUdaje",
    "a"
})
public class FyzickaOsobaSko {

    @XmlElement(name = "Osobni_udaje")
    protected OsobniUdajeSko osobniUdaje;
    @XmlElement(name = "A")
    protected AdresaARES3 a;

    /**
     * Gets the value of the osobniUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link OsobniUdajeSko }
     *     
     */
    public OsobniUdajeSko getOsobniUdaje() {
        return osobniUdaje;
    }

    /**
     * Sets the value of the osobniUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobniUdajeSko }
     *     
     */
    public void setOsobniUdaje(OsobniUdajeSko value) {
        this.osobniUdaje = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setA(AdresaARES3 value) {
        this.a = value;
    }

}
