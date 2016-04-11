
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ares_vyber_typ.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ares_vyber_typ">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREE"/>
 *     &lt;enumeration value="ICO"/>
 *     &lt;enumeration value="RC"/>
 *     &lt;enumeration value="OF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ares_vyber_typ")
@XmlEnum
public enum AresVyberTyp3 {

    FREE,
    ICO,
    RC,
    OF;

    public String value() {
        return name();
    }

    public static AresVyberTyp3 fromValue(String v) {
        return valueOf(v);
    }

}
