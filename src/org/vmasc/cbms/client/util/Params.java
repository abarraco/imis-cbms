package org.vmasc.cbms.client.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.logging.Logger;

public class Params 
{
	private static final Logger LOGGER = Logger.getLogger(Params.class.getName());
    private static final String BUNDLE_NAME = "params.properties";
    private static Properties properties = null;

    private Params() 
    {
    }
    
    private static Properties getProperties()
    {
    	if(properties == null)
    	{
    		properties = new Properties();
    		File file = new File(new File("."), BUNDLE_NAME);
    		InputStream is = null;
			try 
			{
				is = new FileInputStream(file);
				properties.load(is);
			} 
			catch (FileNotFoundException e) 
			{
				properties = null;
				LOGGER.info(e.getMessage());
			}
			catch (IOException e) 
			{
				properties = null;
				LOGGER.info(e.getMessage());
			}
    	}
    	
    	return properties;
    }
    
    public static void writeProperties()
    {
    	Properties properties = getProperties();
    	if(properties != null)
    	{
    		File file = new File(BUNDLE_NAME);
			FileOutputStream fileOut;
			try
			{
				fileOut = new FileOutputStream(file);
				properties.store(fileOut, "Written from " + Constants.DISPLAY_STR_MAIN_TITLE);
				fileOut.close();
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
    	}
    }

    /**
     * Retrieve the value using the specified key.
     * @param key: the property key
     * @return: the retrieved value
     */
    public static String getString(String key) 
    {
    	Properties properties = getProperties();
    	if(properties != null)
    	{
	        try 
	        {
	            return properties.getProperty(key);
	        }
	        catch (MissingResourceException e) 
	        {
	        	LOGGER.info("Parameter " + key + " not found.");
	            return null;
	        }
    	}
    	else
    	{
    		LOGGER.info("Parameter file not found.");
    		return null;
    	}
    }
    
    public static void setString(String key, String value) 
    {
    	Properties properties = getProperties();
    	if(properties != null)
    	{
	        try 
	        {
	            properties.setProperty(key, value);
	        }
	        catch (MissingResourceException e) 
	        {
	        	LOGGER.info("Parameter " + key + " not found.");
	           
	        }
    	}
    	else
    	{
    		LOGGER.info("Parameter file not found.");
    	}
    }
    
    /**
     * Retrieve comma separated values.
     * @param key
     * @return: an array of values; null if the key is not found
     */
    public static String[] getStringArray(String key)
    {
    	Properties properties = getProperties();
    	if(properties != null)
    	{
	    	try
	    	{
	    		String value = properties.getProperty(key);
	    		return value.split(",");
		    }
		    catch (MissingResourceException e) 
		    {
		    	LOGGER.info("Parameter " + key + " not found.");
		        return null;
		    }
    	}
    	else
    	{
    		LOGGER.info("Parameter file not found.");
    		return null;
    	}
    }
}