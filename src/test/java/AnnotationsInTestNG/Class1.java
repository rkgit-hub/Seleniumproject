package AnnotationsInTestNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;
public class Class1 {
	
	@Test
	public void abc()
	{
		System.out.println("This is abc from class1");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is Before Test Method");
	}
}
 