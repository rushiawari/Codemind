package SeleniumLAST;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableEXAMPLE {

	@Test
	
	public void printTableData()  {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();       
	
		 driver.get("https://www.amazon.in/");        
		 driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//To scroll to the end
		
		JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver; 
		javascriptExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr/td"));

		
		for (WebElement elm : list) {
			
			System.out.println(elm.getText());
		}

	System.out.println();
	
	}
	
}
