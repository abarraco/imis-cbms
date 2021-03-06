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
 * An OBJECT-ITEM that is equipment, apparatus or supplies of military interest without distinction as to its application for administrative or combat purposes. Concrete types are: {InstrumentLandingSystem, OtherMateriel}
 * 
 * <p>Java class for AbstractMateriel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMateriel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractObjectItem">
 *       &lt;sequence>
 *         &lt;element name="SerialNumberIdentificationText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar50" minOccurs="0"/>
 *         &lt;element name="LotIdentificationText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar100" minOccurs="0"/>
 *         &lt;element name="HullNumberText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar15" minOccurs="0"/>
 *         &lt;element name="MineRequisitionCaseNumberText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractMateriel", propOrder = {
    "serialNumberIdentificationText",
    "lotIdentificationText",
    "hullNumberText",
    "mineRequisitionCaseNumberText"
})
@XmlSeeAlso({
    InstrumentLandingSystem.class,
    OtherMateriel.class
})
public abstract class AbstractMateriel
    extends AbstractObjectItem
{

    @XmlElement(name = "SerialNumberIdentificationText")
    protected String serialNumberIdentificationText;
    @XmlElement(name = "LotIdentificationText")
    protected String lotIdentificationText;
    @XmlElement(name = "HullNumberText")
    protected String hullNumberText;
    @XmlElement(name = "MineRequisitionCaseNumberText")
    protected String mineRequisitionCaseNumberText;

    /**
     * Gets the value of the serialNumberIdentificationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberIdentificationText() {
        return serialNumberIdentificationText;
    }

    /**
     * Sets the value of the serialNumberIdentificationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberIdentificationText(String value) {
        this.serialNumberIdentificationText = value;
    }

    /**
     * Gets the value of the lotIdentificationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotIdentificationText() {
        return lotIdentificationText;
    }

    /**
     * Sets the value of the lotIdentificationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotIdentificationText(String value) {
        this.lotIdentificationText = value;
    }

    /**
     * Gets the value of the hullNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHullNumberText() {
        return hullNumberText;
    }

    /**
     * Sets the value of the hullNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHullNumberText(String value) {
        this.hullNumberText = value;
    }

    /**
     * Gets the value of the mineRequisitionCaseNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMineRequisitionCaseNumberText() {
        return mineRequisitionCaseNumberText;
    }

    /**
     * Sets the value of the mineRequisitionCaseNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMineRequisitionCaseNumberText(String value) {
        this.mineRequisitionCaseNumberText = value;
    }

}
