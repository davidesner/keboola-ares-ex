
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis z registru zdravotnických zaøízení
 * 
 * <p>Java class for vypis_RZZ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_RZZ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}uvod" minOccurs="0"/>
 *         &lt;element name="Zakladni_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zakladni_udaje_RZZ"/>
 *         &lt;element name="Sidlo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="ZUJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zuj" minOccurs="0"/>
 *         &lt;element name="Dalsi_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}dalsi_udaje" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_RZZ", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "uvod",
    "zakladniUdaje",
    "sidlo",
    "zuj",
    "dalsiUdaje"
})
public class VypisRZZ {

    @XmlElement(name = "Uvod")
    protected Uvod uvod;
    @XmlElement(name = "Zakladni_udaje", required = true)
    protected ZakladniUdajeRZZ zakladniUdaje;
    @XmlElement(name = "Sidlo")
    protected AdresaARES sidlo;
    @XmlElement(name = "ZUJ")
    protected Zuj zuj;
    @XmlElement(name = "Dalsi_udaje")
    protected DalsiUdaje dalsiUdaje;

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod }
     *     
     */
    public Uvod getUvod() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod }
     *     
     */
    public void setUvod(Uvod value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the zakladniUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeRZZ }
     *     
     */
    public ZakladniUdajeRZZ getZakladniUdaje() {
        return zakladniUdaje;
    }

    /**
     * Sets the value of the zakladniUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRZZ }
     *     
     */
    public void setZakladniUdaje(ZakladniUdajeRZZ value) {
        this.zakladniUdaje = value;
    }

    /**
     * Gets the value of the sidlo property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getSidlo() {
        return sidlo;
    }

    /**
     * Sets the value of the sidlo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setSidlo(AdresaARES value) {
        this.sidlo = value;
    }

    /**
     * Gets the value of the zuj property.
     * 
     * @return
     *     possible object is
     *     {@link Zuj }
     *     
     */
    public Zuj getZUJ() {
        return zuj;
    }

    /**
     * Sets the value of the zuj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zuj }
     *     
     */
    public void setZUJ(Zuj value) {
        this.zuj = value;
    }

    /**
     * Gets the value of the dalsiUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link DalsiUdaje }
     *     
     */
    public DalsiUdaje getDalsiUdaje() {
        return dalsiUdaje;
    }

    /**
     * Sets the value of the dalsiUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link DalsiUdaje }
     *     
     */
    public void setDalsiUdaje(DalsiUdaje value) {
        this.dalsiUdaje = value;
    }

}
