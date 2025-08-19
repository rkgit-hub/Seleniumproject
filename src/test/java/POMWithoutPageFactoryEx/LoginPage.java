package POMWithoutPageFactoryEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// Finding locators
	
	By txt_uname_loc=By.xpath("//input[@placeholder='Username']");
	By txt_pwd_loc=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	
	// Writing action Methods
	public void setUserName(String username)
	{
		driver.findElement(txt_uname_loc).sendKeys(username);;
	}
	public void setPassword(String password)
	{
		driver.findElement(txt_pwd_loc).sendKeys(password);
	}
	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();
	}

}
