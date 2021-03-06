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
 * <p>Java class for QuayContainerHandlingTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuayContainerHandlingTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CNTSTR"/>
 *     &lt;enumeration value="EMPCNT"/>
 *     &lt;enumeration value="NOS"/>
 *     &lt;enumeration value="RCHSTK"/>
 *     &lt;enumeration value="RGHTER"/>
 *     &lt;enumeration value="SHNTER"/>
 *     &lt;enumeration value="SHPTSH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuayContainerHandlingTypeCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum QuayContainerHandlingTypeCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A freight container lifting frame which straddles a container, is able to lift the container and carry it about inside the frame, can be towed or self-propelled, may have steerable wheels and used for loading, unloading, transportation and stacking of freight containers.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CNTSTR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A forklift truck or tractor for lifting, moving and stacking only empty freight containers.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    EMPCNT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The appropriate value is not in the set of specified values.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NOS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A vehicle similar to a forklift tractor with a single boom or arm which moves in a vertical plane with on-top spreader for clamping freight containers, used for moving and stacking fully loaded freight containers.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    RCHSTK,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A vehicle with an attachment or clamp to the forks in front for lifting and carrying ISO freight containers, used for loading and unloading containers and is designed to be used on rough undulating surface conditions or off-road conditions, all wheels are driven.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    RGHTER,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A vehicle used in port operations to move freight containers between a stacking area and a vessel side by means of a towed trailer upon which the container is placed.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SHNTER,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A crane designed with sufficient outreach to load and unload freight container vessels berthed alongside.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SHPTSH;

    public String value() {
        return name();
    }

    public static QuayContainerHandlingTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
