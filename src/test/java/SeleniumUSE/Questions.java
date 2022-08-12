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
	
//________________________________________________________________________________________________________________________________________________________________
	
	
	
	//Questions by Tulsi Sir For Manual Testing
	
	/*
	 * 1) Severity & Priority with examples.
	 * 2) Agile 
	 * 3) Sprint 
	 * 4) User stories , Story points
	 * 5) scrum meetings :- PI planning , Daily scrum call, Sprint planning, Sprint restrospective
	 * 6) burnt down chart
	 * 7) Bug Life Cycle
	 * 8) Sanity, Smoke, Regression ,System Testing    // always Smoke vs Sanity difference
	 * 9) Daily Routine in Company
	 * 10) Acceptance Criteria means what?
	 * 11) When you close user storie/Test case.
	 * 12) Accurately Explain Your Project
	 * 13) Agile Framework and Agile Ceremonies you must know deeply
	 * 14) Test Design Techniques
	 * 
	 * 
	 * 
	 */
	
	
	
//__________________________________________________________________________________________________________________________________________________________________	
	
	//How many test cases you automate on daily basis?   (never tell direct numbers)
	// Sir it depeneds on complexity of functionality, pages are created or not,test data already in place or not, pre-requisites
	//if all those thinks are ready made and also having complexity level medium i can automate 2 to 3 test cases daily
	// but if test data is very less or unavailable, functionality is very complex, and pages also not in place then for me
	//  it will take  of almost 1 to 2 days  to create everything and finally deliver 1 test case.
	
//____________________________________________________________________________________________________________________________	
	//Challanges you faced while Automation Testing?
	
	/*
	 * 1) Unable to click on element using simple click
	 * => I used JavaSCript Executor Interface method to click
	 * 
	 * 2) TimeOut Exception and sometimes NoSuchElement Exception due to dynamic elements on webpage
	 * => I wrote one utility method using Fluent Wait
	 * 
	 * 3) Handling web table data was somewhere challanging for me
	 * => i used table parameters like td (table data) tr(table row) and wrote a single xpath to take all the data at a single time
	 *    and run one loop ...it was different way from others but eventually it worked properly. 
	 *    
	 * 4)
	 * 
	 * 
	 */
	
//_______________________________________________________________________________________________________________________________________	
	
	
	// What is your Daily Routine?
	// How Agile works in your compony?
	// Real time Scinerio of Agile Framework?
	// What pattern you follow ?
	// How you execute sprint in your organization & what are the tasks comes under a single sprint?
	
	/*
	 * 1) As we are working in agile methodology ,in initial days of sprint we have different kind of meetings as like 
	 *    sprint planning, User story refined sessions in which we allot story points according to complexity of that user story (1 to 5),
	 *    then after stating of sprint we have face daily standup scrum calls where we discuss
	 *    what we did yesterday,what we are doing day, if there any inpediments or blocker in your work.
	 *    
	 * 2) 1st day:- i will create a Task1 :- going through existing user story ,gathering imformation,understanding future requirement from respective user story
	 * 3) 2nd day:- Now i have understood a functionality and if i found anything problematic/doughts then will raise it in daily scrum
	 *              task2:- i am drafting manual test cases         
	 *              it will take 1 -2 days to create and review those test cases by product owner /BA  if they anything which should not be there then they will 
	 *              provide any comment with it 
	 * 4) 3rd/4th day:- task:- started auomating manual written test cases
	 *             it will take 3 to 4 days for automation i will get build from user which they have build in 4 to 5 days
	 *             and they will deploy it on testing environment anmd provide me with link.
	 *             
	 *    Task :- started executing written test cases manually    
	 *    Task :- Started automating manual written test cases
	 *   
	 *    Before last day of Sprint i will have all the Automation script with execution results 
	 *    I need to change status of respective user story from in Progress to completed.
	 *    at the time of changing status i need to attach all the artifacts or execution reports with that user story. those will be my evidences
	 *    
	 *    Now product owner will accept the user story and close that user story
	 *         
	 *    On Last day there will be sprint demo sometimes developer or sometimes tester gives that demo.
	 *    in that we need to show them UI what we have develope or test how it works ,how the error getting displayed
	 *    
	 *    And another one meeting is there "Sprnit Restrospective" in this meeting all team members,product owner, manager, all those people will discuss
	 *    on what we done in last 15 days, where we have mistaken ,all those mistakes should not get repeated in upcming sprints
	 *    all such things we discuss in Sprint Retrospective meeting and its the end of our sprint.
	 *    
	 *         Tester complaints such as - we got test data very late thats why our execution got delayed
	 *                                     user story was highly complex and there were lots large number of test cases in the user story
	 *                                     thats why it was taking very much time for completion
	 *                                     that user story shuold not have included in this sprint somewhere that user story overloaded testers with workload
	 *                                     from next time we have to include limited user stories according to complexity.
	 * 
	 */
//______________________________________________________________________________________________________	
	
	//my Jenkins set up
	
	// rushiawari16
	
	// 7$yzGwcTkJDJ-._
	
	//http://localhost:8000/
	
	// id -1234
	
	
	
}
