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
import org.excelUtility.ExcelGenericMethods;
import org.openqa.selenium.WebDriver;

import com.google.common.collect.Table.Cell;

public class ExcelHandalingEx2 {

	public static void main(String[] args) {

	
		try {
			FileInputStream fis=new FileInputStream("C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase.xlsx");

			ExcelGenericMethods ex =new ExcelGenericMethods();
			Workbook wb=WorkbookFactory.create(fis);
	        
	      
			ex.getAllShitsNames();
			ex.getSheetIndex("Sheet1");
			ex.getSheetName(2);
			wb.getSheetIndex("all type");
			System.out.println(wb.getSheetIndex("all type"));
			System.out.println(wb.getSheetName(1));
			System.out.println(wb.getNumberOfSheets());
			
			for(int i=0;i<wb.getNumberOfSheets();i++)
			{
				System.out.println(i+"-"+wb.getSheetName(i));
			}
			
   System.out.println("---------------------- sheet reference all type   ---------------------------------------");	
   
			// sheet reference 
 
			//generic method 
			//System.out.println( "first row num=>"+ ex.getFirstRowNum("Sheet1"));
   
			Sheet s= wb.getSheet("all type");
			// first row 
			  
			int first= s.getFirstRowNum();
			System.out.println("first row "+first);
			//last row
			int lastRow= s.getLastRowNum();  //n-1
			System.out.println("last row "+lastRow);
			
			int phisical_Row =s.getPhysicalNumberOfRows();  // actual count  but it shows actual data
			System.out.println("total phisical row "+phisical_Row);
			
			
	System.out.println("--------------------- perticuler Row reference     --------------------------------------");		
		  //row reference 
			Row r1=s.getRow(1);
			//First cell number 
			int firstcell =r1.getFirstCellNum();
			System.out.println("first cell number"+firstcell);
			// last cell number 
			int last_cell =r1.getLastCellNum();
			System.out.println("last cell number "+ last_cell);
			
			//phisical cell 
			
			int phisical_Cell =r1.getPhysicalNumberOfCells();
			System.out.println( " phisical cell only "+phisical_Cell);
			
	System.out.println("--------------------- perticuler cell reference     --------------------------------------");	
			
	 
	     
	
			
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	
	}


