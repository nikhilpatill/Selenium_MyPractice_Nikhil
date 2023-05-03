package Example11;

import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleWebElements2 {

	public static void main(String[] args) {
		startUp sc = new startUp();
		WebDriver driver = sc.startUp("ch", "http://tutorialsninja.com/demo/index.php?route=product/category&path=57");

		WebElement dekh = driver.findElement(By.xpath("//a[text()=\"Desktops\"]"));

		System.out.println(dekh.getText());
		dekh.click();

		driver.findElement(By.xpath("//a[text()='PC (0)']")).click();

		List<WebElement> name = driver.findElements(By.xpath("//li[@class='dropdown']/a"));
		// dekstop click

		for (int i = 1; i < name.size(); i++) {

			if (name.get(i).getAttribute("class").contains("open")) {
				System.out.println("selected tab=" + name.get(i).getText());
			} else {

				System.out.println("not selected tab=" + name.get(i).getText());
			}

		}
	}

}
