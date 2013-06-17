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
 * A METEOROLOGIC-FEATURE that specifies the accumulation of frozen water on stationary or moving surfaces.
 * 
 * <p>Java class for Icing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Icing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractMeteorologicFeature">
 *       &lt;sequence>
 *         &lt;element name="CategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}IcingCategoryCode" minOccurs="0"/>
 *         &lt;element name="SeverityQualifierCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}IcingSeverityQualifierCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Icing", propOrder = {
    "categoryCode",
    "severityQualifierCode"
})
public class Icing
    extends AbstractMeteorologicFeature
{

    @XmlElement(name = "CategoryCode")
    protected IcingCategoryCode categoryCode;
    @XmlElement(name = "SeverityQualifierCode")
    protected IcingSeverityQualifierCode severityQualifierCode;

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IcingCategoryCode }
     *     
     */
    public IcingCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcingCategoryCode }
     *     
     */
    public void setCategoryCode(IcingCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the severityQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link IcingSeverityQualifierCode }
     *     
     */
    public IcingSeverityQualifierCode getSeverityQualifierCode() {
        return severityQualifierCode;
    }

    /**
     * Sets the value of the severityQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IcingSeverityQualifierCode }
     *     
     */
    public void setSeverityQualifierCode(IcingSeverityQualifierCode value) {
        this.severityQualifierCode = value;
    }

}