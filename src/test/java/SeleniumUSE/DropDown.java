package SeleniumUSE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

	//Using Select class
	
	@Test
	public void DropDownHandling() {
	System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
	WebDriver driver = new ChromeDriver();       

	 driver.get("https://demoqa.com/select-menu");        
	 driver.manage().window().maximize(); 
	 
	Select select= new Select ( driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
	 
	   select.selectByIndex(1);
	// select.selectByValue("Blue");        //another way
	// select.selectByVisibleText("Blue");  //another way
	 
	 
	}
	
}
