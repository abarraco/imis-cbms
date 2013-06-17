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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Specifies the end time of an action (task or event) in
 * 				relative time. 
 * 
 * <p>Java class for EndWhenRelativeTimeLightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndWhenRelativeTimeLightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="TaskRef" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *           &lt;element name="EventRef" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;/choice>
 *         &lt;element name="TemporalAssociationCategoryCode" type="{http://www.sisostds.org/schemas/c-bml/1.0}ActionEndTemporalAssociationCategoryCode"/>
 *         &lt;element name="ReferenceDuration" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DurationType19" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndWhenRelativeTimeLightType", propOrder = {
    "taskRef",
    "eventRef",
    "temporalAssociationCategoryCode",
    "referenceDuration"
})
public class EndWhenRelativeTimeLightType {

    @XmlElement(name = "TaskRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taskRef;
    @XmlElement(name = "EventRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String eventRef;
    @XmlElement(name = "TemporalAssociationCategoryCode", required = true)
    protected ActionEndTemporalAssociationCategoryCode temporalAssociationCategoryCode;
    @XmlElement(name = "ReferenceDuration")
    protected BigInteger referenceDuration;

    /**
     * Gets the value of the taskRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskRef() {
        return taskRef;
    }

    /**
     * Sets the value of the taskRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskRef(String value) {
        this.taskRef = value;
    }

    /**
     * Gets the value of the eventRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventRef() {
        return eventRef;
    }

    /**
     * Sets the value of the eventRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventRef(String value) {
        this.eventRef = value;
    }

    /**
     * Gets the value of the temporalAssociationCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionEndTemporalAssociationCategoryCode }
     *     
     */
    public ActionEndTemporalAssociationCategoryCode getTemporalAssociationCategoryCode() {
        return temporalAssociationCategoryCode;
    }

    /**
     * Sets the value of the temporalAssociationCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEndTemporalAssociationCategoryCode }
     *     
     */
    public void setTemporalAssociationCategoryCode(ActionEndTemporalAssociationCategoryCode value) {
        this.temporalAssociationCategoryCode = value;
    }

    /**
     * Gets the value of the referenceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferenceDuration() {
        return referenceDuration;
    }

    /**
     * Sets the value of the referenceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferenceDuration(BigInteger value) {
        this.referenceDuration = value;
    }

}