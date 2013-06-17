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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A MEDICAL-FACILITY-STATUS that specifies the count of deaths and completed surgeries for each of specified groups during the period defined by the effective beginning and ending datetimes stipulated through REPORTING-DATA.
 * 
 * <p>Java class for MedicalFacilityStatusIntervalCasualtyGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicalFacilityStatusIntervalCasualtyGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="Code" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CasualtyGroupCode"/>
 *         &lt;element name="CompletedSurgeryCount" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CountType6"/>
 *         &lt;element name="DeathCount" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CountType6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicalFacilityStatusIntervalCasualtyGroup", propOrder = {
    "oid",
    "code",
    "completedSurgeryCount",
    "deathCount"
})
public class MedicalFacilityStatusIntervalCasualtyGroup {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "Code", required = true)
    protected CasualtyGroupCode code;
    @XmlElement(name = "CompletedSurgeryCount")
    protected int completedSurgeryCount;
    @XmlElement(name = "DeathCount")
    protected int deathCount;

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CasualtyGroupCode }
     *     
     */
    public CasualtyGroupCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CasualtyGroupCode }
     *     
     */
    public void setCode(CasualtyGroupCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the completedSurgeryCount property.
     * 
     */
    public int getCompletedSurgeryCount() {
        return completedSurgeryCount;
    }

    /**
     * Sets the value of the completedSurgeryCount property.
     * 
     */
    public void setCompletedSurgeryCount(int value) {
        this.completedSurgeryCount = value;
    }

    /**
     * Gets the value of the deathCount property.
     * 
     */
    public int getDeathCount() {
        return deathCount;
    }

    /**
     * Sets the value of the deathCount property.
     * 
     */
    public void setDeathCount(int value) {
        this.deathCount = value;
    }

}