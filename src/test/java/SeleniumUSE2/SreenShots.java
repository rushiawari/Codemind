package SeleniumUSE2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SreenShots {       //This is the most Imp because it gets asked in each and every interview compulsory.

	// If you found any failuer you need to analyse it ,you need to understand where is the problem.
	// ScreenShots are more helpfull than written logs to understand any issue/failuer.
	// ScreenShot is the Best way to collect evidence and to prove your point.
	
	
	/// How To Take ScreenShot in Selenium we use one interface
	
	// As we know we can not create Object of Inteface so we can go with to ways:
	         //1) We can create one implementation class of that interface
	         //2) We can Typecast our driver with that inteface.
	
	// TakesScreenShot takesScreenShot = (TakesScreenShot)driver;     This is how you typecast your browser with an inteface
	
	@Test
	public void ScreenshotsInSelenium() throws IOException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	
	TakesScreenshot takesScreenShot = (TakesScreenshot)driver;
	File file =takesScreenShot.getScreenshotAs(OutputType.FILE);            //we need to store this file //Initailly this file stores in Buffer memory
	 
	// We need to copy it from there and store it somewhere else..so we can later use it.
	//We use one Maven Dependency called "Apache Commons IO"
	// you need to add this inside your pom.xml file of Your Maven project
	
	FileUtils.copyFile(file, new File("C:\\Rushi java workspace\\com.codemind.project\\src\\test\\resources\\test.png"));    
	                                                                    // Use method FileUtils.copyFile and allocate adress to store that file
	                                                                    // We gave adress of our test/resource folder so we can see those ss in our project itself.
	                                                                    // test.png is the name and extension we given to that file
	 //Now we can see this ss file in our Resource Folder....we no need to go anywhere
	
	
	///Note:- "Apache Commons IO" this dependency gets used in almost every framework available in industry.
	
	}
	
	
}
