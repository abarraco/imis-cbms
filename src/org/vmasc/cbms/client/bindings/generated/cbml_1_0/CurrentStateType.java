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


/**
 * Specifies a state described as a set of reports.
 * 
 * <p>Java class for CurrentStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentStateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Report" type="{http://www.sisostds.org/schemas/c-bml/1.0}ReportType"/>
 *         &lt;element name="ReportRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}ReportRefType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentStateType", propOrder = {
    "report",
    "reportRef"
})
public class CurrentStateType {

    @XmlElement(name = "Report")
    protected ReportType report;
    @XmlElement(name = "ReportRef")
    protected ReportRefType reportRef;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link ReportType }
     *     
     */
    public ReportType getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportType }
     *     
     */
    public void setReport(ReportType value) {
        this.report = value;
    }

    /**
     * Gets the value of the reportRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRefType }
     *     
     */
    public ReportRefType getReportRef() {
        return reportRef;
    }

    /**
     * Sets the value of the reportRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRefType }
     *     
     */
    public void setReportRef(ReportRefType value) {
        this.reportRef = value;
    }

}
