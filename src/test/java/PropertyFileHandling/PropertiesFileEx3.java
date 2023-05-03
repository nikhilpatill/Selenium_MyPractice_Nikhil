package PropertyFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileEx3 {
	
public static void main(String[] args) {
	
	 /*public String GetProprties(String kay)
		{
		 
			try {
				FileInputStream fis=new FileInputStream("C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\PropertyFile\\config2.properties");
				
				Properties pop =new  Properties();
				pop.load(fis);
				
				return pop.getProperty(kay);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
			
		}
		 */
		
		
  try {
	FileInputStream fis=new FileInputStream("C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\PropertyFile\\config2.properties");
	Properties pop=new Properties();
	pop.load(fis);
	
	
	String url=pop.getProperty("Url");
	System.out.println("show the url "+url);
	
	String FirstName= pop.getProperty("FirstName");
	System.out.println(FirstName);
	
	String E=pop.getProperty("E-Mail");
	System.out.println(E);
	
	String Telephone=pop.getProperty("Telephone");
	System.out.println(Telephone);
	
	
	
	

	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
  /*public String GetProprties(String kay)
	{
	 
		try {
			FileInputStream fis=new FileInputStream("C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\PropertyFile\\config2.properties");
			
			Properties pop =new  Properties();
			pop.load(fis);
			
			return pop.getProperty(kay);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	 */
		
		
		
		
		
		
		
		
		

	
}
}
