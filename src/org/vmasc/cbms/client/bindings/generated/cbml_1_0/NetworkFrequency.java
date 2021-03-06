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
 * The specification of a discrete frequency that is used on a specific NETWORK.
 * 
 * <p>Java class for NetworkFrequency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkFrequency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="BandCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}NetworkFrequencyBandCode" minOccurs="0"/>
 *         &lt;element name="ChannelNumberText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar6" minOccurs="0"/>
 *         &lt;element name="DiscreteFrequencyQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType9" minOccurs="0"/>
 *         &lt;element name="BandLowerFrequencyQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType9" minOccurs="0"/>
 *         &lt;element name="BandUpperFrequencyQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType9" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDatetime" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DatetimeTypeFix18"/>
 *         &lt;element name="EffectiveEndDatetime" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DatetimeTypeFix18"/>
 *         &lt;element name="ModulationCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}NetworkFrequencyModulationCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkFrequency", propOrder = {
    "oid",
    "bandCode",
    "channelNumberText",
    "discreteFrequencyQuantity",
    "bandLowerFrequencyQuantity",
    "bandUpperFrequencyQuantity",
    "effectiveStartDatetime",
    "effectiveEndDatetime",
    "modulationCode"
})
public class NetworkFrequency {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "BandCode")
    protected NetworkFrequencyBandCode bandCode;
    @XmlElement(name = "ChannelNumberText")
    protected String channelNumberText;
    @XmlElement(name = "DiscreteFrequencyQuantity")
    protected Integer discreteFrequencyQuantity;
    @XmlElement(name = "BandLowerFrequencyQuantity")
    protected Integer bandLowerFrequencyQuantity;
    @XmlElement(name = "BandUpperFrequencyQuantity")
    protected Integer bandUpperFrequencyQuantity;
    @XmlElement(name = "EffectiveStartDatetime", required = true)
    protected String effectiveStartDatetime;
    @XmlElement(name = "EffectiveEndDatetime", required = true)
    protected String effectiveEndDatetime;
    @XmlElement(name = "ModulationCode")
    protected NetworkFrequencyModulationCode modulationCode;

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
     * Gets the value of the bandCode property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkFrequencyBandCode }
     *     
     */
    public NetworkFrequencyBandCode getBandCode() {
        return bandCode;
    }

    /**
     * Sets the value of the bandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkFrequencyBandCode }
     *     
     */
    public void setBandCode(NetworkFrequencyBandCode value) {
        this.bandCode = value;
    }

    /**
     * Gets the value of the channelNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelNumberText() {
        return channelNumberText;
    }

    /**
     * Sets the value of the channelNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelNumberText(String value) {
        this.channelNumberText = value;
    }

    /**
     * Gets the value of the discreteFrequencyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscreteFrequencyQuantity() {
        return discreteFrequencyQuantity;
    }

    /**
     * Sets the value of the discreteFrequencyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscreteFrequencyQuantity(Integer value) {
        this.discreteFrequencyQuantity = value;
    }

    /**
     * Gets the value of the bandLowerFrequencyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBandLowerFrequencyQuantity() {
        return bandLowerFrequencyQuantity;
    }

    /**
     * Sets the value of the bandLowerFrequencyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBandLowerFrequencyQuantity(Integer value) {
        this.bandLowerFrequencyQuantity = value;
    }

    /**
     * Gets the value of the bandUpperFrequencyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBandUpperFrequencyQuantity() {
        return bandUpperFrequencyQuantity;
    }

    /**
     * Sets the value of the bandUpperFrequencyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBandUpperFrequencyQuantity(Integer value) {
        this.bandUpperFrequencyQuantity = value;
    }

    /**
     * Gets the value of the effectiveStartDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveStartDatetime() {
        return effectiveStartDatetime;
    }

    /**
     * Sets the value of the effectiveStartDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveStartDatetime(String value) {
        this.effectiveStartDatetime = value;
    }

    /**
     * Gets the value of the effectiveEndDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveEndDatetime() {
        return effectiveEndDatetime;
    }

    /**
     * Sets the value of the effectiveEndDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveEndDatetime(String value) {
        this.effectiveEndDatetime = value;
    }

    /**
     * Gets the value of the modulationCode property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkFrequencyModulationCode }
     *     
     */
    public NetworkFrequencyModulationCode getModulationCode() {
        return modulationCode;
    }

    /**
     * Sets the value of the modulationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkFrequencyModulationCode }
     *     
     */
    public void setModulationCode(NetworkFrequencyModulationCode value) {
        this.modulationCode = value;
    }

}
