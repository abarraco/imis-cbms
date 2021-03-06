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
 * Specifies a report describing the personnel protection of a target.
 * 
 * <p>Java class for TargetPersonnelProtectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetPersonnelProtectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractReportType">
 *       &lt;sequence>
 *         &lt;element name="TargetRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}TargetRef"/>
 *         &lt;element name="ProtectionCategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TargetPersonnelProtectionCategoryCode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetPersonnelProtectionType", propOrder = {
    "targetRef",
    "protectionCategoryCode"
})
public class TargetPersonnelProtectionType
    extends AbstractReportType
{

    @XmlElement(name = "TargetRef", required = true)
    protected TargetRef targetRef;
    @XmlElement(name = "ProtectionCategoryCode", required = true)
    protected TargetPersonnelProtectionCategoryCode protectionCategoryCode;

    /**
     * Gets the value of the targetRef property.
     * 
     * @return
     *     possible object is
     *     {@link TargetRef }
     *     
     */
    public TargetRef getTargetRef() {
        return targetRef;
    }

    /**
     * Sets the value of the targetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetRef }
     *     
     */
    public void setTargetRef(TargetRef value) {
        this.targetRef = value;
    }

    /**
     * Gets the value of the protectionCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TargetPersonnelProtectionCategoryCode }
     *     
     */
    public TargetPersonnelProtectionCategoryCode getProtectionCategoryCode() {
        return protectionCategoryCode;
    }

    /**
     * Sets the value of the protectionCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetPersonnelProtectionCategoryCode }
     *     
     */
    public void setProtectionCategoryCode(TargetPersonnelProtectionCategoryCode value) {
        this.protectionCategoryCode = value;
    }

}
