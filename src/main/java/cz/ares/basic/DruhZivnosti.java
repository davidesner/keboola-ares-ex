
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for druh_zivnosti.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="druh_zivnosti">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="1"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "druh_zivnosti")
@XmlEnum
public enum DruhZivnosti {

    L,
    K,
    R,
    V,
    O,
    C,
    P;

    public String value() {
        return name();
    }

    public static DruhZivnosti fromValue(String v) {
        return valueOf(v);
    }

}
