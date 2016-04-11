
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vypis_ROS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_ROS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zakladni_udaje_ros"/>
 *         &lt;element name="Podnikatel" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}podnikatel_ros" minOccurs="0"/>
 *         &lt;element name="Agendy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}agendy_ros" minOccurs="0"/>
 *         &lt;element name="Statutari" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}statutari_ros" minOccurs="0"/>
 *         &lt;element name="PRY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}provozovny_ros" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_ROS", propOrder = {
    "zau",
    "podnikatel",
    "agendy",
    "statutari",
    "pry"
})
public class VypisROS {

    @XmlElement(name = "ZAU", required = true)
    protected ZakladniUdajeRos zau;
    @XmlElement(name = "Podnikatel")
    protected PodnikatelRos podnikatel;
    @XmlElement(name = "Agendy")
    protected AgendyRos agendy;
    @XmlElement(name = "Statutari")
    protected StatutariRos statutari;
    @XmlElement(name = "PRY")
    protected ProvozovnyRos pry;

    /**
     * Gets the value of the zau property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeRos }
     *     
     */
    public ZakladniUdajeRos getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRos }
     *     
     */
    public void setZAU(ZakladniUdajeRos value) {
        this.zau = value;
    }

    /**
     * Gets the value of the podnikatel property.
     * 
     * @return
     *     possible object is
     *     {@link PodnikatelRos }
     *     
     */
    public PodnikatelRos getPodnikatel() {
        return podnikatel;
    }

    /**
     * Sets the value of the podnikatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodnikatelRos }
     *     
     */
    public void setPodnikatel(PodnikatelRos value) {
        this.podnikatel = value;
    }

    /**
     * Gets the value of the agendy property.
     * 
     * @return
     *     possible object is
     *     {@link AgendyRos }
     *     
     */
    public AgendyRos getAgendy() {
        return agendy;
    }

    /**
     * Sets the value of the agendy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgendyRos }
     *     
     */
    public void setAgendy(AgendyRos value) {
        this.agendy = value;
    }

    /**
     * Gets the value of the statutari property.
     * 
     * @return
     *     possible object is
     *     {@link StatutariRos }
     *     
     */
    public StatutariRos getStatutari() {
        return statutari;
    }

    /**
     * Sets the value of the statutari property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutariRos }
     *     
     */
    public void setStatutari(StatutariRos value) {
        this.statutari = value;
    }

    /**
     * Gets the value of the pry property.
     * 
     * @return
     *     possible object is
     *     {@link ProvozovnyRos }
     *     
     */
    public ProvozovnyRos getPRY() {
        return pry;
    }

    /**
     * Sets the value of the pry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvozovnyRos }
     *     
     */
    public void setPRY(ProvozovnyRos value) {
        this.pry = value;
    }

}
