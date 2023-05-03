package PropertyFileHandling;



import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.propertiesUtilityy.PropertiesGeneric;

public class RegisterPageDetail {
	/*RegisterUrl=https://tutorialsninja.com/demo/index.php?route=account/register
	        FirstName=nikhil
			LastName=patil
			E-Mail="nikhilpatil1030@gmail.com
			Telephone=77985625656
			Passwordd=nikhil@123
			PasswordConfirm=nikhil@123
			

	*/
	public static void main(String[] args) {
		
		startUp sb=new startUp();
		PropertiesGeneric s=new PropertiesGeneric();
		WebDriver driver =sb.startUp("ch",s.getPropertiesData("RegisterUrl"));
	
		//firstname 
	driver.findElement(By.id("input-firstname")).sendKeys(s.getPropertiesData("FirstName"));
	    //lastname
	driver.findElement(By.id("input-lastname")).sendKeys(s.getPropertiesData("LastName"));
	
	// Email 
	driver.findElement(By.id("input-email")).sendKeys(s.getPropertiesData("E-Mail"));
	
	// telephone number 
	driver.findElement(By.id("input-telephone")).sendKeys(s.getPropertiesData("Telephone"));
	
	//password 
	driver.findElement(By.id("input-password")).sendKeys(s.getPropertiesData("Passwordd"));
	
	//comform passord
	driver.findElement(By.id("input-confirm")).sendKeys(s.getPropertiesData("PasswordConfirm"));
	
	//driver.findElement(By.xpath("//div[@class=\"radio\"]//input")).click();
	
	driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
	
	// click rgister button
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
