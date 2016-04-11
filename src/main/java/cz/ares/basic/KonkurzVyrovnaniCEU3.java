
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for konkurz_vyrovnani_CEU.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="konkurz_vyrovnani_CEU">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="V"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "konkurz_vyrovnani_CEU")
@XmlEnum
public enum KonkurzVyrovnaniCEU3 {

    K,
    V;

    public String value() {
        return name();
    }

    public static KonkurzVyrovnaniCEU3 fromValue(String v) {
        return valueOf(v);
    }

}
