package SeleniumUSE2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sroll2 {
	
	@Test
	public void scrollUpToElement() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	//Find that element and store it
//	WebElement element = driver.findElement(By.xpath("//span[text()='Amazon Brand - Vedaka Amazon Brand Popular Raisins, 500 g']"));
	
	// Scroll To the specific element on the page   
	JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver; 
//	javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", element);    // This is also static never changes, we just put our element in the same code every time

	// How to scroll Vertically  (Static only value changes)
	// if you provide positive number => scroll down
	// if you provide negative number => scroll up
	javaScriptExecutor.executeScript("window.scrollBy(0,500)");
	javaScriptExecutor.executeScript("window.scrollBy(0,-500)");
	
	// How to scroll Horizontly
	// if you provide positive number => scroll right
	// if you provide negative number => scroll left
	javaScriptExecutor.executeScript("window.scrollBy(500,0)");
	javaScriptExecutor.executeScript("window.scrollBy(-500,0)");
	
	}
}

// Note first parameter is for  => Horizontle action
//      second parameter is for => Vertical action









