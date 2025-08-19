package AnnotationsInTestNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;
public class Class3 
{
	@Test
	public void pqr()
	{
		System.out.println("This is pqr from class3");
	}
	@BeforeSuite
	public void bs()
	{
		System.out.println("This is Before Suite Method");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("This is After Suite Method");
	}
	
}
