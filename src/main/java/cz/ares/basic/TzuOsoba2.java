
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tzu_osoba.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tzu_osoba">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="Tuzemská"/>
 *     &lt;enumeration value="Zahranièní"/>
 *     &lt;enumeration value="Uprchlík"/>
 *     &lt;enumeration value="Evropská spoleènost"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tzu_osoba", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
@XmlEnum
public enum TzuOsoba2 {

    T("T"),
    Z("Z"),
    U("U"),
    E("E"),
    @XmlEnumValue("Tuzemsk\u00e1")
    TUZEMSKÁ("Tuzemsk\u00e1"),
    @XmlEnumValue("Zahrani\u010dn\u00ed")
    ZAHRANIÈNÍ("Zahrani\u010dn\u00ed"),
    @XmlEnumValue("Uprchl\u00edk")
    UPRCHLÍK("Uprchl\u00edk"),
    @XmlEnumValue("Evropsk\u00e1 spole\u010dnost")
    EVROPSKÁ_SPOLEÈNOST("Evropsk\u00e1 spole\u010dnost");
    private final String value;

    TzuOsoba2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TzuOsoba2 fromValue(String v) {
        for (TzuOsoba2 c: TzuOsoba2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
