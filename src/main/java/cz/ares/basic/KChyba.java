
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Chyby zjištìné pøi zpracování
 * 
 * <p>Java class for k_chyba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_chyba">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cislo_chyby" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nazev_chyby" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis"/>
 *         &lt;element name="Popis_chyby" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis"/>
 *         &lt;element name="Zavaznost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_chyba", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "cisloChyby",
    "nazevChyby",
    "popisChyby",
    "zavaznost"
})
public class KChyba {

    @XmlElement(name = "Cislo_chyby")
    protected int cisloChyby;
    @XmlElement(name = "Nazev_chyby", required = true)
    protected String nazevChyby;
    @XmlElement(name = "Popis_chyby", required = true)
    protected String popisChyby;
    @XmlElement(name = "Zavaznost")
    protected int zavaznost;

    /**
     * Gets the value of the cisloChyby property.
     * 
     */
    public int getCisloChyby() {
        return cisloChyby;
    }

    /**
     * Sets the value of the cisloChyby property.
     * 
     */
    public void setCisloChyby(int value) {
        this.cisloChyby = value;
    }

    /**
     * Gets the value of the nazevChyby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevChyby() {
        return nazevChyby;
    }

    /**
     * Sets the value of the nazevChyby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevChyby(String value) {
        this.nazevChyby = value;
    }

    /**
     * Gets the value of the popisChyby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopisChyby() {
        return popisChyby;
    }

    /**
     * Sets the value of the popisChyby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopisChyby(String value) {
        this.popisChyby = value;
    }

    /**
     * Gets the value of the zavaznost property.
     * 
     */
    public int getZavaznost() {
        return zavaznost;
    }

    /**
     * Sets the value of the zavaznost property.
     * 
     */
    public void setZavaznost(int value) {
        this.zavaznost = value;
    }

}
