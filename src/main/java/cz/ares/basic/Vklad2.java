
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Èástka vkladu slouží k uložení finanèních obnosù v Kè nebo volným textem
 * 
 * <p>Java class for vklad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vklad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="OST" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vklad", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "kc",
    "ost"
})
public class Vklad2 {

    @XmlElement(name = "KC")
    protected String kc;
    @XmlElement(name = "OST")
    protected String ost;

    /**
     * Gets the value of the kc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKC() {
        return kc;
    }

    /**
     * Sets the value of the kc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKC(String value) {
        this.kc = value;
    }

    /**
     * Gets the value of the ost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOST() {
        return ost;
    }

    /**
     * Sets the value of the ost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOST(String value) {
        this.ost = value;
    }

}
