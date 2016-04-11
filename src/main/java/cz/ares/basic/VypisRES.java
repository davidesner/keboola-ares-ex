
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
 *         &lt;element name="Uvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}uvod" minOccurs="0"/>
 *         &lt;element name="Zakladni_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zakladni_udaje_RES"/>
 *         &lt;element name="Sidlo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="ZUJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zuj" minOccurs="0"/>
 *         &lt;element name="Statisticke_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}statisticke_udaje" minOccurs="0"/>
 *         &lt;element name="OKECE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}okec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Nace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}nace" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Doplnujici_PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}doplnujici_pravni_formy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_RES", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "uvod",
    "zakladniUdaje",
    "sidlo",
    "zuj",
    "statistickeUdaje",
    "okece",
    "nace",
    "doplnujiciPF"
})
public class VypisRES {

    @XmlElement(name = "Uvod")
    protected Uvod uvod;
    @XmlElement(name = "Zakladni_udaje", required = true)
    protected ZakladniUdajeRES zakladniUdaje;
    @XmlElement(name = "Sidlo")
    protected AdresaARES sidlo;
    @XmlElement(name = "ZUJ")
    protected Zuj zuj;
    @XmlElement(name = "Statisticke_udaje")
    protected StatistickeUdaje statistickeUdaje;
    @XmlElement(name = "OKECE")
    protected List<Okec> okece;
    @XmlElement(name = "Nace")
    protected List<Nace> nace;
    @XmlElement(name = "Doplnujici_PF")
    protected DoplnujiciPravniFormy doplnujiciPF;

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
     *     {@link ZakladniUdajeRES }
     *     
     */
    public ZakladniUdajeRES getZakladniUdaje() {
        return zakladniUdaje;
    }

    /**
     * Sets the value of the zakladniUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRES }
     *     
     */
    public void setZakladniUdaje(ZakladniUdajeRES value) {
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
     * Gets the value of the statistickeUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link StatistickeUdaje }
     *     
     */
    public StatistickeUdaje getStatistickeUdaje() {
        return statistickeUdaje;
    }

    /**
     * Sets the value of the statistickeUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatistickeUdaje }
     *     
     */
    public void setStatistickeUdaje(StatistickeUdaje value) {
        this.statistickeUdaje = value;
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
     * {@link Okec }
     * 
     * 
     */
    public List<Okec> getOKECE() {
        if (okece == null) {
            okece = new ArrayList<Okec>();
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
     * {@link Nace }
     * 
     * 
     */
    public List<Nace> getNace() {
        if (nace == null) {
            nace = new ArrayList<Nace>();
        }
        return this.nace;
    }

    /**
     * Gets the value of the doplnujiciPF property.
     * 
     * @return
     *     possible object is
     *     {@link DoplnujiciPravniFormy }
     *     
     */
    public DoplnujiciPravniFormy getDoplnujiciPF() {
        return doplnujiciPF;
    }

    /**
     * Sets the value of the doplnujiciPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoplnujiciPravniFormy }
     *     
     */
    public void setDoplnujiciPF(DoplnujiciPravniFormy value) {
        this.doplnujiciPF = value;
    }

}
