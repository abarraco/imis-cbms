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
 * <p>Java class for MobilityCapabilityCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilityCapabilityCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AIRBRN"/>
 *     &lt;enumeration value="AIRCMP"/>
 *     &lt;enumeration value="AIRFW"/>
 *     &lt;enumeration value="AIRLGT"/>
 *     &lt;enumeration value="AIRRW"/>
 *     &lt;enumeration value="AMPH"/>
 *     &lt;enumeration value="ANIMNT"/>
 *     &lt;enumeration value="ARCTIC"/>
 *     &lt;enumeration value="DSMNTD"/>
 *     &lt;enumeration value="LNDRAI"/>
 *     &lt;enumeration value="LNDSPP"/>
 *     &lt;enumeration value="LNDTRC"/>
 *     &lt;enumeration value="LNDTWD"/>
 *     &lt;enumeration value="LNDWHL"/>
 *     &lt;enumeration value="MLC"/>
 *     &lt;enumeration value="ROADMR"/>
 *     &lt;enumeration value="SELFDP"/>
 *     &lt;enumeration value="WATBAY"/>
 *     &lt;enumeration value="WATCNL"/>
 *     &lt;enumeration value="WATCRK"/>
 *     &lt;enumeration value="WATFJR"/>
 *     &lt;enumeration value="WATLAK"/>
 *     &lt;enumeration value="WATNTD"/>
 *     &lt;enumeration value="WATRVR"/>
 *     &lt;enumeration value="WATSEA"/>
 *     &lt;enumeration value="WATSUB"/>
 *     &lt;enumeration value="WATSUR"/>
 *     &lt;enumeration value="WATSWM"/>
 *     &lt;enumeration value="WATTDL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilityCapabilityCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum MobilityCapabilityCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability to be employed, following transport by air, in an assault debarkation either by parachuting or touchdown.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AIRBRN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability to move through the air by means that combine deriving lift from fixed wings or from aerofoils that rotate.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AIRCMP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability to move through the air by deriving lift from fixed wings.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AIRFW,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of an air vehicle to remain airborne and move by displacing a weight of air greater than its own.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AIRLGT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability to move through the air by deriving lift from aerofoils that rotate.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AIRRW,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to operate both on land and in water.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AMPH,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability to move by using an animal as a carrier.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ANIMNT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability to move on or through ice.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ARCTIC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of moving on foot.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DSMNTD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to move along rails.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LNDRAI,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to move over land under its own power.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LNDSPP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to move on caterpillar treads.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LNDTRC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to move by means of external propulsion (mechanical or animal).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LNDTWD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to move on wheels.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LNDWHL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The characteristics, required for planning, of those CONTROL-FEATUREs, FACILITYs and MATERIELs or CONTROL-FEATURE-TYPEs, FACILITY-TYPEs and EQUIPMENT-TYPEs, and ORGANISATION-TYPEs that represents the standard system in which a route, bridge or raft is assigned class number(s) representing the load it can carry. Vehicles are also assigned number(s) indicating the minimum class of route, bridge or raft they are authorized to use.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MLC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a formation moving on a road.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ROADMR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to be brought into effective action by its own means.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SELFDP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to navigate in bays.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATBAY,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to navigate canals.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATCNL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to navigate in creeks.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATCRK,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to navigate fjords.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATFJR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to navigate lakes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATLAK,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to navigate non-tidal waters.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATNTD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to navigate rivers.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATRVR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to navigate seas.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATSEA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to move on or under the water surface.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATSUB,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to move on the water surface.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATSUR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to navigate swamps.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATSWM,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The capability of a device to navigate tidal waters.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WATTDL;

    public String value() {
        return name();
    }

    public static MobilityCapabilityCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}