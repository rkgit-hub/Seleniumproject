package Seleniumproject.Seleniumproject;

import org.testng.annotations.Test;

public class ExampleofTestNG {
	@Test(priority=1)
	void openapp()
	{
		System.out.println("Opening application");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("Login to Application");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout to Appication");
	}
	

}
