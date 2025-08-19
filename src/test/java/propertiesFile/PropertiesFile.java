package propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		//Location of properties file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
		
		//Loading file properties
		Properties pobj=new Properties();
		pobj.load(file);
		
		//Reading Data From properties file
		String url=pobj.getProperty("appurl");
		String email=pobj.getProperty("username");
		String pwd=pobj.getProperty("password");
		String cid=pobj.getProperty("custid");
		
		System.out.println(url+" "+email+" "+pwd+" "+cid);
		
		// Reading all the keys from properties file
		
		//Set<String> keys=pobj.stringPropertyNames();		//1st Approach to get set of keys from the config.properties file
		//System.out.println(keys);
		
		Set<Object> keys =pobj.keySet();	// 2nd approach to get set of keys config.properties file
		
		System.out.println(keys);
		
		// Reading all the values from properties file
		
		Collection<Object> values=pobj.values();
		
		System.out.println(values);   //This will print all values from config.properties file.
		file.close();
	}

}
