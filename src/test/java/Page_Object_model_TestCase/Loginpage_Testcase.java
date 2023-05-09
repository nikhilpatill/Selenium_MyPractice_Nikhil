package Page_Object_model_TestCase;

import org.BaseUtility.startUp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page_Object_Model_Pages.TetorilNinja_Login_Page;

public class Loginpage_Testcase {
	
	
	private TetorilNinja_Login_Page  lp;
	private WebDriver driver;
	private startUp sb;
	private SoftAssert ac;
	@BeforeMethod
	public void BrowserInit()
	{
	
		sb=new startUp();
		driver=sb.startUp("ch", "http://tutorialsninja.com/demo/index.php?route=product/category&path=57");
		
		
		
		
	}
	
	@AfterMethod
	public void BrowserClose()
	{
		driver.close();
	}
	
	@Test(enabled = false)
	public void varify_login_page()
	{
		  lp=new TetorilNinja_Login_Page (driver);	
	  	ac=new SoftAssert();
		
	  	ac.assertEquals(lp.DashBoad_page_numberofSubtab(), 5);
	  	System.out.println(lp.DashBoad_page_numberofSubtab());
	  	ac.assertAll();
		
		
		
	}
	

	@Test
	public void varify_login_SubTabname()
	{
		  lp=new TetorilNinja_Login_Page (driver);	
	  	ac=new SoftAssert();
	  	System.out.println(lp.DashBoad_page_NameofSubTab());
	  ac.assertEquals(lp.DashBoad_page_NameofSubTab(), "nikhil");
		
		
	}

}
