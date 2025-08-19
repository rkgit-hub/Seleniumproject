package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {
	
	//@Test
	void hardAssertion()
	{
		System.out.println("Statement1");
		System.out.println("Statement2");
		
		Assert.assertEquals(123, 125);     // Hard Assertion

		System.out.println("Statement3");
		System.out.println("Statement4");
		
		// In the above code if assertion is got failed the next statements will not execute
		// whenever we create some test methods the last statement should be an assertion.
		// Hard assertion methods are static due to that by using Assert Class we can call those methods
		
		// To overcome above problem if assert is got filed by using soft assertion
		// even though the next statements should be execute. 
	}
	
	@Test
	void softAssertion()
	{
		SoftAssert sa=new SoftAssert();    
		System.out.println("Statement1");
		System.out.println("Statement2");
		
		sa.assertEquals(123, 125);     // Soft Assertion

		System.out.println("Statement3");
		System.out.println("Statement4");
		
		sa.assertAll();    /*This statement should be last mandatory in test methods of soft assertion*/
	                           
	}
	
	//in the above code even though test method is got failed rest of the statements are executed
	
	/*if we want to call soft assertion methods we have to create object for SoftAssert Class the
	   then only we will get soft assertion method*/
}
