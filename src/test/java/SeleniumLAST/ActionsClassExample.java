package SeleniumLAST;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClassExample {

	
	@Test
	public void actionsclass() {
		
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();       

		 driver.get("https://www.google.com/");        
		 driver.manage().window().maximize(); 
		 
		 //1)Lets find element having something when you hover on it
		 
		WebElement element = driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]"));    //To sue Action class you need to store element
		
		Actions actions = new Actions(driver);            // it always webdrivers argument when you try to use its object
		
		actions.moveToElement(element).build().perform();   // at the end you always need to provide build().perform();    untill that Action class wont work
		//This is how you store a element and hover there by using Actions Class
		
		
		//here we need  to find our toolTip and print its text ...not other action to perform hence try to directly find it in Sysout
		System.out.println(driver.findElement(By.xpath("//div[text()='Google apps']")));
		
		
		//2) to type text/sendkeys in textBox using actions Class
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		actions.keyDown(searchBox,Keys.SHIFT).sendKeys("awari").build().perform();             // we click Shift to take all keys in  Capital
		//to backspace any character in textbox 
		actions.keyDown(searchBox, Keys.BACK_SPACE).build().perform();                         // it will remove "i" from awari
		
		//Never miss build().perform() in each Actions Class method
		
		//Inside (keys.) command all the keys from your KeyBoard are available but except character keys (ABCD..Z)
		// Hence we used SendKeys because it do not have character keys to use integretely
		
		
		
		//3) How to right click on any element //Also called contextClick in selenium
		
		actions.contextClick(searchBox).build().perform();     // now it will right click on particular webelement
		
		
		
		 
		
		
		
		
		
	}
}
