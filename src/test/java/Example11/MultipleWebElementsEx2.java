package Example11;

import java.util.List;

import org.BaseUtilityy.startUp;
import org.WaitUtilityy.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleWebElementsEx2 {

	public static void main(String[] args) {

		startUp sb = new startUp();

		// open the url show flipcart site
		WebDriver driver = sb.startUp("ch", "https://www.flipkart.com/");
		// serch button type iphone
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("iphone");
		// close the poup
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		// click the serch button
		driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]"))
				.click();

		// click the pagination 2 show second page all mobiles
		WebElement teo=driver.findElement(By.xpath("//a[text()='2']"));

		List<WebElement> name = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));

		for (int i = 0;i<name.size() ; i++) {
			
           
			System.out.println(name.get(i).getText());
			
		}
		
		System.out.println("--------------------------------------------------");
			if(teo.isDisplayed())
				
			{
				 WaitGenericMethod wt=new  WaitGenericMethod();
				wt.waitForPresenceOfByType(driver, 15, "xpath", "//a[text()='2']");
				driver.findElement(By.xpath("//a[text()='2']")).click();
			
				for (int i1 = 0;i1<driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]")).size() ; i1++) {
					
					System.out.println(driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]")).get(i1).getText());	
					
				}
				
				
				
			}
			
			

		
	}

}
