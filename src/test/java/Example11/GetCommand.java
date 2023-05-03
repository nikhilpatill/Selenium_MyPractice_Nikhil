package Example11;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetCommand {
	
	public static void main(String[] args) {
		
		
		startUp sb=new startUp();
		WebDriver driver =sb.startUp("ch","https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("Samsung Galaxy ");
		 //sb.waitForInVisibilityByType(driver, 10, "csslocator", "._2KpZ6l._2doB4");
	    driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
	    
	    
	    driver.navigate().refresh();
	   
	        try
	        {
	        	
	        	driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")).click();
	        	
	        }catch(Exception e)
	       {
	        	System.out.println(e);
	        }
	        finally
	       {
	        	driver.navigate().to("https://www.flipkart.com/search?q=Samsung%20Galaxy%20&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	        	WebElement totalRds = driver.findElement(By.cssSelector("span[class='_10Ermr']"));
	    		String totalRecords = totalRds.getText();
	    		System.out.println(totalRecords);
	    		String substr = totalRecords.substring(18, 21);
	    		//String[] a =totalRecords.split("of");
	    		//String[] b =a[1].split(" ");
	    	System.out.println(substr);
	    		//System.out.println("total records of samsung galaxy =" + b[0]);
	        	
	        }
			
		
		
		
		//div[input[@title="Search for products, brands and more"]]/following-sibling::button[1]
        
        
        
		
	}

	}

