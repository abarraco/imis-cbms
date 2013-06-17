//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An individually identified object that has military or civilian significance. Concrete types are: {Atmosphere, CloudCover, Icing, Light, OtherMeteorologicFeature, Precipitation, Visibility, Wind, AirRouteSegment, OtherRouteSegment, AirspaceControlMeans, OtherControlFeature, Route, GeographicFeature, OtherFeature, InstrumentLandingSystem, OtherMateriel, MinefieldLand, MinefieldMaritime, OtherMilitaryObstacle, Airfield, Anchorage, Apron, Basin, Berth, Bridge, DryDock, Harbour, Jetty, OtherFacility, Quay, Railway, Road, Slipway, Convoy, OtherOrganisation, Unit, OtherObjectItem, Person}
 * 
 * <p>Java class for AbstractObjectItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractObjectItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="NameText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar100"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Alias" type="{http://www.sisostds.org/schemas/c-bml/1.0}ObjectItemAlias"/>
 *           &lt;element name="AliasRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}ObjectItemAliasRef"/>
 *         &lt;/choice>
 *         &lt;element name="ObjectItemObjectTypeEstablishmentInObjectItem" type="{http://www.sisostds.org/schemas/c-bml/1.0}ObjectItemObjectTypeEstablishmentInObjectItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractObjectItem", propOrder = {
    "oid",
    "nameText",
    "aliasOrAliasRef",
    "objectItemObjectTypeEstablishmentInObjectItem"
})
@XmlSeeAlso({
    OtherObjectItem.class,
    Person.class,
    AbstractMateriel.class,
    AbstractOrganisation.class,
    AbstractFeature.class,
    AbstractFacility.class
})
public abstract class AbstractObjectItem {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "NameText", required = true)
    protected String nameText;
    @XmlElements({
        @XmlElement(name = "AliasRef", type = ObjectItemAliasRef.class),
        @XmlElement(name = "Alias", type = ObjectItemAlias.class)
    })
    protected List<Object> aliasOrAliasRef;
    @XmlElement(name = "ObjectItemObjectTypeEstablishmentInObjectItem")
    protected List<ObjectItemObjectTypeEstablishmentInObjectItem> objectItemObjectTypeEstablishmentInObjectItem;

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
     * Gets the value of the aliasOrAliasRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliasOrAliasRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliasOrAliasRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectItemAliasRef }
     * {@link ObjectItemAlias }
     * 
     * 
     */
    public List<Object> getAliasOrAliasRef() {
        if (aliasOrAliasRef == null) {
            aliasOrAliasRef = new ArrayList<Object>();
        }
        return this.aliasOrAliasRef;
    }

    /**
     * Gets the value of the objectItemObjectTypeEstablishmentInObjectItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectItemObjectTypeEstablishmentInObjectItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectItemObjectTypeEstablishmentInObjectItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectItemObjectTypeEstablishmentInObjectItem }
     * 
     * 
     */
    public List<ObjectItemObjectTypeEstablishmentInObjectItem> getObjectItemObjectTypeEstablishmentInObjectItem() {
        if (objectItemObjectTypeEstablishmentInObjectItem == null) {
            objectItemObjectTypeEstablishmentInObjectItem = new ArrayList<ObjectItemObjectTypeEstablishmentInObjectItem>();
        }
        return this.objectItemObjectTypeEstablishmentInObjectItem;
    }

}