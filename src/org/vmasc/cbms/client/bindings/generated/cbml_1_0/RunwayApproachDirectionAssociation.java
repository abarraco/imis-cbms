//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A relationship of a subject RUNWAY with an object APPROACH-DIRECTION.
 * 
 * <p>Java class for RunwayApproachDirectionAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunwayApproachDirectionAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="SlopeRatio" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RatioType6_5" minOccurs="0"/>
 *         &lt;element name="LandingDistanceDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="TakeoffDistanceDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayApproachDirectionAssociation", propOrder = {
    "oid",
    "slopeRatio",
    "landingDistanceDimension",
    "takeoffDistanceDimension"
})
public class RunwayApproachDirectionAssociation {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "SlopeRatio")
    protected BigDecimal slopeRatio;
    @XmlElement(name = "LandingDistanceDimension")
    protected BigDecimal landingDistanceDimension;
    @XmlElement(name = "TakeoffDistanceDimension")
    protected BigDecimal takeoffDistanceDimension;

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
     * Gets the value of the slopeRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSlopeRatio() {
        return slopeRatio;
    }

    /**
     * Sets the value of the slopeRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSlopeRatio(BigDecimal value) {
        this.slopeRatio = value;
    }

    /**
     * Gets the value of the landingDistanceDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLandingDistanceDimension() {
        return landingDistanceDimension;
    }

    /**
     * Sets the value of the landingDistanceDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLandingDistanceDimension(BigDecimal value) {
        this.landingDistanceDimension = value;
    }

    /**
     * Gets the value of the takeoffDistanceDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTakeoffDistanceDimension() {
        return takeoffDistanceDimension;
    }

    /**
     * Sets the value of the takeoffDistanceDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTakeoffDistanceDimension(BigDecimal value) {
        this.takeoffDistanceDimension = value;
    }

}
