package ActionClassAssignemt;

import java.time.Duration;
import java.util.List;

import org.BaseUtilityy.startUp;
import org.WaitUtilityy.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassExpample1 {
	
	public static void main(String[] args) {
		
		
		startUp sb = new startUp();
   WebDriver driver = sb.startUp("ch", "https://demoqa.com/progress-bar");

	WebElement ele=	driver .findElement(By.xpath("//div[@role='progressbar']"));
	
	
	WebElement btn=	driver .findElement(By.id("startStopButton"));
	btn.click();
	
	//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));

   //wait.until(ExpectedConditions.attributeToBe(ele, "aria-valuenow", "100"));
	 WaitGenericMethod  wt=new  WaitGenericMethod ();
    wt.waitForattributeTobe(driver, ele, "aria-valuenow", "100");
     
    driver.findElement(By.id("resetButton")).click();
	
		
		
	
		
		
		
	}

}
