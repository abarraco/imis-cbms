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
 * An EQUIPMENT-TYPE of any kind used in warfare or combat to attack and overcome an enemy.
 * 
 * <p>Java class for WeaponType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeaponType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractEquipmentType">
 *       &lt;sequence>
 *         &lt;element name="CategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}WeaponTypeCategoryCode"/>
 *         &lt;element name="SubcategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}WeaponTypeSubcategoryCode" minOccurs="0"/>
 *         &lt;element name="CalibreText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar15" minOccurs="0"/>
 *         &lt;element name="FireGuidanceIndicatorCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}WeaponTypeFireGuidanceIndicatorCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeaponType", propOrder = {
    "categoryCode",
    "subcategoryCode",
    "calibreText",
    "fireGuidanceIndicatorCode"
})
public class WeaponType
    extends AbstractEquipmentType
{

    @XmlElement(name = "CategoryCode", required = true)
    protected WeaponTypeCategoryCode categoryCode;
    @XmlElement(name = "SubcategoryCode")
    protected WeaponTypeSubcategoryCode subcategoryCode;
    @XmlElement(name = "CalibreText")
    protected String calibreText;
    @XmlElement(name = "FireGuidanceIndicatorCode")
    protected WeaponTypeFireGuidanceIndicatorCode fireGuidanceIndicatorCode;

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link WeaponTypeCategoryCode }
     *     
     */
    public WeaponTypeCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeaponTypeCategoryCode }
     *     
     */
    public void setCategoryCode(WeaponTypeCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the subcategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link WeaponTypeSubcategoryCode }
     *     
     */
    public WeaponTypeSubcategoryCode getSubcategoryCode() {
        return subcategoryCode;
    }

    /**
     * Sets the value of the subcategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeaponTypeSubcategoryCode }
     *     
     */
    public void setSubcategoryCode(WeaponTypeSubcategoryCode value) {
        this.subcategoryCode = value;
    }

    /**
     * Gets the value of the calibreText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibreText() {
        return calibreText;
    }

    /**
     * Sets the value of the calibreText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibreText(String value) {
        this.calibreText = value;
    }

    /**
     * Gets the value of the fireGuidanceIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link WeaponTypeFireGuidanceIndicatorCode }
     *     
     */
    public WeaponTypeFireGuidanceIndicatorCode getFireGuidanceIndicatorCode() {
        return fireGuidanceIndicatorCode;
    }

    /**
     * Sets the value of the fireGuidanceIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeaponTypeFireGuidanceIndicatorCode }
     *     
     */
    public void setFireGuidanceIndicatorCode(WeaponTypeFireGuidanceIndicatorCode value) {
        this.fireGuidanceIndicatorCode = value;
    }

}
