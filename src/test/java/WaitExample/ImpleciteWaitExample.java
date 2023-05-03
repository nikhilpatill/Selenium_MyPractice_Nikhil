package WaitExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpleciteWaitExample {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option =new 	ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		 
		 ChromeDriver driver = new  ChromeDriver (option);
		 
		 
		 driver.get("https://omayo.blogspot.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		WebElement btn= driver.findElement(By.xpath("//button[text()=\"Dropdown\"]"));
		 
		btn.click();
		 
		 
		
		
		
		
	}

}
