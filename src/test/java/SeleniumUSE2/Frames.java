package SeleniumUSE2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {  // Frame is nothing but the "embeded page" inside our webpage.

	@Test
	public void frameHandling() {
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();
			
		 WebElement element= driver.findElement(By.xpath("//iframe[@id='frame1']"));
		 driver.switchTo().frame(element);
		 //We switch on the lement i.e our stored frame
		 // now we will get text on frame
		 String str= driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		 System.out.println(str);
		 
		 //now we again switch back to our original webPage
		 driver.switchTo().defaultContent();
	
		 
	}
	
}
