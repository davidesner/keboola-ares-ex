
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for podoba_akcii.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="podoba_akcii">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="v listinné podobì"/>
 *     &lt;enumeration value="v zaknihované podobì"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "podoba_akcii", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
@XmlEnum
public enum PodobaAkcii2 {

    @XmlEnumValue("v listinn\u00e9 podob\u011b")
    V_LISTINNÉ_PODOBÌ("v listinn\u00e9 podob\u011b"),
    @XmlEnumValue("v zaknihovan\u00e9 podob\u011b")
    V_ZAKNIHOVANÉ_PODOBÌ("v zaknihovan\u00e9 podob\u011b");
    private final String value;

    PodobaAkcii2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PodobaAkcii2 fromValue(String v) {
        for (PodobaAkcii2 c: PodobaAkcii2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
