
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kod_nazev_ovm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kod_nazev_ovm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KOVM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="NOVM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kod_nazev_ovm", propOrder = {
    "kovm",
    "novm"
})
public class KodNazevOvm {

    @XmlElement(name = "KOVM")
    protected String kovm;
    @XmlElement(name = "NOVM")
    protected String novm;

    /**
     * Gets the value of the kovm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOVM() {
        return kovm;
    }

    /**
     * Sets the value of the kovm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOVM(String value) {
        this.kovm = value;
    }

    /**
     * Gets the value of the novm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOVM() {
        return novm;
    }

    /**
     * Sets the value of the novm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOVM(String value) {
        this.novm = value;
    }

}
