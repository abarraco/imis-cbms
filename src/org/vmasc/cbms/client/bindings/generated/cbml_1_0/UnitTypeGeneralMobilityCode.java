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
 * <p>Java class for UnitTypeGeneralMobilityCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitTypeGeneralMobilityCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AIR"/>
 *     &lt;enumeration value="AIRCMP"/>
 *     &lt;enumeration value="AIRFW"/>
 *     &lt;enumeration value="AIRRW"/>
 *     &lt;enumeration value="AIRVST"/>
 *     &lt;enumeration value="AMPH"/>
 *     &lt;enumeration value="DSMNTD"/>
 *     &lt;enumeration value="HORSE"/>
 *     &lt;enumeration value="LAND"/>
 *     &lt;enumeration value="LNDRAI"/>
 *     &lt;enumeration value="LNDTRC"/>
 *     &lt;enumeration value="LNDTWD"/>
 *     &lt;enumeration value="LNDWHL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitTypeGeneralMobilityCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum UnitTypeGeneralMobilityCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally through the air.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AIR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally through the air by means that combine deriving lift from fixed wings or from airfoils that rotate.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally through the air by deriving lift from fixed wings.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally through the air by deriving lift from airfoils that rotate.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally through the air by using aircraft able to take off and land on very short distances.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AIRVST,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally both on land and in water.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally on foot.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally while carried by horses.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HORSE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally on the ground.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LAND,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally on the ground, along rails.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally on the ground by means of vehicles using caterpillar treads.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The main equipment of the specified UNIT-TYPE moves generally on the ground by means of external propulsion (mechanical or animal).&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE moves generally on the ground by means of vehicles using wheels.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LNDWHL;

    public String value() {
        return name();
    }

    public static UnitTypeGeneralMobilityCode fromValue(String v) {
        return valueOf(v);
    }

}
