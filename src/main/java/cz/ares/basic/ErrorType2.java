
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for error_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="error_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="global"/>
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="info"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "error_type", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3")
@XmlEnum
public enum ErrorType2 {

    @XmlEnumValue("global")
    GLOBAL("global"),
    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("info")
    INFO("info");
    private final String value;

    ErrorType2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorType2 fromValue(String v) {
        for (ErrorType2 c: ErrorType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
