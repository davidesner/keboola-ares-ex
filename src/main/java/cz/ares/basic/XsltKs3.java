
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xslt_ks.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xslt_ks">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="klient"/>
 *     &lt;enumeration value="server"/>
 *     &lt;enumeration value="savexml"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "xslt_ks")
@XmlEnum
public enum XsltKs3 {

    @XmlEnumValue("klient")
    KLIENT("klient"),
    @XmlEnumValue("server")
    SERVER("server"),
    @XmlEnumValue("savexml")
    SAVEXML("savexml");
    private final String value;

    XsltKs3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XsltKs3 fromValue(String v) {
        for (XsltKs3 c: XsltKs3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
