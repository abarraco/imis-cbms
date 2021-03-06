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
 * A FACILITY that is a structure (including overpass and viaduct), fixed or moveable, spanning and/or providing passage over an object.
 * 
 * <p>Java class for Bridge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bridge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractFacility">
 *       &lt;sequence>
 *         &lt;element name="LongestSpanLengthDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="SpanCount" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CountType3" minOccurs="0"/>
 *         &lt;element name="UsageCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}BridgeUsageCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bridge", propOrder = {
    "longestSpanLengthDimension",
    "spanCount",
    "usageCode"
})
public class Bridge
    extends AbstractFacility
{

    @XmlElement(name = "LongestSpanLengthDimension")
    protected BigDecimal longestSpanLengthDimension;
    @XmlElement(name = "SpanCount")
    protected Integer spanCount;
    @XmlElement(name = "UsageCode")
    protected BridgeUsageCode usageCode;

    /**
     * Gets the value of the longestSpanLengthDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongestSpanLengthDimension() {
        return longestSpanLengthDimension;
    }

    /**
     * Sets the value of the longestSpanLengthDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongestSpanLengthDimension(BigDecimal value) {
        this.longestSpanLengthDimension = value;
    }

    /**
     * Gets the value of the spanCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpanCount() {
        return spanCount;
    }

    /**
     * Sets the value of the spanCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpanCount(Integer value) {
        this.spanCount = value;
    }

    /**
     * Gets the value of the usageCode property.
     * 
     * @return
     *     possible object is
     *     {@link BridgeUsageCode }
     *     
     */
    public BridgeUsageCode getUsageCode() {
        return usageCode;
    }

    /**
     * Sets the value of the usageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BridgeUsageCode }
     *     
     */
    public void setUsageCode(BridgeUsageCode value) {
        this.usageCode = value;
    }

}
