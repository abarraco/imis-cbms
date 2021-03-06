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
 * <p>Java class for ExecutiveMilitaryOrganisationTypeCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutiveMilitaryOrganisationTypeCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="HQ"/>
 *     &lt;enumeration value="LOG"/>
 *     &lt;enumeration value="MILSVC"/>
 *     &lt;enumeration value="NOS"/>
 *     &lt;enumeration value="PRSNL"/>
 *     &lt;enumeration value="SUPPLY"/>
 *     &lt;enumeration value="TRNPTN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExecutiveMilitaryOrganisationTypeCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ExecutiveMilitaryOrganisationTypeCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EXECUTIVE-MILITARY-ORGANISATION-TYPE that performs the management functions of an international, national, strategic or service headquarters.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HQ,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EXECUTIVE-MILITARY-ORGANISATION-TYPE that provides management of logistics services.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LOG,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EXECUTIVE-MILITARY-ORGANISATION-TYPE, other than police, that manages the training, equipping, manning, and operating of an armed uniformed force.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MILSVC,

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EXECUTIVE-MILITARY-ORGANISATION-TYPE that provides management of personnel services.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PRSNL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EXECUTIVE-MILITARY-ORGANISATION-TYPE that provides management of supply services.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SUPPLY,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EXECUTIVE-MILITARY-ORGANISATION-TYPE that provides management of transportation services.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    TRNPTN;

    public String value() {
        return name();
    }

    public static ExecutiveMilitaryOrganisationTypeCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
