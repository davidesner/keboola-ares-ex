
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ares_dotaz_typ.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ares_dotaz_typ">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Seznam_Reg"/>
 *     &lt;enumeration value="Vypis_OR"/>
 *     &lt;enumeration value="Vypis_RZP"/>
 *     &lt;enumeration value="Vypis_RES"/>
 *     &lt;enumeration value="Vypis_RZZ"/>
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Vypis_CNS"/>
 *     &lt;enumeration value="Vypis_OSS"/>
 *     &lt;enumeration value="Stdadr"/>
 *     &lt;enumeration value="zl"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="su"/>
 *     &lt;enumeration value="fo"/>
 *     &lt;enumeration value="ceu"/>
 *     &lt;enumeration value="zm"/>
 *     &lt;enumeration value="szr"/>
 *     &lt;enumeration value="Vypis_OFF"/>
 *     &lt;enumeration value="Vypis_PSH"/>
 *     &lt;enumeration value="Vypis_IR"/>
 *     &lt;enumeration value="Vypis_SKO"/>
 *     &lt;enumeration value="Vypis_ros"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ares_dotaz_typ")
@XmlEnum
public enum AresDotazTyp3 {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Seznam_Reg")
    SEZNAM_REG("Seznam_Reg"),
    @XmlEnumValue("Vypis_OR")
    VYPIS_OR("Vypis_OR"),
    @XmlEnumValue("Vypis_RZP")
    VYPIS_RZP("Vypis_RZP"),
    @XmlEnumValue("Vypis_RES")
    VYPIS_RES("Vypis_RES"),
    @XmlEnumValue("Vypis_RZZ")
    VYPIS_RZZ("Vypis_RZZ"),
    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Vypis_CNS")
    VYPIS_CNS("Vypis_CNS"),
    @XmlEnumValue("Vypis_OSS")
    VYPIS_OSS("Vypis_OSS"),
    @XmlEnumValue("Stdadr")
    STDADR("Stdadr"),
    @XmlEnumValue("zl")
    ZL("zl"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("su")
    SU("su"),
    @XmlEnumValue("fo")
    FO("fo"),
    @XmlEnumValue("ceu")
    CEU("ceu"),
    @XmlEnumValue("zm")
    ZM("zm"),
    @XmlEnumValue("szr")
    SZR("szr"),
    @XmlEnumValue("Vypis_OFF")
    VYPIS_OFF("Vypis_OFF"),
    @XmlEnumValue("Vypis_PSH")
    VYPIS_PSH("Vypis_PSH"),
    @XmlEnumValue("Vypis_IR")
    VYPIS_IR("Vypis_IR"),
    @XmlEnumValue("Vypis_SKO")
    VYPIS_SKO("Vypis_SKO"),
    @XmlEnumValue("Vypis_ros")
    VYPIS_ROS("Vypis_ros");
    private final String value;

    AresDotazTyp3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AresDotazTyp3 fromValue(String v) {
        for (AresDotazTyp3 c: AresDotazTyp3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
