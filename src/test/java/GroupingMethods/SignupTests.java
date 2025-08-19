package GroupingMethods;

import org.testng.annotations.Test;

public class SignupTests {
	@Test(priority=1,groups={"regression"})
	void signupByFacebook() 
	{
		System.out.println("Singning up Facebook...");
	}
	@Test(priority=2,groups={"regression"})
	void signupByEmail() 
	{
		System.out.println("Singning up Email...");
	}
	@Test(priority=3,groups={"regression"})
	void signupByTwitter() 
	{
		System.out.println("Singning up Twitter...");
	}
	

}
