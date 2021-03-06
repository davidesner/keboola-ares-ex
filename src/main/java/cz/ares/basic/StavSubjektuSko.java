
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stav_subjektu_sko.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stav_subjektu_sko">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aktivn�"/>
 *     &lt;enumeration value="Zanikl�"/>
 *     &lt;enumeration value="Fyzicky vymazan�"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stav_subjektu_sko")
@XmlEnum
public enum StavSubjektuSko {

    @XmlEnumValue("Aktivn\u00ed")
    AKTIVN�("Aktivn\u00ed"),
    @XmlEnumValue("Zanikl\u00fd")
    ZANIKL�("Zanikl\u00fd"),
    @XmlEnumValue("Fyzicky vymazan\u00fd")
    FYZICKY_VYMAZAN�("Fyzicky vymazan\u00fd");
    private final String value;

    StavSubjektuSko(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StavSubjektuSko fromValue(String v) {
        for (StavSubjektuSko c: StavSubjektuSko.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
