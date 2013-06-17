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
 * <p>Java class for RunwayPavementMaximumTyrePressureCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RunwayPavementMaximumTyrePressureCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="Z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RunwayPavementMaximumTyrePressureCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum RunwayPavementMaximumTyrePressureCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific value, which indicates that the maximum tyre pressure is not limited.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    W,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific value, which indicates that the maximum tyre pressure is limited between 1006,634 Pa and 1496,162 Pa (146 and 217 (Pounds per square inch)) PSI (1 PSI = 6894.757 Pa).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    X,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific value, which indicates that the maximum tyre pressure is limited between 510,212 Pa and 999,739 Pa (74 and 145 (Pounds per square inch)) PSI (1 PSI = 6894.757 Pa).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    Y,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific value, which indicates that the maximum tyre pressure is limited to 503,317 Pa (73 Pounds per square inch) PSI (1 PSI = 6894.757 Pa).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    Z;

    public String value() {
        return name();
    }

    public static RunwayPavementMaximumTyrePressureCode fromValue(String v) {
        return valueOf(v);
    }

}