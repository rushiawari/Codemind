package SeleniumUSE;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class WaitsInSelenium {
	
	//WebElements which are dynamic in nature we need to handle them using synchronization methods or waits.
	
	///There are 3 types of waits :-
	/*
	 * 1) Implicit Wait
	 * 2) Explicit Wait
	 * 3) Fluent Wait
	 * 
	 */

	///Fluent Wait:-  its a smart wait
	
	@Test
	public void Fluent() {

	System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
	WebDriver driver = new ChromeDriver();  
	
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));        //provided Implicit wait 
	  
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click(); 
	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofSeconds(10));
	wait.pollingEvery(Duration.ofMillis(10));                // only Fluent wait allows to set polling period all other waits have default polling period.  
	wait.ignoring(NoSuchElementException.class);             // only Fluent wait provide facility to ignore exceptions
	wait.until(ExpectedConditions.alertIsPresent());
	

    Alert alert = driver.switchTo().alert();
    alert.dismiss();
    
	

	
	}

}