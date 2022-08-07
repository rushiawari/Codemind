package SeleniumUSE3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle2 {
	
	@Test
	public void HowToHandleWindow() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		

		String parentWindowHandle=driver.getWindowHandle();    
		
		WebElement Button=driver.findElement(By.xpath("//button[contains(@id,'windowButton')]"));  //lets store this button to perform (click)  if required later in any step
		Button.click();        //new window open
		
		Set<String> windowHandle= driver.getWindowHandles();
		
		for(String str : windowHandle) {    
			
			if(!(str!=parentWindowHandle)){           //String is not equals to parent ...means String is Child
				driver.switchTo().window(str);        //Switch to child
				WebElement childWindowHeading = driver.findElement(By.xpath("//h1[starts-with(@id,'sampleHeading')]"));           
		    	System.out.println(childWindowHeading.getAttribute("innerHTML"));   
		    
		    	driver.close();                    //it will close the window on which we are now  i.e child   because we have switched on child.
				
			}	
		}
		
		//Now we never directly switched back to parent ...to perform any action
		// so we need to switch back to parent window first...to perform any opearation there
		
		driver.switchTo().window(parentWindowHandle);    //in frames we use (.defaultContent) to switch back to parent
	
		//now we have switched back on our parent window
		// lets we have click on that window button again
		// we can't perform this action until we switched back to parent 
		
		Button.click();
		
		//this is how we again open that window...by switching back to our parent
		
		
		
		//Now we will close all the windows
		
		driver.quit();
		
		
	}
}
