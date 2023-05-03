package DropDownMenu;

import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenu1 {

	public static void main(String[] args) {

		startUp sb = new startUp();
	WebDriver driver = sb.startUp("ch", "https://www.flipkart.com");
	
		
	 driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
	    
	Actions ac = new Actions(driver);
    WebElement ele = driver.findElement(By.xpath("//div[@class=\"xtXmba\"][text()='Electronics']"));
	ac.moveToElement(ele).build().perform();

    driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe']")).click();
	
	
	
	}

}
