package SeleniumUSE2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {

	@Test
	public void Navigation() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.navigate().to("https://www.flipkart.com/");  // Navigate to another website from existing one on same window/Tab
		
		
		driver.navigate().back();      //navigate to back page  or previous page
		
		driver.navigate().forward();   // Navigate to forword page
		
		driver.navigate().refresh();   //Refresh the page /Reload
	
		
		
	}
	
	
}
