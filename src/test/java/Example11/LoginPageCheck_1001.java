package Example11;

import java.awt.RenderingHints.Key;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.propertiesUtilityy.PropertiesGeneric;

// Tese case 
//  open url ("http://tutorialsninja.com/demo/index.php?route=account/login")
//  chacked Email;
//  password 
//  Login
// check titile


public class LoginPageCheck_1001 {
	
	public static void main(String[] args) throws InterruptedException {
		
		startUp sb=new startUp();
		PropertiesGeneric s=new PropertiesGeneric();
		WebDriver driver =sb.startUp("ch",s.getPropertiesData("url"));
		
	WebElement Email =driver.findElement(By.id("input-email"));
	//Email.sendKeys(Keys.ENTER);
	Email.sendKeys(s.getPropertiesData("emil"));
	Email.sendKeys(Keys.ENTER);
	//Email.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	
	
	WebElement password = driver.findElement(By.id("input-password"));
	//password.sendKeys(Keys.ENTER);
	password.sendKeys(s.getPropertiesData("password"));
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//password.clear();
	//Email.clear();	
	

		
	}

}
