package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenByDataPROVIDER { // Data provider can be in one class or you can make another class for it

	                                     // Very Imp Topic
	WebDriver driver;

	// when you want to execute it before every test case
	@BeforeMethod
	public void launchUrl() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "userData")
	public void verifyValidLogin(String user, String pass) {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);

		driver.findElement(By.xpath("//input[@Name='submit']")).click();

	}

	@DataProvider(name = "userData") // this is static way to provide data but we never this way, we directly use // file(file handling)  in company
										
	public String[][] dataProvide() {
		String[][] array = { { "user1", "password1" }, { "user2", "password2" } };
		return array;

	}
	
	//After completion of every test case
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}