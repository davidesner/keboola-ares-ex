
package cz.ares.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for akcie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="akcie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EM" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}druh_akcie" minOccurs="0"/>
 *                   &lt;element name="H" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}hodnota_emise" minOccurs="0"/>
 *                   &lt;element name="Pocet" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}pocet_akcii" minOccurs="0"/>
 *                   &lt;element name="T" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}textType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}podoba_akcii" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
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
@XmlType(name = "akcie", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "em"
})
public class Akcie2 {

    @XmlElement(name = "EM", required = true)
    protected List<Akcie2 .EM> em;

    /**
     * Gets the value of the em property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the em property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Akcie2 .EM }
     * 
     * 
     */
    public List<Akcie2 .EM> getEM() {
        if (em == null) {
            em = new ArrayList<Akcie2 .EM>();
        }
        return this.em;
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
     *       &lt;sequence>
     *         &lt;element name="DA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}druh_akcie" minOccurs="0"/>
     *         &lt;element name="H" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}hodnota_emise" minOccurs="0"/>
     *         &lt;element name="Pocet" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}pocet_akcii" minOccurs="0"/>
     *         &lt;element name="T" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}textType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}podoba_akcii" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "da",
        "h",
        "pocet",
        "t",
        "pd"
    })
    public static class EM {

        @XmlElement(name = "DA", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
        protected DruhAkcie2 da;
        @XmlElement(name = "H", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
        protected String h;
        @XmlElement(name = "Pocet", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
        protected BigDecimal pocet;
        @XmlElement(name = "T", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
        protected List<TextType2> t;
        @XmlElement(name = "PD", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
        protected PodobaAkcii2 pd;
        @XmlAttribute
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dod;
        @XmlAttribute
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar ddo;

        /**
         * Gets the value of the da property.
         * 
         * @return
         *     possible object is
         *     {@link DruhAkcie2 }
         *     
         */
        public DruhAkcie2 getDA() {
            return da;
        }

        /**
         * Sets the value of the da property.
         * 
         * @param value
         *     allowed object is
         *     {@link DruhAkcie2 }
         *     
         */
        public void setDA(DruhAkcie2 value) {
            this.da = value;
        }

        /**
         * Gets the value of the h property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getH() {
            return h;
        }

        /**
         * Sets the value of the h property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setH(String value) {
            this.h = value;
        }

        /**
         * Gets the value of the pocet property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPocet() {
            return pocet;
        }

        /**
         * Sets the value of the pocet property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPocet(BigDecimal value) {
            this.pocet = value;
        }

        /**
         * Gets the value of the t property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the t property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TextType2 }
         * 
         * 
         */
        public List<TextType2> getT() {
            if (t == null) {
                t = new ArrayList<TextType2>();
            }
            return this.t;
        }

        /**
         * Gets the value of the pd property.
         * 
         * @return
         *     possible object is
         *     {@link PodobaAkcii2 }
         *     
         */
        public PodobaAkcii2 getPD() {
            return pd;
        }

        /**
         * Sets the value of the pd property.
         * 
         * @param value
         *     allowed object is
         *     {@link PodobaAkcii2 }
         *     
         */
        public void setPD(PodobaAkcii2 value) {
            this.pd = value;
        }

        /**
         * Gets the value of the dod property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDod() {
            return dod;
        }

        /**
         * Sets the value of the dod property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDod(XMLGregorianCalendar value) {
            this.dod = value;
        }

        /**
         * Gets the value of the ddo property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDdo() {
            return ddo;
        }

        /**
         * Sets the value of the ddo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDdo(XMLGregorianCalendar value) {
            this.ddo = value;
        }

    }

}
