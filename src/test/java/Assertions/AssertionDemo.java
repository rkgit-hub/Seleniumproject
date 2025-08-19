package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo  {
	@Test
	public void testTitle()
	{
		String exp_title="Opencart";
		String act_title="Openshop";
		
	/*	if(exp_title.equals(act_title))
		{
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test is Failed");
		
		}*/
		// In the above example by using conditional statement to validating eventhough condtion failed test method 
		// is showing pass to overcome this problem we have to use Assertions.
		Assert.assertEquals(exp_title,act_title);
	}
	
	// By using Assertions we can make test method passed or failed based on the condition
	
}
