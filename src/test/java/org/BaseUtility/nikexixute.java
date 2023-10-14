package org.BaseUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class nikexixute {
	
	WebDriver driver;
	  public void contextClick(WebElement ele)
	    {
		  Actions ac=new Actions(driver);
		  ac.click(ele).perform();
	    	
	    	
	    }
		
	
	public static void main(String[] args) {
		
		startup4 sb=new startup4();
		
		WebDriver driver=sb.Startup("ch", "https://demoqa.com/progress-bar");
		
		//Actions ac=new Actions(driver);
		
		WebElement btn=	driver .findElement(By.id("startStopButton"));
	
		nikexixute s=new nikexixute();
		s.contextClick(btn);
	  
		
	}
	


}
