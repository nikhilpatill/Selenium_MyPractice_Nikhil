package MultipleOptionsselect;

import java.util.List;

import org.ActionClassUtilityy.ActionClassGenericMethod;
import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Example1 {
	
	
	public static void main(String[] args) {
		
		
		startUp bu = new startUp();
		WebDriver driver = bu.startUp("ch",
				"https://www.flipkart.com/infinix-30i-coming-soon-fd63-98ad-store?param=2765&otracker=hp_bannerads_1_2.bannerAdCard.BANNERADS_Cat_Mob_HPW_Infinix%2BHot%2B30i_Today_R45DTAJTENMR");

		ActionClassGenericMethod act=new ActionClassGenericMethod();
		act.MoveToCtionClass(driver, driver.findElement(By.xpath("//span[text()='Electronics']")));
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		List<WebElement> name = driver.findElements(By.xpath("//span[@class=\"_2I9KP_\"]"));

		for (int i = 0; i < name.size(); i++) {

			WebElement ele = name.get(i);
			System.out.println(ele.getText());
			String value = ele.getAttribute("class");
			if (value.contains("_2I9KP_ _2WDRax")) {
				System.out.println("selected tab=" + name.get(i).getText());
			} else {

				System.out.println("not selected tab=" + name.get(i).getText());
			}
		}
		// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#logoutLink"))));

	}
		
		
		
		
		
	}


