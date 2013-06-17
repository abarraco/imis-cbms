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


/**
 *  A reference on some AbstractReportType - Specifies a reporting data. Concrete types are: {WhatEffectRefType, EventWhatStatusRefType, WhoGroupAccountRefType, WhoHostilityRefType, WhoAddressRefType, WhoAffiliationRefType, WhoAssociationRefType, WhoLocationRefType, WhoStatusRefType, WhoTypeRefType, EventWhatLocationRefType, TaskWhatStatusRefType, WhoHoldingRefType, HoldingTransferRefType, CandidateTargetListRefType, NetworkServiceStatusRefType, TargetPersonnelProtectionRefType, RequestWhatAnswerRefType, OrganisationStructureRefType}
 * 
 * <p>Java class for AbstractReportRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractReportRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportingDataRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}ReportingDataRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractReportRefType", propOrder = {
    "reportingDataRef"
})
@XmlSeeAlso({
    WhoStatusRefType.class,
    WhoGroupAccountRefType.class,
    CandidateTargetListRefType.class,
    WhoTypeRefType.class,
    TaskWhatStatusRefType.class,
    NetworkServiceStatusRefType.class,
    WhoHostilityRefType.class,
    EventWhatLocationRefType.class,
    WhoAddressRefType.class,
    OrganisationStructureRefType.class,
    EventWhatStatusRefType.class,
    RequestWhatAnswerRefType.class,
    WhoHoldingRefType.class,
    HoldingTransferRefType.class,
    WhoAssociationRefType.class,
    WhoLocationRefType.class,
    WhatEffectRefType.class,
    TargetPersonnelProtectionRefType.class,
    WhoAffiliationRefType.class
})
public class AbstractReportRefType {

    @XmlElement(name = "ReportingDataRef", required = true)
    protected ReportingDataRef reportingDataRef;

    /**
     * Gets the value of the reportingDataRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingDataRef }
     *     
     */
    public ReportingDataRef getReportingDataRef() {
        return reportingDataRef;
    }

    /**
     * Sets the value of the reportingDataRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingDataRef }
     *     
     */
    public void setReportingDataRef(ReportingDataRef value) {
        this.reportingDataRef = value;
    }

}