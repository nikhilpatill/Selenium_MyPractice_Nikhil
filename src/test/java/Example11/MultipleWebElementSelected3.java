package Example11;

import java.time.Duration;
import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWebElementSelected3 {

	public static void main(String[] args) {
		startUp sb = new startUp();
		WebDriver driver = sb.startUp("ch", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]"))
				.sendKeys("Samsung Galaxy ");
		// sb.waitForInVisibilityByType(driver, 10, "csslocator", "._2KpZ6l._2doB4");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();

		driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]"))
				.click();

		List<WebElement> name = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));

		for (int i = 0; i < name.size(); i++) {
			WebElement ele = name.get(i);
			System.out.println(ele.getText());
			String value = ele.getAttribute("class");

			if (value.contains("ge-49")) {
				System.out.println("selected tab=" + name.get(i).getText());
			} else {

				System.out.println("not selected tab=" + name.get(i).getText());
			}
		}

	}

}
