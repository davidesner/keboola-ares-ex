
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
 *         &lt;element name="Emise" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Druh_akcie" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}druh_akcie" minOccurs="0"/>
 *                   &lt;element name="Hodnota" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}hodnota_emise" minOccurs="0"/>
 *                   &lt;element name="Pocet" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}pocet_akcii" minOccurs="0"/>
 *                   &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}textType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Podoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}podoba_akcii" minOccurs="0"/>
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
@XmlType(name = "akcie", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "emise"
})
public class Akcie {

    @XmlElement(name = "Emise", required = true)
    protected List<Akcie.Emise> emise;

    /**
     * Gets the value of the emise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Akcie.Emise }
     * 
     * 
     */
    public List<Akcie.Emise> getEmise() {
        if (emise == null) {
            emise = new ArrayList<Akcie.Emise>();
        }
        return this.emise;
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
     *         &lt;element name="Druh_akcie" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}druh_akcie" minOccurs="0"/>
     *         &lt;element name="Hodnota" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}hodnota_emise" minOccurs="0"/>
     *         &lt;element name="Pocet" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}pocet_akcii" minOccurs="0"/>
     *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}textType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Podoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}podoba_akcii" minOccurs="0"/>
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
        "druhAkcie",
        "hodnota",
        "pocet",
        "text",
        "podoba"
    })
    public static class Emise {

        @XmlElement(name = "Druh_akcie", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected DruhAkcie druhAkcie;
        @XmlElement(name = "Hodnota", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected String hodnota;
        @XmlElement(name = "Pocet", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected BigDecimal pocet;
        @XmlElement(name = "Text", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected List<TextType> text;
        @XmlElement(name = "Podoba", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected PodobaAkcii podoba;
        @XmlAttribute
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dod;
        @XmlAttribute
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar ddo;

        /**
         * Gets the value of the druhAkcie property.
         * 
         * @return
         *     possible object is
         *     {@link DruhAkcie }
         *     
         */
        public DruhAkcie getDruhAkcie() {
            return druhAkcie;
        }

        /**
         * Sets the value of the druhAkcie property.
         * 
         * @param value
         *     allowed object is
         *     {@link DruhAkcie }
         *     
         */
        public void setDruhAkcie(DruhAkcie value) {
            this.druhAkcie = value;
        }

        /**
         * Gets the value of the hodnota property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHodnota() {
            return hodnota;
        }

        /**
         * Sets the value of the hodnota property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHodnota(String value) {
            this.hodnota = value;
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
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TextType }
         * 
         * 
         */
        public List<TextType> getText() {
            if (text == null) {
                text = new ArrayList<TextType>();
            }
            return this.text;
        }

        /**
         * Gets the value of the podoba property.
         * 
         * @return
         *     possible object is
         *     {@link PodobaAkcii }
         *     
         */
        public PodobaAkcii getPodoba() {
            return podoba;
        }

        /**
         * Sets the value of the podoba property.
         * 
         * @param value
         *     allowed object is
         *     {@link PodobaAkcii }
         *     
         */
        public void setPodoba(PodobaAkcii value) {
            this.podoba = value;
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
