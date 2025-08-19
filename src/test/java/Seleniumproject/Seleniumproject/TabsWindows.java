package Seleniumproject.Seleniumproject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabsWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement reg=driver.findElement(By.xpath("//a[@class='ico-register']"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();
		
		//Switching to Registration Page
		
		List<String> id=new ArrayList(driver.getWindowHandles());
		
		// Registration page
		
		driver.switchTo().window(id.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ramana");
		Thread.sleep(2000);
		// Switching to homepage
		
		driver.switchTo().window(id.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");
		
	}

}
