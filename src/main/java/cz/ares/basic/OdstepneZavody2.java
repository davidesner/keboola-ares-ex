
package cz.ares.basic;

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
 * <p>Java class for odstepne_zavody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odstepne_zavody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OZ" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}ico" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}obchodni_firma" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CIN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}cinnosti" minOccurs="0"/>
 *                   &lt;element name="V" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}angazma" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "odstepne_zavody", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "oz"
})
public class OdstepneZavody2 {

    @XmlElement(name = "OZ", required = true)
    protected List<OdstepneZavody2 .OZ> oz;

    /**
     * Gets the value of the oz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OdstepneZavody2 .OZ }
     * 
     * 
     */
    public List<OdstepneZavody2 .OZ> getOZ() {
        if (oz == null) {
            oz = new ArrayList<OdstepneZavody2 .OZ>();
        }
        return this.oz;
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
     *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}ico" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}obchodni_firma" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CIN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}cinnosti" minOccurs="0"/>
     *         &lt;element name="V" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}angazma" maxOccurs="unbounded" minOccurs="0"/>
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
        "ico",
        "of",
        "si",
        "cin",
        "v"
    })
    public static class OZ {

        @XmlElement(name = "ICO", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
        protected List<Ico2> ico;
        @XmlElement(name = "OF", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
        protected List<ObchodniFirma2> of;
        @XmlElement(name = "SI", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
        protected List<AdresaARES2> si;
        @XmlElement(name = "CIN", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
        protected Cinnosti2 cin;
        @XmlElement(name = "V", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3")
        protected List<Angazma2> v;
        @XmlAttribute
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dod;
        @XmlAttribute
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar ddo;

        /**
         * Gets the value of the ico property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ico property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getICO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ico2 }
         * 
         * 
         */
        public List<Ico2> getICO() {
            if (ico == null) {
                ico = new ArrayList<Ico2>();
            }
            return this.ico;
        }

        /**
         * Gets the value of the of property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the of property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObchodniFirma2 }
         * 
         * 
         */
        public List<ObchodniFirma2> getOF() {
            if (of == null) {
                of = new ArrayList<ObchodniFirma2>();
            }
            return this.of;
        }

        /**
         * Gets the value of the si property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the si property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSI().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdresaARES2 }
         * 
         * 
         */
        public List<AdresaARES2> getSI() {
            if (si == null) {
                si = new ArrayList<AdresaARES2>();
            }
            return this.si;
        }

        /**
         * Gets the value of the cin property.
         * 
         * @return
         *     possible object is
         *     {@link Cinnosti2 }
         *     
         */
        public Cinnosti2 getCIN() {
            return cin;
        }

        /**
         * Sets the value of the cin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cinnosti2 }
         *     
         */
        public void setCIN(Cinnosti2 value) {
            this.cin = value;
        }

        /**
         * Gets the value of the v property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the v property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getV().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Angazma2 }
         * 
         * 
         */
        public List<Angazma2> getV() {
            if (v == null) {
                v = new ArrayList<Angazma2>();
            }
            return this.v;
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
