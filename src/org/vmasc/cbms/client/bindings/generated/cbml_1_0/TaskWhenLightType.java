//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the duration and start/end time of a
 * 				task.
 * 
 * <p>Java class for TaskWhenLightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskWhenLightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinimumDuration" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DurationType19" minOccurs="0"/>
 *         &lt;element name="EstimatedDuration" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DurationType19" minOccurs="0"/>
 *         &lt;element name="MaximumDuration" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DurationType19" minOccurs="0"/>
 *         &lt;element name="StartWhen" type="{http://www.sisostds.org/schemas/c-bml/1.0}TaskStartWhenLightType"/>
 *         &lt;element name="EndWhen" type="{http://www.sisostds.org/schemas/c-bml/1.0}TaskEndWhenLightType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskWhenLightType", propOrder = {
    "minimumDuration",
    "estimatedDuration",
    "maximumDuration",
    "startWhen",
    "endWhen"
})
public class TaskWhenLightType {

    @XmlElement(name = "MinimumDuration")
    protected BigInteger minimumDuration;
    @XmlElement(name = "EstimatedDuration")
    protected BigInteger estimatedDuration;
    @XmlElement(name = "MaximumDuration")
    protected BigInteger maximumDuration;
    @XmlElement(name = "StartWhen", required = true)
    protected TaskStartWhenLightType startWhen;
    @XmlElement(name = "EndWhen")
    protected TaskEndWhenLightType endWhen;

    /**
     * Gets the value of the minimumDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumDuration() {
        return minimumDuration;
    }

    /**
     * Sets the value of the minimumDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumDuration(BigInteger value) {
        this.minimumDuration = value;
    }

    /**
     * Gets the value of the estimatedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEstimatedDuration() {
        return estimatedDuration;
    }

    /**
     * Sets the value of the estimatedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEstimatedDuration(BigInteger value) {
        this.estimatedDuration = value;
    }

    /**
     * Gets the value of the maximumDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumDuration() {
        return maximumDuration;
    }

    /**
     * Sets the value of the maximumDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumDuration(BigInteger value) {
        this.maximumDuration = value;
    }

    /**
     * Gets the value of the startWhen property.
     * 
     * @return
     *     possible object is
     *     {@link TaskStartWhenLightType }
     *     
     */
    public TaskStartWhenLightType getStartWhen() {
        return startWhen;
    }

    /**
     * Sets the value of the startWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskStartWhenLightType }
     *     
     */
    public void setStartWhen(TaskStartWhenLightType value) {
        this.startWhen = value;
    }

    /**
     * Gets the value of the endWhen property.
     * 
     * @return
     *     possible object is
     *     {@link TaskEndWhenLightType }
     *     
     */
    public TaskEndWhenLightType getEndWhen() {
        return endWhen;
    }

    /**
     * Sets the value of the endWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskEndWhenLightType }
     *     
     */
    public void setEndWhen(TaskEndWhenLightType value) {
        this.endWhen = value;
    }

}
