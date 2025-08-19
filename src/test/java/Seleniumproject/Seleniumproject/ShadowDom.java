package Seleniumproject.Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
	//driver.findElement(By.cssSelector("#input")).sendKeys("Welcome");// NosuchElementfound 
				
		//This Element is inside single shadow DOM.only by using cssSelector we can find the element
		//To find shadow DOM element Xpath will not work.....
	
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome");
	}

}
