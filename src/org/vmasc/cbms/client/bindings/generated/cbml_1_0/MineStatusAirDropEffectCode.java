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
 * <p>Java class for MineStatusAirDropEffectCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MineStatusAirDropEffectCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ARMMAL"/>
 *     &lt;enumeration value="ARMMBU"/>
 *     &lt;enumeration value="ARMMS"/>
 *     &lt;enumeration value="ARMMSB"/>
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="PARAM"/>
 *     &lt;enumeration value="PARAMB"/>
 *     &lt;enumeration value="PARAMS"/>
 *     &lt;enumeration value="PARMAL"/>
 *     &lt;enumeration value="PARMBU"/>
 *     &lt;enumeration value="PARMS"/>
 *     &lt;enumeration value="SKIP"/>
 *     &lt;enumeration value="SKIPBU"/>
 *     &lt;enumeration value="UNK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MineStatusAirDropEffectCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum MineStatusAirDropEffectCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Arming wires not retained.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ARMMAL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Arming wires not retained, case broke up on impact.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ARMMBU,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Arming wires not retained, case skipped on impact.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ARMMS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Arming wires not retained, case skipped and broke up on impact.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ARMMSB,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Parachute drop and weapon impact where normal.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NORMAL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Parachute failed to fully open, arming wires not retained.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PARAM,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Parachute failed to fully open, arming wires not retained, and case skipped and broke up on impact.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PARAMB,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Parachute failed to fully open, arming wires not retained, and case skipped on impact.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PARAMS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Parachute failed to fully open.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PARMAL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Parachute failed to fully open, case broke up on impact.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PARMBU,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Parachute failed to fully open, case skipped on impact.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PARMS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Case skipped on impact.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SKIP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Case skipped and broke up on impact.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SKIPBU,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The type of malfunction is unknown.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    UNK;

    public String value() {
        return name();
    }

    public static MineStatusAirDropEffectCode fromValue(String v) {
        return valueOf(v);
    }

}