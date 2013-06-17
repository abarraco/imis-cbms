//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A FACILITY that is a specifically prepared surface along which aircraft take off and land.
 * 
 * <p>Java class for Runway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Runway">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractFacility">
 *       &lt;sequence>
 *         &lt;element name="LightingPresenceIndicatorCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RunwayLightingPresenceIndicatorCode" minOccurs="0"/>
 *         &lt;element name="WeightBearingCapacityQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType8_4" minOccurs="0"/>
 *         &lt;element name="PavementClassificationNumberCount" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CountType9" minOccurs="0"/>
 *         &lt;element name="PavementTypeCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RunwayPavementTypeCode" minOccurs="0"/>
 *         &lt;element name="PavementSubgradeCategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RunwayPavementSubgradeCategoryCode" minOccurs="0"/>
 *         &lt;element name="PavementMaximumTyrePressureCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RunwayPavementMaximumTyrePressureCode" minOccurs="0"/>
 *         &lt;element name="PavementEvaluationMethodCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RunwayPavementEvaluationMethodCode" minOccurs="0"/>
 *         &lt;element name="RunwayApproachDirectionAssociationInRunway" type="{http://www.sisostds.org/schemas/c-bml/1.0}RunwayApproachDirectionAssociationInRunway" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Runway", propOrder = {
    "lightingPresenceIndicatorCode",
    "weightBearingCapacityQuantity",
    "pavementClassificationNumberCount",
    "pavementTypeCode",
    "pavementSubgradeCategoryCode",
    "pavementMaximumTyrePressureCode",
    "pavementEvaluationMethodCode",
    "runwayApproachDirectionAssociationInRunway"
})
public class Runway
    extends AbstractFacility
{

    @XmlElement(name = "LightingPresenceIndicatorCode")
    protected RunwayLightingPresenceIndicatorCode lightingPresenceIndicatorCode;
    @XmlElement(name = "WeightBearingCapacityQuantity")
    protected BigDecimal weightBearingCapacityQuantity;
    @XmlElement(name = "PavementClassificationNumberCount")
    protected Integer pavementClassificationNumberCount;
    @XmlElement(name = "PavementTypeCode")
    protected RunwayPavementTypeCode pavementTypeCode;
    @XmlElement(name = "PavementSubgradeCategoryCode")
    protected RunwayPavementSubgradeCategoryCode pavementSubgradeCategoryCode;
    @XmlElement(name = "PavementMaximumTyrePressureCode")
    protected RunwayPavementMaximumTyrePressureCode pavementMaximumTyrePressureCode;
    @XmlElement(name = "PavementEvaluationMethodCode")
    protected RunwayPavementEvaluationMethodCode pavementEvaluationMethodCode;
    @XmlElement(name = "RunwayApproachDirectionAssociationInRunway")
    protected List<RunwayApproachDirectionAssociationInRunway> runwayApproachDirectionAssociationInRunway;

    /**
     * Gets the value of the lightingPresenceIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayLightingPresenceIndicatorCode }
     *     
     */
    public RunwayLightingPresenceIndicatorCode getLightingPresenceIndicatorCode() {
        return lightingPresenceIndicatorCode;
    }

    /**
     * Sets the value of the lightingPresenceIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayLightingPresenceIndicatorCode }
     *     
     */
    public void setLightingPresenceIndicatorCode(RunwayLightingPresenceIndicatorCode value) {
        this.lightingPresenceIndicatorCode = value;
    }

    /**
     * Gets the value of the weightBearingCapacityQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightBearingCapacityQuantity() {
        return weightBearingCapacityQuantity;
    }

    /**
     * Sets the value of the weightBearingCapacityQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightBearingCapacityQuantity(BigDecimal value) {
        this.weightBearingCapacityQuantity = value;
    }

    /**
     * Gets the value of the pavementClassificationNumberCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPavementClassificationNumberCount() {
        return pavementClassificationNumberCount;
    }

    /**
     * Sets the value of the pavementClassificationNumberCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPavementClassificationNumberCount(Integer value) {
        this.pavementClassificationNumberCount = value;
    }

    /**
     * Gets the value of the pavementTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayPavementTypeCode }
     *     
     */
    public RunwayPavementTypeCode getPavementTypeCode() {
        return pavementTypeCode;
    }

    /**
     * Sets the value of the pavementTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayPavementTypeCode }
     *     
     */
    public void setPavementTypeCode(RunwayPavementTypeCode value) {
        this.pavementTypeCode = value;
    }

    /**
     * Gets the value of the pavementSubgradeCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayPavementSubgradeCategoryCode }
     *     
     */
    public RunwayPavementSubgradeCategoryCode getPavementSubgradeCategoryCode() {
        return pavementSubgradeCategoryCode;
    }

    /**
     * Sets the value of the pavementSubgradeCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayPavementSubgradeCategoryCode }
     *     
     */
    public void setPavementSubgradeCategoryCode(RunwayPavementSubgradeCategoryCode value) {
        this.pavementSubgradeCategoryCode = value;
    }

    /**
     * Gets the value of the pavementMaximumTyrePressureCode property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayPavementMaximumTyrePressureCode }
     *     
     */
    public RunwayPavementMaximumTyrePressureCode getPavementMaximumTyrePressureCode() {
        return pavementMaximumTyrePressureCode;
    }

    /**
     * Sets the value of the pavementMaximumTyrePressureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayPavementMaximumTyrePressureCode }
     *     
     */
    public void setPavementMaximumTyrePressureCode(RunwayPavementMaximumTyrePressureCode value) {
        this.pavementMaximumTyrePressureCode = value;
    }

    /**
     * Gets the value of the pavementEvaluationMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayPavementEvaluationMethodCode }
     *     
     */
    public RunwayPavementEvaluationMethodCode getPavementEvaluationMethodCode() {
        return pavementEvaluationMethodCode;
    }

    /**
     * Sets the value of the pavementEvaluationMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayPavementEvaluationMethodCode }
     *     
     */
    public void setPavementEvaluationMethodCode(RunwayPavementEvaluationMethodCode value) {
        this.pavementEvaluationMethodCode = value;
    }

    /**
     * Gets the value of the runwayApproachDirectionAssociationInRunway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runwayApproachDirectionAssociationInRunway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunwayApproachDirectionAssociationInRunway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayApproachDirectionAssociationInRunway }
     * 
     * 
     */
    public List<RunwayApproachDirectionAssociationInRunway> getRunwayApproachDirectionAssociationInRunway() {
        if (runwayApproachDirectionAssociationInRunway == null) {
            runwayApproachDirectionAssociationInRunway = new ArrayList<RunwayApproachDirectionAssociationInRunway>();
        }
        return this.runwayApproachDirectionAssociationInRunway;
    }

}