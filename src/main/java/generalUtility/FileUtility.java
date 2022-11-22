package generalUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility
{
	/**
	 * This method gets the details from the propertyfile
	 * @author DIVYASIDDAPPA
	 * @param propertyfile 
	 * @param key 
	 * 
	 */
	public String propertyfile(String propertyfile, String key)
	{
	
	FileInputStream fis = null;
	try 
	{
		fis = new FileInputStream(propertyfile);
	} catch (FileNotFoundException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Properties property = new Properties();
	try
	{
		property.load(fis);
	} catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String details = property.getProperty(key).trim();	
	try 
	{
		fis.close();
	} catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return details;
	}

}
