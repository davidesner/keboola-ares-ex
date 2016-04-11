
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
 *         &lt;element name="UVOD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}uvod" minOccurs="0"/>
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zakladni_udaje_RZZ"/>
 *         &lt;element name="FO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}fyzicka_osoba" minOccurs="0"/>
 *         &lt;element name="FOS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}fyzicka_osoba" minOccurs="0"/>
 *         &lt;element name="SI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="ZUJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zuj" minOccurs="0"/>
 *         &lt;element name="DAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}dalsi_udaje" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_RZZ", propOrder = {
    "uvod",
    "zau",
    "fo",
    "fos",
    "si",
    "zuj",
    "dau"
})
public class VypisRZZ3 {

    @XmlElement(name = "UVOD")
    protected Uvod3 uvod;
    @XmlElement(name = "ZAU", required = true)
    protected ZakladniUdajeRZZ3 zau;
    @XmlElement(name = "FO")
    protected FyzickaOsoba3 fo;
    @XmlElement(name = "FOS")
    protected FyzickaOsoba3 fos;
    @XmlElement(name = "SI")
    protected AdresaARES3 si;
    @XmlElement(name = "ZUJ")
    protected Zuj3 zuj;
    @XmlElement(name = "DAU")
    protected DalsiUdaje3 dau;

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
     *     {@link ZakladniUdajeRZZ3 }
     *     
     */
    public ZakladniUdajeRZZ3 getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRZZ3 }
     *     
     */
    public void setZAU(ZakladniUdajeRZZ3 value) {
        this.zau = value;
    }

    /**
     * Gets the value of the fo property.
     * 
     * @return
     *     possible object is
     *     {@link FyzickaOsoba3 }
     *     
     */
    public FyzickaOsoba3 getFO() {
        return fo;
    }

    /**
     * Sets the value of the fo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FyzickaOsoba3 }
     *     
     */
    public void setFO(FyzickaOsoba3 value) {
        this.fo = value;
    }

    /**
     * Gets the value of the fos property.
     * 
     * @return
     *     possible object is
     *     {@link FyzickaOsoba3 }
     *     
     */
    public FyzickaOsoba3 getFOS() {
        return fos;
    }

    /**
     * Sets the value of the fos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FyzickaOsoba3 }
     *     
     */
    public void setFOS(FyzickaOsoba3 value) {
        this.fos = value;
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
     * Gets the value of the dau property.
     * 
     * @return
     *     possible object is
     *     {@link DalsiUdaje3 }
     *     
     */
    public DalsiUdaje3 getDAU() {
        return dau;
    }

    /**
     * Sets the value of the dau property.
     * 
     * @param value
     *     allowed object is
     *     {@link DalsiUdaje3 }
     *     
     */
    public void setDAU(DalsiUdaje3 value) {
        this.dau = value;
    }

}
