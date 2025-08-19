package Seleniumproject.Seleniumproject;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SelectCheckboxs{
	public WebDriver driver=null;
	public void setup()
	{
		 driver=new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void checkbox()
	{
		//Select specipic checkbox
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//Select all checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		 
		//Select all checkboxes using normal for loop
		
			/*for(int i=0;i<checkboxes.size();i++)
			{
				checkboxes.get(i).click();
			}*/
		
		// Select all checkboxes using enhanced for loop;
		
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}*/
		
		
		// Select last 3 checkboxes
		
		for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}	
	}

	public static void main(String[] args) {
		SelectCheckboxs obj=new SelectCheckboxs();
		obj.setup();
		obj.checkbox();
	}

}
