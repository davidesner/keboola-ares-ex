
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
@XmlType(name = "status_vety_ares")
@XmlEnum
public enum StatusVetyAres3 {


    /**
     * aktuálnì platný záznam u ekonomického subjektu
     * 
     */
    A,

    /**
     * ekonomický subjekt u daného záznamu je zaniklý
     * 
     */
    Z,

    /**
     * status vìty neuveden
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static StatusVetyAres3 fromValue(String v) {
        return valueOf(v);
    }

}
