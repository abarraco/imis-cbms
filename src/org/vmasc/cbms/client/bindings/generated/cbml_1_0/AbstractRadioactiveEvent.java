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
 * A CBRN-EVENT involving radioactive materiel(s). Concrete types are: {NuclearWeaponEvent, OtherNuclearEvent, OtherRadioactiveEvent, RadiologicalEvent}
 * 
 * <p>Java class for AbstractRadioactiveEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRadioactiveEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractCbrnEvent">
 *       &lt;sequence>
 *         &lt;element name="DoseQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType14_6" minOccurs="0"/>
 *         &lt;element name="DoseRate" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RateType16_7" minOccurs="0"/>
 *         &lt;element name="DoseRateTrendCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RadioactiveEventDoseRateTrendCode" minOccurs="0"/>
 *         &lt;element name="VolumeConcentrationQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType14_6" minOccurs="0"/>
 *         &lt;element name="SurfaceDepositionQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType14_6" minOccurs="0"/>
 *         &lt;element name="RelativeDecayRateCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RadioactiveEventRelativeDecayRateCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRadioactiveEvent", propOrder = {
    "doseQuantity",
    "doseRate",
    "doseRateTrendCode",
    "volumeConcentrationQuantity",
    "surfaceDepositionQuantity",
    "relativeDecayRateCode"
})
@XmlSeeAlso({
    RadiologicalEvent.class,
    OtherRadioactiveEvent.class,
    AbstractNuclearEvent.class
})
public abstract class AbstractRadioactiveEvent
    extends AbstractCbrnEvent
{

    @XmlElement(name = "DoseQuantity")
    protected BigDecimal doseQuantity;
    @XmlElement(name = "DoseRate")
    protected BigDecimal doseRate;
    @XmlElement(name = "DoseRateTrendCode")
    protected RadioactiveEventDoseRateTrendCode doseRateTrendCode;
    @XmlElement(name = "VolumeConcentrationQuantity")
    protected BigDecimal volumeConcentrationQuantity;
    @XmlElement(name = "SurfaceDepositionQuantity")
    protected BigDecimal surfaceDepositionQuantity;
    @XmlElement(name = "RelativeDecayRateCode")
    protected RadioactiveEventRelativeDecayRateCode relativeDecayRateCode;

    /**
     * Gets the value of the doseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * Sets the value of the doseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDoseQuantity(BigDecimal value) {
        this.doseQuantity = value;
    }

    /**
     * Gets the value of the doseRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDoseRate() {
        return doseRate;
    }

    /**
     * Sets the value of the doseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDoseRate(BigDecimal value) {
        this.doseRate = value;
    }

    /**
     * Gets the value of the doseRateTrendCode property.
     * 
     * @return
     *     possible object is
     *     {@link RadioactiveEventDoseRateTrendCode }
     *     
     */
    public RadioactiveEventDoseRateTrendCode getDoseRateTrendCode() {
        return doseRateTrendCode;
    }

    /**
     * Sets the value of the doseRateTrendCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioactiveEventDoseRateTrendCode }
     *     
     */
    public void setDoseRateTrendCode(RadioactiveEventDoseRateTrendCode value) {
        this.doseRateTrendCode = value;
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
     * Gets the value of the relativeDecayRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link RadioactiveEventRelativeDecayRateCode }
     *     
     */
    public RadioactiveEventRelativeDecayRateCode getRelativeDecayRateCode() {
        return relativeDecayRateCode;
    }

    /**
     * Sets the value of the relativeDecayRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioactiveEventRelativeDecayRateCode }
     *     
     */
    public void setRelativeDecayRateCode(RadioactiveEventRelativeDecayRateCode value) {
        this.relativeDecayRateCode = value;
    }

}
