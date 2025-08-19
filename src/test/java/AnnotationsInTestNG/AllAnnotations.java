package AnnotationsInTestNG;

import org.testng.annotations.*;

public class AllAnnotations {
	@BeforeSuite
	void bs()
	{
		System.out.println("This is Before Suite...");
	}
	@AfterSuite
	void as()
	{
		System.out.println("This is After Suite...");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("This is Before Test...");
	}
	@AfterTest
	void at()
	{
		System.out.println("This is After Test...");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("This is Before Class...");
	}
	@AfterClass
	void ac()
	{
		System.out.println("This is After Class...");
	}
	@BeforeMethod
	void bm()
	{
		System.out.println("This is Before Method...");
	}
	@AfterMethod
	void am()
	{
		System.out.println("This is After Method...");
	}
	@Test(priority=1)
	void m1()
	{
		System.out.println("This is Method1...");
	}
	@Test(priority=2)
	void m2()
	{
		System.out.println("This is Method2...");
	}
}
