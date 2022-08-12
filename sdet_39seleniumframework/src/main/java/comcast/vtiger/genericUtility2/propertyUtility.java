package comcast.vtiger.genericUtility2;

import java.io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class propertyUtility {
	
	public String getPropertyKeyValue(String Key) throws Throwable
	{
		
    FileInputStream fis=new FileInputStream("./data/common.properties"); 
	Properties  p=new Properties();
	p.load(fis);
	String value = p.getProperty(Key);
	return value;
	

    }
}



