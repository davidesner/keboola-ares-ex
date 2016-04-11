
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
@XmlType(name = "xslt_ks", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
@XmlEnum
public enum XsltKs {

    @XmlEnumValue("klient")
    KLIENT("klient"),
    @XmlEnumValue("server")
    SERVER("server"),
    @XmlEnumValue("savexml")
    SAVEXML("savexml");
    private final String value;

    XsltKs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XsltKs fromValue(String v) {
        for (XsltKs c: XsltKs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
