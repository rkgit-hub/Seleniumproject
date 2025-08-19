package Seleniumproject.Seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
	WebDriver driver=null;
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void bootstrap()
	{
		driver.findElement(By.xpath("//button/span[contains(@class,'multiselect')]")).click();
		
		// select one option from dropdown
		driver.findElement(By.xpath("//input[@value='jQuery']")).click();
		
		// counting option from the dropdown
		List<WebElement> check=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(check.size());
		
		// printing the option from the dropdown
		for(WebElement checkss:check)
		{
			System.out.println(checkss.getText());
		}
		
		//Select multiple option from dropdown
		
		for(WebElement checks:check)
		{
			if(checks.getText().equals("Java")||checks.getText().equals("Bootstrap"))
			{
				checks.click();
			}	
		}
	}
	public static void main(String[] args) {
		BootstrapDropdown obj=new BootstrapDropdown();
		obj.setup();
		obj.bootstrap();

	}

}
