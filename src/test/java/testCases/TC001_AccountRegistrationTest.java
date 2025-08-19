package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass{
	
	@Test
	public void verify_account_registration() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		hp.clickRegister();
		
		AccountRegistrationPage arp=new AccountRegistrationPage(driver);
		arp.setfirstname("Aryan");
		arp.setlastname("kumar");
		arp.setemail("aryan@123456");
		arp.setpassword("Aryan@123");
		arp.checkagree();
		Thread.sleep(10000);
		arp.clickContinue();
	}

}
