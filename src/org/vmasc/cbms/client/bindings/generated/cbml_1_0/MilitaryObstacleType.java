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
 * A FACILITY-TYPE that is a class of man-made devices or passive defence works that are designed to stop, impede, or divert movement of amphibious or ground forces.
 * 
 * <p>Java class for MilitaryObstacleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MilitaryObstacleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractFacilityType">
 *       &lt;sequence>
 *         &lt;element name="CategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}MilitaryObstacleTypeCategoryCode"/>
 *         &lt;element name="SubcategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}MilitaryObstacleTypeSubcategoryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MilitaryObstacleType", propOrder = {
    "categoryCode",
    "subcategoryCode"
})
public class MilitaryObstacleType
    extends AbstractFacilityType
{

    @XmlElement(name = "CategoryCode", required = true)
    protected MilitaryObstacleTypeCategoryCode categoryCode;
    @XmlElement(name = "SubcategoryCode")
    protected MilitaryObstacleTypeSubcategoryCode subcategoryCode;

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryObstacleTypeCategoryCode }
     *     
     */
    public MilitaryObstacleTypeCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryObstacleTypeCategoryCode }
     *     
     */
    public void setCategoryCode(MilitaryObstacleTypeCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the subcategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryObstacleTypeSubcategoryCode }
     *     
     */
    public MilitaryObstacleTypeSubcategoryCode getSubcategoryCode() {
        return subcategoryCode;
    }

    /**
     * Sets the value of the subcategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryObstacleTypeSubcategoryCode }
     *     
     */
    public void setSubcategoryCode(MilitaryObstacleTypeSubcategoryCode value) {
        this.subcategoryCode = value;
    }

}
