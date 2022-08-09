package SeleniumLAST;

public class TableDATA {

	//  Table in HTML:->
	
	/*
	 * 1) table
	 * 2) table Body
	 * 3) Header (Heading ) (th)  ...sometimes not there  ... for e.g Marks, Books, Mobiles
	 * 4) table rows (tr)
	 * 5) table data (td)
	 * 
	 * &nbsp => non breaking spaces  //whenever there is empty row , you can see this &nbsp mentioned there 
	 * 
	 * 
	 */

//___________________________________________________________________________________________________________________________
	
	
	// suppose you wanted to go on 1st rows 5nd td (table data) then waht will be the xpath
	
	//=> //table/tbody/tr[1]/td[5]              This is how you write relative xpath to reach any table data 

	//=> //table/tbody/tr[3]/td[3]            3rd row 3rd td 
	
//____________________________________________________________________________________________________________________________	
	
	
	// Suppose i want all data from all rows
	
	/*
	 * 
	 * 1) first of all create List of all td (table data)
	 *  
	 *    List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr/td"));
	 *  
	 * 2)  outer for loop :- will itearte 1 ,2 ,3 rows(ALL ROWS)   (i)    // to run this loop you must know how many no of (tr) there  //Search = //table/tbody/tr
	 *     
	 * 3)  inner for loop :- will iterate all td                   (j)    // to run this loop you must know how many no of (td) there  //Search = //table/tbody/tr/td
	 * 
	 */
	
	
	// Note :- In xpath indexing never starts from zero ....always from 1
	
	
}
