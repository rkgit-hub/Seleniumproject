package AnnotationsInTestNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	public void xyz()
	{
		System.out.println("This is xyz from class2");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("This is After test Method");
	}

}
