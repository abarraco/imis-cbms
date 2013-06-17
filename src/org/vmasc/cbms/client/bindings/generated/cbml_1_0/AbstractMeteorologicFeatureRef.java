//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A reference to some MeteorologicFeature - A FEATURE that describes reported or forecast weather and light conditions. Concrete types are: {AtmosphereRef, CloudCoverRef, IcingRef, LightRef, OtherMeteorologicFeatureRef, PrecipitationRef, VisibilityRef, WindRef}
 * 
 * <p>Java class for AbstractMeteorologicFeatureRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMeteorologicFeatureRef">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractFeatureRef">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractMeteorologicFeatureRef")
@XmlSeeAlso({
    WindRef.class,
    AtmosphereRef.class,
    IcingRef.class,
    VisibilityRef.class,
    CloudCoverRef.class,
    LightRef.class,
    OtherMeteorologicFeatureRef.class,
    PrecipitationRef.class
})
public abstract class AbstractMeteorologicFeatureRef
    extends AbstractFeatureRef
{


}
