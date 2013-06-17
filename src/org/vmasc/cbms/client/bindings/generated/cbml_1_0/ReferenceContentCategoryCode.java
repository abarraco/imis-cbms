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
 * <p>Java class for ReferenceContentCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceContentCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ADMDOC"/>
 *     &lt;enumeration value="AUTHRS"/>
 *     &lt;enumeration value="CERTFC"/>
 *     &lt;enumeration value="DRCTV"/>
 *     &lt;enumeration value="GUIDNC"/>
 *     &lt;enumeration value="HISDOC"/>
 *     &lt;enumeration value="HLTDOC"/>
 *     &lt;enumeration value="IDDOC"/>
 *     &lt;enumeration value="INSTRC"/>
 *     &lt;enumeration value="LGLDOC"/>
 *     &lt;enumeration value="MAP"/>
 *     &lt;enumeration value="MTF"/>
 *     &lt;enumeration value="NOS"/>
 *     &lt;enumeration value="ORDER"/>
 *     &lt;enumeration value="PERDOC"/>
 *     &lt;enumeration value="REPORT"/>
 *     &lt;enumeration value="STFFJR"/>
 *     &lt;enumeration value="TECDOC"/>
 *     &lt;enumeration value="TEMPLT"/>
 *     &lt;enumeration value="TSTDOC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferenceContentCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ReferenceContentCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE provides administrative information.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ADMDOC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE constitutes an authorising document.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AUTHRS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE is an official document authorised for a specific use.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CERTFC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE provides compulsory instructions.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DRCTV,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE provides advisory information.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    GUIDNC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE records historical information.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HISDOC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE records medical information.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HLTDOC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE is an official document to ascertain identity.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    IDDOC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE provides information to support learning.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    INSTRC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE records information regarding legal matters.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LGLDOC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE provides graphic geographic information.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MAP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE is composed of several sets ordered in a specified sequence, each set characterized by an identifier and containing information of a specified type, coded and arranged in an ordered sequence of character fields in accordance with the NATO message text formatting rules.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MTF,

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE is a document that is directive in nature and generally used within the military sphere.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ORDER,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE records information regarding matters affecting personnel.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PERDOC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE is an authoritative account of an event or situation.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    REPORT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE is a detailed account of the activities of a staff.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    STFFJR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE provides technical description.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    TECDOC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE provides a pre-defined guide.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    TEMPLT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact cited in the specific REFERENCE provides information about test design or test results.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    TSTDOC;

    public String value() {
        return name();
    }

    public static ReferenceContentCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
