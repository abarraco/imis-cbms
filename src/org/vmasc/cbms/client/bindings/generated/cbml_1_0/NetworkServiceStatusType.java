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
 * Specifies a report describing the status of a network service.
 * 
 * <p>Java class for NetworkServiceStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkServiceStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractReportType">
 *       &lt;sequence>
 *         &lt;element name="NetworkServiceRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}NetworkServiceRef"/>
 *         &lt;element name="StatusIndicatorCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}NetworkServiceStatusIndicatorCode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkServiceStatusType", propOrder = {
    "networkServiceRef",
    "statusIndicatorCode"
})
public class NetworkServiceStatusType
    extends AbstractReportType
{

    @XmlElement(name = "NetworkServiceRef", required = true)
    protected NetworkServiceRef networkServiceRef;
    @XmlElement(name = "StatusIndicatorCode", required = true)
    protected NetworkServiceStatusIndicatorCode statusIndicatorCode;

    /**
     * Gets the value of the networkServiceRef property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkServiceRef }
     *     
     */
    public NetworkServiceRef getNetworkServiceRef() {
        return networkServiceRef;
    }

    /**
     * Sets the value of the networkServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkServiceRef }
     *     
     */
    public void setNetworkServiceRef(NetworkServiceRef value) {
        this.networkServiceRef = value;
    }

    /**
     * Gets the value of the statusIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkServiceStatusIndicatorCode }
     *     
     */
    public NetworkServiceStatusIndicatorCode getStatusIndicatorCode() {
        return statusIndicatorCode;
    }

    /**
     * Sets the value of the statusIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkServiceStatusIndicatorCode }
     *     
     */
    public void setStatusIndicatorCode(NetworkServiceStatusIndicatorCode value) {
        this.statusIndicatorCode = value;
    }

}