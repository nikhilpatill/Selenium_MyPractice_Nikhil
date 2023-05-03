package Example11;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImpliciteXpathExanple {
	
	public static void main(String[] args) {
		
		
		startUp sb=new startUp();
		WebDriver driver=sb.startUp("ch","http://localhost:93/login.do");
		
		driver.findElement(By.id("username")).sendKeys("Nikhil");
		driver.findElement(By.xpath("//input[@type=\"password\"] [@name=\"pwd\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@value=\"on\"] ")).click();
	    
		
		driver.findElement(By.cssSelector("#loginButton")).click();
		
		driver.findElement(By.cssSelector("#logoutLink")).click();
		
		
	 
	//
		
	}

}
