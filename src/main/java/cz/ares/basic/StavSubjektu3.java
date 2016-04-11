
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
 *     &lt;enumeration value="pozastavena èinnost"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stav_subjektu")
@XmlEnum
public enum StavSubjektu3 {

    @XmlEnumValue("Aktivn\u00ed")
    AKTIVNÍ("Aktivn\u00ed"),
    @XmlEnumValue("Zanikl\u00fd")
    ZANIKLÝ("Zanikl\u00fd"),
    @XmlEnumValue("pozastavena \u010dinnost")
    POZASTAVENA_ÈINNOST("pozastavena \u010dinnost");
    private final String value;

    StavSubjektu3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StavSubjektu3 fromValue(String v) {
        for (StavSubjektu3 c: StavSubjektu3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
