package TestNGexp;

import org.testng.annotations.Test;

public class TestCasePriority {
	@Test(priority=1)
	public void openapp()
	{
		System.out.println("Open the Application...");
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("Login to Application...");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("Logout from the Appklication...");
	}

}
