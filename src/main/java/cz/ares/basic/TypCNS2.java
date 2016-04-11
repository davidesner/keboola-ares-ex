
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typ_CNS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typ_CNS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Církev"/>
 *     &lt;enumeration value="Svaz"/>
 *     &lt;enumeration value="Právnická osoba"/>
 *     &lt;enumeration value="Církevní právnická osoba"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typ_CNS", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
@XmlEnum
public enum TypCNS2 {

    @XmlEnumValue("C\u00edrkev")
    CÍRKEV("C\u00edrkev"),
    @XmlEnumValue("Svaz")
    SVAZ("Svaz"),
    @XmlEnumValue("Pr\u00e1vnick\u00e1 osoba")
    PRÁVNICKÁ_OSOBA("Pr\u00e1vnick\u00e1 osoba"),
    @XmlEnumValue("C\u00edrkevn\u00ed pr\u00e1vnick\u00e1 osoba")
    CÍRKEVNÍ_PRÁVNICKÁ_OSOBA("C\u00edrkevn\u00ed pr\u00e1vnick\u00e1 osoba");
    private final String value;

    TypCNS2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypCNS2 fromValue(String v) {
        for (TypCNS2 c: TypCNS2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
