package org.BaseUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

public class startup3 {
	
	public WebDriver startip(String bname ,String  url)
	{
		WebDriver driver =null;
		
		
		if(bname.equalsIgnoreCase("ch")||bname.equalsIgnoreCase("chrome"))
		{
			ChromeOptions option =new ChromeOptions();
			option.addArguments("--remote-allow-origin=*");
			option.addArguments("start-maximized");
			 driver =new ChromeDriver(option);
			
		}
	 else if(bname.equalsIgnoreCase("ff")||bname.equalsIgnoreCase("firefox"))
		{
		 
		      driver=new FirefoxDriver();
		      driver.manage().window().maximize();
			
		}
		
	 else if(bname.equalsIgnoreCase("ed")||bname.equalsIgnoreCase("edge"))
		{
		      driver=new EdgeDriver();
		      driver.manage().window().maximize();
		 
		}
		
	 else
	 {
		 System.out.println("browser does not found ");
	 }
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		return driver;
		
		
		
		
		
		
	}
	

}
