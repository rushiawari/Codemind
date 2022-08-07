package testNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 @Listeners(ListenersInTestNG.class)               // How to bound Listener?  this is how we bound listener with Listener Annotation 
//@Listeners(testNG.ListenersInTestNG.class)       this is also a way by using qualified name  means packageName.className.class
public class ListenerUse {

	@Test
	public void test() {
		
	} 
}
 