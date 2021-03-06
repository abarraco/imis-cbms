//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An estimate of the average number of casualties for a given number of vessel transits through a specific MINEFIELD-MARITIME.
 * 
 * <p>Java class for MinefieldMaritimeCasualtyEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MinefieldMaritimeCasualtyEstimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="AverageCount" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CountType6" minOccurs="0"/>
 *         &lt;element name="GivenTransitCount" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CountType6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinefieldMaritimeCasualtyEstimate", propOrder = {
    "oid",
    "averageCount",
    "givenTransitCount"
})
public class MinefieldMaritimeCasualtyEstimate {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "AverageCount")
    protected Integer averageCount;
    @XmlElement(name = "GivenTransitCount")
    protected Integer givenTransitCount;

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the averageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAverageCount() {
        return averageCount;
    }

    /**
     * Sets the value of the averageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAverageCount(Integer value) {
        this.averageCount = value;
    }

    /**
     * Gets the value of the givenTransitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGivenTransitCount() {
        return givenTransitCount;
    }

    /**
     * Sets the value of the givenTransitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGivenTransitCount(Integer value) {
        this.givenTransitCount = value;
    }

}
