package SeleniumUSE3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	
	
	
	@Test
	public void readExcel2() throws IOException {
		
		File file = new File("./src/test/resources/ExcelForMaven1.xls");     
		FileInputStream fis = new FileInputStream(file);  
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = hssfWorkbook.getSheet("Sheet1");
		
		int lastRowNumber = sheet.getLastRowNum();
		
		//Outer Loop to iterate Rows one bye one
		//Inner Loop To Iterate Cells one by one
		
		for(int i =1; i<=lastRowNumber;i++) {  
			
			HSSFRow row = sheet.getRow(i); 
			int lastCellNumber = row.getLastCellNum(); 
			
			for (int j=0; j< lastCellNumber; j++) {
				
				System.out.print(row.getCell(j).getStringCellValue()+" : "); 
			}
			
			System.out.println();
		}
		
		
		
		
	}
}
