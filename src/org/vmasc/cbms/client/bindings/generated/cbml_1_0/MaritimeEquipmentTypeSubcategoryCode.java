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
 * <p>Java class for MaritimeEquipmentTypeSubcategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaritimeEquipmentTypeSubcategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BUOYBC"/>
 *     &lt;enumeration value="BUOYDN"/>
 *     &lt;enumeration value="BUOYDP"/>
 *     &lt;enumeration value="BUOYDT"/>
 *     &lt;enumeration value="BUOYMR"/>
 *     &lt;enumeration value="BUOYMS"/>
 *     &lt;enumeration value="BUOYNV"/>
 *     &lt;enumeration value="BUOYPM"/>
 *     &lt;enumeration value="BUOYPS"/>
 *     &lt;enumeration value="BUOYSD"/>
 *     &lt;enumeration value="BUOYSS"/>
 *     &lt;enumeration value="CUTTEN"/>
 *     &lt;enumeration value="CUTTEX"/>
 *     &lt;enumeration value="CUTTST"/>
 *     &lt;enumeration value="MCDFRR"/>
 *     &lt;enumeration value="MCJZBR"/>
 *     &lt;enumeration value="NOS"/>
 *     &lt;enumeration value="SHF"/>
 *     &lt;enumeration value="SONARB"/>
 *     &lt;enumeration value="SONOAC"/>
 *     &lt;enumeration value="SONOCA"/>
 *     &lt;enumeration value="SONODC"/>
 *     &lt;enumeration value="SONOPA"/>
 *     &lt;enumeration value="SONRAC"/>
 *     &lt;enumeration value="SONRCR"/>
 *     &lt;enumeration value="SONRDA"/>
 *     &lt;enumeration value="SONRDP"/>
 *     &lt;enumeration value="SONRDT"/>
 *     &lt;enumeration value="SONRHH"/>
 *     &lt;enumeration value="SONRPS"/>
 *     &lt;enumeration value="SONRRD"/>
 *     &lt;enumeration value="SONRSH"/>
 *     &lt;enumeration value="SONRVA"/>
 *     &lt;enumeration value="SONRVP"/>
 *     &lt;enumeration value="STAFF"/>
 *     &lt;enumeration value="SUBTAS"/>
 *     &lt;enumeration value="SUBTSS"/>
 *     &lt;enumeration value="SUBTWA"/>
 *     &lt;enumeration value="SWPAAF"/>
 *     &lt;enumeration value="SWPACC"/>
 *     &lt;enumeration value="SWPACE"/>
 *     &lt;enumeration value="SWPACL"/>
 *     &lt;enumeration value="SWPACO"/>
 *     &lt;enumeration value="SWPHAC"/>
 *     &lt;enumeration value="SWPHMA"/>
 *     &lt;enumeration value="SWPHME"/>
 *     &lt;enumeration value="SWPHVA"/>
 *     &lt;enumeration value="SWPHVE"/>
 *     &lt;enumeration value="SWPHVM"/>
 *     &lt;enumeration value="SWPMCC"/>
 *     &lt;enumeration value="SWPMCN"/>
 *     &lt;enumeration value="SWPMCS"/>
 *     &lt;enumeration value="SWPMCT"/>
 *     &lt;enumeration value="SWPMEC"/>
 *     &lt;enumeration value="SWPMGA"/>
 *     &lt;enumeration value="SWPMGC"/>
 *     &lt;enumeration value="SWPMGE"/>
 *     &lt;enumeration value="SWPMGO"/>
 *     &lt;enumeration value="SWPMGS"/>
 *     &lt;enumeration value="SWPORO"/>
 *     &lt;enumeration value="SWPPRS"/>
 *     &lt;enumeration value="SWPPRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaritimeEquipmentTypeSubcategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum MaritimeEquipmentTypeSubcategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A temporary marker active buoy used during minesweeping operations to indicate the boundaries of swept paths, swept areas, known hazards or other locations for some specific reason.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BUOYBC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A temporary marker buoy used during minesweeping operations to indicate the boundaries of swept paths, swept areas, known hazards or other locations of reference points.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BUOYDN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A temporary marker active buoy used in deep water during minesweeping operations to indicate the boundaries of swept paths, swept areas, known hazards or other locations for some specific reason.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BUOYDP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A dan buoy intended as a geographical reference or check, which needs to be more visible and more securely moored than a normal dan buoy.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BUOYDT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A floating object fastened in a particular place to point out the position of a specific hazard or obstacle or act as a marker for some specific purpose.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BUOYMR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A floating object fastened in a particular place to point out the position acting as a reference marker for MCM operations.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BUOYMS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A floating object fastened in a particular place to point out the position of a specific hazard or obstacle for navigation purposes.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BUOYNV,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1196/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BUOYPM,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A marked floating object fastened in a particular place to point out the position of a specific hazard or obstacle or act as a marker for some specific reason.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BUOYPS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A temporary marker active buoy used during minesweeping operations to indicate the boundaries of swept paths, swept areas, known hazards or other locations for some specific reason.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BUOYSD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A buoy used as a navigational reference that remains nearly vertical over its sinker.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BUOYSS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;In naval mine warfare a device fitted to the end of a sweep wire to cut or part the mooring of mines or obstructors; it may also be fitted in, or to, the mooring of a mine or obstructors to part a sweep wire.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CUTTEN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;In naval mine warfare an explosive device fitted to a sweep wire to cut or part the mooring of mines or obstructors; it may also be fitted in, or to, the mooring of a mine or obstructors to part a sweep wire.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CUTTEX,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A device that is static and cuts the cable by use of mechanical forces.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CUTTST,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A relaying Directional Frequency Ranging sonobuoy with 4-64 Channels.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MCDFRR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A relaying air dropped sonobuoy with 4-64 channels.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MCJZBR,

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A relaying air dropped sonobuoy 4-64 channels.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SHF,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 BL 11.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONARB,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONOAC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONOCA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONODC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONOPA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A system that projects acoustic energy into the water and measures the speed of its return from a reflective surface as an echo to detect an underwater object and determine its range and bearing.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONRAC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONRCR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONRDA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONRDP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONRDT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A hand held acoustic device used primarily for the detection and location of underwater objects.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONRHH,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A system that detects acoustic radiation from another vessel or object.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONRPS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A device to make a training mine appear larger or for use during diving conning run ICOS 42+ sides etc.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONRRD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment mounted on a ship that uses acoustic or SOund Navigation And Ranging (SONAR) technology.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONRSH,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONRVA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SONRVP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A part of the buoy equipment.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    STAFF,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SUBTAS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SUBTSS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1434/1.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SUBTWA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines by use of a sweep designed to operate the acoustic firing system of a mine, audio frequency.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPAAF,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines by use of a sweep designed to operate the acoustic firing system of a mine, MF and LF frequency 30 to 15000HZ.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPACC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines by use of a sweep using the detonation of explosive charges to actuate the acoustic sensors in the mine.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPACE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines by use of a sweep designed to operate the acoustic firing system of a mine, low frequency, up to 30Hz.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPACL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to be used in minesweeping operations, utilizing the acoustic firing mechanisms of the target mines.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPACO,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment mounted on a helicopter designed to be used in minesweeping operations, utilizing the acoustic firing mechanisms of the target mines.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPHAC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment mounted on a helicopter designed to locate mines by use of a conducting cable through which is passed a high current, towed behind a minesweeper helicopter.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPHMA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment mounted on a helicopter designed to locate mines in the lane swept by mechanical means.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPHME,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment mounted on a hovercraft designed to be used in minesweeping operations, utilising the acoustic firing mechanisms of the target mines.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPHVA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment mounted on a hovercraft designed to locate mines in the lane swept by mechanical means.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPHVE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment mounted on a hovercraft designed to locate mines by use of a conducting cable through which is passed a high current, towed behind a minesweeper hovercraft.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPHVM,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines in the lane swept by mechanical means, chains, normally fixed between two or more minesweeping vessels, dragged across the sea-bed.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPMCC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines in the lane swept by mechanical means; nets normally fixed between two or more minesweeping vessels.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPMCN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines by use of a wire to catch the snagline of a moored mine.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPMCS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines by towing either a mechanical or influence gear through the liquid with the intention of cutting or destruction of mines. Sweep wire towed between two or more ships using only kites to keep the sweep down.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPMCT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines in the lane swept by mechanical means.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPMEC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines in the lane swept with either a single or multiple ship rig and is designed to ensure that the sweep wire is not brought into contact with the mines antenna until the mine is a safe distance astern.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPMGA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines by use of a conducting cable, loop shaped through which is passed a high current, towed behind a minesweeper.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPMGC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines by use of two buoyant conducting cable an electrode fitted between each leg, the electrical circuit being completed through the seawater.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPMGE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines by use of a conducting cable, open loop shaped through which is passed a high current, towed behind a minesweeper.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPMGO,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines by use of large number of horizontal coils through which a small current is passed.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPMGS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines using a length of sweep wire that is towed by a single ship, lateral displacement being caused by an Otter and depth being controlled at the ship end by a Kite at the Otter end by a float and float wire.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPORO,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mine by use of pressure differentials.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPPRS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed to locate mines by use of a sweep designed to operate the acoustic firing system of a mine, MF and LF frequency 30 to 15000HZ.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPPRT;

    public String value() {
        return name();
    }

    public static MaritimeEquipmentTypeSubcategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
