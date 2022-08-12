package SeleniumUSE4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowToFindBrokenLINKS {         //IMP- This Code is Used for API Testing
		
		 //  each link is always under      => Anchor Tag (<a>)
		 //  Links Are always assigned to => Atrribute href
		 
		 //  If you pass xpath => //a[@href]   you will get all the links present on that webpage
		
		// There are almost 70 links on this Google WebPage
	
		//There is one class =>  HttpURLConnection   we use to find Broken Links   // we declare it at class level  // so use in any method 

		 HttpURLConnection huc;

		 
		 
	@Test
	public void brokenLinks() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();       
	
		 driver.get("https://www.google.com/");        
		 driver.manage().window().maximize();
		 
		 
		 // To find All the links  you have to use List of WebElements/Links
		 // Because driver.findelement xpath => only find/return single element
		
		 List<WebElement> list = driver.findElements(By.xpath("//a[@href]"));
		 
		 for(WebElement ele:list) {          // it will iterate one by one WebElement/link from list
			 
			 // there is also one class "URL" in java.net => we use it to hit URL's 
			 // but it only hits , so to get to know current state of Links either broken or working we need to typecast "URL" with "HttpURLConnection" class
			 // .openConnection=> opens the connection with url's so we can store its statetics in huc
			 huc=(HttpURLConnection) new URL (ele.getAttribute("href")).openConnection();
			 huc.setConnectTimeout(5000);            //set timeout to connect // This is must (otherwise timeout exception will throw)
			 huc.connect();                        // connect with Url's
			 
			 //Lets put Assert here to check our test case is passing or failing
			 
			 Assert.assertEquals(huc.getResponseCode(), 200);         // it means if responce code is 200  then test case will pass , if not it will get imediatly fail.
			                                                          // Assert is optional ..only if you perform as test case
			 if (huc.getResponseCode()==200) {
				 
				 System.out.println( ele.getAttribute("href") + ":" + "This link is Working Fine");
			 }
			 
			 else {
				 System.out.println(ele.getAttribute("href") + ":" + "This link is not Working Fine");
			 }
			 
			 
		 }
		 
		 
		 
		 
	/// This is code is mosty used in API to hit any API
		 
		 //you can write test case for any respoance code like 200,201,404,500 etc
		 
		 // To check any API behaviour
		 
		 // This code is also static never changes only put your required responce code for which you are testing API.
		 
		}
		
	}
