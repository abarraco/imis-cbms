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
 * A CBRN-EVENT involving chemical and/or biological materiel.
 * 
 * <p>Java class for ChemicalBiologicalEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChemicalBiologicalEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractCbrnEvent">
 *       &lt;sequence>
 *         &lt;element name="CategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ChemicalBiologicalEventCategoryCode"/>
 *         &lt;element name="ReleaseCategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ReleaseCategoryCode" minOccurs="0"/>
 *         &lt;element name="SpillSizeCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ChemicalBiologicalEventSpillSizeCode" minOccurs="0"/>
 *         &lt;element name="ReleaseHeightDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="VolumeConcentrationQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType14_6" minOccurs="0"/>
 *         &lt;element name="SurfaceDepositionQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType14_6" minOccurs="0"/>
 *         &lt;element name="AtmosphericParticleConcentrationQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType14_6" minOccurs="0"/>
 *         &lt;element name="MassFractionConcentrationQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType14_6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChemicalBiologicalEvent", propOrder = {
    "categoryCode",
    "releaseCategoryCode",
    "spillSizeCode",
    "releaseHeightDimension",
    "volumeConcentrationQuantity",
    "surfaceDepositionQuantity",
    "atmosphericParticleConcentrationQuantity",
    "massFractionConcentrationQuantity"
})
public class ChemicalBiologicalEvent
    extends AbstractCbrnEvent
{

    @XmlElement(name = "CategoryCode", required = true)
    protected ChemicalBiologicalEventCategoryCode categoryCode;
    @XmlElement(name = "ReleaseCategoryCode")
    protected ReleaseCategoryCode releaseCategoryCode;
    @XmlElement(name = "SpillSizeCode")
    protected ChemicalBiologicalEventSpillSizeCode spillSizeCode;
    @XmlElement(name = "ReleaseHeightDimension")
    protected BigDecimal releaseHeightDimension;
    @XmlElement(name = "VolumeConcentrationQuantity")
    protected BigDecimal volumeConcentrationQuantity;
    @XmlElement(name = "SurfaceDepositionQuantity")
    protected BigDecimal surfaceDepositionQuantity;
    @XmlElement(name = "AtmosphericParticleConcentrationQuantity")
    protected BigDecimal atmosphericParticleConcentrationQuantity;
    @XmlElement(name = "MassFractionConcentrationQuantity")
    protected BigDecimal massFractionConcentrationQuantity;

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChemicalBiologicalEventCategoryCode }
     *     
     */
    public ChemicalBiologicalEventCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChemicalBiologicalEventCategoryCode }
     *     
     */
    public void setCategoryCode(ChemicalBiologicalEventCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the releaseCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseCategoryCode }
     *     
     */
    public ReleaseCategoryCode getReleaseCategoryCode() {
        return releaseCategoryCode;
    }

    /**
     * Sets the value of the releaseCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseCategoryCode }
     *     
     */
    public void setReleaseCategoryCode(ReleaseCategoryCode value) {
        this.releaseCategoryCode = value;
    }

    /**
     * Gets the value of the spillSizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChemicalBiologicalEventSpillSizeCode }
     *     
     */
    public ChemicalBiologicalEventSpillSizeCode getSpillSizeCode() {
        return spillSizeCode;
    }

    /**
     * Sets the value of the spillSizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChemicalBiologicalEventSpillSizeCode }
     *     
     */
    public void setSpillSizeCode(ChemicalBiologicalEventSpillSizeCode value) {
        this.spillSizeCode = value;
    }

    /**
     * Gets the value of the releaseHeightDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReleaseHeightDimension() {
        return releaseHeightDimension;
    }

    /**
     * Sets the value of the releaseHeightDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReleaseHeightDimension(BigDecimal value) {
        this.releaseHeightDimension = value;
    }

    /**
     * Gets the value of the volumeConcentrationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeConcentrationQuantity() {
        return volumeConcentrationQuantity;
    }

    /**
     * Sets the value of the volumeConcentrationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeConcentrationQuantity(BigDecimal value) {
        this.volumeConcentrationQuantity = value;
    }

    /**
     * Gets the value of the surfaceDepositionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurfaceDepositionQuantity() {
        return surfaceDepositionQuantity;
    }

    /**
     * Sets the value of the surfaceDepositionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurfaceDepositionQuantity(BigDecimal value) {
        this.surfaceDepositionQuantity = value;
    }

    /**
     * Gets the value of the atmosphericParticleConcentrationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAtmosphericParticleConcentrationQuantity() {
        return atmosphericParticleConcentrationQuantity;
    }

    /**
     * Sets the value of the atmosphericParticleConcentrationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAtmosphericParticleConcentrationQuantity(BigDecimal value) {
        this.atmosphericParticleConcentrationQuantity = value;
    }

    /**
     * Gets the value of the massFractionConcentrationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMassFractionConcentrationQuantity() {
        return massFractionConcentrationQuantity;
    }

    /**
     * Sets the value of the massFractionConcentrationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMassFractionConcentrationQuantity(BigDecimal value) {
        this.massFractionConcentrationQuantity = value;
    }

}
