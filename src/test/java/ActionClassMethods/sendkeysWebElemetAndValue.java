package ActionClassMethods;

import java.awt.Desktop.Action;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class sendkeysWebElemetAndValue {
	 public static void main(String[] args) {
		
		 
		 startUp sb=new startUp();
	    	WebDriver driver= sb.startUp("ch","https://demoqa.com/automation-practice-form");
	    	WebElement ele=driver.findElement(By.id("firstName"));
	    	
	    	Actions act =new Actions(driver);
        //   act.sendKeys(ele, "nikhil").perform();   way1
		   act.click(ele).sendKeys("nikhil patil").perform();  // way2
		
	 }
		  
}
