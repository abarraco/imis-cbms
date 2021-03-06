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
 * <p>Java class for MaintenanceCapabilityCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaintenanceCapabilityCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CABLE"/>
 *     &lt;enumeration value="ELEC"/>
 *     &lt;enumeration value="NAVGTE"/>
 *     &lt;enumeration value="PLUMBN"/>
 *     &lt;enumeration value="PNTSHP"/>
 *     &lt;enumeration value="SHPWRG"/>
 *     &lt;enumeration value="SHTBLS"/>
 *     &lt;enumeration value="STEAM"/>
 *     &lt;enumeration value="STLFBR"/>
 *     &lt;enumeration value="TNKCLN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaintenanceCapabilityCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum MaintenanceCapabilityCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific MAINTENANCE-CAPABILITY determines the ability to provide cable repair.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CABLE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific MAINTENANCE-CAPABILITY determines the ability to provide electrical repair.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ELEC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific MAINTENANCE-CAPABILITY determines the ability to provide navigational equipment repair.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NAVGTE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment and resources for fitting and repairing pipes, fixtures and other apparatus of a water gas or sewage system belonging to a docked vessel.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PLUMBN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment and resources for painting any part of a docked vessel.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PNTSHP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment and resources for the construction, fitting and repairing the wooden parts of a docked vessel.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SHPWRG,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment and resources for the cleaning of metal, belonging to a docked vessel, by the impact of a stream of shot (lead pellets).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SHTBLS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific MAINTENANCE-CAPABILITY determines the ability to provide steam repair.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    STEAM,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment and resources for the construction or manufacture of any article made of steel required for a docked vessel.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    STLFBR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment and resources for the removal of any trace of the original contents of any tank belonging to a docked vessel. Removal is often carried out by means of a high-pressure water jet.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    TNKCLN;

    public String value() {
        return name();
    }

    public static MaintenanceCapabilityCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
