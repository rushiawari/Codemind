package POMandMAVEN;

public class MavenLifeCycle {

	
	///Maven Life Cycle:-  Following Sequence never changes
	/*
	
	1) Prepare Resources:- Resource copying can be costomized in this phase.
	
	2) Validate:- (Validating the imformation) validates if the project is correct and if all necessory information is available.
	               validates your syntaxes,files like pom.xml,tesNG.xml everything before go to the compilation.
	              
	
	3) Compile :- (Compilation) Source code compilation is done in this phase. 
	               Using comiler pluging it compiles the source code according to java support.
	
	4) Test    :- (Testing) Tests the compiled source code suitable for testing framework. 
	               Execute the test cases.
	
	5) Package :- (Packaging) This phase creates the JAR/WAR packahe as mentioned in the packaging in POM.xml
	
	              for ex=> if you want to package your project as JAR file the simply paste following code in your pom.xml file
	              <packaging>jar</packaging>
	
	6) Install :- (Installation) This phase installs the package in local/remote maven repository.
	               you simply install your Jar file in maven central repository.
	
	7) Deploy  :- (Deploying) Copies the final package to the remote repository.
	              suppose if you have any remote server you simply deploy your project there so that 
	              if anyone wants access to your project he can get it from there.
	                
	
	// Keep in mind that:- if you initiate any of theses command all commands comes before it (under it) gets automatically executes.
	 
	    for e.g => If you execute (Test) command =>  prepare sorce+validate+compile thses phases gets automatically executes under this command.
	    
	    similarly if you execute (Deploy) then all the command gets executed.
	
	
	*/
	
	
	/// Note :- All these commonds are available in (Run Configuration) of POM.xml file
	
	
	
	
	
	
}
