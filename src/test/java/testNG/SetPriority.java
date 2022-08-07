package testNG;

import org.testng.annotations.Test;

public class SetPriority { // we have multiple test cases but we have to give priority to one of them to
							// execute it at first place

	@Test(priority = 2, enabled = false)    // enable is by default true hence you need provide "false" 
											//(you use this when you wants to ignore this test case while execution)    to skip the test case
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = 0)
	public void test2() {
		System.out.println("test2");
	}

	@Test(priority = 1)
	public void test3() {
		System.out.println("test3");
	}

}

	/*
	  this is also one way because of lower ASCII value "a" gets executed at first
	  place then "b" and then "c".
	  
	  @Test public void ctest1() 
	  { System.out.println("test1"); }
	  
	  @Test public void atest2() 
	  { System.out.println("test2"); }
	  
	  @Test public void btest3()
	   { System.out.println("test3"); }
	 */
