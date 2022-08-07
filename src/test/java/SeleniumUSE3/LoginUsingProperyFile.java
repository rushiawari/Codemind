package SeleniumUSE3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingProperyFile {
	
	@Test
	public void validLogin() throws IOException {
		
		
		// whenever you wants to denote/present any file in Java program  => you use "File" class
		// and provide path of the file you wants to present in the particular program
		
		File file = new File("C:\\Rushi java workspace\\com.codemind.project\\src\\test\\resources\\test.properties");  
		
		//To read  this particular file you need (FileInputStream)
		FileInputStream fis= new FileInputStream(file);
		//This is how we first (denote/introduced) the file in this program and then we (connect) the file with program. 
		
		//There is one class in Java => (Properties)
				Properties properties= new Properties();             //created object of that class here in this program
				properties.load(fis);                                // we use (.load) method of this class which takes inputStream
				System.out.println(properties.get("userName"));      // .Get(Object Key)/(string key) method to call the key and get the value of that key
				
				
// How  we use Property file in our Testing Automation (By reading it)	:-
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(properties.getProperty("url"));           // This is how we put our url key here to get value automatically
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys((String)properties.get("userName"));         //we typecasted it as String because it shows error
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys((String)properties.get("password"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	
		
		

		//To write in the file you use (FileOutputStream)
		FileOutputStream fos= new FileOutputStream(file,false);            // To add something like new property in your property file 
		                                                                   //(false) is to append the object file here . because when you are writing in the same file
		                                                                   // there are chances to overriding the existing data or creating new file each time to write.
		
		properties.setProperty("userName2", "user2");                        //.setProperty helps to set new property (key) and (its value)   //takes Strings
		properties.setProperty("password2", "pass2");       
		properties.store(fos, "This is write");                              // we are storing our changes and giving comment to show for this change.                  
		
	 	fos.close();   //we done with writing so we closed the file(writing opeartion)   to avoid currupt
		fis.close();   //we done with reading so we closed the file(reading opeartion)   to avoid currupt
		
		
		// When we write a file it will return at top => comment with time stand
		// below that all previous and new added data
	 	
	}

}
