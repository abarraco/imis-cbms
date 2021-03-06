//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An ORGANISATION that is a group of vehicles or vessels organised for the purpose of control and orderly movement with or without escort protection.
 * 
 * <p>Java class for Convoy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Convoy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractOrganisation">
 *       &lt;sequence>
 *         &lt;element name="DaySpeedRate" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RateType8_4" minOccurs="0"/>
 *         &lt;element name="DayVehicleGapDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="HaltDuration" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DurationType19" minOccurs="0"/>
 *         &lt;element name="NightSpeedRate" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RateType8_4" minOccurs="0"/>
 *         &lt;element name="NightVehicleGapDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="PacketGapDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="PacketSizeCount" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CountType9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Convoy", propOrder = {
    "daySpeedRate",
    "dayVehicleGapDimension",
    "haltDuration",
    "nightSpeedRate",
    "nightVehicleGapDimension",
    "packetGapDimension",
    "packetSizeCount"
})
public class Convoy
    extends AbstractOrganisation
{

    @XmlElement(name = "DaySpeedRate")
    protected BigDecimal daySpeedRate;
    @XmlElement(name = "DayVehicleGapDimension")
    protected BigDecimal dayVehicleGapDimension;
    @XmlElement(name = "HaltDuration")
    protected BigInteger haltDuration;
    @XmlElement(name = "NightSpeedRate")
    protected BigDecimal nightSpeedRate;
    @XmlElement(name = "NightVehicleGapDimension")
    protected BigDecimal nightVehicleGapDimension;
    @XmlElement(name = "PacketGapDimension")
    protected BigDecimal packetGapDimension;
    @XmlElement(name = "PacketSizeCount")
    protected Integer packetSizeCount;

    /**
     * Gets the value of the daySpeedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaySpeedRate() {
        return daySpeedRate;
    }

    /**
     * Sets the value of the daySpeedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaySpeedRate(BigDecimal value) {
        this.daySpeedRate = value;
    }

    /**
     * Gets the value of the dayVehicleGapDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayVehicleGapDimension() {
        return dayVehicleGapDimension;
    }

    /**
     * Sets the value of the dayVehicleGapDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayVehicleGapDimension(BigDecimal value) {
        this.dayVehicleGapDimension = value;
    }

    /**
     * Gets the value of the haltDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHaltDuration() {
        return haltDuration;
    }

    /**
     * Sets the value of the haltDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHaltDuration(BigInteger value) {
        this.haltDuration = value;
    }

    /**
     * Gets the value of the nightSpeedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNightSpeedRate() {
        return nightSpeedRate;
    }

    /**
     * Sets the value of the nightSpeedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNightSpeedRate(BigDecimal value) {
        this.nightSpeedRate = value;
    }

    /**
     * Gets the value of the nightVehicleGapDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNightVehicleGapDimension() {
        return nightVehicleGapDimension;
    }

    /**
     * Sets the value of the nightVehicleGapDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNightVehicleGapDimension(BigDecimal value) {
        this.nightVehicleGapDimension = value;
    }

    /**
     * Gets the value of the packetGapDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPacketGapDimension() {
        return packetGapDimension;
    }

    /**
     * Sets the value of the packetGapDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPacketGapDimension(BigDecimal value) {
        this.packetGapDimension = value;
    }

    /**
     * Gets the value of the packetSizeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPacketSizeCount() {
        return packetSizeCount;
    }

    /**
     * Sets the value of the packetSizeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPacketSizeCount(Integer value) {
        this.packetSizeCount = value;
    }

}
