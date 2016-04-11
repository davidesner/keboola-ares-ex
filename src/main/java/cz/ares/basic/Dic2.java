
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * DI� organizace nebo fyzick� osoby -  CZ + identifika�n� ��slo organizace /p�ed 1.5.2004 se skl�dalo z k�du finan�n�ho ��adu (3 ��slice) - k�du pl�tce dan� (I�O nebo R�), poml�ka nen� v UVISu definov�na, ale b�v� sou��st�./
 * 
 * <p>Java class for dic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dic">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3>dicSimpleType">
 *       &lt;attribute name="zdroj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zdroj_type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dic", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "value"
})
public class Dic2 {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected ZdrojType2 zdroj;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the zdroj property.
     * 
     * @return
     *     possible object is
     *     {@link ZdrojType2 }
     *     
     */
    public ZdrojType2 getZdroj() {
        return zdroj;
    }

    /**
     * Sets the value of the zdroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZdrojType2 }
     *     
     */
    public void setZdroj(ZdrojType2 value) {
        this.zdroj = value;
    }

}
