package MultipleOptionsselect;

import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Example {
	public static void main(String[] args) {
		
		
		startUp sb = new startUp();
		WebDriver driver = sb.startUp("ch","https://demoqa.com/radio-button");
		
		driver.findElement(By.xpath("//div[@class=\"icon\"]")).click();
		List<WebElement> ele = driver.findElements(By.className("element-group"));
		
		for(int i=0;i<ele.size();i++)
		{
			WebElement opt = ele.get(i);
			String name=opt.getText();
			System.out.println(name);
			
			
			
			
			if(ele.get(i).getAttribute("class").contains("element-list collapse show"))
			{
				
				System.out.println("seleceted =>"+ele.get(i).getText());
			}
			else
			{
				System.out.println("not selcetd =>"+ele.get(i).getText());
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
