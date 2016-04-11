
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for druh_akcie.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="druh_akcie">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Akcie na jméno"/>
 *     &lt;enumeration value="Akcie na majitele"/>
 *     &lt;enumeration value="Zamìstnanecké akcie na jméno"/>
 *     &lt;enumeration value="Prioritní akcie na majitele"/>
 *     &lt;enumeration value="Prioritní akcie na jméno"/>
 *     &lt;enumeration value="Akcie se zvláštními právy"/>
 *     &lt;enumeration value="Kmenové akcie na jméno"/>
 *     &lt;enumeration value="Kmenové akcie na majitele"/>
 *     &lt;enumeration value="Na doruèitele"/>
 *     &lt;enumeration value="Na jméno a majitele"/>
 *     &lt;enumeration value="Na držitele"/>
 *     &lt;enumeration value="Bez uvedení druhu"/>
 *     &lt;enumeration value="Hromadná akcie"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "druh_akcie", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
@XmlEnum
public enum DruhAkcie {

    @XmlEnumValue("Akcie na jm\u00e9no")
    AKCIE_NA_JMÉNO("Akcie na jm\u00e9no"),
    @XmlEnumValue("Akcie na majitele")
    AKCIE_NA_MAJITELE("Akcie na majitele"),
    @XmlEnumValue("Zam\u011bstnaneck\u00e9 akcie na jm\u00e9no")
    ZAMÌSTNANECKÉ_AKCIE_NA_JMÉNO("Zam\u011bstnaneck\u00e9 akcie na jm\u00e9no"),
    @XmlEnumValue("Prioritn\u00ed akcie na majitele")
    PRIORITNÍ_AKCIE_NA_MAJITELE("Prioritn\u00ed akcie na majitele"),
    @XmlEnumValue("Prioritn\u00ed akcie na jm\u00e9no")
    PRIORITNÍ_AKCIE_NA_JMÉNO("Prioritn\u00ed akcie na jm\u00e9no"),
    @XmlEnumValue("Akcie se zvl\u00e1\u0161tn\u00edmi pr\u00e1vy")
    AKCIE_SE_ZVLÁŠTNÍMI_PRÁVY("Akcie se zvl\u00e1\u0161tn\u00edmi pr\u00e1vy"),
    @XmlEnumValue("Kmenov\u00e9 akcie na jm\u00e9no")
    KMENOVÉ_AKCIE_NA_JMÉNO("Kmenov\u00e9 akcie na jm\u00e9no"),
    @XmlEnumValue("Kmenov\u00e9 akcie na majitele")
    KMENOVÉ_AKCIE_NA_MAJITELE("Kmenov\u00e9 akcie na majitele"),
    @XmlEnumValue("Na doru\u010ditele")
    NA_DORUÈITELE("Na doru\u010ditele"),
    @XmlEnumValue("Na jm\u00e9no a majitele")
    NA_JMÉNO_A_MAJITELE("Na jm\u00e9no a majitele"),
    @XmlEnumValue("Na dr\u017eitele")
    NA_DRŽITELE("Na dr\u017eitele"),
    @XmlEnumValue("Bez uveden\u00ed druhu")
    BEZ_UVEDENÍ_DRUHU("Bez uveden\u00ed druhu"),
    @XmlEnumValue("Hromadn\u00e1 akcie")
    HROMADNÁ_AKCIE("Hromadn\u00e1 akcie");
    private final String value;

    DruhAkcie(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DruhAkcie fromValue(String v) {
        for (DruhAkcie c: DruhAkcie.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
