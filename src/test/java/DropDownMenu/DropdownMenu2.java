package DropDownMenu;
import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenu2 {

	public static void main(String[] args) {

		startUp sb = new startUp();
	WebDriver driver = sb.startUp("ch", "https://demoqa.com/select-menu");
	
		driver.findElement(By.xpath("//div[text()='Select Option']")).click();

		driver.findElement(By.cssSelector("#withOptGroup  input")).sendKeys("Grup1,Option1");
	//	String text = driver.getPageSource();
	//  System.out.println(text);
	
		WebElement dom =driver.findElement(By.className("css-26l3qy-menu"));
		dom.click();
		
		
		


	}

}
