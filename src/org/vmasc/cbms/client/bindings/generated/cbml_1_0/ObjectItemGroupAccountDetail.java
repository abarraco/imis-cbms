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
 * The total count and condition of a specific group included in a specific OBJECT-ITEM-GROUP-ACCOUNT. The group is defined as a specific PERSON-TYPE that may also be categorised by a specific GROUP-CHARACTERISTIC.
 * 
 * <p>Java class for ObjectItemGroupAccountDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectItemGroupAccountDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="Count" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CountType9"/>
 *         &lt;element name="QualifierCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ObjectItemGroupAccountDetailQualifierCode" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="GroupCharacteristic" type="{http://www.sisostds.org/schemas/c-bml/1.0}GroupCharacteristic"/>
 *           &lt;element name="GroupCharacteristicRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}GroupCharacteristicRef"/>
 *         &lt;/choice>
 *         &lt;element name="PersonTypeRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}PersonTypeRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectItemGroupAccountDetail", propOrder = {
    "oid",
    "count",
    "qualifierCode",
    "groupCharacteristic",
    "groupCharacteristicRef",
    "personTypeRef"
})
public class ObjectItemGroupAccountDetail {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "QualifierCode")
    protected ObjectItemGroupAccountDetailQualifierCode qualifierCode;
    @XmlElement(name = "GroupCharacteristic")
    protected GroupCharacteristic groupCharacteristic;
    @XmlElement(name = "GroupCharacteristicRef")
    protected GroupCharacteristicRef groupCharacteristicRef;
    @XmlElement(name = "PersonTypeRef", required = true)
    protected PersonTypeRef personTypeRef;

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
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the qualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectItemGroupAccountDetailQualifierCode }
     *     
     */
    public ObjectItemGroupAccountDetailQualifierCode getQualifierCode() {
        return qualifierCode;
    }

    /**
     * Sets the value of the qualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectItemGroupAccountDetailQualifierCode }
     *     
     */
    public void setQualifierCode(ObjectItemGroupAccountDetailQualifierCode value) {
        this.qualifierCode = value;
    }

    /**
     * Gets the value of the groupCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link GroupCharacteristic }
     *     
     */
    public GroupCharacteristic getGroupCharacteristic() {
        return groupCharacteristic;
    }

    /**
     * Sets the value of the groupCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCharacteristic }
     *     
     */
    public void setGroupCharacteristic(GroupCharacteristic value) {
        this.groupCharacteristic = value;
    }

    /**
     * Gets the value of the groupCharacteristicRef property.
     * 
     * @return
     *     possible object is
     *     {@link GroupCharacteristicRef }
     *     
     */
    public GroupCharacteristicRef getGroupCharacteristicRef() {
        return groupCharacteristicRef;
    }

    /**
     * Sets the value of the groupCharacteristicRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCharacteristicRef }
     *     
     */
    public void setGroupCharacteristicRef(GroupCharacteristicRef value) {
        this.groupCharacteristicRef = value;
    }

    /**
     * Gets the value of the personTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link PersonTypeRef }
     *     
     */
    public PersonTypeRef getPersonTypeRef() {
        return personTypeRef;
    }

    /**
     * Sets the value of the personTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonTypeRef }
     *     
     */
    public void setPersonTypeRef(PersonTypeRef value) {
        this.personTypeRef = value;
    }

}
