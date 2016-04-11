
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pf_osoba.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pf_osoba">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pf_osoba")
@XmlEnum
public enum PfOsoba3 {

    F,
    P,
    X,
    Z,
    O,
    C;

    public String value() {
        return name();
    }

    public static PfOsoba3 fromValue(String v) {
        return valueOf(v);
    }

}
