package ActionClassMethods;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DoubeclickActionClick {

	
	public static void main(String[] args) {
		
		
		 startUp sb=new startUp();
	    	WebDriver driver= sb.startUp("ch","https://demoqa.com/books");
	    WebElement ele=	driver.findElement(By.xpath("//a[text()='Understanding ECMAScript 6']"));
	    
	    Actions act =new Actions(driver);
	    act.doubleClick(ele).perform();
		
		
	}
	
}
