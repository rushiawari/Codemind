package SeleniumUSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDownNotSelectClass {
	
	//How To Handle Not Coming Under Select
	

	@Test
	public void DropDownHandling2() {
	System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
	WebDriver driver = new ChromeDriver();       

	 driver.get("https://www.airvistara.com/in");        
	 driver.manage().window().maximize(); 
	 
	 //click on img under which dropDown is present....not select Tag
	 driver.findElement(By.xpath("//img[@src='/etc.clientlibs/airvistara/clientlibs/clientlib-site/resources/images/dropdown-arrow-purple.png']")).click();
	 //another xpath option gives one on one match
	// driver.findElement(By.xpath("//img[contains(@src,'dropdown-arrow')]")).click();
	 
	 //Lets put implicit wait because some time dropdown takes some time to display
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 
	 //Under the dropdown 
	 //xpath  = //ul[@id='country-scroll']//li/span[text()='India']               // single (/)  means relative xpath
	 //  (ul) is our List of countries
	 // "country scroll" is the id of our list ...to loacte the list
	 // (li) are our individual options having span attribute
	 // in those options we selected Text= India
	 
	 driver.findElement(By.xpath("//ul[@id='country-scroll']//li/span[text()='India'] ")).click();
	 
	 // This is how we clicked on option India.
	}
}
