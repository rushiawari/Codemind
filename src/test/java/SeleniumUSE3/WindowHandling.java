	package SeleniumUSE3;
	
	import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
	public class WindowHandling {
	
		@Test
		public void HowToHandleWindow() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		String parentWindowHandle=driver.getWindowHandle();                     // return string of handle of current window  
		driver.findElement(By.xpath("//button[contains(@id,'windowButton')]")).click();  // here we open new window (child)
		
		Set<String> windowHandle= driver.getWindowHandles();    //All window handles are stored in this Set         // returns set of window handles  
		                                                                       // Set because handles are unique...duplicate not allowed
		//Lets try to print child window handle without switching on child window
	//	WebElement childWindowHeading = driver.findElement(By.xpath("//h1[starts-with(@id,'sampleHeading')]"));          //To perform .getAttribute you need store it 
	//	System.out.println(childWindowHeading.getAttribute("innerHTML"));                                           //you can also do simple getText method
		//It will throw NOSuchElement exception because it will fail to locate it (because we haven't switched on that window yet)
		
		for(String str : windowHandle) {    // what it type String ...Hence we taken String str = windowHandle  ...loop will return one by one each handle
			
			if(!(str.equals(parentWindowHandle))){   // we write str is equal to parentwindow Handle then put whole bracket as (not) ..not equals to parent handle
				driver.switchTo().window(str);       // simply do (str != parentWindowHandle)
		// means when str is not equal to parent it simply means str is a child ....so we switched to the str
			//Now put that previous code inside this loop and see it prints element handle on child window  or not	
				
				WebElement childWindowHeading = driver.findElement(By.xpath("//h1[starts-with(@id,'sampleHeading')]"));           
		    	System.out.println(childWindowHeading.getAttribute("innerHTML"));   
		    	
		    	//In inner HTML there are text or linkText are situated 
		    	// so we directly write/use innerHTML it will print everything inside inner html.
		    	
		    	//now we will close childWindow
		    	driver.close();                    //it will close the window on which we are now  i.e child   because we have switched on child.
				
			}	
		}
		
		
		//Loop will switch to child window and print the handle of particular webElement you want
		
		
		
		
		
		
		
		
		
		
		}
	}
