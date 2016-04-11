
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sekce údajù o konkurzech, vyrovnáních a zamítnutích konkurzù
 * 
 * <p>Java class for konkurzy_vyrovnani complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="konkurzy_vyrovnani">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ukon" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Konkurz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}konkurz" minOccurs="0"/>
 *                   &lt;element name="Vyrovnani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}konkurz" minOccurs="0"/>
 *                   &lt;element name="Zamitnuti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}konkurz" minOccurs="0"/>
 *                   &lt;element name="Insolvence" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}konkurz" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "konkurzy_vyrovnani", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "ukon"
})
public class KonkurzyVyrovnani {

    @XmlElement(name = "Ukon", required = true)
    protected List<KonkurzyVyrovnani.Ukon> ukon;

    /**
     * Gets the value of the ukon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ukon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUkon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KonkurzyVyrovnani.Ukon }
     * 
     * 
     */
    public List<KonkurzyVyrovnani.Ukon> getUkon() {
        if (ukon == null) {
            ukon = new ArrayList<KonkurzyVyrovnani.Ukon>();
        }
        return this.ukon;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="Konkurz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}konkurz" minOccurs="0"/>
     *         &lt;element name="Vyrovnani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}konkurz" minOccurs="0"/>
     *         &lt;element name="Zamitnuti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}konkurz" minOccurs="0"/>
     *         &lt;element name="Insolvence" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}konkurz" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "konkurz",
        "vyrovnani",
        "zamitnuti",
        "insolvence"
    })
    public static class Ukon {

        @XmlElement(name = "Konkurz", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected Konkurz konkurz;
        @XmlElement(name = "Vyrovnani", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected Konkurz vyrovnani;
        @XmlElement(name = "Zamitnuti", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected Konkurz zamitnuti;
        @XmlElement(name = "Insolvence", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected Konkurz insolvence;

        /**
         * Gets the value of the konkurz property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getKonkurz() {
            return konkurz;
        }

        /**
         * Sets the value of the konkurz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setKonkurz(Konkurz value) {
            this.konkurz = value;
        }

        /**
         * Gets the value of the vyrovnani property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getVyrovnani() {
            return vyrovnani;
        }

        /**
         * Sets the value of the vyrovnani property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setVyrovnani(Konkurz value) {
            this.vyrovnani = value;
        }

        /**
         * Gets the value of the zamitnuti property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getZamitnuti() {
            return zamitnuti;
        }

        /**
         * Sets the value of the zamitnuti property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setZamitnuti(Konkurz value) {
            this.zamitnuti = value;
        }

        /**
         * Gets the value of the insolvence property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getInsolvence() {
            return insolvence;
        }

        /**
         * Sets the value of the insolvence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setInsolvence(Konkurz value) {
            this.insolvence = value;
        }

    }

}
