package FileUploadDownloads;

import java.io.IOException;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadExaple1 {
	 
	  public static void main(String[] args) {
		
			
	    	startUp sb=new startUp();
	    	WebDriver driver= sb.startUp("ch","https://omayo.blogspot.com");
	    	
	    	WebElement ele=driver.findElement(By.cssSelector("#uploadfile"));
		  
		     sb.Scrollbyjs(ele, driver);
		  //shows current project 
		     String filepath= System.getProperty("user.dir");
		     //courrent ptoject + file path
		     ele.sendKeys(filepath+"\\ImageFolder\\day2.png");
		     
		     
		     
		     
		     
		     
		     
		     
		     
		
	  }
}
