package POMWithPagaFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);   // Mandatory Pagefactory will invoke for all kinds of WebElements
	}
	
	@FindBy(xpath="//input[@placeholder='Username']") // @FindBy will finding the webElement
	WebElement txt_username;						// After finding Element it will store in a variable
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	/*@FindBy(tagName="a")
	List<WebElement> links;*/        //Using this to Find List of WebElements 
	
	public void setUserName(String username)
	{
		txt_username.sendKeys(username);
	}
	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	public void clickLogin()
	{
		btn_login.click();
	}

}
