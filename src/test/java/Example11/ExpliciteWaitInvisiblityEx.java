package Example11;

import org.BaseUtilityy.startUp;
import org.WaitUtilityy.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExpliciteWaitInvisiblityEx {
    
	public static void main(String[] args) {
		
		
		startUp bu=new startUp();
		WebDriver driver=bu.startUp("ch"," https://omayo.blogspot.com/");
		
		
		 WaitGenericMethod  wt=new  WaitGenericMethod ();
		wt.waitForInvisiblityWebElement(driver, 5, "xpath", "//div[@id='delayedText']");
		
	
		
		
		
		
		
		
		
		
	}

}
