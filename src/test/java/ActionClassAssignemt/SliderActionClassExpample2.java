package ActionClassAssignemt;

import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderActionClassExpample2 {
	
	public static void main(String[] args) {
		
		
		startUp sb = new startUp();
		WebDriver driver = sb.startUp("ch", "https://demoqa.com/auto-complete");

	WebElement ele=	driver .findElement(By.cssSelector(".auto-complete__input >input[id=\"autoCompleteMultipleInput\"]"));
	
	 Actions act =new Actions(driver);
	 act.sendKeys(ele, "red").perform();
	 ele.sendKeys(Keys.ENTER);
	 
	 act.sendKeys(ele, "black").perform();
	 ele.sendKeys(Keys.ENTER);
	 
	 act.sendKeys(ele, "blue").perform();
	 ele.sendKeys(Keys.ENTER);
	 
	 act.sendKeys(ele, "purple").perform();
	 ele.sendKeys(Keys.ENTER);
	 
	
	 act.sendKeys(ele, "white").perform();
	 ele.sendKeys(Keys.ENTER);
	 
	/*List<WebElement> ele2= driver.findElements(By.className("auto-complete__menu-list auto-complete__menu-list--is-multi css-11unzgr"));
	
	for(int i=0;i<ele2.size();i++)
	{
		
		System.out.println(ele2.get(i).getText());
		
		
		
	}
	
		*/
		
		
	}

}
