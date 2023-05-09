package DropDownMenu;

import java.nio.channels.Selector;
import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultipleElementSelectInDDL {

	public static void main(String[] args) {

		startUp sb = new startUp();
		WebDriver driver = sb.startUp("ch", "https://demoqa.com/select-menu");

		WebElement tah = driver.findElement(By.tagName("html"));
		tah.sendKeys(Keys.PAGE_DOWN);

		driver.findElement(By.xpath("//p[b[text()='Multiselect drop down']]/following-sibling::div")).click();
        driver.findElement(By.xpath("//div[@id=\"react-select-4-option-0\"]")).click();
        
        
       
        
	}

}
