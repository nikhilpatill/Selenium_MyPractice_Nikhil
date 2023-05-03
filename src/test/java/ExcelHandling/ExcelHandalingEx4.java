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

public class ExcelHandalingEx4 {

	public static void main(String[] args) {

	
		try {
			FileInputStream fis=new FileInputStream("C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase.xlsx");


			Workbook wb=WorkbookFactory.create(fis);
			
	Sheet s= wb.getSheet("Sheet1");
	Row r1=s.getRow(1);
	org.apache.poi.ss.usermodel.Cell c=r1.getCell(0);
	
	//System.out.println(c.getStringCellValue());
   //	System.out.println(r1.getCell(0).getStringCellValue());
	//System.out.println(s.getRow(2).getCell(2).getStringCellValue());
	//System.out.println(wb.getSheet("String type").getRow(3).getCell(5).getStringCellValue());
	
	//int lastRownum = s.getLastRowNum();
	//int lastcellnum = r1.getLastCellNum();
	
	
	try
	{
		for(int k=0;k<=s.getLastRowNum();k++)
		{
			
		for(int i=0;i<r1.getLastCellNum();i++)
		{
			
			System.out.println(s.getRow(k).getCell(i).getStringCellValue()+" ");
			
		}
		
		System.out.println("  ");
		}	
		
		
		
		
	}catch(Exception e)
	{
		
	}

		
			
			
			
			
			
			
		
			
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	

}
