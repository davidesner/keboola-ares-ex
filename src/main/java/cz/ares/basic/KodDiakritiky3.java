
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kod_diakritiky.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="kod_diakritiky">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ISO"/>
 *     &lt;enumeration value="WIN"/>
 *     &lt;enumeration value="LAT"/>
 *     &lt;enumeration value="UTF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "kod_diakritiky")
@XmlEnum
public enum KodDiakritiky3 {

    ISO,
    WIN,
    LAT,
    UTF;

    public String value() {
        return name();
    }

    public static KodDiakritiky3 fromValue(String v) {
        return valueOf(v);
    }

}
