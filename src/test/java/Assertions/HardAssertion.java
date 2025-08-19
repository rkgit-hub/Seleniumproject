package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	void hardAssertion()
	{
		// Hard Assertion methods are static due to that  those methods directly we can call by using Assert class  
		
		//Assert.assertEquals("Ram", "Ram"); 	// test pass
		
		//Assert.assertEquals(101, 101);		//test pass
		
		//Assert.assertNotEquals("Ram", "Ram");	//test fail
		
		//Assert.assertNotEquals(101, 102);		//test pass
		
		//Assert.assertTrue(true); 				// test pass
		
		//Assert.assertTrue(false); 			// test fail
		
		//Assert.assertFalse(true); 			//test fail
		
		//Assert.assertFalse(false); 			// test true
		
		Assert.fail(); 							// test fial
	}

}
