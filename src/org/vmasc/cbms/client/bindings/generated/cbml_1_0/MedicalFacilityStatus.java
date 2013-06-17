//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A FACILITY-STATUS that is a record of condition of a specific medical facility.
 * 
 * <p>Java class for MedicalFacilityStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalFacilityStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractFacilityStatus">
 *       &lt;sequence>
 *         &lt;element name="SurgeryBacklogDuration" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DurationType19"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="CasualtyBedOccupancy" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusCasualtyBedOccupancy"/>
 *           &lt;element name="CasualtyBedOccupancyRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusCasualtyBedOccupancyRef"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="IntervalCasualtyGroup" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusIntervalCasualtyGroup"/>
 *           &lt;element name="IntervalCasualtyGroupRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusIntervalCasualtyGroupRef"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="IntervalCasualtyType" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusIntervalCasualtyType"/>
 *           &lt;element name="IntervalCasualtyTypeRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusIntervalCasualtyTypeRef"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="IntervalEvacuation" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusIntervalEvacuation"/>
 *           &lt;element name="IntervalEvacuationRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusIntervalEvacuationRef"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="PendingCasualtyEvacuation" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusPendingCasualtyEvacuation"/>
 *           &lt;element name="PendingCasualtyEvacuationRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusPendingCasualtyEvacuationRef"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="PendingSurgery" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusPendingSurgery"/>
 *           &lt;element name="PendingSurgeryRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}MedicalFacilityStatusPendingSurgeryRef"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicalFacilityStatus", propOrder = {
    "surgeryBacklogDuration",
    "casualtyBedOccupancyOrCasualtyBedOccupancyRef",
    "intervalCasualtyGroupOrIntervalCasualtyGroupRef",
    "intervalCasualtyTypeOrIntervalCasualtyTypeRef",
    "intervalEvacuationOrIntervalEvacuationRef",
    "pendingCasualtyEvacuationOrPendingCasualtyEvacuationRef",
    "pendingSurgeryOrPendingSurgeryRef"
})
public class MedicalFacilityStatus
    extends AbstractFacilityStatus
{

    @XmlElement(name = "SurgeryBacklogDuration", required = true)
    protected BigInteger surgeryBacklogDuration;
    @XmlElements({
        @XmlElement(name = "CasualtyBedOccupancyRef", type = MedicalFacilityStatusCasualtyBedOccupancyRef.class),
        @XmlElement(name = "CasualtyBedOccupancy", type = MedicalFacilityStatusCasualtyBedOccupancy.class)
    })
    protected List<Object> casualtyBedOccupancyOrCasualtyBedOccupancyRef;
    @XmlElements({
        @XmlElement(name = "IntervalCasualtyGroup", type = MedicalFacilityStatusIntervalCasualtyGroup.class),
        @XmlElement(name = "IntervalCasualtyGroupRef", type = MedicalFacilityStatusIntervalCasualtyGroupRef.class)
    })
    protected List<Object> intervalCasualtyGroupOrIntervalCasualtyGroupRef;
    @XmlElements({
        @XmlElement(name = "IntervalCasualtyType", type = MedicalFacilityStatusIntervalCasualtyType.class),
        @XmlElement(name = "IntervalCasualtyTypeRef", type = MedicalFacilityStatusIntervalCasualtyTypeRef.class)
    })
    protected List<Object> intervalCasualtyTypeOrIntervalCasualtyTypeRef;
    @XmlElements({
        @XmlElement(name = "IntervalEvacuationRef", type = MedicalFacilityStatusIntervalEvacuationRef.class),
        @XmlElement(name = "IntervalEvacuation", type = MedicalFacilityStatusIntervalEvacuation.class)
    })
    protected List<Object> intervalEvacuationOrIntervalEvacuationRef;
    @XmlElements({
        @XmlElement(name = "PendingCasualtyEvacuationRef", type = MedicalFacilityStatusPendingCasualtyEvacuationRef.class),
        @XmlElement(name = "PendingCasualtyEvacuation", type = MedicalFacilityStatusPendingCasualtyEvacuation.class)
    })
    protected List<Object> pendingCasualtyEvacuationOrPendingCasualtyEvacuationRef;
    @XmlElements({
        @XmlElement(name = "PendingSurgery", type = MedicalFacilityStatusPendingSurgery.class),
        @XmlElement(name = "PendingSurgeryRef", type = MedicalFacilityStatusPendingSurgeryRef.class)
    })
    protected List<Object> pendingSurgeryOrPendingSurgeryRef;

    /**
     * Gets the value of the surgeryBacklogDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSurgeryBacklogDuration() {
        return surgeryBacklogDuration;
    }

    /**
     * Sets the value of the surgeryBacklogDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSurgeryBacklogDuration(BigInteger value) {
        this.surgeryBacklogDuration = value;
    }

    /**
     * Gets the value of the casualtyBedOccupancyOrCasualtyBedOccupancyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the casualtyBedOccupancyOrCasualtyBedOccupancyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCasualtyBedOccupancyOrCasualtyBedOccupancyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalFacilityStatusCasualtyBedOccupancyRef }
     * {@link MedicalFacilityStatusCasualtyBedOccupancy }
     * 
     * 
     */
    public List<Object> getCasualtyBedOccupancyOrCasualtyBedOccupancyRef() {
        if (casualtyBedOccupancyOrCasualtyBedOccupancyRef == null) {
            casualtyBedOccupancyOrCasualtyBedOccupancyRef = new ArrayList<Object>();
        }
        return this.casualtyBedOccupancyOrCasualtyBedOccupancyRef;
    }

    /**
     * Gets the value of the intervalCasualtyGroupOrIntervalCasualtyGroupRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervalCasualtyGroupOrIntervalCasualtyGroupRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervalCasualtyGroupOrIntervalCasualtyGroupRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalFacilityStatusIntervalCasualtyGroup }
     * {@link MedicalFacilityStatusIntervalCasualtyGroupRef }
     * 
     * 
     */
    public List<Object> getIntervalCasualtyGroupOrIntervalCasualtyGroupRef() {
        if (intervalCasualtyGroupOrIntervalCasualtyGroupRef == null) {
            intervalCasualtyGroupOrIntervalCasualtyGroupRef = new ArrayList<Object>();
        }
        return this.intervalCasualtyGroupOrIntervalCasualtyGroupRef;
    }

    /**
     * Gets the value of the intervalCasualtyTypeOrIntervalCasualtyTypeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervalCasualtyTypeOrIntervalCasualtyTypeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervalCasualtyTypeOrIntervalCasualtyTypeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalFacilityStatusIntervalCasualtyType }
     * {@link MedicalFacilityStatusIntervalCasualtyTypeRef }
     * 
     * 
     */
    public List<Object> getIntervalCasualtyTypeOrIntervalCasualtyTypeRef() {
        if (intervalCasualtyTypeOrIntervalCasualtyTypeRef == null) {
            intervalCasualtyTypeOrIntervalCasualtyTypeRef = new ArrayList<Object>();
        }
        return this.intervalCasualtyTypeOrIntervalCasualtyTypeRef;
    }

    /**
     * Gets the value of the intervalEvacuationOrIntervalEvacuationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervalEvacuationOrIntervalEvacuationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervalEvacuationOrIntervalEvacuationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalFacilityStatusIntervalEvacuationRef }
     * {@link MedicalFacilityStatusIntervalEvacuation }
     * 
     * 
     */
    public List<Object> getIntervalEvacuationOrIntervalEvacuationRef() {
        if (intervalEvacuationOrIntervalEvacuationRef == null) {
            intervalEvacuationOrIntervalEvacuationRef = new ArrayList<Object>();
        }
        return this.intervalEvacuationOrIntervalEvacuationRef;
    }

    /**
     * Gets the value of the pendingCasualtyEvacuationOrPendingCasualtyEvacuationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendingCasualtyEvacuationOrPendingCasualtyEvacuationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingCasualtyEvacuationOrPendingCasualtyEvacuationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalFacilityStatusPendingCasualtyEvacuationRef }
     * {@link MedicalFacilityStatusPendingCasualtyEvacuation }
     * 
     * 
     */
    public List<Object> getPendingCasualtyEvacuationOrPendingCasualtyEvacuationRef() {
        if (pendingCasualtyEvacuationOrPendingCasualtyEvacuationRef == null) {
            pendingCasualtyEvacuationOrPendingCasualtyEvacuationRef = new ArrayList<Object>();
        }
        return this.pendingCasualtyEvacuationOrPendingCasualtyEvacuationRef;
    }

    /**
     * Gets the value of the pendingSurgeryOrPendingSurgeryRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendingSurgeryOrPendingSurgeryRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingSurgeryOrPendingSurgeryRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalFacilityStatusPendingSurgery }
     * {@link MedicalFacilityStatusPendingSurgeryRef }
     * 
     * 
     */
    public List<Object> getPendingSurgeryOrPendingSurgeryRef() {
        if (pendingSurgeryOrPendingSurgeryRef == null) {
            pendingSurgeryOrPendingSurgeryRef = new ArrayList<Object>();
        }
        return this.pendingSurgeryOrPendingSurgeryRef;
    }

}