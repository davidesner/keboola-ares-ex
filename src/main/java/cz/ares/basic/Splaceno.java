
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informace o splacení èástky vkladu v Kè, procentech nebo slovy volným textem
 * 
 * <p>Java class for splaceno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="splaceno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kc" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Procenta" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Ostatni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "splaceno", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kc",
    "procenta",
    "ostatni"
})
public class Splaceno {

    @XmlElement(name = "Kc")
    protected String kc;
    @XmlElement(name = "Procenta")
    protected String procenta;
    @XmlElement(name = "Ostatni")
    protected String ostatni;

    /**
     * Gets the value of the kc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKc() {
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
    public void setKc(String value) {
        this.kc = value;
    }

    /**
     * Gets the value of the procenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcenta() {
        return procenta;
    }

    /**
     * Sets the value of the procenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcenta(String value) {
        this.procenta = value;
    }

    /**
     * Gets the value of the ostatni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOstatni() {
        return ostatni;
    }

    /**
     * Sets the value of the ostatni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOstatni(String value) {
        this.ostatni = value;
    }

}
