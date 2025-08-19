package AnnotationsInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 login()------->@BeforeClass
 search()------>@Test
 advSearch()--->@Test
 logout()------>@AfterClass
 */



public class Classlevel {
	@BeforeClass
	public void login()
	{
		System.out.println("login in to the Application");
	}
	@AfterClass
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
