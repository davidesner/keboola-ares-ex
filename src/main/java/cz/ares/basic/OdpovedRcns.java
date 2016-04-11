
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odpoved_rcns complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odpoved_rcns">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pomocne_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Error" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}error_ARES" minOccurs="0"/>
 *         &lt;element name="Vysledek_hledani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}vysledek_hledani"/>
 *         &lt;element name="Pocet_zaznamu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vypis_rcns" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}vypis_rcns" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odpoved_rcns", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "pomocneID",
    "error",
    "vysledekHledani",
    "pocetZaznamu",
    "vypisRcns"
})
public class OdpovedRcns {

    @XmlElement(name = "Pomocne_ID")
    protected int pomocneID;
    @XmlElement(name = "Error")
    protected ErrorARES error;
    @XmlElement(name = "Vysledek_hledani", required = true)
    protected VysledekHledani vysledekHledani;
    @XmlElement(name = "Pocet_zaznamu")
    protected int pocetZaznamu;
    @XmlElement(name = "Vypis_rcns")
    protected List<VypisRcns> vypisRcns;

    /**
     * Gets the value of the pomocneID property.
     * 
     */
    public int getPomocneID() {
        return pomocneID;
    }

    /**
     * Sets the value of the pomocneID property.
     * 
     */
    public void setPomocneID(int value) {
        this.pomocneID = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorARES }
     *     
     */
    public ErrorARES getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorARES }
     *     
     */
    public void setError(ErrorARES value) {
        this.error = value;
    }

    /**
     * Gets the value of the vysledekHledani property.
     * 
     * @return
     *     possible object is
     *     {@link VysledekHledani }
     *     
     */
    public VysledekHledani getVysledekHledani() {
        return vysledekHledani;
    }

    /**
     * Sets the value of the vysledekHledani property.
     * 
     * @param value
     *     allowed object is
     *     {@link VysledekHledani }
     *     
     */
    public void setVysledekHledani(VysledekHledani value) {
        this.vysledekHledani = value;
    }

    /**
     * Gets the value of the pocetZaznamu property.
     * 
     */
    public int getPocetZaznamu() {
        return pocetZaznamu;
    }

    /**
     * Sets the value of the pocetZaznamu property.
     * 
     */
    public void setPocetZaznamu(int value) {
        this.pocetZaznamu = value;
    }

    /**
     * Gets the value of the vypisRcns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vypisRcns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVypisRcns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VypisRcns }
     * 
     * 
     */
    public List<VypisRcns> getVypisRcns() {
        if (vypisRcns == null) {
            vypisRcns = new ArrayList<VypisRcns>();
        }
        return this.vypisRcns;
    }

}
