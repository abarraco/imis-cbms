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
 * An ADDRESS that is reached by using the specified NETWORK-SERVICE.
 * 
 * <p>Java class for ElectronicAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractAddress">
 *       &lt;sequence>
 *         &lt;element name="NameText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar50" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="NetworkService" type="{http://www.sisostds.org/schemas/c-bml/1.0}NetworkService"/>
 *           &lt;element name="NetworkServiceRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}NetworkServiceRef"/>
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
@XmlType(name = "ElectronicAddress", propOrder = {
    "nameText",
    "networkService",
    "networkServiceRef"
})
public class ElectronicAddress
    extends AbstractAddress
{

    @XmlElement(name = "NameText")
    protected String nameText;
    @XmlElement(name = "NetworkService")
    protected NetworkService networkService;
    @XmlElement(name = "NetworkServiceRef")
    protected NetworkServiceRef networkServiceRef;

    /**
     * Gets the value of the nameText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameText() {
        return nameText;
    }

    /**
     * Sets the value of the nameText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameText(String value) {
        this.nameText = value;
    }

    /**
     * Gets the value of the networkService property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkService }
     *     
     */
    public NetworkService getNetworkService() {
        return networkService;
    }

    /**
     * Sets the value of the networkService property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkService }
     *     
     */
    public void setNetworkService(NetworkService value) {
        this.networkService = value;
    }

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

}
