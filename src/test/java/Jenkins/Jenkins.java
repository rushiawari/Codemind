package Jenkins;

public class Jenkins {

	// Jenkins is an Web Based Application/Tool
	// Well known tool for CICD :- Contineous integration Contineous Deployment/Delivery.
	
	
	// It helps to maintain Agile Approach
	// In Agile you build complete product in single-single part and test each one of them and then deploy one after one
	// to maintain that flow you need Contineous integration Contineous Deployment.
	
	// On every Sprint completion you developes a certain part of software and Test it.
	// so on every sprint completion you need to integrate that part of software in existing functionalities/modules
    // And at last you need to Deploy it.
	// thats why you need to follow the process repetatively each time in Agile.
	// As it is repetative we can Automate it.
	
	// We integrate our maven with Jenkins
	// when at last point you store your code in GitHub after review and mergeing, 
	// in Jenkins you provide time frequency to detect any change happened in code/central Repository or not. (for e.g 1 Hour=> (it will check for change on every 1 hour)
	// and when it found any change it immediatly pull that code/Build in its own repository and executes ,tests and finally deployes that code/Build on Server 
	// It deployes code on Server who's configuration we provided to it.
	
	// Jenkins also provide facility in which , if your Build gets fail during deployment/integration due to any reason .(for e.g test case failuer)
	// it will automatically send mail to that respective person may be Tester,Developer,Team Lead,BA.
	
	// This is how Jenkins contineous integrate code/build and contineously Deploy.
	
}



// have you worked on Jenkins?
// yes i have worked on it.

// what kind of work?
// we got one url from devOps team and there is already job was created
// so i am just running that job and investigating failuer

// How they creates pipelines?
// using groovy language code and linux commands executed through scripting and at last they also integrate it with dockers. 


// DevOps team provide you with Job URl what they have created already and you just need to Run that and check for Failuers
// and you need to fix that failuers locally in your IDE.
// And you push your code that you fixed ,on GitHub
//  Then Jenkins automatically takes that code from GitHUb  by polling SCM method in which we provided it with polling peroid
//  then Jenkins starts it work compile ,test,build and deploy on server 
//  and if build get fail emails to respective person (According to list provided to it)

//All such manual processes now automated by using Jenkins.

// Your product owner or manager will never see your test results in you local system they will always see your results in Jenkins execution results.














