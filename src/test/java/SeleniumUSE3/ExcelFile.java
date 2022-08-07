package SeleniumUSE3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFile {
	
	// We can alos add data from your Excel file to your Automation project.
	// Lets suppose you have do user Registration one user and to check whether it success or not
	// UserNAme , Password,Adress, mobile number, Adhar Card Number, etc.
	// You have fill multiple such a informations
	// You no need to send them each time using .sendKeys (You do it only in practice cources not in Industry)
	// Keep in mind that We never HardCode Any test Data in Company level...it is ok at only learning phase.
	// We takes data from External Sources directly...like=> For Confriguration we use "Property File".
	
	// When You have to test such a forms like Registartion and any other forms 
	// Where you need to put lot of imformation from "Excel File" provided by your Firm /BA
    
	// Then How will you Read/Write that Excel file in Your Project:- (How Will you directly take data from Excel file and use it in your project)
	
	
	// Selenium API do not provide us such a facility
	// Hence we use  "Apache poi Dependency"
	
	
	
	@Test
	public void readExcel() throws IOException {
		
		File file = new File("./src/test/resources/ExcelForMaven1.xls");     //We put relative path of file from resource folder
		FileInputStream fis = new FileInputStream(file);                     // use ( dot .) in front of /src in relative path , 
		                                                                     //system will search that file in current directory
		                                                                     // we do this to avoid system failuer due to unable to find file path
		
		// There is one class (apache.poi) "HSSFWorkbook" that we use to read the Excel file 
		// But You can only use HSSF workbook if your Excel file format is ("xls").
		// If Your file is in (xlsx) format you can not use this workbook.
		// for (xlsx) format we use "XSSFWorkbook", "XSSFSheets", "XSSFRow",.
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fis);     //As this is a class we will create its object  // we used inputStream method of this Workbook 
		// This is how we connected our EXcel file to this class object
		// Now we will get our sheet from that file // On which we have written our data
		HSSFSheet sheet = hssfWorkbook.getSheet("Sheet1");     // we use .getSheet(String Arg)  method here   // mostly we use this method  // It will give you whole sheet
		// We stored it in HSSFSheet class and created its object
		
		//Supose you wanted to know how many rows are there in your sheet
		int lastRowNumber = sheet.getLastRowNum();
		
		
		for(int i =1; i<=lastRowNumber;i++) {              // For loop will iterate all the rows one by one till the last Row Number
         			                                       // Started loop from 1st index to avoid column names from printing with values
			HSSFRow row = sheet.getRow(i);                // we use .getRow(rowIndex) and put i ... i=0 hence iteration will start from 1st row
			                                              //HSSFRow is another class in (poi) we will store and use its object 
			
			int lastCellNumber = row.getLastCellNum();    // When you last cell number you will get that how many cells are there
			
			// we iterated rows now we will take another for loop to iterate cells
			for (int j=0; j< lastCellNumber; j++) {
				
				System.out.print(row.getCell(j).getStringCellValue()+" : ");               //use .NumericCellValue if cell having numbers
				// Print to print in sinle line and (spaces with :)  to seperate view      //use .StringCellValue  if cell having Strings
			}
			
			System.out.println();   // To sepearte line output for each iteration of loop
		}
		
		
		
		
		// Note :- File do not directly gets read/ write in Hard disc 
		//         We have to take it inside Buffer / RAM of our system
		//         For this we use Streams. 
		//(FileInputStream => To Read only)  (FileOutPutStream=> To modify/write/add) 
		
	}
}
