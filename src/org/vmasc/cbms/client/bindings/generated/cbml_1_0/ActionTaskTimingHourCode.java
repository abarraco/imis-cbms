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
 * <p>Java class for ActionTaskTimingHourCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionTaskTimingHourCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionTaskTimingHourCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ActionTaskTimingHourCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The time designated for the start of cross-FLOT aviation operations.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    F,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The time on which an order (normally national) is given to deploy a unit.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    G,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;1. The specific time at which an operation or exercise commences or is due to commence. It is also the time at which the Line of Departure is crossed by the leading element in an attack. 2. In amphibious operations, the time at which the first waterborne wave of an amphibious assault lands on a beach.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    H,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The time on which a convoy system is introduced or is due to be introduced on any particular land convoy route or sea convoy lane.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    K,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;In amphibious or airmobile operations, the time at which the first helicopter of the heliborne assault wave touches down in the landing zone (LZ).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    L,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;In airborne operations, the time at which the lead parachute element is to arrive over the parachute impact point to begin operations.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    P,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The time of Transfer of Authority.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    T,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;In airmobile operations the time at which the first helicopter in the first wave departs the "Pick-up-Point"(PUP).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    Y;

    public String value() {
        return name();
    }

    public static ActionTaskTimingHourCode fromValue(String v) {
        return valueOf(v);
    }

}
