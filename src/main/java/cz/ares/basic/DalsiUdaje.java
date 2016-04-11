
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dalsi_udaje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dalsi_udaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Druh_zarizeni_kod" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Druh_zarizeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="Typ_ucetnictvi_kod" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Typ_ucetnictvi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dalsi_udaje", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "druhZarizeniKod",
    "druhZarizeni",
    "typUcetnictviKod",
    "typUcetnictvi"
})
public class DalsiUdaje {

    @XmlElement(name = "Druh_zarizeni_kod")
    protected Short druhZarizeniKod;
    @XmlElement(name = "Druh_zarizeni")
    protected String druhZarizeni;
    @XmlElement(name = "Typ_ucetnictvi_kod")
    protected Short typUcetnictviKod;
    @XmlElement(name = "Typ_ucetnictvi")
    protected String typUcetnictvi;

    /**
     * Gets the value of the druhZarizeniKod property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDruhZarizeniKod() {
        return druhZarizeniKod;
    }

    /**
     * Sets the value of the druhZarizeniKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDruhZarizeniKod(Short value) {
        this.druhZarizeniKod = value;
    }

    /**
     * Gets the value of the druhZarizeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDruhZarizeni() {
        return druhZarizeni;
    }

    /**
     * Sets the value of the druhZarizeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDruhZarizeni(String value) {
        this.druhZarizeni = value;
    }

    /**
     * Gets the value of the typUcetnictviKod property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTypUcetnictviKod() {
        return typUcetnictviKod;
    }

    /**
     * Sets the value of the typUcetnictviKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTypUcetnictviKod(Short value) {
        this.typUcetnictviKod = value;
    }

    /**
     * Gets the value of the typUcetnictvi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypUcetnictvi() {
        return typUcetnictvi;
    }

    /**
     * Sets the value of the typUcetnictvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypUcetnictvi(String value) {
        this.typUcetnictvi = value;
    }

}
