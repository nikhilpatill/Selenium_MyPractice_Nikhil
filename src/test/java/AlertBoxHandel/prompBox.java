package AlertBoxHandel;

import org.BaseUtilityy.startUp;
import org.WaitUtilityy.WaitGenericMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class prompBox {

	public static void main(String[] args) {
		
		startUp sb=new startUp();
    	WebDriver driver= sb.startUp("ch","https://demoqa.com/alerts");
    	
    	driver.findElement(By.id("timerAlertButton")).click();
    	 WaitGenericMethod  wt=new  WaitGenericMethod ();
    	wt.isAlertpresent(driver, 10);
    	Alert alt=driver.switchTo().alert();
        String name= alt.getText();
        System.out.println(name);
    	alt.accept();
    	//alt.dismiss();
    	
    	
    	
    	
    	
	}
	
}
