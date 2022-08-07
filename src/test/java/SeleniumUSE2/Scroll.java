package SeleniumUSE2;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
	
	@Test
	public void srollPage() {
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			// Scroll To the end of the page   //Static it never changes
			JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;                        //typecasted interface with our driver
			javaScriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");        // We use "executeScript" method 
			
			//When you wanted to execute "JavaScript" inside your selenium project you need to use JavaScriptExecutor Interface
	}

}
