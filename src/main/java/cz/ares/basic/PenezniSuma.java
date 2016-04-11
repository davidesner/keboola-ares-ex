
package cz.ares.basic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Libovolná penìžní èástka
 * 
 * <p>Java class for penezni_suma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="penezni_suma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Castka" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}castka"/>
 *         &lt;element name="Mena" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}mena"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "penezni_suma", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "castka",
    "mena"
})
public class PenezniSuma {

    @XmlElement(name = "Castka", required = true)
    protected BigDecimal castka;
    @XmlElement(name = "Mena", required = true)
    protected Mena mena;

    /**
     * Gets the value of the castka property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCastka() {
        return castka;
    }

    /**
     * Sets the value of the castka property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCastka(BigDecimal value) {
        this.castka = value;
    }

    /**
     * Gets the value of the mena property.
     * 
     * @return
     *     possible object is
     *     {@link Mena }
     *     
     */
    public Mena getMena() {
        return mena;
    }

    /**
     * Sets the value of the mena property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mena }
     *     
     */
    public void setMena(Mena value) {
        this.mena = value;
    }

}
