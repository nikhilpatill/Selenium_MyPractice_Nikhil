package DropDownMenu;

import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu_TestCase {

	public static void main(String[] args) {

		startUp sb = new startUp();
		// 1]open browser hit the burl ---
		WebDriver driver = sb.startUp("ch", "https://demoqa.com/select-menu");

		WebElement Scroll = driver.findElement(By.tagName("html"));
		Scroll.sendKeys(Keys.PAGE_DOWN);

		
		  //find out webelemet
         WebElement ele =driver.findElement(By.xpath("//div[text()=\"Select Option\"]"));
         ele.click();
         
         WebElement opt =driver.findElement(By.cssSelector("div[class=\" css-1s9izoc\"]"));
         
         List<WebElement>name=(List<WebElement>) driver.findElement(By.cssSelector("div[class=\" css-1s9izoc\"]"));
         
        
   
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
