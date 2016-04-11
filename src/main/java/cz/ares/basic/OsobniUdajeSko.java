
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o fyzické osobì v SKO
 * 
 * <p>Java class for osobni_udaje_sko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="osobni_udaje_sko">
 *   &lt;complexContent>
 *     &lt;extension base="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}osobniUdaje">
 *       &lt;sequence>
 *         &lt;element name="Pohlavi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}pohlavi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "osobni_udaje_sko", propOrder = {
    "pohlavi"
})
public class OsobniUdajeSko
    extends OsobniUdaje
{

    @XmlElement(name = "Pohlavi")
    protected Byte pohlavi;

    /**
     * Gets the value of the pohlavi property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPohlavi() {
        return pohlavi;
    }

    /**
     * Sets the value of the pohlavi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPohlavi(Byte value) {
        this.pohlavi = value;
    }

}
