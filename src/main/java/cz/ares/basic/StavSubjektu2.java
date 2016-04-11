
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stav_subjektu.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stav_subjektu">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aktivní"/>
 *     &lt;enumeration value="Zaniklý"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stav_subjektu", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
@XmlEnum
public enum StavSubjektu2 {

    @XmlEnumValue("Aktivn\u00ed")
    AKTIVNÍ("Aktivn\u00ed"),
    @XmlEnumValue("Zanikl\u00fd")
    ZANIKLÝ("Zanikl\u00fd");
    private final String value;

    StavSubjektu2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StavSubjektu2 fromValue(String v) {
        for (StavSubjektu2 c: StavSubjektu2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
