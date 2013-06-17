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
 * A vessel principally designed to operate under the water surface.
 * 
 * <p>Java class for SubsurfaceVesselType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubsurfaceVesselType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractVesselType">
 *       &lt;sequence>
 *         &lt;element name="CategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}SubsurfaceVesselTypeCategoryCode"/>
 *         &lt;element name="DivedDisplacementQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType9" minOccurs="0"/>
 *         &lt;element name="SpeedCavitationQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType3" minOccurs="0"/>
 *         &lt;element name="TorpedoLoadingGearIndicatorCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}SubsurfaceVesselTypeTorpedoLoadingGearIndicatorCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsurfaceVesselType", propOrder = {
    "categoryCode",
    "divedDisplacementQuantity",
    "speedCavitationQuantity",
    "torpedoLoadingGearIndicatorCode"
})
public class SubsurfaceVesselType
    extends AbstractVesselType
{

    @XmlElement(name = "CategoryCode", required = true)
    protected SubsurfaceVesselTypeCategoryCode categoryCode;
    @XmlElement(name = "DivedDisplacementQuantity")
    protected Integer divedDisplacementQuantity;
    @XmlElement(name = "SpeedCavitationQuantity")
    protected Integer speedCavitationQuantity;
    @XmlElement(name = "TorpedoLoadingGearIndicatorCode")
    protected SubsurfaceVesselTypeTorpedoLoadingGearIndicatorCode torpedoLoadingGearIndicatorCode;

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubsurfaceVesselTypeCategoryCode }
     *     
     */
    public SubsurfaceVesselTypeCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsurfaceVesselTypeCategoryCode }
     *     
     */
    public void setCategoryCode(SubsurfaceVesselTypeCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the divedDisplacementQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDivedDisplacementQuantity() {
        return divedDisplacementQuantity;
    }

    /**
     * Sets the value of the divedDisplacementQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDivedDisplacementQuantity(Integer value) {
        this.divedDisplacementQuantity = value;
    }

    /**
     * Gets the value of the speedCavitationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpeedCavitationQuantity() {
        return speedCavitationQuantity;
    }

    /**
     * Sets the value of the speedCavitationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeedCavitationQuantity(Integer value) {
        this.speedCavitationQuantity = value;
    }

    /**
     * Gets the value of the torpedoLoadingGearIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubsurfaceVesselTypeTorpedoLoadingGearIndicatorCode }
     *     
     */
    public SubsurfaceVesselTypeTorpedoLoadingGearIndicatorCode getTorpedoLoadingGearIndicatorCode() {
        return torpedoLoadingGearIndicatorCode;
    }

    /**
     * Sets the value of the torpedoLoadingGearIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsurfaceVesselTypeTorpedoLoadingGearIndicatorCode }
     *     
     */
    public void setTorpedoLoadingGearIndicatorCode(SubsurfaceVesselTypeTorpedoLoadingGearIndicatorCode value) {
        this.torpedoLoadingGearIndicatorCode = value;
    }

}