
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for status_vety_ares.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="status_vety_ares">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "status_vety_ares", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
@XmlEnum
public enum StatusVetyAres2 {


    /**
     * aktu�ln� platn� z�znam u ekonomick�ho subjektu
     * 
     */
    A,

    /**
     * ekonomick� subjekt u dan�ho z�znamu je zanikl�
     * 
     */
    Z,

    /**
     * status v�ty neuveden
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static StatusVetyAres2 fromValue(String v) {
        return valueOf(v);
    }

}
