//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadWeatherConditionCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadWeatherConditionCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AWR"/>
 *     &lt;enumeration value="FWR"/>
 *     &lt;enumeration value="LAWR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadWeatherConditionCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum RoadWeatherConditionCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific value, which determines that the ROAD is passable, to all traffic in any weather except deep snow or flood (normally roads with waterproof surfaces).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AWR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific value, which determines that the ROAD is passable only in fair weather. Quickly becomes impassable in bad weather. Cannot be kept open by maintenance short of major construction.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    FWR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific value, which determines that the volume of ROAD traffic may be limited by bad weather. Heavy unrestricted use during adverse weather may cause complete breakdown of surface (normally roads with non-waterproof surfaces).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LAWR;

    public String value() {
        return name();
    }

    public static RoadWeatherConditionCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}