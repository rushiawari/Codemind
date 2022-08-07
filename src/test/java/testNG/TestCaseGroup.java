package testNG;

import org.testng.annotations.Test;

public class TestCaseGroup {

	@Test(groups= {"smoke","sanity"})    // we use this {groups array} for making groups of test cases
	public void test1() {
		System.out.println("smoke,sanity");
	}
	
	
	@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("sanity");
	}
	

	@Test(groups= {"smoke"})
	public void test3() {
		System.out.println("smoke");
	}
		

	@Test(groups= {"smoke"})
	public void test4() {
		System.out.println("smoke");
	}
		
}
