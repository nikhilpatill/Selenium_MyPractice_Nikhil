package ActionClassMethods;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByActionClass {
	
	
	
	public static void main(String[] args) {
		
		
		 startUp sb=new startUp();
	    	WebDriver driver= sb.startUp("ch","https://demoqa.com/droppable");
	    	//sb.waitForPresenceOfByType(driver, 10, "id","#draggable");
	    	WebElement ele = driver.findElement(By.id("draggable"));
	     	WebElement src= driver.findElement(By.id("droppable"));
	    	Actions act=new Actions(driver);
	    	
	    	act.dragAndDropBy(ele, 100, 0).perform();
	    	//act.dragAndDropBy(ele, 200, 0).perform();
	    	
	    
	     	
	     	//generic method calling 
	    	//sb.dragandDropAtionClass(driver, ele, src);
	      
	    	// generic method calling 
	    	
	    	//sb.dragandDropCtionAClass(driver, ele, 100, 0);
	    	
	    	
		
		
		
	}

}
