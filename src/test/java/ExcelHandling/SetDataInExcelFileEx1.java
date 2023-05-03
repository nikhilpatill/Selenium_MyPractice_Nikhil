package ExcelHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SetDataInExcelFileEx1 {
	
	public static void main(String[] args) {

		
		try {
			FileInputStream fis=new FileInputStream(
				"./src/test/resources/org/Excel File/TestCase.xlsx");


	  Workbook wb=WorkbookFactory.create(fis);
			
	Sheet s= wb.getSheet("All type");
	//Row r1=s.getRow(1);
	//org.apache.poi.ss.usermodel.Cell c=r1.getCell(2);
	
	s.getRow(1).createCell(7).setCellValue("pass");
	s.getRow(2).createCell(7).setCellValue("fail");
	s.getRow(3).createCell(7).setCellValue("fail");
	
	FileOutputStream fos=new FileOutputStream(
               "./src/test/resources/org/Excel File/TestCase.xlsx");
	
	

	
       wb.write(fos);
       wb.close();
       fos.close();
	
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		

	}

	

}
