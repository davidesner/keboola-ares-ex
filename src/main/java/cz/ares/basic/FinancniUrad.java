
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Finanèní úøad (vz_podnik.k_fu)
 * 
 * <p>Java class for financni_urad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="financni_urad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kod_FU" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Nazev_FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}nazev_FU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financni_urad", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kodFU",
    "nazevFU"
})
public class FinancniUrad {

    @XmlElement(name = "Kod_FU")
    protected short kodFU;
    @XmlElement(name = "Nazev_FU", required = true)
    protected String nazevFU;

    /**
     * Gets the value of the kodFU property.
     * 
     */
    public short getKodFU() {
        return kodFU;
    }

    /**
     * Sets the value of the kodFU property.
     * 
     */
    public void setKodFU(short value) {
        this.kodFU = value;
    }

    /**
     * Gets the value of the nazevFU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevFU() {
        return nazevFU;
    }

    /**
     * Sets the value of the nazevFU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevFU(String value) {
        this.nazevFU = value;
    }

}
