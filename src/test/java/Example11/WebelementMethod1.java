package Example11;

import java.util.List;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebelementMethod1 {
	
	public static void main(String[] args) {
		
	startUp sb=new startUp();
	WebDriver driver=sb.startUp("ch","http://localhost:93/login.do");
		
	WebElement name= driver.findElement(By.id("headerContainer"));
	
	
     sb.Gettext(name);
	// check the url 
	
	String actual="http://localhost:93/login.do";
	String expected =driver.getCurrentUrl();
	
	if(actual.equalsIgnoreCase("http://localhost:93/login.do"))
	{
		System.out.println("this is the match url ");
	}
	else																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
	{
		System.out.println("this is not actual url match ");
	}
	
	// send key use  the 
	
	  
	WebElement name1=driver.findElement(By.id("username"));
	name1.sendKeys("admin");
	WebElement password=driver.findElement(By.name("pwd"));
	password.sendKeys("manager");
	
	boolean show1=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
	System.out.println(show1);
	driver.findElement(By.id("keepLoggedInCheckBox")).click();
	System.out.println(show1);
	// when submit the form that time we use submit method
	driver.findElement(By.id("loginButton")).click();
	

	
	// getattribute method use to show the attribute value 
	
	  //  String name3=  driver.findElement(By.id("headerContainer")).getAttribute("class");
	    //System.out.println(name3);
	   
	// get title();
	    
	    String actual1_title="actiTIME -  Enter Time-Track";
	   if(actual1_title.equals(actual1_title))
	   {
		   
		System.out.println("this is same title");
	   }else
	   {
		   System.out.println("does not match title ");
	   }
	    
	   // close driver ();
	   
	   
	   
	   driver.close();
	   
	   //Queite driver ();
	   driver.quit();
	   
	 
		
	    
	
	
	
	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
	
	
	

	 //table[@class=\"dataTable\"]//tr[3]/td[2] 
	
	  
	
		
	
		
		
		
		
		

		
	}

}
