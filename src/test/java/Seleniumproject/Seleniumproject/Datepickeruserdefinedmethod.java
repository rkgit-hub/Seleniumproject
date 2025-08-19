package Seleniumproject.Seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickeruserdefinedmethod {
	//   9for future date 
	static void selectfuturedate(WebDriver driver,String year,String month,String date)
	{
		while(true)
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next year
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//Previous year
		}
			// Selecting the date
			List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
			for(WebElement dt:alldates)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			}
	}
	//for past date
	static void selectpreviousdate(WebDriver driver,String year,String month,String date)
	{
		while(true)
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
			if(currentmonth.equals(month) && currentyear.equals(year))
				{
					break;
				}
					
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//Previous year
				}
					// Selecting the date
			List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
			for(WebElement dt:alldates)
			{
				if(dt.getText().equals(date))
					{
						dt.click();
						break;
					}
			}
	}
		

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//future date 
		/*String year="2026";
		String month="January";
		String date="18";*/		
		
		// Previous date
		
		String year="2020";
		String month="January";
		String date="20";
		//Datepickeruserdefinedmethod.selectfuturedate(driver,year,month,date);
		Datepickeruserdefinedmethod.selectpreviousdate(driver,year,month,date);

	}

}
