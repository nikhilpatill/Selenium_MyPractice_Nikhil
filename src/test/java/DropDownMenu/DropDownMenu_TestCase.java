package DropDownMenu;

import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu_TestCase {

	public static void main(String[] args) {

		startUp sb = new startUp();
		// 1]open browser hit the burl ---
		WebDriver driver = sb.startUp("ch", "https://demoqa.com/select-menu");

		WebElement Scroll = driver.findElement(By.tagName("html"));
		Scroll.sendKeys(Keys.PAGE_DOWN);

		
		  //find out webelemet
         WebElement ele =driver.findElement(By.id("cars"));
     //create object of select  option
		Select option= new Select(ele);
		
	List<WebElement> multi= option.getAllSelectedOptions();
		  int no=multi.size();
		  System.out.println("size of selected option "+no);
		if(multi.isEmpty())
		{
			System.out.println("not selected ");
		}else
		{
			System.out.println("selected casrs ");
		}
		
		
		
		
		
		
		
	/*	List<WebElement> mul =option.getOptions();
	int size=	mul.size();
	System.out.println("size of the dropdown "+size);
		for(int i=0;i<mul.size();i++)
		{
			  System.out.println("size of selected option "+size);
			//WebElement ele1=mul.get(i);
			System.out.println(mul.get(i).getText());
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
