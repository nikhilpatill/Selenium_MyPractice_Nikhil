package ExcelHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandalingEx6 {
	
	public static void main(String[] args) {

		
		try {
			FileInputStream fis=new FileInputStream("C:\\accelaration\\workspace\\Nov_25_Selenium\\src\\test\\resources\\org\\Excel File\\TestCase.xlsx");


			Workbook wb=WorkbookFactory.create(fis);
			
	Sheet s= wb.getSheet("All type");
	Row r1=s.getRow(1);
	org.apache.poi.ss.usermodel.Cell c=r1.getCell(2);
	
		for(int k=1;k<=s.getLastRowNum();k++)
		{
			
			
		for(int i=0;i<r1.getLastCellNum();i++)
		{
		    CellType act= s.getRow(k).getCell(i).getCellType();
			//System.out.println(s.getRow(k).getCell(i).getStringCellValue()+" ");
			//System.out.println(act);
			
			switch(act)
			{
			
			case STRING: System.out.println(s.getRow(k).getCell(i).getStringCellValue()+" ");
				break;
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(s.getRow(k).getCell(i))) {
					SimpleDateFormat("dd/mm/yyy");
					System.out.println(s.getRow(k).getCell(i).getDateCellValue()+" ");
				}
				else
				System.out.println((long)s.getRow(k).getCell(i).getNumericCellValue()+" "); 
				break;
			case BOOLEAN: System.out.println(s.getRow(k).getCell(i).getBooleanCellValue()+" ");
				break;
				
			case ERROR: System.out.println(s.getRow(k).getCell(i).getErrorCellValue()+" ");
				break;
				
			case BLANK: 
				break;
				
			case FORMULA: System.out.println(s.getRow(k).getCell(i).getCellFormula()+" ");
				break;
			case _NONE: System.out.println(" data data in cell ");
				break;
				
				
				default : System.out.println("invalid  cell type ");
				
				
			
				
			}
		}
		
		System.out.println("  ");
		}	
			
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	private static void SimpleDateFormat(String string) {
		// TODO Auto-generated method stub
		
	}

	

}
