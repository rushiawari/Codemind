package SeleniumUSE;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.Utility;

public class AlertHandling {    // Alerts are also called as PopUps

	
	@Test
	public void handeAlerts() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement ClickButton=driver.findElement(By.xpath("//button[@id='promtButton']"));           ///simple click is not working hence we store this element and
		Utility.clickUsingJavaScript(ClickButton, driver);                                            //use it in our utility javascript code for click
		
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());  // it is necessory to print our alert name to verify that we handle the exact same alert we wanted to handle. 
	//	alert.accept();
	//	alert.dismiss();
		alert.sendKeys("alert accepted");
		alert.accept();
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
