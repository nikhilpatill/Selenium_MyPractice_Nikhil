package org.ExcelFileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;

public class ExcelFileGenericMethods {
	
	public int getSheetIndex(String SheetName)
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream ("./src/test/resources/org/Excel File/TestCase.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			return  wb.getSheetIndex(SheetName);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return 0;
		}
		
		
		
	}

	
	
	
	public int getNumberOfSheet()
	{
		
		try {
			//only one xcel file in sheet alredy pass path
			FileInputStream fis = new FileInputStream ("./src/test/resources/org/Excel File/TestCase.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			return wb.getNumberOfSheets();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return 0;
		}
	}
	
		
	
			
			
		
	

	

}
