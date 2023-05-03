package ActionClassMethods;

import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.webdriver.WebDriverCreator;

public class ActionClassMultipleWebelemet {
	
	public void Actionclick(WebDriver driver, WebElement ele)
	{
		Actions sb=new Actions(driver);
		sb.click(ele).perform();
	}
	
	public void Actiondoubleclick(WebDriver driver, WebElement ele)
	{
		Actions sb =new Actions(driver);
		sb.doubleClick(ele).perform();
	}
	
	public void movetoelemet(WebDriver driver, WebElement ele)
	{
		Actions as=new Actions(driver);
		as.contextClick(ele).click(ele).perform();
	}
	
	
	public static void main(String[] args) {
		ActionClassMultipleWebelemet s=new ActionClassMultipleWebelemet();
		
		startUp sb = new startUp();
		WebDriver driver = sb.startUp("ch", "https://demoqa.com/checkbox");
		
	//WebElement ele=	driver.findElement(By.id("section2Heading"));
	//s.Actionclick(driver, ele);
	//Actions act =new Actions(driver);
//	act.click(ele).perform();
	
	WebElement checkbox =driver.findElement(By.xpath("//label[@for=\"tree-node-home\"]/span[1]/*"));
	
	s.Actionclick(driver, checkbox);

	List<WebElement> opt=driver.findElements(By.className("card"));
	
	for(int i=0;i<opt.size();i++)
	{
		
		
		
		if(opt.get(i).getAttribute("class").contains("collapse show"))
		{
			
			System.out.println("selected "+opt.get(i).getText());
			
		}else
		{
			System.out.println("not selected "+opt.get(i).getText());
		}
		
		
	}
		
		
		
		
		
		
		
		
		
	}

}
