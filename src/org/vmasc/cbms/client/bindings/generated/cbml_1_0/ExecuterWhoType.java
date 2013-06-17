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
 * Specifies the who that is reported be executing an event by a ReporterWho. Note that in the case of an organization reporting its own unplanned activity (Event), the ExecuterWho and the ReporterWho are the same organization.
 * 
 * <p>Java class for ExecuterWhoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuterWhoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganisationRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractOrganisationRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuterWhoType", propOrder = {
    "organisationRef"
})
public class ExecuterWhoType {

    @XmlElement(name = "OrganisationRef", required = true)
    protected AbstractOrganisationRef organisationRef;

    /**
     * Gets the value of the organisationRef property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractOrganisationRef }
     *     
     */
    public AbstractOrganisationRef getOrganisationRef() {
        return organisationRef;
    }

    /**
     * Sets the value of the organisationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractOrganisationRef }
     *     
     */
    public void setOrganisationRef(AbstractOrganisationRef value) {
        this.organisationRef = value;
    }

}