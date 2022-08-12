package SeleniumUSE4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {

	//Parallel Execution:-   its a feature of TestNG
	
	// Executing two or more test cases at a time 
	// or Executing multiple test cases at a same time.
	// not really use in industry but someone may ask you about it.
	
	// It is time saving process nothing else.
	
	
	
	//Suppose we have 6 test cases and we need to execute them at a same time.
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();       

		 driver.get("https://www.google.com/");        
		 driver.manage().window().maximize(); 
		driver.quit();
	}

	
	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();       

		 driver.get("https://www.facebook.com/");        
		 driver.manage().window().maximize(); 
		 driver.quit();
	}
	
	
	@Test
	public void test3() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();       

		 driver.get("https://www.amazon.com/");        
		 driver.manage().window().maximize(); 
		 driver.quit();
		
	}
	
	@Test
	public void test4() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();       

		 driver.get("https://www.flipkart.com/");        
		 driver.manage().window().maximize(); 
		 driver.quit();
		
	}
	
	@Test
	public void test5() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();       

		 driver.get("https://www.zoom.com/");        
		 driver.manage().window().maximize(); 
		 driver.quit();
		
	}
	
	@Test
	public void test6() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();       

		 driver.get("https://www.youtube.com/");        
		 driver.manage().window().maximize(); 
		 driver.quit();
		 
		 
		
		 //Now covert as TestNG.xml file
		 
	//	 <!-- we gave thread count 6 to start 6 browsers at a time,,,and parallel methods to run methods parallely 
    //    <!-- we can give any thread value according to how many browser we wanted start at a time 
		 
	//  we have taken parallel= "methods"  because we trying to execute method of a single class at a time.
		 
	// But when there are 2 classes having muultiple methods and wanted to execute those classes at a time 
	// then you simply write parallel="classes"   and give thread value equal to no of classes there
		 
		 // then each thread will workout each class at a time
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}	 
		 
	}

