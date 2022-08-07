package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {            /// In this page => We create methods to locate the element (set) and return methods(get) to perform operation on them.

	 WebDriver driver;               // declare global variable  , because we have store it in our Utility method.
	 WebElement userNameTextBox;     // we generate one by one webElements and we will them path using setters and getters
	 WebElement genderRadioButton;
	 WebElement dateOfBirthInputField;
	 WebElement hobbiesCheckBox;
	 WebElement fileUpload;           // we will use only Getter method approach for this method (Something new)
	 
	 //then we create Constructor of this page
	 public HomePage( WebDriver driver) {          // this indicates cuurent class variable
		 this.driver=driver;                       //here blue one is our current class driver that we initially written
	 }                                             // we are assigning value of driver that we will send from outside class to our current class driver.

	 //We have created Getters and Setters for "userNameTextBox"
	public WebElement getUserNameTextBox() {           
		return userNameTextBox;                           
	}

	public void setUserNameTextBox(WebElement userNameTextBox) {
		this.userNameTextBox = driver.findElement(By.xpath("//input[@id='firstName']"));
	}
	
	//We have created Getters and Setters for "genderRadioButton"
	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public void setGenderRadioButton(WebElement genderRadioButton) {
		this.genderRadioButton = driver.findElement(By.xpath("//input[@id='gender-radio-1']")); 
	}
	
	//We have created Getters and Setters for dateOfBirthInputField
	public WebElement getDateOfBirthInputField() {
		return dateOfBirthInputField;
	}

	public void setDateOfBirthInputField(WebElement dateOfBirthInputField) {
		this.dateOfBirthInputField = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	}

	//We have created Getters and Setters for hobbiesCheckBox
	public WebElement getHobbiesCheckBox() {
		return hobbiesCheckBox;
	}

	public void setHobbiesCheckBox(/*WebElement hobbiesCheckBox */) {                                 // You can remove that arguments in set method if you want
		this.hobbiesCheckBox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	}

	public WebElement getFileUpload() {
		this.fileUpload= driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		return fileUpload;
	}
	
	
	
	
	/// NOTE:- We can remove all the Set methods(Setters) and write that code inside Getter method and below that write return get method
	//        this is also one way to perform same operation
	
	/*
	 * Lets Take example of above HoobiesCheckBox method
	 * 
	 * public WebElement getHobbiesCheckBox() {
	 *       this.hobbiesCheckBox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	 *       return hobbiesCheckBox;
	 * }
	 * 
	 * same like this we can remove all the setters and use only getters
	 * and while writing test cases only call homePage.getHobbiesCheckBox.AnyOperation();
	 * 
	 * 
	 * 
	 */
	
}
