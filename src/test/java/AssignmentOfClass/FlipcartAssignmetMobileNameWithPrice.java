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

public class FlipcartAssignmetMobileNameWithPrice {

	public static void main(String[] args) throws InterruptedException {
		// generic class for calling wait genaric method 
		 WaitGenericMethod  wt=new  WaitGenericMethod ();
		startUp sb = new startUp();
		WebDriver driver = sb.startUp("ch", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("infinix mobile");
		// sb.waitForInVisibilityByType(driver, 10, "csslocator", "._2KpZ6l._2doB4");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();

		driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]"))
				.click();

		List<WebElement> name = driver.findElements(By.cssSelector("._4rR01T"));
		List<WebElement> price = driver.findElements(By.cssSelector("[class=\"_30jeq3 _1_WHN1\"]"));
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

		System.out.println("name of phone" + name.size());
		System.out.println("prise of the phone" + price.size());

		for (int j = 0; j < name.size(); j++) {
			System.out.print(name.get(j).getText() + "= ");
			System.out.println(price.get(j).getText());

		}
		System.out.println("------------------------------------------------------------------------");

		while(!driver.findElements(By.xpath("//span[text()='Next']")).isEmpty()) {

			// sb.scrollByUsingActionClass(driver,driver.findElement(By.xpath("//span[text()='Next']")));
			// sb.waitForClickableByType(driver, 15, "xpath","//span[text()='Next']");
			// driver.findElement(By.xpath("//span[text()='Next']")).click();
			// sb.waitForPresenceOfByType(driver, 20, "xpath", "//span[text()='Next']");
			// Thread.sleep(5000);
			wt.waitForPresenceOfByType(driver, 20, "xpath", "//span[text()='Next']");
			try {

				ActionClassGenericMethod act =new ActionClassGenericMethod();
				act.clickByUsingActionClass(driver, driver.findElement(By.xpath("//span[text()='Next']")));
				for (int i = 0; i < driver.findElements(By.cssSelector("._4rR01T")).size(); i++) {

					System.out.print(driver.findElements(By.cssSelector("._4rR01T")).get(i).getText() + "=");
					System.out.println(
							driver.findElements(By.cssSelector("[class=\"_30jeq3 _1_WHN1\"]")).get(i).getText());
				}

				System.out.println("-----------------------------------------------------------");

			} catch (StaleElementReferenceException e) {

				

			}
			catch(NoSuchElementException e)
			{
				
			}

		}

	}
}
