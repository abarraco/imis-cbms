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
 * A FEATURE describing terrain characteristics to which military significance is attached.
 * 
 * <p>Java class for GeographicFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicFeature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractFeature">
 *       &lt;sequence>
 *         &lt;element name="BottomHardnessCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}GeographicFeatureBottomHardnessCode" minOccurs="0"/>
 *         &lt;element name="BottomPenetrationQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType3_2" minOccurs="0"/>
 *         &lt;element name="SolidSurfaceCompositionCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}GeographicFeatureSolidSurfaceCompositionCode" minOccurs="0"/>
 *         &lt;element name="SurfaceCategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}GeographicFeatureSurfaceCategoryCode" minOccurs="0"/>
 *         &lt;element name="TerrainCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}GeographicFeatureTerrainCode" minOccurs="0"/>
 *         &lt;element name="VegetationCategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}VegetationCategoryCode" minOccurs="0"/>
 *         &lt;element name="VegetationSubcategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}VegetationSubcategoryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicFeature", propOrder = {
    "bottomHardnessCode",
    "bottomPenetrationQuantity",
    "solidSurfaceCompositionCode",
    "surfaceCategoryCode",
    "terrainCode",
    "vegetationCategoryCode",
    "vegetationSubcategoryCode"
})
public class GeographicFeature
    extends AbstractFeature
{

    @XmlElement(name = "BottomHardnessCode")
    protected GeographicFeatureBottomHardnessCode bottomHardnessCode;
    @XmlElement(name = "BottomPenetrationQuantity")
    protected BigDecimal bottomPenetrationQuantity;
    @XmlElement(name = "SolidSurfaceCompositionCode")
    protected GeographicFeatureSolidSurfaceCompositionCode solidSurfaceCompositionCode;
    @XmlElement(name = "SurfaceCategoryCode")
    protected GeographicFeatureSurfaceCategoryCode surfaceCategoryCode;
    @XmlElement(name = "TerrainCode")
    protected GeographicFeatureTerrainCode terrainCode;
    @XmlElement(name = "VegetationCategoryCode")
    protected VegetationCategoryCode vegetationCategoryCode;
    @XmlElement(name = "VegetationSubcategoryCode")
    protected VegetationSubcategoryCode vegetationSubcategoryCode;

    /**
     * Gets the value of the bottomHardnessCode property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicFeatureBottomHardnessCode }
     *     
     */
    public GeographicFeatureBottomHardnessCode getBottomHardnessCode() {
        return bottomHardnessCode;
    }

    /**
     * Sets the value of the bottomHardnessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicFeatureBottomHardnessCode }
     *     
     */
    public void setBottomHardnessCode(GeographicFeatureBottomHardnessCode value) {
        this.bottomHardnessCode = value;
    }

    /**
     * Gets the value of the bottomPenetrationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBottomPenetrationQuantity() {
        return bottomPenetrationQuantity;
    }

    /**
     * Sets the value of the bottomPenetrationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBottomPenetrationQuantity(BigDecimal value) {
        this.bottomPenetrationQuantity = value;
    }

    /**
     * Gets the value of the solidSurfaceCompositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicFeatureSolidSurfaceCompositionCode }
     *     
     */
    public GeographicFeatureSolidSurfaceCompositionCode getSolidSurfaceCompositionCode() {
        return solidSurfaceCompositionCode;
    }

    /**
     * Sets the value of the solidSurfaceCompositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicFeatureSolidSurfaceCompositionCode }
     *     
     */
    public void setSolidSurfaceCompositionCode(GeographicFeatureSolidSurfaceCompositionCode value) {
        this.solidSurfaceCompositionCode = value;
    }

    /**
     * Gets the value of the surfaceCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicFeatureSurfaceCategoryCode }
     *     
     */
    public GeographicFeatureSurfaceCategoryCode getSurfaceCategoryCode() {
        return surfaceCategoryCode;
    }

    /**
     * Sets the value of the surfaceCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicFeatureSurfaceCategoryCode }
     *     
     */
    public void setSurfaceCategoryCode(GeographicFeatureSurfaceCategoryCode value) {
        this.surfaceCategoryCode = value;
    }

    /**
     * Gets the value of the terrainCode property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicFeatureTerrainCode }
     *     
     */
    public GeographicFeatureTerrainCode getTerrainCode() {
        return terrainCode;
    }

    /**
     * Sets the value of the terrainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicFeatureTerrainCode }
     *     
     */
    public void setTerrainCode(GeographicFeatureTerrainCode value) {
        this.terrainCode = value;
    }

    /**
     * Gets the value of the vegetationCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link VegetationCategoryCode }
     *     
     */
    public VegetationCategoryCode getVegetationCategoryCode() {
        return vegetationCategoryCode;
    }

    /**
     * Sets the value of the vegetationCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VegetationCategoryCode }
     *     
     */
    public void setVegetationCategoryCode(VegetationCategoryCode value) {
        this.vegetationCategoryCode = value;
    }

    /**
     * Gets the value of the vegetationSubcategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link VegetationSubcategoryCode }
     *     
     */
    public VegetationSubcategoryCode getVegetationSubcategoryCode() {
        return vegetationSubcategoryCode;
    }

    /**
     * Sets the value of the vegetationSubcategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VegetationSubcategoryCode }
     *     
     */
    public void setVegetationSubcategoryCode(VegetationSubcategoryCode value) {
        this.vegetationSubcategoryCode = value;
    }

}
