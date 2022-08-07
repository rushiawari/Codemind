package POMandMAVEN;

public class Maven {
	
	// Maven in one of the Build tool mostly used in java based applications.
	
	// As its a Build Tool , it builds your whole Project and provide its Jar file as a Outcome.
	// Avoid manual process like to compile , to Run , maven handles thses processes internally.
	// It provides us Build of our project in the form of Jar.
	// It provides ready-made project structure.
	// pom.xml file is a heart of maven.
	
	//Dependencies => To install any Jar files
	//Plugins => To install any plugin you want
	
	
	/// Coomands Under Maven:=>
	
	/*
	 
	 * 3) Maven Clean => It cleans previous Run's Artifacts. That were generated during Last run
	                     it deletes your Target folder(also Jar file of your project)........  (Clean has Lowest Priority=> only cleans and stops)
	                     We use it to clean previous projects Artifacts like Jars,Target Folder etc 
	                    
	 * 5) Maven install=> it installs all the dependencies and required updates and installs it in your Maven Project(POM.xml)   (clean+Test+Install)
	                     it aslo useful when any of your maven dependency/plugin is abnormally installed , it installs it properly.
	                      
	 * 6) Maven Test=>  firstly it initaite Maven Clean and then it start Maven Test... it automatically performs both of these actions.  (clean+Test)
	                    Test is use To execute the test cases inside our project
	 
	 * 1)2) when you click on (Maven Build) => it Automatically initiate Maven (Clean) then Maven (Test) then Maven (Install) and at the end it creates Maven Build.  
	        Build=> (Clean+Test+Install+Build)
	  
	  
	 * ///This how Maven Builds , compile, load,validate and finally Create Jar
	       and at last deploy to the server...Thsese are the phases comes under Maven.
	  
	 */

	
	
	/*
	 *
	 * In addtion to Dependencies Pom.xml file also has some imp Plugins
	 *for e.g
	 *1) maven-compiler-plugin:- In this plugin I have to declare that which java version will be used to compile my Maven project (used for compilation purpose)
	                              In which java Version (source) will build and (target) files will support to which java version
	                              
	 *2) maven surefire plugin:- in this plugin includes configuration of test (what to test), so to configure which test cases to execute or to skip
	                              we provide our testng.xml file path inside this plugin.
	                              
	                              IMP Note:- Surefire plugin also generates reports....(emailable Html report)
	                              Thhis is aslo one advantage of Maven .
	 
	 *These two plugins are always used in Pom.xml file in the industries.
	 *Always remember that
	 * 
	 */
	
	
	
	
	/*  Plugins code:-
	  
	  	</dependencies>
	 
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.10.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>
			
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.0.0-M6</version>
				<configuration>
					<suiteXmlFiles>
						<file>C:\Rushi java workspace\com.codemind.project\testng.xml</file>
					</suiteXmlFiles>
				</configuration>
			</plugin>
		</plugins>
	</build>
	
</project>
	  
	 
	                                                                           */
}
