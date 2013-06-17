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
 * <p>Java class for ActionReconnaissanceEmploymentImageCoverageModeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionReconnaissanceEmploymentImageCoverageModeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MONOCC"/>
 *     &lt;enumeration value="MONOPC"/>
 *     &lt;enumeration value="PSMCC"/>
 *     &lt;enumeration value="PSMPC"/>
 *     &lt;enumeration value="STMCC"/>
 *     &lt;enumeration value="STMPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionReconnaissanceEmploymentImageCoverageModeCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ActionReconnaissanceEmploymentImageCoverageModeCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Complete imagery coverage in mono mode.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MONOCC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Partial imagery coverage in mono mode.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MONOPC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Complete imagery coverage in partial stereo mode.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PSMCC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Partial imagery coverage in partial stereo mode.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PSMPC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Complete imagery coverage in stereo mode.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    STMCC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Partial imagery coverage in stereo mode.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    STMPC;

    public String value() {
        return name();
    }

    public static ActionReconnaissanceEmploymentImageCoverageModeCode fromValue(String v) {
        return valueOf(v);
    }

}
