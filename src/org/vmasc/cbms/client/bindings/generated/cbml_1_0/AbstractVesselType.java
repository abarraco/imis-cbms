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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An EQUIPMENT-TYPE that is designed to operate on or under the water surface. Concrete types are: {OtherVesselType, SubsurfaceVesselType, SurfaceVesselType}
 * 
 * <p>Java class for AbstractVesselType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractVesselType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractEquipmentType">
 *       &lt;sequence>
 *         &lt;element name="MagneticDegaussingCodeNumberQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType12" minOccurs="0"/>
 *         &lt;element name="PrismaticCoefficientRatio" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RatioType6_5" minOccurs="0"/>
 *         &lt;element name="DeadWeightQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType6" minOccurs="0"/>
 *         &lt;element name="DraughtDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="GrossRegisteredTonnageQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType9" minOccurs="0"/>
 *         &lt;element name="HeightAboveTheWaterlineDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="PropellerCount" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CountType2" minOccurs="0"/>
 *         &lt;element name="PropulsionTypeCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}VesselTypePropulsionTypeCode" minOccurs="0"/>
 *         &lt;element name="OperationalDisplacementQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType9" minOccurs="0"/>
 *         &lt;element name="MaximumSpeedRate" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RateType8_4" minOccurs="0"/>
 *         &lt;element name="AcousticMeritIndexQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractVesselType", propOrder = {
    "magneticDegaussingCodeNumberQuantity",
    "prismaticCoefficientRatio",
    "deadWeightQuantity",
    "draughtDimension",
    "grossRegisteredTonnageQuantity",
    "heightAboveTheWaterlineDimension",
    "propellerCount",
    "propulsionTypeCode",
    "operationalDisplacementQuantity",
    "maximumSpeedRate",
    "acousticMeritIndexQuantity"
})
@XmlSeeAlso({
    SurfaceVesselType.class,
    SubsurfaceVesselType.class,
    OtherVesselType.class
})
public abstract class AbstractVesselType
    extends AbstractEquipmentType
{

    @XmlElement(name = "MagneticDegaussingCodeNumberQuantity")
    protected Long magneticDegaussingCodeNumberQuantity;
    @XmlElement(name = "PrismaticCoefficientRatio")
    protected BigDecimal prismaticCoefficientRatio;
    @XmlElement(name = "DeadWeightQuantity")
    protected Integer deadWeightQuantity;
    @XmlElement(name = "DraughtDimension")
    protected BigDecimal draughtDimension;
    @XmlElement(name = "GrossRegisteredTonnageQuantity")
    protected Integer grossRegisteredTonnageQuantity;
    @XmlElement(name = "HeightAboveTheWaterlineDimension")
    protected BigDecimal heightAboveTheWaterlineDimension;
    @XmlElement(name = "PropellerCount")
    protected Integer propellerCount;
    @XmlElement(name = "PropulsionTypeCode")
    protected VesselTypePropulsionTypeCode propulsionTypeCode;
    @XmlElement(name = "OperationalDisplacementQuantity")
    protected Integer operationalDisplacementQuantity;
    @XmlElement(name = "MaximumSpeedRate")
    protected BigDecimal maximumSpeedRate;
    @XmlElement(name = "AcousticMeritIndexQuantity")
    protected Integer acousticMeritIndexQuantity;

    /**
     * Gets the value of the magneticDegaussingCodeNumberQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMagneticDegaussingCodeNumberQuantity() {
        return magneticDegaussingCodeNumberQuantity;
    }

    /**
     * Sets the value of the magneticDegaussingCodeNumberQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMagneticDegaussingCodeNumberQuantity(Long value) {
        this.magneticDegaussingCodeNumberQuantity = value;
    }

    /**
     * Gets the value of the prismaticCoefficientRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrismaticCoefficientRatio() {
        return prismaticCoefficientRatio;
    }

    /**
     * Sets the value of the prismaticCoefficientRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrismaticCoefficientRatio(BigDecimal value) {
        this.prismaticCoefficientRatio = value;
    }

    /**
     * Gets the value of the deadWeightQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeadWeightQuantity() {
        return deadWeightQuantity;
    }

    /**
     * Sets the value of the deadWeightQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeadWeightQuantity(Integer value) {
        this.deadWeightQuantity = value;
    }

    /**
     * Gets the value of the draughtDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDraughtDimension() {
        return draughtDimension;
    }

    /**
     * Sets the value of the draughtDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDraughtDimension(BigDecimal value) {
        this.draughtDimension = value;
    }

    /**
     * Gets the value of the grossRegisteredTonnageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrossRegisteredTonnageQuantity() {
        return grossRegisteredTonnageQuantity;
    }

    /**
     * Sets the value of the grossRegisteredTonnageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrossRegisteredTonnageQuantity(Integer value) {
        this.grossRegisteredTonnageQuantity = value;
    }

    /**
     * Gets the value of the heightAboveTheWaterlineDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightAboveTheWaterlineDimension() {
        return heightAboveTheWaterlineDimension;
    }

    /**
     * Sets the value of the heightAboveTheWaterlineDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightAboveTheWaterlineDimension(BigDecimal value) {
        this.heightAboveTheWaterlineDimension = value;
    }

    /**
     * Gets the value of the propellerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPropellerCount() {
        return propellerCount;
    }

    /**
     * Sets the value of the propellerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPropellerCount(Integer value) {
        this.propellerCount = value;
    }

    /**
     * Gets the value of the propulsionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link VesselTypePropulsionTypeCode }
     *     
     */
    public VesselTypePropulsionTypeCode getPropulsionTypeCode() {
        return propulsionTypeCode;
    }

    /**
     * Sets the value of the propulsionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselTypePropulsionTypeCode }
     *     
     */
    public void setPropulsionTypeCode(VesselTypePropulsionTypeCode value) {
        this.propulsionTypeCode = value;
    }

    /**
     * Gets the value of the operationalDisplacementQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationalDisplacementQuantity() {
        return operationalDisplacementQuantity;
    }

    /**
     * Sets the value of the operationalDisplacementQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationalDisplacementQuantity(Integer value) {
        this.operationalDisplacementQuantity = value;
    }

    /**
     * Gets the value of the maximumSpeedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumSpeedRate() {
        return maximumSpeedRate;
    }

    /**
     * Sets the value of the maximumSpeedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumSpeedRate(BigDecimal value) {
        this.maximumSpeedRate = value;
    }

    /**
     * Gets the value of the acousticMeritIndexQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcousticMeritIndexQuantity() {
        return acousticMeritIndexQuantity;
    }

    /**
     * Sets the value of the acousticMeritIndexQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcousticMeritIndexQuantity(Integer value) {
        this.acousticMeritIndexQuantity = value;
    }

}