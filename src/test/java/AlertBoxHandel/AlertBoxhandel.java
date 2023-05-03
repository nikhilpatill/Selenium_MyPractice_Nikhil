package AlertBoxHandel;

import java.time.Duration;

import org.BaseUtilityy.startUp;
import org.WaitUtilityy.WaitGenericMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertBoxhandel {

    public static void main(String[] args) {
		
    	
    	startUp sb=new startUp();
    	WebDriver driver= sb.startUp("ch","https://demoqa.com/alerts");
    	
    	
    	driver.findElement(By.id("alertButton")).click();
    	 WebDriverWait wait=new 	WebDriverWait (driver,Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.alertIsPresent());
    	// WaitGenericMethod  wt=new  WaitGenericMethod ();
        	 WaitGenericMethod  wt=new  WaitGenericMethod (); 	    
        	wt.isAlertpresent(driver, 10);
    	  Alert alt=  driver.switchTo().alert();  
    	   String name=alt.getText();
    	   System.out.println(name);
    	   alt.accept();
    	   
    	   
    	   
    	   
    	
    	
 
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

	private static Alert AlertBoxhandel() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
