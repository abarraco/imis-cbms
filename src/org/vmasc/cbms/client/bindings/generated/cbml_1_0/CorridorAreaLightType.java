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
 *  Provides the elements of a corridor area as a width and a center
 * 				line. 
 * 
 * <p>Java class for CorridorAreaLightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorridorAreaLightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Width" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3"/>
 *         &lt;element name="CentreLIne" type="{http://www.sisostds.org/schemas/c-bml/1.0}LineLightType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorridorAreaLightType", propOrder = {
    "width",
    "centreLIne"
})
public class CorridorAreaLightType {

    @XmlElement(name = "Width", required = true)
    protected BigDecimal width;
    @XmlElement(name = "CentreLIne", required = true)
    protected LineLightType centreLIne;

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Gets the value of the centreLIne property.
     * 
     * @return
     *     possible object is
     *     {@link LineLightType }
     *     
     */
    public LineLightType getCentreLIne() {
        return centreLIne;
    }

    /**
     * Sets the value of the centreLIne property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineLightType }
     *     
     */
    public void setCentreLIne(LineLightType value) {
        this.centreLIne = value;
    }

}
