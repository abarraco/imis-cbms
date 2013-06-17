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


/**
 * An association of an ACTION with a LOCATION that enables the geographic position of the ACTION to be specified.
 * 
 * <p>Java class for ActionLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccuracyDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="BearingAngle" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}AngleTypeRangeAngle7_4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionLocation", propOrder = {
    "accuracyDimension",
    "bearingAngle"
})
public class ActionLocation {

    @XmlElement(name = "AccuracyDimension")
    protected BigDecimal accuracyDimension;
    @XmlElement(name = "BearingAngle")
    protected BigDecimal bearingAngle;

    /**
     * Gets the value of the accuracyDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccuracyDimension() {
        return accuracyDimension;
    }

    /**
     * Sets the value of the accuracyDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccuracyDimension(BigDecimal value) {
        this.accuracyDimension = value;
    }

    /**
     * Gets the value of the bearingAngle property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBearingAngle() {
        return bearingAngle;
    }

    /**
     * Sets the value of the bearingAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBearingAngle(BigDecimal value) {
        this.bearingAngle = value;
    }

}
