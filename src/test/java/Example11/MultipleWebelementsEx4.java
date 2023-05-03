package Example11;

import java.time.Duration;
import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleWebelementsEx4 {

	public static void main(String[] args) throws InterruptedException {

		startUp sb = new startUp();
		WebDriver driver = sb.startUp("ch", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("iphone");
		// sb.waitForInVisibilityByType(driver, 10, "csslocator", "._2KpZ6l._2doB4");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();

		driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]"))
				.click();

		List<WebElement> name = driver.findElements(By.xpath("//div[@class=\"_3pLy-c row\"]//div[@class=\"_4rR01T\"]"));
		List<WebElement> price = driver.findElements(By.cssSelector("[class=\"_30jeq3 _1_WHN1\"]"));
		List<WebElement> page = driver.findElements(By.cssSelector("[class=\"yFHi8N\"]>a"));
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		int p1 = page.size();
		System.out.println(p1);

		for (int j = 0; j <name.size(); j++) {

			// int siz=page.size();
			System.out.println(name.get(j).getText());
			System.out.println(price.get(j).getText());

			if (next.isDisplayed()) {
				for (int i = 0; i <driver.findElements(By.xpath("//div[@class=\"_3pLy-c row\"]//div[@class=\"_4rR01T\"]")).size(); i++) {
					next.click();
					Thread.sleep(2000);
					System.out.print(driver.findElements(By.xpath("//div[@class=\"_3pLy-c row\"]//div[@class=\"_4rR01T\"]")).get(i).getText() + "  =");
					System.out.println( driver.findElements(By.cssSelector("[class=\"_30jeq3 _1_WHN1\"]")).get(i).getText()+"");
					System.out.println();
				}
				
			}
		}

		/*
		 * for (int i = 0; i < name.size(); i++) {
		 * System.out.print(name.get(i).getText()+"  =");
		 * System.out.println(price.get(i).getText()); System.out.println();
		 * 
		 * if(next.isDisplayed()) {
		 * driver.findElement(By.xpath("//span[text()='Next']")).click(); } }
		 * 
		 * 
		 */

		/*
		 * while(driver.findElement(By.xpath("//span[text()='Next']")).isDisplayed()) {
		 * driver.findElement(By.xpath("//span[text()='Next']")).click(); for(int
		 * i=0;i<driver.findElements(By.
		 * xpath("//div[@class=\"_3pLy-c row\"]//div[@class=\"_4rR01T\"]")).size();i++)
		 * { System.out.println(driver.findElements(By.
		 * xpath("//div[@class=\"_3pLy-c row\"]//div[@class=\"_4rR01T\"]")).get(i).
		 * getText()+"  :  "); System.out.println(driver.findElements(By.
		 * cssSelector("[class=\"_30jeq3 _1_WHN1\"]")).get(i).getText()+"  :  ");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(); } }
		 */

		/*
		 * WebElement Scroll = driver.findElement(By.tagName("html"));
		 * //Scroll.sendKeys(Keys.PAGE_DOWN); sb.ScrollbBy(Scroll, 4);
		 * 
		 * 
		 * //WebElement next =driver.findElement(By.xpath("//span[text()='Next']")); for
		 * (int i = 0; i < page.size(); i++) {
		 * 
		 * //if(driver.findElement(By.xpath("//span[text()='Next']")).isDisplayed()) //
		 * {
		 * 
		 * 
		 * System.out.print(page.get(i).getText()+"  =");
		 * //System.out.print(name.get(i).getText()+"  =");
		 * //System.out.println(price.get(i).getText());
		 * 
		 * 
		 * 
		 * 
		 * //}
		 * 
		 * 
		 * driver.findElement(By.xpath("//span[text()='Next']")).click();
		 * 
		 * 
		 * }
		 * 
		 */

		// driver.findElement(By.xpath("//span[text()='Next']")).click();

		// List<WebElement> page
		// =driver.findElements(By.cssSelector("[class=\"yFHi8N\"]>a"));

		/*
		 * for (int i = 0; i < page.size(); i++) {
		 * 
		 * int siz=page.size(); String name1=page.get(i).getAttribute("class");
		 * sb.waitForClickableByType(driver, 15, "xpath", "//span[text()='Next']");
		 * driver.findElement(By.xpath("//span[text()='Next']")).click(); //
		 * if(name1.contains("ge-49M _2Kfbh8")) {
		 * //System.out.println("selected"+page.get(i).getText()); } else {
		 * //System.out.println("notselected"+page.get(i).getText()); }
		 * 
		 * 
		 * 
		 * }
		 * 
		 */
	}
}

// for(int i=0;i<top.size();i++)
// {

// System.out.println(top.get(i).getText());
