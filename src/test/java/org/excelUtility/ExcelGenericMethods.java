package org.excelUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelGenericMethods {

	public int getNumberOfSheets() {

		try {

			FileInputStream fis = new FileInputStream(
					"C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase.xlsx");

			Workbook wb = WorkbookFactory.create(fis);
			return wb.getNumberOfSheets();

		} catch (IOException e) {
			// TODO Auto-generated catch block

			return 0;
		}

	}

	public int getSheetIndex(String sheetname) {

		try {

			FileInputStream fis = new FileInputStream(
					"C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase.xlsx");

			Workbook wb = WorkbookFactory.create(fis);
			return wb.getSheetIndex(sheetname);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			return 0;
		}

	}

	public String getSheetName(int Indexno) {
		try {

			FileInputStream fis = new FileInputStream(
					"C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase.xlsx");

			Workbook wb = WorkbookFactory.create(fis);
			return wb.getSheetName(Indexno);

		} catch (IOException e) {
			// TODO Auto-generated catch block

			return null;
		}

	}

	
	
	
	public ArrayList<String> getAllShitsNames() {

		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/org/ExcelFiles/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			ArrayList<String> ar = new ArrayList<String>();
			for (int i = 0; i < wb.getNumberOfSheets(); i++) {
				ar.add(wb.getSheetName(i));
				System.out.println(i+wb.getSheetName(i));				
			}
			return ar;
		} catch (IOException e) {
			return null;
		}


	}
	
	public int getFirstRowNum(String name) {
		try {

			FileInputStream fis = new FileInputStream(
					"C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase.xlsx");

			Workbook wb = WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet s= wb.getSheet("all type");
			// first row 
			return  s.getFirstRowNum();
		     

		
		} catch (IOException e) {
			// TODO Auto-generated catch block

			return 0;
		}
		
	}
		
		public int getLastRowNum(String name) {
			try {

				FileInputStream fis = new FileInputStream(
						"C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase.xlsx");

				Workbook wb = WorkbookFactory.create(fis);
				org.apache.poi.ss.usermodel.Sheet s= wb.getSheet("all type");
				// first row 
				return  s.getLastRowNum();
			     

			
			} catch (IOException e) {
				// TODO Auto-generated catch block

				return 0;
			}
		}
		
			
			public int getPhisicalRowNum(String name) {
				try {

					FileInputStream fis = new FileInputStream(
							"C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase.xlsx");

					Workbook wb = WorkbookFactory.create(fis);
					org.apache.poi.ss.usermodel.Sheet s= wb.getSheet("all type");
					// first row 
					return  s.getPhysicalNumberOfRows();
				     

				
				} catch (IOException e) {
					// TODO Auto-generated catch block

					return 0;
				}
			
			
			
		
	}
	
	

	public Object getSheetRef() {
		
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/org/ExcelFiles/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			return wb.getSheet("Sheet1");
		
		} catch (IOException e) {
			return null;
		}
	
	}
	
	
	
	// reference of sheet

}
