package Windowhandle;

import java.util.Iterator;
import java.util.Set;
import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowHandaleProgram_2 {

	public static void main(String[] args) {

		startUp sb = new startUp();
   
		WebDriver driver = sb.startUp("ch", "https://omayo.blogspot.com/"); // open wirst window 

	//Q open 4 windows identify perticular window 
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();  // open second window 
		
         driver.findElement(By.xpath("//a[text()='SeleniumTutorial']")).click();    //third window 
         
        
         Set<String> windo = driver.getWindowHandles();
          Iterator<String> itr= windo.iterator();
        /*  String name= itr.next();   
          String name2=itr.next();
          String name3=itr.next();
          
          System.out.println(name);
          System.out.println(name2);
          System.out.println(name3);   */
          String title="Basic Web Page Title";
          while(itr.hasNext())
        	  
          {
        	  String win= itr.next();
        	  driver.switchTo().window(win);
        	  if(driver.getTitle().equals(title))
        	  {
        		String txt=	driver.findElement(By.id("para1")).getText();
        		System.out.println(txt);
        		  
        	  }
        
        	
        	driver.close();
        	
        	 
          }
          
          
          
     
          
          
          
          
          
         
          
         
     

		
		
	}

}
