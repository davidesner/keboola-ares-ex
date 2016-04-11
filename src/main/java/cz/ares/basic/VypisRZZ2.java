
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
 *         &lt;element name="UVOD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}uvod" minOccurs="0"/>
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zakladni_udaje_RZZ"/>
 *         &lt;element name="SI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="ZUJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zuj" minOccurs="0"/>
 *         &lt;element name="DAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}dalsi_udaje" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_RZZ", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "uvod",
    "zau",
    "si",
    "zuj",
    "dau"
})
public class VypisRZZ2 {

    @XmlElement(name = "UVOD")
    protected Uvod2 uvod;
    @XmlElement(name = "ZAU", required = true)
    protected ZakladniUdajeRZZ2 zau;
    @XmlElement(name = "SI")
    protected AdresaARES2 si;
    @XmlElement(name = "ZUJ")
    protected Zuj2 zuj;
    @XmlElement(name = "DAU")
    protected DalsiUdaje2 dau;

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod2 }
     *     
     */
    public Uvod2 getUVOD() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod2 }
     *     
     */
    public void setUVOD(Uvod2 value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the zau property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeRZZ2 }
     *     
     */
    public ZakladniUdajeRZZ2 getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRZZ2 }
     *     
     */
    public void setZAU(ZakladniUdajeRZZ2 value) {
        this.zau = value;
    }

    /**
     * Gets the value of the si property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getSI() {
        return si;
    }

    /**
     * Sets the value of the si property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setSI(AdresaARES2 value) {
        this.si = value;
    }

    /**
     * Gets the value of the zuj property.
     * 
     * @return
     *     possible object is
     *     {@link Zuj2 }
     *     
     */
    public Zuj2 getZUJ() {
        return zuj;
    }

    /**
     * Sets the value of the zuj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zuj2 }
     *     
     */
    public void setZUJ(Zuj2 value) {
        this.zuj = value;
    }

    /**
     * Gets the value of the dau property.
     * 
     * @return
     *     possible object is
     *     {@link DalsiUdaje2 }
     *     
     */
    public DalsiUdaje2 getDAU() {
        return dau;
    }

    /**
     * Sets the value of the dau property.
     * 
     * @param value
     *     allowed object is
     *     {@link DalsiUdaje2 }
     *     
     */
    public void setDAU(DalsiUdaje2 value) {
        this.dau = value;
    }

}
