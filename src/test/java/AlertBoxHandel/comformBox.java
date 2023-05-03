package AlertBoxHandel;

import org.BaseUtilityy.startUp;
import org.WaitUtilityy.WaitGenericMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class comformBox {

	public static void main(String[] args) {
		
		startUp sb=new startUp();
    	WebDriver driver= sb.startUp("ch","https://demoqa.com/alerts");
   
    	//sb.waitForClickableByType(driver, 10, "id", "promtButton");
    	WebElement Scroll =driver.findElement(By.id("confirmButton"));
		Scroll.sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.id("confirmButton")).click();	
		 WaitGenericMethod  wt=new  WaitGenericMethod ();
    	wt.isAlertpresent(driver, 10);
    	Alert alt=driver.switchTo().alert();
    	
        String name= alt.getText();
        System.out.println(name);
      alt.dismiss();
    	
    	
    	
    	
    	
	}
	
}
