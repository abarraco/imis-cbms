//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationStatusAvailabilityCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationStatusAvailabilityCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AFT30D"/>
 *     &lt;enumeration value="BTW163"/>
 *     &lt;enumeration value="BTW484"/>
 *     &lt;enumeration value="BTW515"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="WTN48H"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganisationStatusAvailabilityCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum OrganisationStatusAvailabilityCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An availability status of an ORGANISATION indicating that the ORGANISATION can be available for use after 30 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("AFT30D")
    AFT_30_D("AFT30D"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An availability status of an ORGANISATION indicating that the ORGANISATION can be available for use in between 16 and 30 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("BTW163")
    BTW_163("BTW163"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An availability status of an ORGANISATION indicating that the ORGANISATION can be available for use in between 48 hours and 4 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("BTW484")
    BTW_484("BTW484"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An availability status of an ORGANISATION indicating that the ORGANISATION can be available for use in between 5 and 15 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("BTW515")
    BTW_515("BTW515"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An availability status of an ORGANISATION indicating that the ORGANISATION is not available.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NA("NA"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An availability status of an ORGANISATION indicating that the ORGANISATION can be available for use within 48 hours.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("WTN48H")
    WTN_48_H("WTN48H");
    private final String value;

    OrganisationStatusAvailabilityCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganisationStatusAvailabilityCode fromValue(String v) {
        for (OrganisationStatusAvailabilityCode c: OrganisationStatusAvailabilityCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
