package ActionClassMethods;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToolTipElemets2 {
public static void main(String[] args) {
	
	startUp sb = new startUp();
	WebDriver driver = sb.startUp("ch", "https://demoqa.com/tool-tips");
	
	
	WebElement btn= driver.findElement(By.cssSelector("#toolTipButton"));
	
	Actions act =new Actions(driver);
	act.moveToElement(btn).perform();
	
	//div[@class='tooltip-inner']
	
    WebElement ele=	driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
	
	String name= ele.getText();
	System.out.println(name);
	
	
	WebElement textfild=driver.findElement(By.id("toolTipTextField"));
	
	Actions actt =new Actions(driver);
	actt.moveToElement(textfild).perform();
	
	  WebElement ele1=	driver.findElement(By.xpath("//div[@id='toopTipContainer']"));
		
	
	String name2= ele1.getText();
	System.out.println(name2);
}
}
