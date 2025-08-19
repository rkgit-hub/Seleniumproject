package AnnotationsInTestNG;

import org.testng.annotations.*;

/* 
  	login()----->@BeforeMethod (here we multiple before methods)
  	search()---->@Test
  	logout()---->@AfterMethod
  	login()----->@BeforeMethod
  	advsearch()->@Test
  	logout()--->@AfterMethod
 */

public class Methods {
	@BeforeMethod
	public void login()
	{
		System.out.println("login in to the Application");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from the Application ");
	}
	@Test(priority=1)
	public void search()
	{
		System.out.println("This is to search");
	}
	@Test(priority=2)
	public void advsearch()
	{
		System.out.println("This is Advance Searching");
	}

}
