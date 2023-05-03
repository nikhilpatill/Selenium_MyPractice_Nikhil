package Example11;

import java.time.Duration;

import org.BaseUtilityy.startUp;
import org.WaitUtilityy.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitForVisbility2 {
	
	
	public static <WebdriverWait> void main(String[] args) {

		
		startUp sb=new startUp();
		// lunch the browser
		WebDriver driver =sb.startUp("ch","https://www.flipkart.com/");
		//hit the usrl
	//	driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("Sa");
		 driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		
	    driver.findElement(By.xpath("//a[@href=\"https://seller.flipkart.com/sell-online/?utm_source=fkwebsite&utm_medium=websitedirect\"]")).click();
	    WaitGenericMethod  wt=new  WaitGenericMethod ();
	    wt.waitForClickableByType(driver, 10, "xpath", "//input[@name='registrationNumber']");
	   
	   driver.findElement(By.xpath("//input[@name='registrationNumber'] ")).sendKeys("7798260576");
		
    
	   
	  
	}

}
