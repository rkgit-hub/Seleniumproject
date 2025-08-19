package GroupingMethods;

import org.testng.annotations.Test;

public class LoginTests {
	@Test(priority=1,groups={"sanity"})
	void loginByFacebook()
	{
		System.out.println("Loging with facebook");
	}
	@Test(priority=2,groups={"sanity"})
	void loginByEmail()
	{
		System.out.println("Loging with Email");
	}
	@Test(priority=3,groups={"sanity"})
	void loginByTwitter()
	{
		System.out.println("Loging with Twitter");
	}
}
