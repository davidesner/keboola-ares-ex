
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stav_upadce_CEU.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stav_upadce_CEU">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stav_upadce_CEU")
@XmlEnum
public enum StavUpadceCEU3 {

    A,
    Z,
    N;

    public String value() {
        return name();
    }

    public static StavUpadceCEU3 fromValue(String v) {
        return valueOf(v);
    }

}
