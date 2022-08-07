package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion2 {      /// Soft Assertion

	// To use Soft Assertion we use one class called "SoftAssert" and create it's object
	
	 SoftAssert softAssert= new SoftAssert();
	
	@Test
	public void testAssertion() {
		int i=10;
		softAssert.assertEquals(i, 20);         // TestCase Will fail ...condition is false 
		softAssert.assertNotEquals(10, 20);     // test will pass.... condition is false  negative way
		System.out.println("This is test case 1");
	//	softAssert.assertAll();                  // never forget to call assertAll() method at the end.  
		                                         // but you can do it at the end for all the test cases in single command. 

	}

	@Test
	public void testAssertion1() {
		int j=20;
		softAssert.assertTrue(j==10);        // Test case will fail
		softAssert.assertFalse(false);       // Test case will pass... because we passed false in assertFalse
		                       
		System.out.println("This is tst case 2");
	}
	
	@AfterClass
	public void tearDown() {
		softAssert.assertAll();       // when you use it in AfterClass Annotation it will get applied to all the test cases.
	}
}

	// Most Of the times we use SoftAsserts.
