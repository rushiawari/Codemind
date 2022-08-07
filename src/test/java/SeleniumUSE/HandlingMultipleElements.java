	package SeleniumUSE;
	
	
	import java.util.List;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	
	public class HandlingMultipleElements {
		
		@Test
		public void handlingMultipleElementss() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		///How To handle multiple Elements at single time  //By use of List of WebElements
		
		//To find How many links available on particular web page     //tagname <a> (anchorTag) represents link
	  
	    List<WebElement> list=driver.findElements(By.tagName("a"));       // we created List of WebElemnts 
        System.out.println("Number of Links on Google Page :"+list.size());  
		
		
		for(WebElement element:list) {                                   //loop will return each WebElement with link one by one 
			System.out.println(element.getAttribute("href"));                              // which links are there   // All links have attribute "href"
		}
	
		
		
		//Difference between findElement and findElements():-
		
		//findElement:- it will return single webElement and it fails to find that element it will throw noSuchElement Exception
		
		//findElements:- it will find multiple webElement and returns list of WebElements 
		                // if it fails to find elements it will return an empty list.
		
		
		}
	}