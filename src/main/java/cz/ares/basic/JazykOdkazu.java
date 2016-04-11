
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jazyk_odkazu.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jazyk_odkazu">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cz"/>
 *     &lt;enumeration value="en"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jazyk_odkazu")
@XmlEnum
public enum JazykOdkazu {

    @XmlEnumValue("cz")
    CZ("cz"),
    @XmlEnumValue("en")
    EN("en");
    private final String value;

    JazykOdkazu(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JazykOdkazu fromValue(String v) {
        for (JazykOdkazu c: JazykOdkazu.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
