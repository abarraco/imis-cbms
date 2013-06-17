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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A reference to some ObjectItem - An individually identified object that has military or civilian significance. Concrete types are: {AtmosphereRef, CloudCoverRef, IcingRef, LightRef, OtherMeteorologicFeatureRef, PrecipitationRef, VisibilityRef, WindRef, AirRouteSegmentRef, OtherRouteSegmentRef, AirspaceControlMeansRef, OtherControlFeatureRef, RouteRef, GeographicFeatureRef, OtherFeatureRef, InstrumentLandingSystemRef, OtherMaterielRef, MinefieldLandRef, MinefieldMaritimeRef, OtherMilitaryObstacleRef, AirfieldRef, AnchorageRef, ApronRef, BasinRef, BerthRef, BridgeRef, DryDockRef, HarbourRef, JettyRef, OtherFacilityRef, QuayRef, RailwayRef, RoadRef, SlipwayRef, ConvoyRef, OtherOrganisationRef, UnitRef, OtherObjectItemRef, PersonRef}
 * 
 * <p>Java class for AbstractObjectItemRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractObjectItemRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractObjectItemRef", propOrder = {
    "oid"
})
@XmlSeeAlso({
    PersonRef.class,
    OtherObjectItemRef.class,
    AbstractMaterielRef.class,
    AbstractOrganisationRef.class,
    AbstractFeatureRef.class,
    AbstractFacilityRef.class
})
public abstract class AbstractObjectItemRef {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;

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

}
