package GroupingMethods;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test(priority=1,groups={"sanity","regression","functional"})
	void paymentbyRupees() 
	{
		System.out.println("Payment By Ruppes...");
	}
	@Test(priority=2,groups={"sanity","regression","functional"})
	void paymentbyDoller() 
	{
		System.out.println("Payment By Doller...");
	}
}
