package TestNGExamples;

import org.BaseUtilityy.startUp;
import org.WaitUtility.WaitGenericMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AtitimeLoginTeseCase1001 {
	
	private WebDriver driver=null;
	
	@BeforeMethod
	public void LoginMethod()
	{
		startUp sb = new startUp();
		WebDriver driver = sb.startUp("ch", "http://localhost:93/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		//driver.findElement(By.id("loginButton")).click();
		
		
		
	}
	

	@AfterMethod
	public void LogoutMethod()
	{
		
				//driver.findElement(By.cssSelector("#logoutLink>div")).click();
				driver.close();
	}
	
	
	@Test
	
	public void VrifyTheLoginURL()
	{
		
			String Ecpectdurl="http://localhost:93/login.do";
			String actualurl=driver.getCurrentUrl();
			
			Assert.assertEquals(actualurl, Ecpectdurl);
	 
			
	}

	
  @Test
	
	public void VrifyTheLoginTitle()
	{
	 
	
	String Expectd="actiTIME - Login";
	String  expected= driver.getTitle();
	
	Assert.assertEquals(Expectd, expected);
	
	
	}
  
  @Test
	
	public void VrifyTheLoginPage()
	{

	  System.out.println("varify the lofin page ");
	if(driver.findElement(By.id("username")).isDisplayed())
	{
		System.out.println("user name display");
	}
 else if(driver.findElement(By.xpath("//input[@class='textField pwdfield']")).isDisplayed())
	{
		System.out.println("password displayed");
	}
 else if(driver.findElement(By.id("keepLoggedInCheckBox")).isDisplayed())
 {
	 System.out.println("check box is display");
 }
 else if(driver.findElement(By.id("loginButton")).isDisplayed())
 {
	 System.out.println("check box is display");
 }
 else
 {
	 
 }
	
	
	  
	}
  
  @Test
	
	public void VrifyTheLoginFunctionality()
	{
	  
		
		driver.findElement(By.id("username")).isDisplayed();
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).isDisplayed();
		driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		driver.findElement(By.id("loginButton")).isDisplayed();
		
		
		
	}
  
  @Test
	
	public void VrifyTheLoginURL1()
	{
	
		
		WaitGenericMethod wt1 =new WaitGenericMethod();
		wt1.waitForUrlContains(driver, 10, "login.do");
		String Ecpectdurl="http://localhost:93/login.do";
		String actualurl=driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl, Ecpectdurl);
		System.out.println();
 
		//driver.close();
	  
	}
}
