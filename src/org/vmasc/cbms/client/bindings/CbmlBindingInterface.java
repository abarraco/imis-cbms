package org.vmasc.cbms.client.bindings;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.vmasc.cbms.client.bindings.generated.cbml_1_0.CBML;

public class CbmlBindingInterface
{
	public static String generateXml(CBML cbml)
	{
		String xml = null;
		try 
		{
			JAXBContext context = JAXBContext.newInstance("org.vmasc.cbms.client.bindings.generated.cbml_1_0");
			Marshaller marshaller =  context.createMarshaller();	
			marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.sisostds.org/schemas/c-bml/1.0 xsd\\cbml_1_0\\cbml-expressions\\1.0\\cbml-expressions.xsd");
			StringWriter sw = new StringWriter();
			marshaller.marshal(cbml, sw);
			xml = sw.toString();
		} 
		catch (JAXBException e) 
		{
			e.printStackTrace();
		} 
		
		return xml;
	}
	
	public static List <CBML> parseCbml(String xml)
	{
		List <CBML> cbmlList = new ArrayList<CBML>();
		try 
		{
			JAXBContext context = JAXBContext.newInstance("org.vmasc.cbms.client.bindings.generated.cbml_1_0");
			Unmarshaller unmarshaller = context.createUnmarshaller();
    
			List <String> xmlTrimmed = TrimXml(xml);
			if(xmlTrimmed.size() > 0)
			{
				for(String nextTrimmed: xmlTrimmed)
				{
					InputStream is = new ByteArrayInputStream(nextTrimmed.getBytes()); 
					
					Object obj = unmarshaller.unmarshal(is);
					if(obj instanceof CBML)
					{
						CBML cbml = (CBML)obj;
						cbmlList.add(cbml);
					}
				}
			}
		} 
		catch (JAXBException e) 
		{
			e.printStackTrace();
		} 
		
		return cbmlList;
	}
	
	private static List <String> TrimXml(String xml)
	{
		List <String> xmlTrimmed = new ArrayList<String>();
		int fromIndex = 0, startIndex = 0, endIndex = 0;
		do
		{
			startIndex = xml.indexOf("<CBML", fromIndex);
			endIndex = xml.indexOf("</CBML>", fromIndex);
			
			if(startIndex != -1 && endIndex != -1)
			{
				String nextString = xml.substring(startIndex, endIndex + 7);
				xmlTrimmed.add(nextString);
			}
			
			fromIndex = endIndex + 7;
		}
		while(startIndex != -1 && endIndex != -1);
		
		return xmlTrimmed;
	}
}