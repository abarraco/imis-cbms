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
 * <p>Java class for OrganisationStatusOperationalStatusQualifierCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationStatusOperationalStatusQualifierCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DSTRYD"/>
 *     &lt;enumeration value="HVYDAM"/>
 *     &lt;enumeration value="LGTDAM"/>
 *     &lt;enumeration value="LST"/>
 *     &lt;enumeration value="LVR"/>
 *     &lt;enumeration value="MODDAM"/>
 *     &lt;enumeration value="NKN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganisationStatusOperationalStatusQualifierCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum OrganisationStatusOperationalStatusQualifierCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Subjectively judged by the reporting organisation that an ORGANISATION is not, and not expected ever to be, capable of performing the missions or functions for which it is created.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DSTRYD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Subjectively judged by the reporting organisation to be heavily damaged.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HVYDAM,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Subjectively judged by the reporting organisation to be only lightly damaged.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LGTDAM,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Subjectively judged by the reporting organisation that a specific organisation is missing under unknown circumstances.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LST,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Subjectively judged by the reporting organisation that an ORGANISATION is deficient or lacking of some mission-critical resources (e.g., fuel, ammunition).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LVR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Subjectively judged by the reporting organisation to be moderately damaged.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MODDAM,

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
    NKN;

    public String value() {
        return name();
    }

    public static OrganisationStatusOperationalStatusQualifierCode fromValue(String v) {
        return valueOf(v);
    }

}
