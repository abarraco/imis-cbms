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
 * An EQUIPMENT-TYPE that is designed to use electronic processing to realise its primary function.
 * 
 * <p>Java class for ElectronicEquipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicEquipmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractEquipmentType">
 *       &lt;sequence>
 *         &lt;element name="CategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ElectronicEquipmentTypeCategoryCode"/>
 *         &lt;element name="SubcategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ElectronicEquipmentTypeSubcategoryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicEquipmentType", propOrder = {
    "categoryCode",
    "subcategoryCode"
})
public class ElectronicEquipmentType
    extends AbstractEquipmentType
{

    @XmlElement(name = "CategoryCode", required = true)
    protected ElectronicEquipmentTypeCategoryCode categoryCode;
    @XmlElement(name = "SubcategoryCode")
    protected ElectronicEquipmentTypeSubcategoryCode subcategoryCode;

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicEquipmentTypeCategoryCode }
     *     
     */
    public ElectronicEquipmentTypeCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicEquipmentTypeCategoryCode }
     *     
     */
    public void setCategoryCode(ElectronicEquipmentTypeCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the subcategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicEquipmentTypeSubcategoryCode }
     *     
     */
    public ElectronicEquipmentTypeSubcategoryCode getSubcategoryCode() {
        return subcategoryCode;
    }

    /**
     * Sets the value of the subcategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicEquipmentTypeSubcategoryCode }
     *     
     */
    public void setSubcategoryCode(ElectronicEquipmentTypeSubcategoryCode value) {
        this.subcategoryCode = value;
    }

}
