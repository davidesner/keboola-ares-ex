
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Èíslo dávky vèetnì poètu mìnìných vìt v této dávce, aby bylo možno zjistit, že dávka je pøíliž rozsáhlá, což pùsobí problémy se zobrazením v prohlížeèích
 *        
 * 
 * <p>Java class for cislo_davky complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cislo_davky">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5>cSimpleType">
 *       &lt;attribute name="vet" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cislo_davky", propOrder = {
    "value"
})
public class CisloDavky {

    @XmlValue
    protected int value;
    @XmlAttribute
    protected Integer vet;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the vet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVet() {
        return vet;
    }

    /**
     * Sets the value of the vet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVet(Integer value) {
        this.vet = value;
    }

}
