package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleOFannotation {

	
	WebDriver driver;


	@BeforeSuite
	public void beforeSuite() {
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");   */    
		// if we write this code in before suite it means we are following end to end approach with a single launching and executing all the test cases.
		
	}
	
//_____________________________________________________________________  Suite starts
	 
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
//- - - - - - - -  - - - - - - - - - - - - - - -
	
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {                     
		System.out.println("Before Method"); 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");     // Every time new browser will launch for each test case
	}
	
	
	@Test                                         
	 public void testcase1() {                       
		System.out.println("This is TestNG Test 1");
		driver.findElement(By.xpath("//input[@id'firstName']")).sendKeys("Rushikesh");
		
		
	}
	
	@Test                                         
	 public void testcase2() {                       
		System.out.println("This is TestNG Test 2");
		driver.findElement(By.xpath("//input[@id'lastName']")).sendKeys("Awari");
	}
	
	
	@AfterMethod
	public void AfterMethod() {                      
		System.out.println("After Method");
		driver.quit();                        // after performing every test case that respective browser will close and new one will open for new case.
	}
	
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
//- - - - - - - -  - - - - - - - - - - - - - - -
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	
//_____________________________________________________________________	  Suite Ends
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	
	
}
