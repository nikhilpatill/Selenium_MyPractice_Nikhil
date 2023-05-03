package ExcelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.BaseUtilityy.startUp;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetOperations {
	
	
	public static void main(String[] args) {
		
		// generic methods   //
	  startUp sb=new startUp();
	 // calling generic method 
	 // System.out.println("number of sheet ="+sb.getNumberOfSheet());
	  //sb.getNumberOfSheet();	
		//sb.totalSheetName();
		
		
		//startUp sb=new startUp();
	//System.out.println(sb.getSheetIndex("all type"));
	//sb.totalSheetName();
	//System.out.println(sb.getNumberOfSheet());
	
	
	System.out.println();
	try {
			
		FileInputStream fis=new FileInputStream ("./src/test/resources/org/Excel File/TestCase.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
			//number of sheets in excel file ;
			int totalSheet=wb.getNumberOfSheets();
			System.out.println("total sheet="+totalSheet);
			
			int sheet = wb.getSheetIndex("all type");
			System.out.println("perticular sheet index number ="+sheet);
			
			String sheet2=  wb.getSheetName(1);
			System.out.println("pass index number ="+sheet2);
			
			
			for(int i=0;i<totalSheet;i++)
			{
				System.out.println("total sheet name "+wb.getSheetName(i));
			}
			
			
			Sheet sb1=  wb.getSheet("login");
			
			int rowcount=sb1.getPhysicalNumberOfRows();
			System.out.println(rowcount);
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void NumberOfSheet() {
		// TODO Auto-generated method stub
		
	}

}
