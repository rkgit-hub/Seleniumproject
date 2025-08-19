package Seleniumproject.Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookanyticket {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://183.82.106.55:9099/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/movie']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@src='https://image.tmdb.org/t/p/w500//d8Ryb8AunYAuycVKDp5HpdWPKgC.jpg']")).click();
	}

}
