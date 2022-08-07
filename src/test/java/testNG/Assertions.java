package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	// Two types of Assertion:-
	/*
	 
	 * 1) Soft Assertion (Verification):- it will run whole code either there is any mistake.....at the end it will show you where the failure occur.
	                                      but it will not interrupt/terminate the code run.
		                              		                                
	 * 2) Hard Assertion (Assert) :-  when we use hardAssert if any test case fails test run stops immediately that point.
		                           // no further test cases will get executed.no further code will run/executed.
	  
	 */
	
	
	
	
	
	
//Lets take Example of HardAssert
	
	@Test
	public void testAssertion() {
		int i=10;
		Assert.assertEquals(i, 20);
      //Assert.assertNotEquals(10, 20);                   //Actual object is 10 and expected 20   will return true because condition is false 
		System.out.println("This is test case 1");

	}

	@Test
	public void testAssertion1() {
		int j=20;
		Assert.assertTrue(j==20);                         // In actual we use (.isDisplayed method with these methods)
	//	Assert.assertFalse(false);                        // you can also use negative way   false statement in assertFalse returns True
		System.out.println("This is tst case 2");

	}
               //These both the Test Cases got Failed but the code got immediately terminated on their failure and no further statement got printed.
	           // This is What Hard Assert means once the test case fails no further code is get executed.
}

//Note:- We can do any validation using only these four methods i.e  // Assert.assertEquals
                                                                     // Assert.assertNotEquals
                                                                     // Assert.assertTrue
                                                                     // Assert.assertFalse








