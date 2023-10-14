package org.BaseUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class startup4 {
	
	
	public WebDriver Startup(String bname, String url)
	{
		WebDriver driver=null;
		
		
		if(bname.equalsIgnoreCase("ch")||bname.equalsIgnoreCase("chrome"))
		{
			
		ChromeOptions option =new ChromeOptions();
		
		
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("start-maximized");
		 driver=new ChromeDriver(option);
			
		}
		
		if(bname.equalsIgnoreCase("ff")||bname.equalsIgnoreCase("firefox"))
		{
			
		 driver=new FirefoxDriver();
			
		}
		
		if(bname.equalsIgnoreCase("Ed")||bname.equalsIgnoreCase("Edge"))
		{
			
		 driver=new EdgeDriver();
			
		}
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver ;
		
		
	}
	

}
