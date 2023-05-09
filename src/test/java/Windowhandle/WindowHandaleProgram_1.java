package Windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.BaseUtilityy.startUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowHandaleProgram_1 {
	
	
	public static void main(String[] args) {
	

		startUp sb = new startUp();

		WebDriver driver = sb.startUp("ch", "https://demoqa.com/browser-windows");

	/*String PId1 = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		String PId2 = driver.getWindowHandle();
		System.out.println(PId1);
		System.out.println(PId2);
		if (PId1.equals(PId2)) {
			System.out.println("this is the same ");
		}*/
    
		
	
		driver.findElement(By.id("tabButton")).click();
		Set<String> win1 = driver.getWindowHandles();
		
		System.out.println("first window"+win1);
	    
		Iterator<String> itr= win1.iterator();
		String parentwin = itr.next();
		String childwindow = itr.next();
		System.out.println(childwindow);
		System.out.println(parentwin);
		
		driver.switchTo().window(childwindow);
		String name=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(name);
			
		

		 
		//while (iterator.hasNext()) {
			//String n = iterator.next();
			
		
		
		
		//	System.out.println(n);

		//}
	}

}
