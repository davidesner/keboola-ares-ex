
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
 *         &lt;element name="Odstepny_zavod" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}ico" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Obchodni_firma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}obchodni_firma" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Sidlo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}cinnosti" minOccurs="0"/>
 *                   &lt;element name="Vedouci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}angazma" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "odstepne_zavody", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "odstepnyZavod"
})
public class OdstepneZavody {

    @XmlElement(name = "Odstepny_zavod", required = true)
    protected List<OdstepneZavody.OdstepnyZavod> odstepnyZavod;

    /**
     * Gets the value of the odstepnyZavod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the odstepnyZavod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOdstepnyZavod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OdstepneZavody.OdstepnyZavod }
     * 
     * 
     */
    public List<OdstepneZavody.OdstepnyZavod> getOdstepnyZavod() {
        if (odstepnyZavod == null) {
            odstepnyZavod = new ArrayList<OdstepneZavody.OdstepnyZavod>();
        }
        return this.odstepnyZavod;
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
     *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}ico" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Obchodni_firma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}obchodni_firma" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Sidlo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}cinnosti" minOccurs="0"/>
     *         &lt;element name="Vedouci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}angazma" maxOccurs="unbounded" minOccurs="0"/>
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
        "obchodniFirma",
        "sidlo",
        "cinnosti",
        "vedouci"
    })
    public static class OdstepnyZavod {

        @XmlElement(name = "ICO", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected List<Ico> ico;
        @XmlElement(name = "Obchodni_firma", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected List<ObchodniFirma> obchodniFirma;
        @XmlElement(name = "Sidlo", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected List<AdresaARES> sidlo;
        @XmlElement(name = "Cinnosti", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected Cinnosti cinnosti;
        @XmlElement(name = "Vedouci", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2")
        protected List<Angazma> vedouci;
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
         * {@link Ico }
         * 
         * 
         */
        public List<Ico> getICO() {
            if (ico == null) {
                ico = new ArrayList<Ico>();
            }
            return this.ico;
        }

        /**
         * Gets the value of the obchodniFirma property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the obchodniFirma property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObchodniFirma().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObchodniFirma }
         * 
         * 
         */
        public List<ObchodniFirma> getObchodniFirma() {
            if (obchodniFirma == null) {
                obchodniFirma = new ArrayList<ObchodniFirma>();
            }
            return this.obchodniFirma;
        }

        /**
         * Gets the value of the sidlo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sidlo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSidlo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdresaARES }
         * 
         * 
         */
        public List<AdresaARES> getSidlo() {
            if (sidlo == null) {
                sidlo = new ArrayList<AdresaARES>();
            }
            return this.sidlo;
        }

        /**
         * Gets the value of the cinnosti property.
         * 
         * @return
         *     possible object is
         *     {@link Cinnosti }
         *     
         */
        public Cinnosti getCinnosti() {
            return cinnosti;
        }

        /**
         * Sets the value of the cinnosti property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cinnosti }
         *     
         */
        public void setCinnosti(Cinnosti value) {
            this.cinnosti = value;
        }

        /**
         * Gets the value of the vedouci property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vedouci property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVedouci().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Angazma }
         * 
         * 
         */
        public List<Angazma> getVedouci() {
            if (vedouci == null) {
                vedouci = new ArrayList<Angazma>();
            }
            return this.vedouci;
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
