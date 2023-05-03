package TestNGExamples;



import static org.testng.Assert.assertEquals;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class TestNGEx1 {
  @Test
  public void varifyTitleWebPage() {
	  
	  SoftAssert act =new SoftAssert();
	  
	  startUp sb =new startUp();
	  
	  WebDriver driver=sb.startUp("ch", "https://www.google.com/");
	  
	  
	  String  Excpectd="Google";
	  
	  String actual=driver.getTitle();
	  
	  act.assertEquals(Excpectd, actual);
	   
	  act.assertAll();
	//assert.assertEquals(actual_title,Excpectd_titile);
  }
}
