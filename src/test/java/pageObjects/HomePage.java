package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement linkmyaccount;
	
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Register']")
	WebElement linkregister;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement linklogin;
	
	public void clickMyaccount()
	{
		linkmyaccount.click();
	}
	
	public void clickRegister()
	{
		linkregister.click();
	}
	
	public void clickLogin()
	{
		linklogin.click();
	}
	
	
	
}
