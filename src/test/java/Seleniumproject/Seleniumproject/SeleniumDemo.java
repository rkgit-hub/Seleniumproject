package Seleniumproject.Seleniumproject;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		
		 driver.findElement(By.xpath("//div/input[@id='female']")).click();
		 List<WebElement> checks=driver.findElements(By.xpath("//div/input[@class='form-check-input'] [@type='checkbox']"));
		 
		 for(int i=2;i<5;i++)
		 {
			 checks.get(i).click();

		 }
		 /*Thread.sleep(10);
		 for(int i=2;i<5;i++)
		 {
			 if(checks.get(i).isSelected())
			 {
			 checks.get(i).click();
			 }
		 }*/
		
		/*for(WebElement ch:checks)
		  
		 {
			ch.click();
		 }*/
		 WebElement lists=driver.findElement(By.xpath("//select[@id='country']"));
		 Select lt=new Select(lists);
		 lt.selectByVisibleText("France");
		 
		 WebElement options=driver.findElement(By.xpath("//select[@id='colors']"));
		 
		 Select select= new Select(options);
			if(select.isMultiple()) { //true
				select.selectByIndex(2);
				select.selectByVisibleText("Yellow");
	}
	
	}
}


