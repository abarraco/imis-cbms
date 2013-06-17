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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A perceived effectiveness of a specific ACTION against a specific battlespace object or its class. Concrete types are: {ActionEffectItem, ActionEffectType}
 * 
 * <p>Java class for AbstractActionEffect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractActionEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescriptionCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ActionEffectDescriptionCode"/>
 *         &lt;element name="SeverityCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ActionEffectSeverityCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractActionEffect", propOrder = {
    "descriptionCode",
    "severityCode"
})
@XmlSeeAlso({
    ActionEffectType.class,
    ActionEffectItem.class
})
public abstract class AbstractActionEffect {

    @XmlElement(name = "DescriptionCode", required = true)
    protected ActionEffectDescriptionCode descriptionCode;
    @XmlElement(name = "SeverityCode")
    protected ActionEffectSeverityCode severityCode;

    /**
     * Gets the value of the descriptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionEffectDescriptionCode }
     *     
     */
    public ActionEffectDescriptionCode getDescriptionCode() {
        return descriptionCode;
    }

    /**
     * Sets the value of the descriptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEffectDescriptionCode }
     *     
     */
    public void setDescriptionCode(ActionEffectDescriptionCode value) {
        this.descriptionCode = value;
    }

    /**
     * Gets the value of the severityCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionEffectSeverityCode }
     *     
     */
    public ActionEffectSeverityCode getSeverityCode() {
        return severityCode;
    }

    /**
     * Sets the value of the severityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEffectSeverityCode }
     *     
     */
    public void setSeverityCode(ActionEffectSeverityCode value) {
        this.severityCode = value;
    }

}
