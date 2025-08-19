package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC_002_LoginTest extends BaseClass
	{
		@Test
		public void verify_Login() throws InterruptedException
		{
			HomePage hp=new HomePage(driver);
			hp.clickMyaccount();
			hp.clickLogin();
			
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(pf.getProperty("email"));
			lp.setPassword(pf.getProperty("password"));
			lp.clickSubmit();
	}

}
