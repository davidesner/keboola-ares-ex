
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ares_vyber_typ.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ares_vyber_typ">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREE"/>
 *     &lt;enumeration value="ICO"/>
 *     &lt;enumeration value="RC"/>
 *     &lt;enumeration value="OF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ares_vyber_typ", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
@XmlEnum
public enum AresVyberTyp2 {

    FREE,
    ICO,
    RC,
    OF;

    public String value() {
        return name();
    }

    public static AresVyberTyp2 fromValue(String v) {
        return valueOf(v);
    }

}
