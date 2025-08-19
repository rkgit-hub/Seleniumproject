package Dataproviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Dataprovider {
	//By using DataProvider we will repeat the data instead of looping concept
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	}
	@Test(dataProvider="dp")				// this dataProvider is attribute
	void testLogin(String email,String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		boolean status=driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		if(status==true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][text()='Logout']")).click();
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.fail();
		}
	}
	
	@AfterClass
	void teaeDown() 
	{
		driver.quit();
	}
	@DataProvider(name="dp",indices={0,4})   //this DataProvider is Annotation
									// indices attribute will repeat the specific input Ex. indices={0,3}
	Object [][] testData()
	{
		Object [][] data= {
							{"abc123@gmail.com","test@123"},
							{"xyz@gmail.com","test@243"},
							{"john@gmail.com","test@245"},
							{"pavan123@gmail.com","test@123"},
							{"john123@gmail.com","test879"}
						};
		return data;
	}
		
		
	

}
