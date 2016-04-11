
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Osoby ve smyslu civilních individuí
 * 
 * <p>Java class for k_cosoba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_cosoba">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Podnika" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}ano_ne"/>
 *         &lt;element name="Cele_jmeno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="RC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}rodne_cislo"/>
 *         &lt;element name="Rozliseni_rodneho_cisla" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="A_sidla" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="Ares" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}ano_ne"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_cosoba", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "podnika",
    "celeJmeno",
    "rc",
    "rozliseniRodnehoCisla",
    "aSidla",
    "ares"
})
public class KCosoba2 {

    @XmlElement(name = "Podnika", required = true)
    protected String podnika;
    @XmlElement(name = "Cele_jmeno")
    protected String celeJmeno;
    @XmlElement(name = "RC", required = true)
    protected String rc;
    @XmlElement(name = "Rozliseni_rodneho_cisla")
    protected Short rozliseniRodnehoCisla;
    @XmlElement(name = "A_sidla")
    protected AdresaARES2 aSidla;
    @XmlElement(name = "Ares", required = true)
    protected String ares;

    /**
     * Gets the value of the podnika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodnika() {
        return podnika;
    }

    /**
     * Sets the value of the podnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodnika(String value) {
        this.podnika = value;
    }

    /**
     * Gets the value of the celeJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeleJmeno() {
        return celeJmeno;
    }

    /**
     * Sets the value of the celeJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeleJmeno(String value) {
        this.celeJmeno = value;
    }

    /**
     * Gets the value of the rc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRC() {
        return rc;
    }

    /**
     * Sets the value of the rc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRC(String value) {
        this.rc = value;
    }

    /**
     * Gets the value of the rozliseniRodnehoCisla property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRozliseniRodnehoCisla() {
        return rozliseniRodnehoCisla;
    }

    /**
     * Sets the value of the rozliseniRodnehoCisla property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRozliseniRodnehoCisla(Short value) {
        this.rozliseniRodnehoCisla = value;
    }

    /**
     * Gets the value of the aSidla property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getASidla() {
        return aSidla;
    }

    /**
     * Sets the value of the aSidla property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setASidla(AdresaARES2 value) {
        this.aSidla = value;
    }

    /**
     * Gets the value of the ares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAres() {
        return ares;
    }

    /**
     * Sets the value of the ares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAres(String value) {
        this.ares = value;
    }

}
