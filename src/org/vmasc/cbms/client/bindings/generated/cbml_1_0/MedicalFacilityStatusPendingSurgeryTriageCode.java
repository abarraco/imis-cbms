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
 * <p>Java class for MedicalFacilityStatusPendingSurgeryTriageCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicalFacilityStatusPendingSurgeryTriageCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="T1"/>
 *     &lt;enumeration value="T2"/>
 *     &lt;enumeration value="T3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicalFacilityStatusPendingSurgeryTriageCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum MedicalFacilityStatusPendingSurgeryTriageCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Very seriously injured - 1 hour expected duration for surgery.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("T1")
    T_1("T1"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Seriously injured - 2 hours expected duration for surgery.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("T2")
    T_2("T2"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Minimally injured - 35 minutes expected duration for surgery.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("T3")
    T_3("T3");
    private final String value;

    MedicalFacilityStatusPendingSurgeryTriageCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicalFacilityStatusPendingSurgeryTriageCode fromValue(String v) {
        for (MedicalFacilityStatusPendingSurgeryTriageCode c: MedicalFacilityStatusPendingSurgeryTriageCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
