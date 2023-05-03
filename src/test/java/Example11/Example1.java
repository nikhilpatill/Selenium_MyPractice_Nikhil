package Example11;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Example1 {
	
	public static void main(String[] args) {
		
		startUp sb=new startUp();
		WebDriver driver=sb.startUp("ch","https://demo.guru99.com/test/web-table-element.php");
		
	  WebElement name = driver.findElement(By.xpath(" //table[@class=\"dataTable\"]//tr[3]/td[2] "));
	  
	   String text= name.getText();
	   System.out.println("text of table row "+text);
	  
	   WebElement name2 = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr[3]"));
	   String text2= name2.getText();
	   System.out.println("text of table row "+text2); 
	   
	   System.out.println("nikhil");

	 //table[@class=\"dataTable\"]//tr[3]/td[2] 
	
	  
	
		
	
		
		
		
		
		

		
	}

}
