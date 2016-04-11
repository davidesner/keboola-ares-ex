
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * úvod dokumentu
 * 
 * <p>Java class for uvod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uvod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nadpis" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Aktualizace_DB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Datum_vypisu" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Cas_vypisu" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Typ_vypisu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Pozadovane_datum_platnosti_dat" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Typ_odkazu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Typ_odpovedi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uvod", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "nadpis",
    "aktualizaceDB",
    "datumVypisu",
    "casVypisu",
    "typVypisu",
    "pozadovaneDatumPlatnostiDat",
    "typOdkazu",
    "typOdpovedi"
})
public class Uvod {

    @XmlElement(name = "Nadpis")
    protected String nadpis;
    @XmlElement(name = "Aktualizace_DB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar aktualizaceDB;
    @XmlElement(name = "Datum_vypisu")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVypisu;
    @XmlElement(name = "Cas_vypisu")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar casVypisu;
    @XmlElement(name = "Typ_vypisu")
    protected String typVypisu;
    @XmlElement(name = "Pozadovane_datum_platnosti_dat")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pozadovaneDatumPlatnostiDat;
    @XmlElement(name = "Typ_odkazu")
    protected String typOdkazu;
    @XmlElement(name = "Typ_odpovedi")
    protected String typOdpovedi;

    /**
     * Gets the value of the nadpis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNadpis() {
        return nadpis;
    }

    /**
     * Sets the value of the nadpis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNadpis(String value) {
        this.nadpis = value;
    }

    /**
     * Gets the value of the aktualizaceDB property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAktualizaceDB() {
        return aktualizaceDB;
    }

    /**
     * Sets the value of the aktualizaceDB property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAktualizaceDB(XMLGregorianCalendar value) {
        this.aktualizaceDB = value;
    }

    /**
     * Gets the value of the datumVypisu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVypisu() {
        return datumVypisu;
    }

    /**
     * Sets the value of the datumVypisu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVypisu(XMLGregorianCalendar value) {
        this.datumVypisu = value;
    }

    /**
     * Gets the value of the casVypisu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCasVypisu() {
        return casVypisu;
    }

    /**
     * Sets the value of the casVypisu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCasVypisu(XMLGregorianCalendar value) {
        this.casVypisu = value;
    }

    /**
     * Gets the value of the typVypisu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypVypisu() {
        return typVypisu;
    }

    /**
     * Sets the value of the typVypisu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypVypisu(String value) {
        this.typVypisu = value;
    }

    /**
     * Gets the value of the pozadovaneDatumPlatnostiDat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPozadovaneDatumPlatnostiDat() {
        return pozadovaneDatumPlatnostiDat;
    }

    /**
     * Sets the value of the pozadovaneDatumPlatnostiDat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPozadovaneDatumPlatnostiDat(XMLGregorianCalendar value) {
        this.pozadovaneDatumPlatnostiDat = value;
    }

    /**
     * Gets the value of the typOdkazu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypOdkazu() {
        return typOdkazu;
    }

    /**
     * Sets the value of the typOdkazu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypOdkazu(String value) {
        this.typOdkazu = value;
    }

    /**
     * Gets the value of the typOdpovedi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypOdpovedi() {
        return typOdpovedi;
    }

    /**
     * Sets the value of the typOdpovedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypOdpovedi(String value) {
        this.typOdpovedi = value;
    }

}
