package SeleniumUSE2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintCurrentURLandTitles {
	                                      // WebDriver Methods

	
	@Test
	public void urlandTitles() {
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();
			
			System.out.println("Current Url:"+ driver.getCurrentUrl());    // To print current page URL
			System.out.println("Title:"+ driver.getTitle());               // To print Title of the Current page/site
			System.out.println(driver.getPageSource());                    // it return all source of HTML
			
			
	}
}
