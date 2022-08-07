package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnotation {

	@Test(groups= {"smoke","sanity"})    // we use this {groups array} for making groups of test cases
	
	@Parameters({"user","password"})      //we write only names not values
	public void test1(String user, String pass) {
		System.out.println(user+" "+pass);
		System.out.println("smoke,sanity");           //this test case is driven by data that why we called it as "DataDriven"...(data will drive your test case)
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
