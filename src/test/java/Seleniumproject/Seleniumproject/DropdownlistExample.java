package Seleniumproject.Seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownlistExample {
	WebDriver driver=null;
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void dropdown()
	{
		WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		Select drcountry=new Select(country);
		
		//select option from dropdownlist
		
		//drcountry.selectByVisibleText("India");	// By using Visible text for selecting option from drowdown. 
		//drcountry.selectByIndex(5);				// By using index value for selecting option from dropdown
		drcountry.selectByValue("uk");				// By using attribte value for selecting option from dropdown
						// if Value of attribute not available in html dont use "SelectByValue()" method 
		
		// Count options from the dropdown
		
		List<WebElement> opt=drcountry.getOptions();// getOptions() method will return the all options from the webelement
		System.out.println("Counting of Options:"+ " "+opt.size());
		
		// Printing the options from dropdownlist by using normal for loop
		/*for(int i=0;i<opt.size();i++)
		{
			System.out.println(opt.get(i).getText());
		}*/
		// printing options from dropdown by using enhance for loop
		for(WebElement op:opt)
		{
			System.out.println(op.getText());
		}
	}

	public static void main(String[] args) {
		DropdownlistExample obj=new DropdownlistExample();
		obj.setup();
		obj.dropdown();

	}

}
