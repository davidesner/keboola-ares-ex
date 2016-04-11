
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mena.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mena">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Kè"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="DM"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="EURO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mena", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
@XmlEnum
public enum Mena2 {

    @XmlEnumValue("K\u010d")
    KÈ("K\u010d"),
    USD("USD"),
    DM("DM"),
    GBP("GBP"),
    SK("SK"),
    EUR("EUR"),
    EURO("EURO");
    private final String value;

    Mena2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Mena2 fromValue(String v) {
        for (Mena2 c: Mena2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
