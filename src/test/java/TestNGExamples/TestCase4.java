package TestNGExamples;

import org.BaseUtility.startUp;
import org.excelUtility.ExcelGenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestCase4 {
	
	@Test(priority=1)
	
	public void Login()
	{
		SoftAssert as=new SoftAssert ();

		startUp sb =new startUp();
		WebDriver driver = sb.startUp("ch", "https://tutorialsninja.com/demo/index.php?route=account/account");
		
		
		//a[text()="Qafox.com"]
		
		WebElement name =driver.findElement(By.xpath("//a[text()=\"Qafox.com\"]"));
		
		String value=name.getText();
		System.out.println(value);
		
		String Expected="Qafox.com";
		as.assertEquals(value, Expected, "check text are match or not ");
	    
		as.assertAll();
		
		
	}
	
	
	
	
	

}
