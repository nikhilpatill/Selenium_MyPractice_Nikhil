package Example11;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ActivewebElements {
	
	public static void main(String[] args) {
		
		
		startUp sb=new startUp();
		WebDriver driver =sb.startUp("ch","https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("Samsung Galaxy ");
		 //sb.waitForInVisibilityByType(driver, 10, "csslocator", "._2KpZ6l._2doB4");
	    driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
	    
	
		
		
		
	}

}
