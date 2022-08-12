package SeleniumUSE4;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utilities.Utility;

public class HowToTakeSSonFailuer {

	//How To Take ScreenShot on Failuer
	WebDriver driver;
	
	@Test
	public void failuerScreenShots() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	
	Assert.assertTrue(true);    //we intentionally passed the test case 
	
	}
	

	@Test
	public void failuerScreenShots1() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	Assert.assertTrue(false);     //we intentionally failed the test case 
	
	
	}
	
	
	
	//Now we will add one afterMethod annotation : to take screenshot if test case fails
	
	@AfterMethod
		
	// How would I get to know that test case got failed
	// There is one Interface called (ItestResult)
	// it store statitics of our current test case and tells  status of test case pass/fail.
	
	public void tearDown(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus()) {     // if test status is fail then take ss
			
			Utility.takeScreenshot(driver, result.getName());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}