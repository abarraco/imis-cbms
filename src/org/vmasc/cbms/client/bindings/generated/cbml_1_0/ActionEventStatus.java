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
 * The perceived appraisal of the actual progress of a specific ACTION-EVENT as determined by the reporting organisation.
 * 
 * <p>Java class for ActionEventStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionEventStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompletionRatio" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RatioType6_5" minOccurs="0"/>
 *         &lt;element name="FeintIndicatorCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}FeintIndicatorCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionEventStatus", propOrder = {
    "completionRatio",
    "feintIndicatorCode"
})
public class ActionEventStatus {

    @XmlElement(name = "CompletionRatio")
    protected BigDecimal completionRatio;
    @XmlElement(name = "FeintIndicatorCode")
    protected FeintIndicatorCode feintIndicatorCode;

    /**
     * Gets the value of the completionRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompletionRatio() {
        return completionRatio;
    }

    /**
     * Sets the value of the completionRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompletionRatio(BigDecimal value) {
        this.completionRatio = value;
    }

    /**
     * Gets the value of the feintIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link FeintIndicatorCode }
     *     
     */
    public FeintIndicatorCode getFeintIndicatorCode() {
        return feintIndicatorCode;
    }

    /**
     * Sets the value of the feintIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeintIndicatorCode }
     *     
     */
    public void setFeintIndicatorCode(FeintIndicatorCode value) {
        this.feintIndicatorCode = value;
    }

}
