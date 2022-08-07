package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities.Utility;
import pages.HomePage;

public class HomePageTestCases {
	
// If you want to access all the method ,you need to import a class by craeting its reference variable or object at class level as like below.
	HomePage homePage;       //import HomePage class from Pages package and declare it's variable   //To access methods written in HomePage class.
	WebDriver driver;        // we took WebDriver's reference variable (global) 
	
	
	@BeforeClass
	public void launchurl() {
		driver=Utility.getDriver();            // we call getDriver() method directly from Utility  //In that method we have written WebDriver
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		homePage = new HomePage(driver);        // we assign value to the reference of HomePage
		                                        // we craeted constructor(HomePage) so we need to give parameter ,we gave (driver) as parameter
		                                        // when you create object at that instance constructor gets called
		//i.e we called HomePage homePage reference from another class and here we assign value to that ref and called constructor of that class here
		// so now we can use this reference as a representing member of that class....because it has constructor of that class.
		//This is Most Imp step and necessory to perform.
	}
	
	@Test
	public void  verifyFormFiledSelection() throws InterruptedException
	{
		//Write User name
		homePage.setUserNameTextBox(null);                         // whatever we have written inside "setUserNameTextBox" method in HomePage class will get executed
		homePage.getUserNameTextBox().sendKeys("UserName");
		Thread.sleep(2000);
		homePage.getUserNameTextBox().clear();                     // This is how we check our textbox is getting clear or not
		Thread.sleep(2000);                                        // How to use .clear method
		homePage.getUserNameTextBox().sendKeys("UserName2");
		System.out.println(homePage.getUserNameTextBox().isDisplayed());                        // to check this element is available/displayed on our webPage or not
		System.out.println(homePage.getUserNameTextBox().getAttribute("placeholder"));          // Return Attribute value for e.g id,class etc whatever you call
		System.out.println(homePage.getUserNameTextBox().getTagName());                         // Return TagName we used lo locate the element  ...here "input" we used
		System.out.println(homePage.getUserNameTextBox().getCssValue("background-color"));      // Return css Property we wanted to know/see  //But in HTML/css values
		System.out.println(homePage.getUserNameTextBox().getSize().getHeight());                // Return height of element on webPage in pixel
		System.out.println(homePage.getUserNameTextBox().getSize().getWidth());                 // Return width of element on webPage in pixel
		
		//select Gender radio button
		homePage.setGenderRadioButton(null);              
	//	homePage.getGenderRadioButton().click();                                     // simple click is not working so we will use Javascript click from Utility
		Utility.clickUsingJavaScript(homePage.getGenderRadioButton(), driver);       // we clicked directly using method we written in Utility for click operation
		System.out.println(homePage.getGenderRadioButton().isDisplayed());           // to check this element is available/displayed on our webPage or not
		System.out.println(homePage.getGenderRadioButton().isSelected());            // To verify Radio button/check box got checked or selected  //use (.isSelected) method
		                                                                             // it will return (True)/(False)
		//Select Date and year of birth
		homePage.setDateOfBirthInputField(null);
		Utility.scrollIntoView(homePage.getDateOfBirthInputField(), driver);    //we are not able to see date box so we need to assign it by set and then scroll upto it.
		homePage.getDateOfBirthInputField().click();
		WebElement select=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Utility.selectValueFromDropDown(select, "2010");		
		Utility.SelectDateFromDatePicker( select, "18");
		
		//select hobbies checkBox
		homePage.setHobbiesCheckBox();
	//	homePage.getHobbiesCheckBox().click();                                  // simple click is not working
		Utility.clickUsingJavaScript(homePage.getHobbiesCheckBox(), driver);    // we have used JavaScript method from Utility to click
		
		//Upload picture (file)
		// In selenium when you upload file we never click => always sendKey("path of that file") just go on file + right click+ copy as path.
		homePage.getFileUpload().sendKeys("C:\\Users\\CARE SYSTEM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	}
	
}

// Exceptions we faced in this code

//element click intercepted exception mostly we face=> its due to when selenium is unable to click on element you want.
                                                      // or that element is not clickable at that particluar time.
                                                      // there is some issue so you can go for javascript code to click on element

// No such element expection=> when your element locator is wrong or that element is not present on perticular page.








