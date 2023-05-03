package ActionClassMethods;

import org.ActionClassUtilityy.ActionClassGenericMethod;
import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownByActionClass {

	
	public static void main(String[] args) {
		
		

		 startUp sb=new startUp();
	    	WebDriver driver= sb.startUp("ch","https://demoqa.com/books");
	    WebElement ele=	driver.findElement(By.xpath("//a[text()='Understanding ECMAScript 6']"));
	    	//Actions act=new Actions(driver);
	    	
	    	//act.scrollToElement(ele).perform();
	    	//act.scrollByAmount(100, 300).perform();
	    
	    // called by generic method 
		//sb.scrollByUsingActionClass(driver, ele);
		
		// called by generic method 
	    ActionClassGenericMethod act =new ActionClassGenericMethod();
	    act.scrollByXaxisUsingActionClass(driver, ele, 100, 400);
	}
	
	
}
