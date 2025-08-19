package TestNGexp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	
	WebDriver driver;
	@Test(priority=1)
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void login()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority=3)
	public void Verifyapp() throws InterruptedException
	{
		boolean logo=driver.findElement(By.xpath("//img[@src='/web/images/orangehrm-logo.png?v=1721393199309']")).isDisplayed();
		if(logo==true)
		{
			System.out.println("Logodisplayed...");
		}
		else
		{
			System.out.println("Logo Not Displayed...");
		}
		Thread.sleep(3000);
	}
	@Test(priority=4)
	public void logout()
	{
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
	}
	@Test(priority=5)
	public void closeApp()
	{
		driver.quit();
	}
	

}
