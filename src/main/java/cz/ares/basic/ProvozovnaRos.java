
package cz.ares.basic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provozovna_ros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provozovna_ros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ICP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}icp" minOccurs="0"/>
 *         &lt;element name="A" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}sidlo_ros"/>
 *         &lt;element name="Zahajeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}datum_ros" minOccurs="0"/>
 *         &lt;element name="Ukonceni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}datum_ros" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provozovna_ros", propOrder = {
    "icp",
    "a",
    "zahajeni",
    "ukonceni"
})
public class ProvozovnaRos {

    @XmlElement(name = "ICP")
    protected BigDecimal icp;
    @XmlElement(name = "A", required = true)
    protected SidloRos a;
    @XmlElement(name = "Zahajeni")
    protected DatumRos zahajeni;
    @XmlElement(name = "Ukonceni")
    protected DatumRos ukonceni;

    /**
     * Gets the value of the icp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getICP() {
        return icp;
    }

    /**
     * Sets the value of the icp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setICP(BigDecimal value) {
        this.icp = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link SidloRos }
     *     
     */
    public SidloRos getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link SidloRos }
     *     
     */
    public void setA(SidloRos value) {
        this.a = value;
    }

    /**
     * Gets the value of the zahajeni property.
     * 
     * @return
     *     possible object is
     *     {@link DatumRos }
     *     
     */
    public DatumRos getZahajeni() {
        return zahajeni;
    }

    /**
     * Sets the value of the zahajeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatumRos }
     *     
     */
    public void setZahajeni(DatumRos value) {
        this.zahajeni = value;
    }

    /**
     * Gets the value of the ukonceni property.
     * 
     * @return
     *     possible object is
     *     {@link DatumRos }
     *     
     */
    public DatumRos getUkonceni() {
        return ukonceni;
    }

    /**
     * Sets the value of the ukonceni property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatumRos }
     *     
     */
    public void setUkonceni(DatumRos value) {
        this.ukonceni = value;
    }

}
