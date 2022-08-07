package POMandMAVEN;

public class PAgeObjectModel {       
	    
	///Interview 
	
	//POM FrameWork:- Page Object Model
	
	// We are using "Maven" as a build Tool
	// And we use same project structure provided by Maven
	// There is one Folder (src/main/java) in that folder There is one package called "Utility" , Where we write our "Utility methods"
	// Utility Methods:- we write such a methods in Utility , which we need to perform multiple times in our project
	//                    for e.g  Click Using JavaScript, Scroll, Alter Handling, ScreenShots, Frame Handling, DropDown, DatePickers
	//                    also we have written Utility Methods to read "Excel Files" and "Property Files" also.
	
    // There is another one folder (src/test/java)  in this folder we used "page object model" as a Design pattern.
	// How the Page object model works :- Every website/application has multiple pages  for e.g HomePage, Login Page etc
	//                                    On every page there are multiple elements situated having thier own locaters.
	//we store these all locaters of each and every element in our java class which represent as a "Page". 
	// for e.g we stores all the elements of HomePage in one java class and name that class as "HomePage".
	//             
	//We use getter setter methods and one constructor which initiallize our driver
	// Setter method finds the Element by its locator
	// Getter method Return that particular elements which is found by Setter
	
	// Now Object:- How we use Object in our FrameWork as its in the Name of the frameWork
	// We creates Object of our Page and we use those object while writing the test Cases
	// For e.g => we just Simply Create an object of the HomePage in the class where we write the Test Cases
	//            and we call all the setters and getters method for the particular web Element
	
	// And our last Folder (src/test/resource) in this folder we store all the imp documents and files required /associate with our project
	// for e.g chromedriver.exe file, excel files, screenshots, property files. etc
}



// In simple word for our UnderStanding :-
/*
 * We write all important and repetatively used methods inside Utility package
 * for eg=  Click Using JavaScript, Scroll, Alter Handling, ScreenShots, Frame Handling, DropDown, DatePickers
 *  also we have written Utility Methods to read "Excel Files" and "Property Files" also.
 *  
 *  In "Page" package of (src/test/java) we create java class which represent any webPage for e.g HomePage 
 *  in the page class we write all the locaters for each and every web Element present on tat webpage.
 *  
 *  (testCases package) we create class for that particular webPage for which we have already created Locater Page.
 *  we create object of Locater page in TestCases class and we use all the methods of getter and setter
 *  
 *  And our last Folder (src/test/resource) in this folder we store all the imp documents and files required /associate with our project
 *  for e.g chromedriver.exe file, excel files, screenshots, property files. etc 
 *  
 *  
 */
