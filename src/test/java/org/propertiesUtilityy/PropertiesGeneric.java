package org.propertiesUtilityy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesGeneric {

	
	public String getPropertiesData(String key)
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\PropertyFile\\Config.properties");
			Properties pop =new Properties();
			pop.load(fis);
			String value=pop.getProperty(key);
            return value;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
	}
	
	
	
	public Properties getProperty()
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\PropertyFile\\Config.properties");
			Properties pop =new Properties();
			pop.load(fis);
			
            return pop;
		} catch (FileNotFoundException e) {
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
		}
		
		
		
	}
	
}
