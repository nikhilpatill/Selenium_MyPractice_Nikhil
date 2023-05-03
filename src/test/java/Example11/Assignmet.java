package Example11;

import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignmet {
	public static void main(String[] args) {
		
		
		
		System.out.println("push the code on gihub");
		startUp sb=new startUp();
		WebDriver driver =sb.startUp("ch","https://www.flipkart.com/");
		
		
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung galaxy");
		 driver.findElement(By.className("L0Z3Pu")).click();
		 
		 
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 List<WebElement> mobilp = driver.findElements(By.className("slQ9rs"));
		 List<WebElement> cost = driver.findElements(By.className("_30jeq3"));
		 System.out.println("Total mobile phones"+mobilp.size());
		 System.out.println("Total Price "+(cost.size()-5));
		
		 for(int i =0;i<mobilp.size();i++){
			System.out.println(mobilp.get(i).getText()+"  :  ");
		 	System.out.println(cost.get(i).getText());
		 	System.out.println();
		 }
		 
		 while(driver.findElement(By.xpath("//span[text()='Next']")).isDisplayed()) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			for(int i=0;i<driver.findElements(By.className("slQ9rs")).size();i++) {
				System.out.println(driver.findElements(By.className("slQ9rs")).get(i).getText()+"  :  ");
				System.out.println(driver.findElements(By.className("_30jeq3")).get(i).getText());
				System.out.println();
			}
		 }
		 System.out.println();
		
	}

		
		
		
		
		
		
		
	}
		
		
		
	

	
	