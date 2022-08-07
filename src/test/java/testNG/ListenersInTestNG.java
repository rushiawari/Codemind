package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//There are multiple interfaces available in TestNG so call those as "Listeners"
	// Listeners Listens TestNG commands and works according to those commands (behave as per them) 
	
	// Listeners are implemented in code via interfaces to modify TestNG behavior.
	//  Listed below are the most commonly used TestNG listeners:
	
	/*
	 
	    IAnnotationTransformer
		IExecutionListener
		IHookable
		IInvokedMethodListener
		IMethodInterceptor
		IReporter           // this is also one rearly used listener but we use ITestListener 
		ISuiteListener
		ITestListener  //this is most commonly/widely used listener almost 90%
		
	*/


public class ListenersInTestNG implements ITestListener{           // As it's a interface we need to create it's implementation class to use it.
                                                                   
	
	public void onFinish(ITestContext Result) {
		
	}
	
	public void onStart(ITestContext Result) {
		System.out.println("Your Test Case Execution Started");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		
	}
	
	public void onTestFailuer(ITestResult Result) {
		System.out.println("The Name Of Test Case Failed Is:"+ Result.getName());
	}
	
	public void OnTestSkipped(ITestResult Result) {
		System.out.println("The Name Of Test Case Skipped Is:"+ Result.getName());
	}
	
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + "test case strated");
	}
	
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The Name Of The Test Case Passed Is:"+Result.getName());
	}
	
}
  // This all methods are static means we always use them inside ITestListener they never changes.







