
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis z registru ekonomických subjektù Èeského statistického úøadu
 * 
 * <p>Java class for vypis_RES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_RES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UVOD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}uvod" minOccurs="0"/>
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zakladni_udaje_RES"/>
 *         &lt;element name="SI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="ZUJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zuj" minOccurs="0"/>
 *         &lt;element name="SU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}statisticke_udaje" minOccurs="0"/>
 *         &lt;element name="OKECE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}okec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Nace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}nace" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Doplnujici_PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}doplnujici_pravni_formy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_RES", propOrder = {
    "uvod",
    "zau",
    "si",
    "zuj",
    "su",
    "okece",
    "nace",
    "doplnujiciPF"
})
public class VypisRES3 {

    @XmlElement(name = "UVOD")
    protected Uvod3 uvod;
    @XmlElement(name = "ZAU", required = true)
    protected ZakladniUdajeRES3 zau;
    @XmlElement(name = "SI")
    protected AdresaARES3 si;
    @XmlElement(name = "ZUJ")
    protected Zuj3 zuj;
    @XmlElement(name = "SU")
    protected StatistickeUdaje3 su;
    @XmlElement(name = "OKECE")
    protected List<Okec3> okece;
    @XmlElement(name = "Nace")
    protected List<Nace3> nace;
    @XmlElement(name = "Doplnujici_PF")
    protected DoplnujiciPravniFormy3 doplnujiciPF;

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
     *     {@link ZakladniUdajeRES3 }
     *     
     */
    public ZakladniUdajeRES3 getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRES3 }
     *     
     */
    public void setZAU(ZakladniUdajeRES3 value) {
        this.zau = value;
    }

    /**
     * Gets the value of the si property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getSI() {
        return si;
    }

    /**
     * Sets the value of the si property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setSI(AdresaARES3 value) {
        this.si = value;
    }

    /**
     * Gets the value of the zuj property.
     * 
     * @return
     *     possible object is
     *     {@link Zuj3 }
     *     
     */
    public Zuj3 getZUJ() {
        return zuj;
    }

    /**
     * Sets the value of the zuj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zuj3 }
     *     
     */
    public void setZUJ(Zuj3 value) {
        this.zuj = value;
    }

    /**
     * Gets the value of the su property.
     * 
     * @return
     *     possible object is
     *     {@link StatistickeUdaje3 }
     *     
     */
    public StatistickeUdaje3 getSU() {
        return su;
    }

    /**
     * Sets the value of the su property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatistickeUdaje3 }
     *     
     */
    public void setSU(StatistickeUdaje3 value) {
        this.su = value;
    }

    /**
     * Gets the value of the okece property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the okece property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOKECE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Okec3 }
     * 
     * 
     */
    public List<Okec3> getOKECE() {
        if (okece == null) {
            okece = new ArrayList<Okec3>();
        }
        return this.okece;
    }

    /**
     * Gets the value of the nace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nace3 }
     * 
     * 
     */
    public List<Nace3> getNace() {
        if (nace == null) {
            nace = new ArrayList<Nace3>();
        }
        return this.nace;
    }

    /**
     * Gets the value of the doplnujiciPF property.
     * 
     * @return
     *     possible object is
     *     {@link DoplnujiciPravniFormy3 }
     *     
     */
    public DoplnujiciPravniFormy3 getDoplnujiciPF() {
        return doplnujiciPF;
    }

    /**
     * Sets the value of the doplnujiciPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoplnujiciPravniFormy3 }
     *     
     */
    public void setDoplnujiciPF(DoplnujiciPravniFormy3 value) {
        this.doplnujiciPF = value;
    }

}
