
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis z insolvenèního rejstøíku podle ARES
 * 
 * <p>Java class for vypis_IR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_IR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UVOD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}uvod" minOccurs="0"/>
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zakladni_udaje_IR"/>
 *         &lt;element name="Insolvencni_spravci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}insolvencni_spravci" minOccurs="0"/>
 *         &lt;element name="Historie" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}historie_IR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_IR", propOrder = {
    "uvod",
    "zau",
    "insolvencniSpravci",
    "historie"
})
public class VypisIR {

    @XmlElement(name = "UVOD")
    protected Uvod3 uvod;
    @XmlElement(name = "ZAU", required = true)
    protected ZakladniUdajeIR zau;
    @XmlElement(name = "Insolvencni_spravci")
    protected InsolvencniSpravci insolvencniSpravci;
    @XmlElement(name = "Historie")
    protected HistorieIR historie;

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod3 }
     *     
     */
    public Uvod3 getUVOD() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod3 }
     *     
     */
    public void setUVOD(Uvod3 value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the zau property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeIR }
     *     
     */
    public ZakladniUdajeIR getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeIR }
     *     
     */
    public void setZAU(ZakladniUdajeIR value) {
        this.zau = value;
    }

    /**
     * Gets the value of the insolvencniSpravci property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencniSpravci }
     *     
     */
    public InsolvencniSpravci getInsolvencniSpravci() {
        return insolvencniSpravci;
    }

    /**
     * Sets the value of the insolvencniSpravci property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencniSpravci }
     *     
     */
    public void setInsolvencniSpravci(InsolvencniSpravci value) {
        this.insolvencniSpravci = value;
    }

    /**
     * Gets the value of the historie property.
     * 
     * @return
     *     possible object is
     *     {@link HistorieIR }
     *     
     */
    public HistorieIR getHistorie() {
        return historie;
    }

    /**
     * Sets the value of the historie property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistorieIR }
     *     
     */
    public void setHistorie(HistorieIR value) {
        this.historie = value;
    }

}
