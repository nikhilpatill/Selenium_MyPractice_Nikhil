package ActionClassMethods;



import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveToElemetsByActionclass {
	
	public static void main(String[] args) {
		
		
		
		startUp sb=new startUp();
		WebDriver driver =sb.startUp("ch", "https://www.flipkart.com");
		
		
		WebElement ele= driver.findElement(By.xpath("//div[text()='Fashion']"));
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
           
		
	Actions act=new Actions(driver);
	//move to  elemets use to hover the elemets 
	act.moveToElement(ele).perform();
		
		
	// generic method 
	//sb.MoveToCtionClass(driver,driver.findElement(By.xpath("//div[text()='Fashion']")));
		
		
		
		
		
		
		
		
		
		
		
	}

}
