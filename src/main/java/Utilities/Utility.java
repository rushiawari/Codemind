package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {                //Utility=> we write here operations/methods that we need to perform oftenly or repetatively or multiple times

	// for driver
	public static WebDriver getDriver() {   // and we have to provide return here so we put chromedriver path here,
											// so every time we no need to provide that in every code. and return driver.
											
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		// we make all the methods "static" so we can directly use them without creating object directly
	    // To use them inside another method in another class
	}
	
	
		// For Select
		public static void selectValueFromDropDown(WebElement element, String option) {         // we created one method to deal with dropdowns
	      // WebElement to locate the element Option that we want to select in that locator 
			Select select = new Select(element);
			select.selectByVisibleText(option);
		}
		
	
		//To select Date From Date Picker	
		public static void SelectDateFromDatePicker(WebElement driver, String date) {             // created method to select the date
	       // webDriver for driver.find method and String date to select date
		   driver.findElement(By.xpath("//div[text()='" +date+ "']")).click();                    //this is how we select date using utility
		}
		
		
		
		//To scroll upto any element on page 
		public static void scrollIntoView(WebElement element, WebDriver driver1) 
		//To scroll we need WebElement upto which we need to scroll & driver to find that element
        {	
			((JavascriptExecutor) driver1).executeScript("arguments[0].scrollIntoView(true);", element);
			// JavascriptExecutor is an interface so we can't craete its object so have typecasted it with our driver
			// executeScript is a method inside that interface using this method we can execute any script
			// we pass the scroll code and the element upto which we wanted to scroll
			
			//Same like this scroll script you can download any script you want from google and paste it in this executor method
		}
		
		
		//click Using JavaScript (when simple click is not working)
		public static void clickUsingJavaScript(WebElement element,WebDriver driver1) 
		 //Same as scroll element we store and then driver does operations you want  ....set and get
		{
			JavascriptExecutor executor = (JavascriptExecutor)driver1;    // typecasted  Interface with driver and created its reference to use anywhere  
			executor.executeScript("arguments[0].click();", element);
			
		}
		
		// WhenEver you want to use Jaascript inside selenium you need "JavascriptExecutor" interface amd you need to typecast it to use it.
		
		
		
		// To take Screenshot
		public static void takeScreenshot(WebDriver driver,String name) throws IOException {  // we parametarized our driver and name (string we will provide to store ss)
			                                                                                    
			
			TakesScreenshot takesScreenShot = (TakesScreenshot)driver;
			File file =takesScreenShot.getScreenshotAs(OutputType.FILE);            //we need to store this file //Initailly this file stores in Buffer memory
			 
			// We need to copy it from there and store it somewhere else..so we can later use it.
			//We use one Maven Dependency called "Apache Commons IO"
			// you need to add this inside your pom.xml file of Your Maven project
			
			FileUtils.copyFile(file, new File("./src/test/resources/ScreenShot/" +name+ ".png"));     // we provided our name that we will give every time and then extension.
			
			//source => our "file"  that we store initially  //Path=> Folder where we want to store that new file with anme and extension. 
		}
		
		
		
		//when it tells you to declare any  exception you can also try (try-catch blocks)
		
		/*
		 
		// To take Screenshot
		 
		public static void takeScreenshot(WebDriver driver,String name)  {  
			                                                                                    
			
			TakesScreenshot takesScreenShot = (TakesScreenshot)driver;
			File file =takesScreenShot.getScreenshotAs(OutputType.FILE);           
			
			try {
			     FileUtils.copyFile(file, new File("./src/test/resources/ScreenShot/" +name+ ".png"));
	   			}
	   			catch(Exception e){
	   			
	   			}
		 */
		
		
		
		
		
		
	// What is main use of function?
		// write your logic and reuse it whenever you want by craeting object or we can say taking reference. (Avoid writing same the code again and again))
		//Same thing we use Here we write our Logic for one time and we are gonna use it hwnever we want it.
		//By taking objects of these methods or references of these methods
		
		
		
		
}
