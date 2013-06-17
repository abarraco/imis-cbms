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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An ACTION that is being or has been planned and for which the planning details are known. Concrete types are: {ActionTask, Request}
 * 
 * <p>Java class for AbstractActionTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractActionTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractAction">
 *       &lt;sequence>
 *         &lt;element name="ActivityCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ActionTaskActivityCode"/>
 *         &lt;element name="PriorityCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ActionTaskPriorityCode" minOccurs="0"/>
 *         &lt;element name="EntailedSafetyDegreeCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ActionTaskEntailedSafetyDegreeCode" minOccurs="0"/>
 *         &lt;element name="OvertCovertCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ActionTaskOvertCovertCode" minOccurs="0"/>
 *         &lt;element name="MeteorologicalImpactCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ActionTaskMeteorologicalImpactCode" minOccurs="0"/>
 *         &lt;element name="OperationalLevelCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ActionTaskOperationalLevelCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractActionTask", propOrder = {
    "activityCode",
    "priorityCode",
    "entailedSafetyDegreeCode",
    "overtCovertCode",
    "meteorologicalImpactCode",
    "operationalLevelCode"
})
@XmlSeeAlso({
    OtherActionTask.class,
    Request.class
})
public abstract class AbstractActionTask
    extends AbstractAction
{

    @XmlElement(name = "ActivityCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String activityCode;
    @XmlElement(name = "PriorityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String priorityCode;
    @XmlElement(name = "EntailedSafetyDegreeCode")
    protected ActionTaskEntailedSafetyDegreeCode entailedSafetyDegreeCode;
    @XmlElement(name = "OvertCovertCode")
    protected ActionTaskOvertCovertCode overtCovertCode;
    @XmlElement(name = "MeteorologicalImpactCode")
    protected ActionTaskMeteorologicalImpactCode meteorologicalImpactCode;
    @XmlElement(name = "OperationalLevelCode")
    protected ActionTaskOperationalLevelCode operationalLevelCode;

    /**
     * Gets the value of the activityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCode(String value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the priorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityCode() {
        return priorityCode;
    }

    /**
     * Sets the value of the priorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityCode(String value) {
        this.priorityCode = value;
    }

    /**
     * Gets the value of the entailedSafetyDegreeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaskEntailedSafetyDegreeCode }
     *     
     */
    public ActionTaskEntailedSafetyDegreeCode getEntailedSafetyDegreeCode() {
        return entailedSafetyDegreeCode;
    }

    /**
     * Sets the value of the entailedSafetyDegreeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaskEntailedSafetyDegreeCode }
     *     
     */
    public void setEntailedSafetyDegreeCode(ActionTaskEntailedSafetyDegreeCode value) {
        this.entailedSafetyDegreeCode = value;
    }

    /**
     * Gets the value of the overtCovertCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaskOvertCovertCode }
     *     
     */
    public ActionTaskOvertCovertCode getOvertCovertCode() {
        return overtCovertCode;
    }

    /**
     * Sets the value of the overtCovertCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaskOvertCovertCode }
     *     
     */
    public void setOvertCovertCode(ActionTaskOvertCovertCode value) {
        this.overtCovertCode = value;
    }

    /**
     * Gets the value of the meteorologicalImpactCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaskMeteorologicalImpactCode }
     *     
     */
    public ActionTaskMeteorologicalImpactCode getMeteorologicalImpactCode() {
        return meteorologicalImpactCode;
    }

    /**
     * Sets the value of the meteorologicalImpactCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaskMeteorologicalImpactCode }
     *     
     */
    public void setMeteorologicalImpactCode(ActionTaskMeteorologicalImpactCode value) {
        this.meteorologicalImpactCode = value;
    }

    /**
     * Gets the value of the operationalLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaskOperationalLevelCode }
     *     
     */
    public ActionTaskOperationalLevelCode getOperationalLevelCode() {
        return operationalLevelCode;
    }

    /**
     * Sets the value of the operationalLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaskOperationalLevelCode }
     *     
     */
    public void setOperationalLevelCode(ActionTaskOperationalLevelCode value) {
        this.operationalLevelCode = value;
    }

}
