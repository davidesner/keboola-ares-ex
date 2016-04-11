
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zdroj_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zdroj_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="2"/>
 *     &lt;maxLength value="5"/>
 *     &lt;enumeration value="ARES"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="RES"/>
 *     &lt;enumeration value="RZP"/>
 *     &lt;enumeration value="RŽP"/>
 *     &lt;enumeration value="RZZ"/>
 *     &lt;enumeration value="DPH"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SCP"/>
 *     &lt;enumeration value="CEU"/>
 *     &lt;enumeration value="CEDR"/>
 *     &lt;enumeration value="RARIS"/>
 *     &lt;enumeration value="RCNS"/>
 *     &lt;enumeration value="PSH"/>
 *     &lt;enumeration value="OSS"/>
 *     &lt;enumeration value="SZR"/>
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="RŠ"/>
 *     &lt;enumeration value="EZP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zdroj_type")
@XmlEnum
public enum ZdrojType3 {

    ARES,
    OR,
    RES,
    RZP,
    RŽP,
    RZZ,
    DPH,
    SD,
    SCP,
    CEU,
    CEDR,
    RARIS,
    RCNS,
    PSH,
    OSS,
    SZR,
    IR,
    RŠ,
    EZP;

    public String value() {
        return name();
    }

    public static ZdrojType3 fromValue(String v) {
        return valueOf(v);
    }

}
