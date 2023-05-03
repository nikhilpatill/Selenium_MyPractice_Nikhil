package FileUploadDownloads;

import java.io.IOException;

import org.ActionClassUtilityy.ActionClassGenericMethod;
import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadExaple2 {
	 
	  public static void main(String[] args) {
		
			
	    	startUp sb=new startUp();
	    	WebDriver driver= sb.startUp("ch","https://demoqa.com/automation-practice-form");
	    	
	    	WebElement ele=driver.findElement(By.cssSelector("#uploadPicture"));
		  
		     sb.Scrollbyjs(ele, driver);
		 
		 String filepath = System.getProperty("user.dir");
		 ActionClassGenericMethod act =new ActionClassGenericMethod();
		 act.clickByUsingActionClass(driver, ele);
		//ele.sendKeys(filepath+"\\src\\test\\resources\\org\\FilesUploads\\SimpleTextFile");
		 ele.sendKeys(filepath+"\\ImageFolder\\day2.png");
		//ele.click();
	
	  }
}
