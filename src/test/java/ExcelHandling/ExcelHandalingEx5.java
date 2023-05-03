package ExcelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.BaseUtilityy.startUp;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellAddress;
import org.openqa.selenium.WebDriver;

import com.google.common.collect.Table.Cell;

public class ExcelHandalingEx5 {

	
	public static void main(String[] args) {

	
		try {
			FileInputStream fis=new FileInputStream("C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase.xlsx");


		
			Workbook wb=WorkbookFactory.create(fis);
			
			
	Sheet s= wb.getSheet("Sheet1");
	int last_row=s.getLastRowNum();
	// print the total number of the row 
	for(int i=0;i<=last_row;i++) //0,1,2,3,4,5,6
	{
		
		Row r1=s.getRow(i);
		int last_cell= r1.getLastCellNum();
		System.out.println("no of row= "+ i +" " + "no of celle "+last_cell);
		
		
	}

	
	 
	
		
		

			
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	private static void getCell(int i) {
		// TODO Auto-generated method stub
		
	}

	

}
