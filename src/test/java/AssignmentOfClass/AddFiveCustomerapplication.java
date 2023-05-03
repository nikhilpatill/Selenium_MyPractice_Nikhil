package AssignmentOfClass;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;
import java.time.Duration;

import org.ActionClassUtility.ActionClassGenericMethod;
import org.BaseUtility.startUp;
import org.WaitUtility.WaitGenericMethod;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.propertiesUtility.PropertiesGeneric;
import org.testng.Assert;

public class AddFiveCustomerapplication {

	public static void main(String[] args) {

		startUp  sb = new startUp();
		// PropertiesGeneric pop=new PropertiesGeneric();
		WebDriver driver = sb.startUp("ch", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		WaitGenericMethod wait = new WaitGenericMethod();
		wait.waitForClickableByType(driver, 15, "css", "a[@class=\"oxd-main-menu-item active\"]");

		ActionClassGenericMethod act = new ActionClassGenericMethod();
		WebElement serch = driver
				.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"][@placeholder=\"Search\"]"));

		act.sendKeysByUsingvalue(driver, serch, "PIM");
		wait.waitForClickableByType(driver, 15, "xpath", "//span[text()='PIM']");

		WebElement name = driver.findElement(By.xpath("//span[text()='PIM']"));
		act.clickByUsingActionClass(driver, name);

		WebElement Configuration = driver.findElement(By.cssSelector("i[class=\"oxd-icon bi-chevron-down\"]"));
		act.clickByUsingActionClass(driver, Configuration);

		WebElement CustomData = driver.findElement(By.xpath("//ul[@class=\"oxd-dropdown-menu\"]/li[4]/a"));
		act.clickByUsingActionClass(driver, CustomData);

		FileInputStream fis;
		try {
			fis = new FileInputStream(
					"C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase22.xlsx");
			Workbook wb = WorkbookFactory.create(fis);

			Sheet s = wb.getSheet("User");
			int numberOfRow = s.getLastRowNum();
			int numberOfCell = s.getRow(0).getLastCellNum();

			System.out.println(numberOfRow + numberOfCell);

			WebElement add = driver.findElement(
					By.cssSelector("button[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]"));
			act.clickByUsingActionClass(driver, add);

			for (int k = 1; k <= numberOfRow; k++) {

				ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver driver) {
						return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
								.equals("complete");
					}
				};
				try {
					Thread.sleep(1000);
					WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
					wait1.until(expectation);
				} catch (Throwable error) {
					Assert.fail("Timeout waiting for Page Load Request to complete.");
				}

				Row celldata = s.getRow(k);
				String name1 = celldata.getCell(0).getStringCellValue();
				WebElement value = driver
						.findElement(By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/div[2]"));
				act.sendKeysByUsingvalue(driver, value, name1);

				WebElement submit = driver.findElement(By.xpath(
						"//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]"));
				act.clickByUsingActionClass(driver, submit);
				  
			//	WebElement na=driver.findElement(By.xpath("//div[@class=\"oxd-coast oxd toast--success oxd-toast-container toast\"]"));
				//String msg=na.getText();
				System.out.println(k + "+" + name1);

				ExpectedCondition<Boolean> expectation1 = new ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver driver) {
						return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
								.equals("complete");
					}
				};

				try {
					Thread.sleep(2000);
					WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
					wait1.until(expectation);
				} catch (Throwable error) {
					Assert.fail("Timeout waiting for Page Load Request to complete.");
				}

				wait.waitForInVisibilityByType(driver, 15, "cssSelector",
						"button[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");

				WebElement add1 = driver.findElement(
						By.cssSelector("button[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]"));
				act.clickByUsingActionClass(driver, add1);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
