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
 * <p>Java class for SubsurfaceVesselTypeCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubsurfaceVesselTypeCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DSV"/>
 *     &lt;enumeration value="NKN"/>
 *     &lt;enumeration value="NOS"/>
 *     &lt;enumeration value="SS"/>
 *     &lt;enumeration value="SSA"/>
 *     &lt;enumeration value="SSAN"/>
 *     &lt;enumeration value="SSB"/>
 *     &lt;enumeration value="SSBN"/>
 *     &lt;enumeration value="SSC"/>
 *     &lt;enumeration value="SSG"/>
 *     &lt;enumeration value="SSGN"/>
 *     &lt;enumeration value="SSK"/>
 *     &lt;enumeration value="SSN"/>
 *     &lt;enumeration value="SST"/>
 *     &lt;enumeration value="SSU"/>
 *     &lt;enumeration value="SSUN"/>
 *     &lt;enumeration value="SSW"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="TSG"/>
 *     &lt;enumeration value="TSR"/>
 *     &lt;enumeration value="YSG"/>
 *     &lt;enumeration value="YSR"/>
 *     &lt;enumeration value="YSRV"/>
 *     &lt;enumeration value="YSV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubsurfaceVesselTypeCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum SubsurfaceVesselTypeCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Submersible designed to operate at great depth (more than 300 metres).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DSV,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;It is not possible to determine which value is most applicable.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NKN,

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;General designator for a warship, capable of operating under water and usually equipped with torpedoes, missiles and a periscope.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Submarine used mainly in a non-combatant role which has at least a residual combat capability.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Submarine used mainly in a non-combatant role that has at least a residual combat capability and with nuclear power.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSAN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A subsurface vessel designed to deliver ballistic missile attacks against assigned targets from either a submerged or surfaced condition.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSB,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A subsurface vessel designed to deliver ballistic missile attacks against assigned targets from either a submerged or surfaced condition with nuclear power.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSBN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Submarine designed primarily for operations in coastal and shallow waters.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Submarine fitted with underwater to surface or surface-to-surface missiles.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSG,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Submarine fitted with underwater to surface or surface-to-surface missiles with nuclear power.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSGN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Long-range patrol submarine. May have primary anti- surface or anti-submarine role.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSK,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Nuclear propelled attack submarine with both anti-submarine and anti-surface capability.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Submarine used primarily in a training role but with at least a residual combat capability.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SST,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Submarine whose full military capability is unknown or has not been determined.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSU,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Submarine with nuclear power whose full military capability is unknown or has not been determined.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSUN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Midget submarine or submersible designed primarily for special operations and operated by naval forces.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SSW,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;General designator for non-combatant submersible.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    TS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Submersible with no combat capability used in research role.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    TSG,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Submersible designed specifically for underwater rescue operations.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    TSR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Military operated submersible designed specifically for underwater rescue operations.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    YSG,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Military operated submersible with no combat capability used in research role.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    YSR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Military operated submersible designed for submarine rescue operations at great depth (more than 300 metres) and military operated.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    YSRV,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Military operated submersible designed to operate at great depth (more than 300 metres).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    YSV;

    public String value() {
        return name();
    }

    public static SubsurfaceVesselTypeCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
