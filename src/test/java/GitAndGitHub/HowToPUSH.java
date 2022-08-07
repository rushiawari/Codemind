package GitAndGitHub;

public class HowToPUSH {
	
	
	// (How To push) your work/code or the changes you made to the central Repository.

	
    
    //   when ever we made any change inside your code in IDE 
    //   you just in your local repository and in git bash simply write git status => you can see what changes you made in which file.
     
               

//lets make one change here


public static void main (String []args) {
	 System.out.println("Hello World");
	 System.out.println("Rushi Awari");
	 System.out.println("mmm");
}

// 1)  Now we can see modifications inside local repository in git bash => (git status)

// 2)  then (git add) this change in central repo  ...when you use (git add) command it gets added into local repository hence tyou need to cummit it
//     if you want to provide more than one file then simply put (,) between path of two files.
//     note:- we always add (.java) file not (.class)
// when you (add) file get store in buffer then you commit it and push to central repo.....i.e by (git add) you just take file in buffer so that you can add it to central.  


// 3) (git commit -m "This is changes for git learning")  => this is how commited our change with proper massage

//     now at last we will push our change   (we already have set upstream origin main(ourbranch) ) so no need now 
// 4) (git push) => and enter   
//     this is how we push our change to the central repository
}


// git init => we no need here because we already created local repo for the project

// git remote add origin => no needed because we already conneacted our local repo with central repo 







//IMP NOTE:- //command to DELETE the branch => git branch -D branch name	



//_____________________________________________________________________________________________________________________________________________________________________

	// This is our Job in Company
	
	// IMPORTANT:- How to create new branch from gitBash and push code to that branch directly from gitBash
	//            Because in company you never Add your code directly in main/master branch
	//            You create your Own branch and add code in that branch
	//            And push your branch(with your code) to central Repository
	//            where someone will go through your code and finally merge or reject it 
	//            If he accepted you code he will merge and Delete your branch from central Repo.
	
	
	
	////////This is my way
	
	// git branch -m main      (switch to main branch)   this is the command to switch to any branch
	
	
	// git branch -M master   => to create new branch master
	
	// git add "file.java"    => add modefied file 
	
	// git commit -m "comment"
	
	// git push --set-upstream origin master => to set remote origin and push your code there
	// git push origin master                => you can also use this way to push on particular origin(branch) but if there is only one branch or
	                                           // you already have set origin of this branch in that condition it by default push to that origin
	
	// Note :- git remote add origin :- only set remote
	         // but git push --set-upstream master :- sets remote origin and push to that remote origin 
	
	
	
	// Now you will able to see new branch inside your central repo.
	
	// simply sompair both with "pull request"
	// and confirm pull request 
	// at last delete your master branch
	// now you will see your code inside main branch

//command to DELETE the branch => git branch -D branch name	
	
	//________________________________________________________________________________________
	
	////////Sir's way
	
	//1) git checkout -b rushi            => rushi is new branch name => here we created new branch and switched to that branch
	
	//2) git checkout main    => now we will get switched to main branch   => -b we only use to create a branch not to switch over existing
	
	//3) again switch back to git checkout rushi
	
	//4) git status   =>   you will see empty/clean   => go in project and do any change
	
	// now the changes will get store inside rushi branch
	
	//5) git add "change file"
	
	//6) git commit -m "meaningfull massage"
	
	//7) git push --set-upstream rushi
	
	// now go on GitHub and merge pull request 
	// see changes made
	// confirm merge and delete Rushi branch
	




//________________________________________________________________________________________________________________

/*
 * Interview answer by Sir:
 * 
 * what is the flow/steps you follow to push youe code to central Repository?
 * 
 *  first of all i open gitBash 
 *  then i hit command git status 
 *  there i get to see what changes i have made all the file paths 
 *  then i hit command git add in that command i add all new code files
 *  then i use git commit and give proper massage 
 *  then i finally hit git push command 
 *  and if i haven't set remote origin then i use another way git push --set-upstream branchName   (my created branch not directly main/master central branch)
 *  or git remote add origin and paste my gitHub/Central Repo link in front of that  ....before pushing.
 *  
 *    after push i simply open GitHub and there i will be able to see my commit also
 *    i simply do create merge request there thats it.
 *    after that my roll is done now my lead will perform further action
 *    my lead check outs everything and decide to riview, aprove or comment.
 *    
 *    if my lead not ok with my code then he comment like "this code is not as per our standards please make changes in this this code/lines"
 *    then iwill make those all changes metioned in comments and then flow repeats add again,commit,push 
 *    but this time i no need to create new pull request because whenever i will push new changes they will automatically gets added in previous pull request.
 *    lead will again go through the same pull request if he would found it ok then he would aprove 
 *  
 * 
 * 
 * 
 * Note :- We always push codes on our created Branch not directly on main branch.
 *         so that someone can review , aprove and merge it inside main branch maybe our lead.
 *         But we always pull from main/master central Branch.
 * 
 * 
 */





