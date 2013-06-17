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
 * <p>Java class for CbrnEventSubcategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbrnEventSubcategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AIRSMP"/>
 *     &lt;enumeration value="ALPRAD"/>
 *     &lt;enumeration value="ARBRST"/>
 *     &lt;enumeration value="BETRAD"/>
 *     &lt;enumeration value="BRNFIR"/>
 *     &lt;enumeration value="CBRNCL"/>
 *     &lt;enumeration value="CNTFLW"/>
 *     &lt;enumeration value="GAMRAD"/>
 *     &lt;enumeration value="LQDSMP"/>
 *     &lt;enumeration value="LRGSPL"/>
 *     &lt;enumeration value="NEUTRN"/>
 *     &lt;enumeration value="NKN"/>
 *     &lt;enumeration value="NOS"/>
 *     &lt;enumeration value="SBSRBU"/>
 *     &lt;enumeration value="SIBCA"/>
 *     &lt;enumeration value="SIRA"/>
 *     &lt;enumeration value="SMLSPL"/>
 *     &lt;enumeration value="SURBUR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CbrnEventSubcategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum CbrnEventSubcategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The operational action to confirm the presence of a gaseous contaminant.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AIRSMP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The action performed to detect a source of Alpha radiation.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ALPRAD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An explosion of a bomb or projectile above the surface as distinguished from an explosion on contact with the surface or after penetration.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ARBRST,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The action performed to detect a source of Beta radiation.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BETRAD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An event where a fire is consuming materiel and emitting smoke, which may be toxic.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BRNFIR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The action of detecting a visible NBC (CBRN) cloud.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CBRNCL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An event where a continuous flow of possibly toxic liquid is spilled from a container.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CNTFLW,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The action performed to detect a source of Gamma radiation.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    GAMRAD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The operational action to confirm the presence of a liquid contaminant.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LQDSMP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An event where a large quantity of possibly toxic liquid is spilled.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LRGSPL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The action performed to detect a source of Neutron particle.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NEUTRN,

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The explosion of a nuclear weapon in which the centre of the detonation lies at a point beneath the surface of the ground.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SBSRBU,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The forensic expertise performed to confirm to commanders the actual occurrence of a chemical or biological event.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SIBCA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The forensic expertise performed to confirm to commanders the actual occurrence of a Nuclear event.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SIRA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An event where a small quantity of possibly toxic liquid is spilled.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SMLSPL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An explosion of a nuclear weapon at the surface of land or water; or above the surface at a height less than the maximum radius of the fireball.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SURBUR;

    public String value() {
        return name();
    }

    public static CbrnEventSubcategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
