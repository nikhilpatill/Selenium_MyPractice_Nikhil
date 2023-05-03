package AssignmentOfClass;

import java.util.List;
import java.util.NoSuchElementException;

import org.ActionClassUtilityy.ActionClassGenericMethod;
import org.BaseUtilityy.startUp;
import org.WaitUtilityy.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipcartAssignmetMobileNameWithPrice2 {

	public static void main(String[] args) throws InterruptedException {

		startUp sb = new startUp();
		WebDriver driver = sb.startUp("ch", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]"))
				.sendKeys("samsung galaxy");
		// sb.waitForInVisibilityByType(driver, 10, "csslocator", "._2KpZ6l._2doB4");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();

		driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]"))
				.click();

		List<WebElement> name = driver.findElements(By.className("s1Q9rs"));
		List<WebElement> price = driver.findElements(By.className("_30jeq3"));
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

		System.out.println("name of phone" + name.size());
		System.out.println("prise of the phone" + price.size());

		for (int j = 0; j < name.size(); j++) {
			System.out.print(name.get(j).getText() + "= ");
			System.out.println(price.get(j).getText());

		}
		System.out.println("------------------------------------------------------------------------");


		while(!driver.findElements(By.xpath("//span[text()='Next']")).isEmpty()) {
			try
			{
				ActionClassGenericMethod act =new ActionClassGenericMethod();

			act.clickByUsingActionClass(driver, driver.findElement(By.xpath("//span[text()='Next']")));
			 WaitGenericMethod  wt=new  WaitGenericMethod ();
			wt.waitForPresenceOfByType(driver, 20, "xpath", "//span[text()='Next']");
			for (int i = 0; i < driver.findElements(By.className("s1Q9rs")).size(); i++) {

				System.out.print(driver.findElements(By.className("s1Q9rs")).get(i).getText() + "=");
				System.out.println(driver.findElements(By.className("_30jeq3")).get(i).getText());
			}

			System.out.println("-----------------------------------------------------------");

		}
		

catch(StaleElementReferenceException e)
{
	System.out.println(e);
	
}

		}	}
}
