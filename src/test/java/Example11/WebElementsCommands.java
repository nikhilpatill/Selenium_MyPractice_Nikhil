package Example11;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebElementsCommands {

	
	public static void main(String[] args) {
		
		
		
		startUp sb=new startUp();
		WebDriver driver=sb.startUp("ch","http://localhost:93/login.do");
			
		WebElement name= driver.findElement(By.id("headerContainer"));
		
		
	 String txt=sb.Gettext(name);
	 System.out.println(txt);
	 String value=sb.GeTAttributePassByClass(name);
	 System.out.println(value);
	 String value2=sb.GeTAttributePassById(name);
	 System.out.println(value2);
	 
	  WebElement check= driver.findElement(By.id("keepLoggedInCheckBox"));
	 // check.click();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("argument[0].click()","check");
	  
	 
	 
	 
	  
	 
		
	}
	
	
	
}
