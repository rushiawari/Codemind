package SeleniumUSE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locaters {
	
	// What is Locater And Locater Strategies ?
	/*
	 * By.id
	 * By.name
	 * By.className
	 * By.cssSelector
	 * By.linkNext
	 * By.partialLinkText
	 * By.xpath            //Mostly we use xpath ...inside xpath we mostly use id
	 * By.tagName
	 */

	@Test
	public void locaters() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		                                                              
		driver.findElement(By.id(" "));
		driver.findElement(By.className(" "));
		driver.findElement(By.tagName(" "));
		driver.findElement(By.linkText("LinkText"));
		driver.findElement(By.partialLinkText("Link"));   //we write linkText Partially 
		driver.findElement(By.name(" "));
		driver.findElement(By.cssSelector("div[id='10']"));        // tagName[attribute='value']   it is a format to write cssSelector
		driver.findElement(By.cssSelector("div#10"));              // tagName#id(name)   (use # when attribute is id)     //Direct method without using format
		                                                           // tagName.class(name) (use . when attribute is class) //Direct method without using format
		                                                    
		
		driver.findElement(By.xpath("//tagName[@AttributeName='Value']"));      //Relative
		driver.findElement(By.xpath("/html/head/child tab/tagName[@attribute='value']")); //Absolute
		
		/*1) Relative Xpath=>   "//tagName[@AttributeName='Value']"  
		/*2) Absolute Xpath=>   "/html/head/child tab/tagName[@attribute='value']"       //child tabs like div,body,title etc
		                                  
		    //Difference Between Relative and Absolute xpath (always asked in Interviews)
		    *Absolute xpath always start with single forward slash while relative start with double forward slash
		    *Relative Xpath is more secure and good to use than absolute xpath. 
		    *because absolute is dependent on multiple tabs (child tabs).
		
		
		// Hence you can use relative x path n need to go for absolute x path.
		
		
		*/
		
		
		
		//Xpath Using "div" for date
      driver.findElement(By.xpath("//div[text()='28']"));              // to select number value like date
      driver.findElement(By.xpath("//div[text()='28'](notAreaDisabled)]"));  // when there are showing double dates because of previous or upcoming months dates
		
      // Xpath using "span"
      driver.findElement(By.xpath("//span[text()='Beauty Products']"));   //Text method also usefull in terms of "span"
      
      //Contains method of xpath(most unique method)
      //When you don't get exact match for locaters you use contains method because its unique one 
      
      driver.findElement(By.xpath("//button[contains(@id,'windowButton')]"));
      
      
      //Strats-with method of xpath  ........to search with partial value   
      //lable[starts-eith(@id,'value')]
       driver.findElement(By.xpath("//h1[starts-with(@id,'sample')]  "));       // original full id = sampleHeading
       //It can also do complete search and partial also
      
	}
	
}









