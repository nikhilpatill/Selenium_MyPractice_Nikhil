package FileUploadDownloads;

import java.io.IOException;

import org.ActionClassUtilityy.ActionClassGenericMethod;
import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileDownloadExaple3 {
	 
	  public static void main(String[] args) {
		
			
	    	startUp sb=new startUp();
	    	WebDriver driver= sb.startUp("ch","https://demo.automationtesting.in/FileDownload.html");
	    	
	    	WebElement ele=driver.findElement(By.cssSelector("textarea[id='textbox']"));
		    ele.sendKeys("hii i am nikhil patil");
			WebElement btn=driver.findElement(By.cssSelector("button[id='createTxt']"));
		    btn.click();
		  
		    WebElement link=driver.findElement(By.cssSelector("a[id='link-to-download']"));
		    ActionClassGenericMethod act =new ActionClassGenericMethod();
		   act.clickByUsingActionClass(driver,link);
		   
		    
		
		     
		     
		     
		     
		     
		     
		     
		
	  }
}
