package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement txtlname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement agreecheck;
	
	@FindBy(xpath="//div[@class='row mb-3']//div[@class='col-sm-10']")
	WebElement btncontinue;
	
	public void setfirstname(String fname)
	{
		txtfname.sendKeys(fname);
	}
	public void setlastname(String lname)
	{
		txtlname.sendKeys(lname);
	}
	public void setemail(String email)
	{
		txtemail.sendKeys(email);
	}

	public void setpassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	public void checkagree()
	{
		agreecheck.click();
	}
	public void clickContinue()
	{
		//btncontinue.click();
		
		//btncontinue.submit();  // By Using Submit also we can do click action
		
		Actions act=new Actions(driver);                  // By using Actions class we will perform click action
		act.moveToElement(btncontinue).click().perform();
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;   // By Using JavascriptExecutor 
		js.executeScript("arguments[0].click();", btncontinue);*/
	}
	

}
