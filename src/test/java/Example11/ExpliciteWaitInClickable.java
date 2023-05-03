package Example11;

import org.BaseUtilityy.startUp;
import org.WaitUtilityy.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExpliciteWaitInClickable {

	
	public static void main(String[] args) {
		
		
		startUp bu=new startUp();
		WebDriver driver=bu.startUp("ch"," https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[contains(text(),'Check this')]")).click();
		 WaitGenericMethod  wt =new  WaitGenericMethod();
		wt.waitForClickableByType(driver, 5, "id", "dte");
		driver.findElement(By.id("dte")).click();
		
		
		
		
		
		
		
		
		
	}
	
	
}
