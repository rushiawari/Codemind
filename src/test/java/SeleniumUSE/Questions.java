package SeleniumUSE;

public class Questions {

	//Have a ever developed any framework?
	//Sorry, I haven't get chance to deveope a framework from scratch till now i am working with existing framework.
//_________________________________________________________________________________________________________________________	
	//Tell Me about your Automation Framework?
	//We are using Maven As a build tool and we follows pre-definied project structure of maven.
	// And we have put all our dependencies inside pom.xml file(we call it as heart of Maven)  dependencies like selenium,TestNG
	// There are 3 folders (src/main/java) (src/test/java) (src/test/resource)
	//Inside Main/java there are "Utility" methods.
//_________________________________________________________________________________
	
	// Tell me about Utility Methods?
	// there are lot of utilities 
	// Just like we put our "Webdriver" and "chromedriver path" and craete "driver" inside utility so everytime we no  need to write it again and again
	// we will directly use a (driver) as we write that utility method as "Static" so can use it directly without creating object each time.
//__________________________________________________________________________________________________________________________	
	//src/test/resources what inside that file?
	// files which are usefull for us just like chromedriver.exe file, our exel file, propery files
	// it is usefull if I handover my project to you, your chromdriver path and my chromedriver path may not be same
	// you can just simply go in test/resources folder and copy the relative path of chromedriver.exe file
	// as we know that relative path will be same for both of us it not going to change.
	// you can easily complete that action and go for forward.
	// All the important files we can make available inside test/resources folder,
	    // so that our client or any member of our project will not face any difficulty while handling the project
	      // he can get everything he want inside the project itself.
	
	// (pages) package in src/test/java
	// we are using (Page Object Model) As Design Pattern
	
//__________________________________________________________________________________________________________________________________________________
	
	 // Ways to send keys inside texbox?
   // => 1) .sendKesys()
   //    2) Using Action class (mouse and keyboard actions)
   //    3) using JavaScript 
	
//___________________________________________________________________________________________________________
	
	//Q) Selenium program:- suppose you go on Flipkart and there are multiple mobile devices and along with devices thier prices are displayed
	//                      you have to sort the prices
	//                      How will you do it          (asked in one interview to Tulsi sir)
	
	
	
}
