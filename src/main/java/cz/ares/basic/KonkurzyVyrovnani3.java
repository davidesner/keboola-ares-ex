
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
 *                   &lt;element name="KKZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}konkurz" minOccurs="0"/>
 *                   &lt;element name="VY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}konkurz" minOccurs="0"/>
 *                   &lt;element name="ZAM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}konkurz" minOccurs="0"/>
 *                   &lt;element name="Insolvence" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}konkurz" minOccurs="0"/>
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
@XmlType(name = "konkurzy_vyrovnani", propOrder = {
    "ukon"
})
public class KonkurzyVyrovnani3 {

    @XmlElement(name = "Ukon", required = true)
    protected List<KonkurzyVyrovnani3 .Ukon> ukon;

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
     * {@link KonkurzyVyrovnani3 .Ukon }
     * 
     * 
     */
    public List<KonkurzyVyrovnani3 .Ukon> getUkon() {
        if (ukon == null) {
            ukon = new ArrayList<KonkurzyVyrovnani3 .Ukon>();
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
     *         &lt;element name="KKZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}konkurz" minOccurs="0"/>
     *         &lt;element name="VY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}konkurz" minOccurs="0"/>
     *         &lt;element name="ZAM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}konkurz" minOccurs="0"/>
     *         &lt;element name="Insolvence" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}konkurz" minOccurs="0"/>
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
        "kkz",
        "vy",
        "zam",
        "insolvence"
    })
    public static class Ukon {

        @XmlElement(name = "KKZ")
        protected Konkurz3 kkz;
        @XmlElement(name = "VY")
        protected Konkurz3 vy;
        @XmlElement(name = "ZAM")
        protected Konkurz3 zam;
        @XmlElement(name = "Insolvence")
        protected Konkurz3 insolvence;

        /**
         * Gets the value of the kkz property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz3 }
         *     
         */
        public Konkurz3 getKKZ() {
            return kkz;
        }

        /**
         * Sets the value of the kkz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz3 }
         *     
         */
        public void setKKZ(Konkurz3 value) {
            this.kkz = value;
        }

        /**
         * Gets the value of the vy property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz3 }
         *     
         */
        public Konkurz3 getVY() {
            return vy;
        }

        /**
         * Sets the value of the vy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz3 }
         *     
         */
        public void setVY(Konkurz3 value) {
            this.vy = value;
        }

        /**
         * Gets the value of the zam property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz3 }
         *     
         */
        public Konkurz3 getZAM() {
            return zam;
        }

        /**
         * Sets the value of the zam property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz3 }
         *     
         */
        public void setZAM(Konkurz3 value) {
            this.zam = value;
        }

        /**
         * Gets the value of the insolvence property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz3 }
         *     
         */
        public Konkurz3 getInsolvence() {
            return insolvence;
        }

        /**
         * Sets the value of the insolvence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz3 }
         *     
         */
        public void setInsolvence(Konkurz3 value) {
            this.insolvence = value;
        }

    }

}
