package PropertyFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hwpf.usermodel.CharacterProperties;
import org.propertiesUtilityy.PropertiesGeneric;




public class PropertyFileEx1 {
	
	
	
	public static void main(String[] args) {
		 //                         packagename            classname
		// calling generic method   org.propertiesUtility.PropertiesGeneric;
		  
//	PropertiesGeneric s=new PropertiesGeneric();
	//	String name1=s.getPropertiesData("B_name");
	//  Properties pop=s.getProperty();
	//	System.out.println(name1);
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\PropertyFile\\Config.properties");
			Properties pop =new Properties();
			pop.load(fis);
			
			String name=pop.getProperty("B_name");
			System.out.println(" name:"+ name);
			String url_name=pop.getProperty("url");
			System.out.println(" url_name:"+ url_name);
			String user_name=pop.getProperty("user_name");
			System.out.println("user_name:"+user_name);
			String pass=pop.getProperty("password");
			System.out.println("pass:"+pass);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	
		
		
		
		
		
	}
	

}
