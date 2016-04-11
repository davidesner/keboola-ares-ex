
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * pøíznak zmìny u subjektu 
 *       (atribut celého popisu pøíznaku bude jen v Zadani a zde:
 *       N = prvozápis nového subjektu
 *       U = update, zmìna
 *       Z = zánik subjektu
 *       F = fyzický výmaz subjektu)
 *        
 * 
 * <p>Java class for priznak_zmeny complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priznak_zmeny">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5>pSimpleType">
 *       &lt;attribute name="popis" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priznak_zmeny", propOrder = {
    "value"
})
public class PriznakZmeny {

    @XmlValue
    protected PSimpleType value;
    @XmlAttribute
    protected String popis;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link PSimpleType }
     *     
     */
    public PSimpleType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSimpleType }
     *     
     */
    public void setValue(PSimpleType value) {
        this.value = value;
    }

    /**
     * Gets the value of the popis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopis() {
        return popis;
    }

    /**
     * Sets the value of the popis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopis(String value) {
        this.popis = value;
    }

}
