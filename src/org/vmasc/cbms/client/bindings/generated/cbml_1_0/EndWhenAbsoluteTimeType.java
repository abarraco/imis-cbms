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


/**
 * Specifies the end time of a task in absolute time.
 * 
 * <p>Java class for EndWhenAbsoluteTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndWhenAbsoluteTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="SpecifiedTime" type="{http://www.sisostds.org/schemas/c-bml/1.0}EndWhenAbsoluteSpecifiedTimeType"/>
 *           &lt;element name="UnspecifiedTime" type="{http://www.sisostds.org/schemas/c-bml/1.0}EndWhenAbsoluteUnspecifiedTimeType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndWhenAbsoluteTimeType", propOrder = {
    "specifiedTime",
    "unspecifiedTime"
})
public class EndWhenAbsoluteTimeType {

    @XmlElement(name = "SpecifiedTime")
    protected EndWhenAbsoluteSpecifiedTimeType specifiedTime;
    @XmlElement(name = "UnspecifiedTime")
    protected EndWhenAbsoluteUnspecifiedTimeType unspecifiedTime;

    /**
     * Gets the value of the specifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link EndWhenAbsoluteSpecifiedTimeType }
     *     
     */
    public EndWhenAbsoluteSpecifiedTimeType getSpecifiedTime() {
        return specifiedTime;
    }

    /**
     * Sets the value of the specifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndWhenAbsoluteSpecifiedTimeType }
     *     
     */
    public void setSpecifiedTime(EndWhenAbsoluteSpecifiedTimeType value) {
        this.specifiedTime = value;
    }

    /**
     * Gets the value of the unspecifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link EndWhenAbsoluteUnspecifiedTimeType }
     *     
     */
    public EndWhenAbsoluteUnspecifiedTimeType getUnspecifiedTime() {
        return unspecifiedTime;
    }

    /**
     * Sets the value of the unspecifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndWhenAbsoluteUnspecifiedTimeType }
     *     
     */
    public void setUnspecifiedTime(EndWhenAbsoluteUnspecifiedTimeType value) {
        this.unspecifiedTime = value;
    }

}
