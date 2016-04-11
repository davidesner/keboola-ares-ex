
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vystup_format.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vystup_format">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XML"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="XHTML"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="jenIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vystup_format")
@XmlEnum
public enum VystupFormat3 {

    XML("XML"),
    HTML("HTML"),
    XHTML("XHTML"),
    TEXT("TEXT"),
    @XmlEnumValue("jenIC")
    JEN_IC("jenIC");
    private final String value;

    VystupFormat3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VystupFormat3 fromValue(String v) {
        for (VystupFormat3 c: VystupFormat3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
