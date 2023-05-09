package Page_Object_Model_Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TetorilNinja_Login_Page {
	
	//Webelemet
	WebDriver driver=null;
	
	
	@FindBy(xpath="//li[@class='dropdown']/a")
	private List<WebElement> txt;
	
	

	
	
	
	
	
	//contructor 
	
	public TetorilNinja_Login_Page(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	//action method
	
	public int DashBoad_page_numberofSubtab()
	{
		
		return txt.size();
	
		
	}
	
	public List<String> DashBoad_page_NameofSubTab()
	{
		List<String> stringArray = new ArrayList<>();
	    for (int i=0;i<txt.size();i++){
	        String str= txt.get(i).getText();
	        stringArray.add(str);
	    }
	    return stringArray;
		
	
	
		
	}
	
}
