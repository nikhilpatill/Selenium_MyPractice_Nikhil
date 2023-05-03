package Example11;

import org.BaseUtilityy.startUp;
import org.WaitUtilityy.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExpliciteWaitVisibility {
	
	
	public static void main(String[] args) {
		
		

		startUp bu=new startUp();
		WebDriver driver=bu.startUp("ch"," https://omayo.blogspot.com/");
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Dropdown')]")).click();
		 WaitGenericMethod wt=new  WaitGenericMethod();
		wt.waitForVisibilityByType(driver, 10, "xpath", "//a[contains(text(),'Facebook')]");
		
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		
		
		
	}
	 

}
