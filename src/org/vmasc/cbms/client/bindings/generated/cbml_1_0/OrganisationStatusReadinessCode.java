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
 * <p>Java class for OrganisationStatusReadinessCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganisationStatusReadinessCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AIRALR"/>
 *     &lt;enumeration value="BTLSTN"/>
 *     &lt;enumeration value="GRDALR"/>
 *     &lt;enumeration value="NKN"/>
 *     &lt;enumeration value="NOS"/>
 *     &lt;enumeration value="NRD12H"/>
 *     &lt;enumeration value="RDNS1"/>
 *     &lt;enumeration value="RDNS2"/>
 *     &lt;enumeration value="RDNS3"/>
 *     &lt;enumeration value="RDNS4"/>
 *     &lt;enumeration value="RDNS5"/>
 *     &lt;enumeration value="RDNS6"/>
 *     &lt;enumeration value="RDNS7"/>
 *     &lt;enumeration value="RDNS8"/>
 *     &lt;enumeration value="RDNS9"/>
 *     &lt;enumeration value="RDY10M"/>
 *     &lt;enumeration value="RDY12H"/>
 *     &lt;enumeration value="RDY15M"/>
 *     &lt;enumeration value="RDY20M"/>
 *     &lt;enumeration value="RDY2H"/>
 *     &lt;enumeration value="RDY30M"/>
 *     &lt;enumeration value="RDY3H"/>
 *     &lt;enumeration value="RDY5M"/>
 *     &lt;enumeration value="RDY60M"/>
 *     &lt;enumeration value="RDY6H"/>
 *     &lt;enumeration value="RDYL5M"/>
 *     &lt;enumeration value="RED"/>
 *     &lt;enumeration value="RNYALR"/>
 *     &lt;enumeration value="WHITE"/>
 *     &lt;enumeration value="WT10D"/>
 *     &lt;enumeration value="WT180D"/>
 *     &lt;enumeration value="WT20D"/>
 *     &lt;enumeration value="WT2D"/>
 *     &lt;enumeration value="WT30D"/>
 *     &lt;enumeration value="WT365D"/>
 *     &lt;enumeration value="WT5D"/>
 *     &lt;enumeration value="WT60D"/>
 *     &lt;enumeration value="WT90D"/>
 *     &lt;enumeration value="YELLOW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganisationStatusReadinessCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum OrganisationStatusReadinessCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION wherein combat-equipped aircraft are airborne and ready for immediate action.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AIRALR("AIRALR"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION where the aircrews will be in cockpits of their fighters and be capable of starting their engines and becoming airborne in the minimum practicable time.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BTLSTN("BTLSTN"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION wherein aircraft on the ground/deck are fully serviced and armed, with combat crews in readiness to take off within a specified short period of time (usually 15 minutes) after receipt of a mission order.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    GRDALR("GRDALR"),

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
    NKN("NKN"),

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
    NOS("NOS"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION cannot be ready within 12 hours.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("NRD12H")
    NRD_12_H("NRD12H"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Readiness state 1, in line with definitions provided by "Shape Standing Defence Plan (SDP) 10901D - ANGRY HASP" [NC] and by the "Comairnorth Supplan 24600D Constant Effort" for the Northern Region Integrated Air Defence System (NRIADS), Annex h dated 15 FEB 2000 [NC].&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDNS1")
    RDNS_1("RDNS1"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Readiness state 2, in line with definitions provided by "Shape Standing Defence Plan (SDP) 10901D - ANGRY HASP" [NC] and by the "Comairnorth Supplan 24600D Constant Effort" for the Northern Region Integrated Air Defence System (NRIADS), Annex h dated 15 FEB 2000 [NC].&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDNS2")
    RDNS_2("RDNS2"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Readiness state 3, in line with definitions provided by "Shape Standing Defence Plan (SDP) 10901D - ANGRY HASP" [NC] and by the "Comairnorth Supplan 24600D Constant Effort" for the Northern Region Integrated Air Defence System (NRIADS), Annex h dated 15 FEB 2000 [NC].&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDNS3")
    RDNS_3("RDNS3"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Readiness state 4, in line with definitions provided by "Shape Standing Defence Plan (SDP) 10901D - ANGRY HASP" [NC] and by the "Comairnorth Supplan 24600D Constant Effort" for the Northern Region Integrated Air Defence System (NRIADS), Annex h dated 15 FEB 2000 [NC].&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDNS4")
    RDNS_4("RDNS4"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Readiness state 5, in line with definitions provided by "Shape Standing Defence Plan (SDP) 10901D - ANGRY HASP" [NC] and by the "Comairnorth Supplan 24600D Constant Effort" for the Northern Region Integrated Air Defence System (NRIADS), Annex h dated 15 FEB 2000 [NC].&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDNS5")
    RDNS_5("RDNS5"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Readiness state 6, in line with definitions provided by "Shape Standing Defence Plan (SDP) 10901D - ANGRY HASP" [NC] and by the "Comairnorth Supplan 24600D Constant Effort" for the Northern Region Integrated Air Defence System (NRIADS), Annex h dated 15 FEB 2000 [NC].&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDNS6")
    RDNS_6("RDNS6"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Readiness state 7, in line with definitions provided by "Shape Standing Defence Plan (SDP) 10901D - ANGRY HASP" [NC] and by the "Comairnorth Supplan 24600D Constant Effort" for the Northern Region Integrated Air Defence System (NRIADS), Annex h dated 15 FEB 2000 [NC].&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDNS7")
    RDNS_7("RDNS7"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Readiness state 8, in line with definitions provided by "Shape Standing Defence Plan (SDP) 10901D - ANGRY HASP" [NC] and by the "Comairnorth Supplan 24600D Constant Effort" for the Northern Region Integrated Air Defence System (NRIADS), Annex h dated 15 FEB 2000 [NC].&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDNS8")
    RDNS_8("RDNS8"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Readiness state 9, in line with definitions provided by "Shape Standing Defence Plan (SDP) 10901D - ANGRY HASP" [NC] and by the "Comairnorth Supplan 24600D Constant Effort" for the Northern Region Integrated Air Defence System (NRIADS), Annex h dated 15 FEB 2000 [NC].&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDNS9")
    RDNS_9("RDNS9"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION can be ready within 10 minutes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDY10M")
    RDY_10_M("RDY10M"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION can be ready within 12 hours.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDY12H")
    RDY_12_H("RDY12H"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION can be ready within 15 minutes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDY15M")
    RDY_15_M("RDY15M"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION can be ready within 20 minutes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDY20M")
    RDY_20_M("RDY20M"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION can be ready within 2 hours.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDY2H")
    RDY_2_H("RDY2H"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION can be ready within 30 minutes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDY30M")
    RDY_30_M("RDY30M"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION can be ready within 3 hours.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDY3H")
    RDY_3_H("RDY3H"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION can be ready within 5 minutes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDY5M")
    RDY_5_M("RDY5M"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION can be ready within 60 minutes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDY60M")
    RDY_60_M("RDY60M"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION can be ready within 6 hours.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDY6H")
    RDY_6_H("RDY6H"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness state of an ORGANISATION indicating that the ORGANISATION can be ready within less than 5 minutes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("RDYL5M")
    RDYL_5_M("RDYL5M"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of a "Marine Unit" type ORGANISATION where the troops must be able to open fire in 2 to 5 minutes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    RED("RED"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION where the aircrews will be in the cockpits with the applicable checks completed and the aircraft will be located on or near the runway with engines running ready for take off.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    RNYALR("RNYALR"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of a "Marine Unit" type ORGANISATION where the troops must be able to open fire in 30 to 60 minutes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WHITE("WHITE"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION where the troops will be able to be engaged in action, defence or protection within 10 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("WT10D")
    WT_10_D("WT10D"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION where the troops will be able to be engaged in action, defence or protection within 180 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("WT180D")
    WT_180_D("WT180D"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION where the troops will be able to be engaged in action, defence or protection within 20 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("WT20D")
    WT_20_D("WT20D"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION where the troops will be able to be engaged in action, defence or protection within 2 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("WT2D")
    WT_2_D("WT2D"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION where the troops will be able to be engaged in action, defence or protection within 30 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("WT30D")
    WT_30_D("WT30D"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION where the troops will be able to be engaged in action, defence or protection within 365 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("WT365D")
    WT_365_D("WT365D"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION where the troops will be able to be engaged in action, defence or protection within 5 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("WT5D")
    WT_5_D("WT5D"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION where the troops will be able to be engaged in action, defence or protection within 60 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("WT60D")
    WT_60_D("WT60D"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of an ORGANISATION where the troops will be able to be engaged in action, defence or protection within 90 days.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("WT90D")
    WT_90_D("WT90D"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A readiness level of a "Marine Unit" type ORGANISATION where the troops must be able to open fire in 15 minutes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    YELLOW("YELLOW");
    private final String value;

    OrganisationStatusReadinessCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganisationStatusReadinessCode fromValue(String v) {
        for (OrganisationStatusReadinessCode c: OrganisationStatusReadinessCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
