package FramExamples;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FremExaple1 {
	
	
public static void main(String[] args) {
	
	
	

	startUp sb=new startUp();
	WebDriver driver= sb.startUp("ch","https://demoqa.com/frames");
	WebElement ele=driver.findElement(By.id("frame1"));
	
	driver.switchTo().frame(ele);
	WebElement name22=driver.findElement(By.id("sampleHeading"));
	String name23=name22.getText();
	System.out.println(name23);
	
	driver.switchTo().defaultContent();
	
	
	
	
	 driver.switchTo().frame(2);
	 //way 3 by name or id 
	WebElement name2=driver.findElement(By.id("sampleHeading"));
	String name21=name2.getText();
	
	System.out.println(name21);
			
	

	
	
	
}

}
