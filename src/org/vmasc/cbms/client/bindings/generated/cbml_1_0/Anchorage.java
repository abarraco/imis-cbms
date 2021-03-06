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
 * A FACILITY that is a place where vessels anchor.
 * 
 * <p>Java class for Anchorage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Anchorage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractFacility">
 *       &lt;sequence>
 *         &lt;element name="BottomTypeCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}AnchorageBottomTypeCode" minOccurs="0"/>
 *         &lt;element name="DayLimitNetExplosiveQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType6" minOccurs="0"/>
 *         &lt;element name="DraughtHighTideDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="DraughtLowTideDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="MooringsTypeCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}AnchorageMooringsTypeCode" minOccurs="0"/>
 *         &lt;element name="NightLimitNetExplosiveQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType6" minOccurs="0"/>
 *         &lt;element name="PrevailingWindDirectionCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DirectionCode" minOccurs="0"/>
 *         &lt;element name="VesselTonnageQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Anchorage", propOrder = {
    "bottomTypeCode",
    "dayLimitNetExplosiveQuantity",
    "draughtHighTideDimension",
    "draughtLowTideDimension",
    "mooringsTypeCode",
    "nightLimitNetExplosiveQuantity",
    "prevailingWindDirectionCode",
    "vesselTonnageQuantity"
})
public class Anchorage
    extends AbstractFacility
{

    @XmlElement(name = "BottomTypeCode")
    protected AnchorageBottomTypeCode bottomTypeCode;
    @XmlElement(name = "DayLimitNetExplosiveQuantity")
    protected Integer dayLimitNetExplosiveQuantity;
    @XmlElement(name = "DraughtHighTideDimension")
    protected BigDecimal draughtHighTideDimension;
    @XmlElement(name = "DraughtLowTideDimension")
    protected BigDecimal draughtLowTideDimension;
    @XmlElement(name = "MooringsTypeCode")
    protected AnchorageMooringsTypeCode mooringsTypeCode;
    @XmlElement(name = "NightLimitNetExplosiveQuantity")
    protected Integer nightLimitNetExplosiveQuantity;
    @XmlElement(name = "PrevailingWindDirectionCode")
    protected DirectionCode prevailingWindDirectionCode;
    @XmlElement(name = "VesselTonnageQuantity")
    protected Integer vesselTonnageQuantity;

    /**
     * Gets the value of the bottomTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AnchorageBottomTypeCode }
     *     
     */
    public AnchorageBottomTypeCode getBottomTypeCode() {
        return bottomTypeCode;
    }

    /**
     * Sets the value of the bottomTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnchorageBottomTypeCode }
     *     
     */
    public void setBottomTypeCode(AnchorageBottomTypeCode value) {
        this.bottomTypeCode = value;
    }

    /**
     * Gets the value of the dayLimitNetExplosiveQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayLimitNetExplosiveQuantity() {
        return dayLimitNetExplosiveQuantity;
    }

    /**
     * Sets the value of the dayLimitNetExplosiveQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayLimitNetExplosiveQuantity(Integer value) {
        this.dayLimitNetExplosiveQuantity = value;
    }

    /**
     * Gets the value of the draughtHighTideDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDraughtHighTideDimension() {
        return draughtHighTideDimension;
    }

    /**
     * Sets the value of the draughtHighTideDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDraughtHighTideDimension(BigDecimal value) {
        this.draughtHighTideDimension = value;
    }

    /**
     * Gets the value of the draughtLowTideDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDraughtLowTideDimension() {
        return draughtLowTideDimension;
    }

    /**
     * Sets the value of the draughtLowTideDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDraughtLowTideDimension(BigDecimal value) {
        this.draughtLowTideDimension = value;
    }

    /**
     * Gets the value of the mooringsTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AnchorageMooringsTypeCode }
     *     
     */
    public AnchorageMooringsTypeCode getMooringsTypeCode() {
        return mooringsTypeCode;
    }

    /**
     * Sets the value of the mooringsTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnchorageMooringsTypeCode }
     *     
     */
    public void setMooringsTypeCode(AnchorageMooringsTypeCode value) {
        this.mooringsTypeCode = value;
    }

    /**
     * Gets the value of the nightLimitNetExplosiveQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNightLimitNetExplosiveQuantity() {
        return nightLimitNetExplosiveQuantity;
    }

    /**
     * Sets the value of the nightLimitNetExplosiveQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNightLimitNetExplosiveQuantity(Integer value) {
        this.nightLimitNetExplosiveQuantity = value;
    }

    /**
     * Gets the value of the prevailingWindDirectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCode }
     *     
     */
    public DirectionCode getPrevailingWindDirectionCode() {
        return prevailingWindDirectionCode;
    }

    /**
     * Sets the value of the prevailingWindDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCode }
     *     
     */
    public void setPrevailingWindDirectionCode(DirectionCode value) {
        this.prevailingWindDirectionCode = value;
    }

    /**
     * Gets the value of the vesselTonnageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVesselTonnageQuantity() {
        return vesselTonnageQuantity;
    }

    /**
     * Sets the value of the vesselTonnageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVesselTonnageQuantity(Integer value) {
        this.vesselTonnageQuantity = value;
    }

}
