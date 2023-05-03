package Example11;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class conditionalCommand {

	public static void main(String[] args) {

		startUp sb = new startUp();
		WebDriver driver = sb.startUp("ch", "https://omayo.blogspot.com/");
	

		// Isdisplay() , IsEnable(), IsSelected()

		WebElement name = driver.findElement(By.xpath("//input[@value=\"Bike\"]"));
		name.click();
		boolean is = name.isSelected();
		System.out.println(is);

		WebElement name2 = driver.findElement(By.xpath("//input[@value=\"Bicycle\"]"));
		name.click();
		boolean iss = name.isSelected();
		System.out.println(iss);

	}

}
