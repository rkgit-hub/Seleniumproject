package Seleniumproject.Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorEx {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	//ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	//passing the value into textbox------> alternate of Sendkeys() method
	
	WebElement inputtext=driver.findElement(By.xpath("//input[@id='name']"));
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver; //(When created driver variable by using WebDriver class
														//reference type then use the Scenario
														// upcasting---> parent to child 
	//JavascriptExecutor js=driver;  // If you created driver variable for ChromeDriver   
									// by using direct ChromeDriver reference type then use this Scenario
	
	js.executeScript("arguments[0].setAttribute('value','Ramana')",inputtext);
	
	
	// cliking on element-----> alternate of click() method
	
	WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
	js.executeScript("arguments[0].click()",radiobtn);
	
	}
}
