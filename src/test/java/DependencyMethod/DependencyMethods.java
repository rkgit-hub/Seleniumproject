package DependencyMethod;

import org.testng.Assert;
import org.testng.annotations.Test;
// Whenever test method got failed due to some reasons we just want to skip dependent methods.
//Advantage of DependencyMethodsno need to run unnecessarly every test method. 
public class DependencyMethods {
	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods={"openApp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods={"login"})
	void search()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods={"login","search"})
	void advSearch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=5,dependsOnMethods={"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
}
