package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations1 {            // Not mandatory to write it in perfect order its just for our understanding
	                                         // How it is actually sequenced when it gets executed
	
	//they always gets executed in their right sequential pattern. it do not depends upon their written sequence.

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
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
	public void beforeMethod() {                     // Before test case
		System.out.println("Before Method");         // before method is nothing but before (Test Case).....remember that Method itself a Test Case
	}
	
	
	@Test                                         
	 public void testcase1() {                       // This is our test means Test Case .............our method
		System.out.println("This is TestNG Test 1");
	}
	
	@Test                                         
	 public void testcase2() {                       // This is our Test Case 2
		System.out.println("This is TestNG Test 2");
	}
	
	
	@AfterMethod
	public void AfterMethod() {                      // After Test Case
		System.out.println("After Method");
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
	
	
	
	
	
	// How it is useful:
	/*
	 * Think that when you have to perform multiple test cases on web Browser where you wants to login only once
	 * such cas you can write that login code in Before Suite 
	 * 
	 * Assume that there are multiple test cases and for each test case you need to login every time
	 * such case you just write your login code in "Before Method"  
	 * for every new test case "before method" will get executed and  new login every time.
	 * 
	 */
	
	
	
	
	
	
	
	
}
