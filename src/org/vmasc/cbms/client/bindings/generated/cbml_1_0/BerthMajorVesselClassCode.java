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
 * <p>Java class for BerthMajorVesselClassCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BerthMajorVesselClassCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BARGE"/>
 *     &lt;enumeration value="BRKBLK"/>
 *     &lt;enumeration value="CONTNR"/>
 *     &lt;enumeration value="NOS"/>
 *     &lt;enumeration value="RORO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BerthMajorVesselClassCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum BerthMajorVesselClassCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A long flat-bottomed vessel for carrying freight on canals, rivers, etc.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BARGE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Dry cargo-carrying vessel capable of handling break bulk cargo.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BRKBLK,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A vessel specially constructed and equipped to carry standard containers.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CONTNR,

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Vessel 40 metres or more having capability for Roll-on / Roll-off cargo.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    RORO;

    public String value() {
        return name();
    }

    public static BerthMajorVesselClassCode fromValue(String v) {
        return valueOf(v);
    }

}
