package Seleniumproject.Seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsExample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("WELCOME TO RAMANASOFT");
		
		//Ctrl+A ------> Select the Text
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//Ctrl+C ------> Copy the Text
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		// TAB-----> Shift to Second Text Box
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		// Ctrl+V
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		
		

	}

}
