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
 * <p>Java class for ActionReconnaissanceEmploymentImageViewQualifierCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionReconnaissanceEmploymentImageViewQualifierCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DBEOIR"/>
 *     &lt;enumeration value="DBMIEO"/>
 *     &lt;enumeration value="ELCOPT"/>
 *     &lt;enumeration value="MIDINF"/>
 *     &lt;enumeration value="NSELEN"/>
 *     &lt;enumeration value="THRINF"/>
 *     &lt;enumeration value="VIDSFT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionReconnaissanceEmploymentImageViewQualifierCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ActionReconnaissanceEmploymentImageViewQualifierCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1677/6.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DBEOIR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1677/6.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DBMIEO,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1677/6.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ELCOPT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1677/6.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MIDINF,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1677/6.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NSELEN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1677/6.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    THRINF,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in ADatP-3 Baseline 13.1 FFIRN/FUD 1677/6.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    VIDSFT;

    public String value() {
        return name();
    }

    public static ActionReconnaissanceEmploymentImageViewQualifierCode fromValue(String v) {
        return valueOf(v);
    }

}