package ExcelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.BaseUtilityy.startUp;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.excelUtility.ExcelGenericMethods;
import org.openqa.selenium.WebDriver;

public class ExcelHandalingEx1 {

	public static void main(String[] args) {

		try {
			
			FileInputStream fis = new FileInputStream("C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase.xlsx");
			
			
			Workbook wb = WorkbookFactory.create(fis);
			int totalSheet= wb.getNumberOfSheets();
			System.out.println(totalSheet);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		
		}
		
		
		ExcelGenericMethods ex=new ExcelGenericMethods();
		
	
		//System.out.println(ex.getNumberOfSheets());

	}
	
	 
}
