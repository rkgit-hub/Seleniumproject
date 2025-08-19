package Seleniumproject.Seleniumproject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExamples {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		
		// Fullpage screenshot
		
		/*File sourcefile=sc.getScreenshotAs(OutputType.FILE);// this method from TakesScreenshot Interface class
		
		File targetfile=new File("C:\\Users\\ramak\\eclipse-workspace\\Seleniumproject\\screenshots\\fullpage.png");
		
		sourcefile.renameTo(targetfile);*/
		
		// Capture the screenshot specific area
		
		/*WebElement fproduct=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File sourcefile1=fproduct.getScreenshotAs(OutputType.FILE);// This method from WebElement Interface class
		File targetfile1=new File("C:\\Users\\ramak\\eclipse-workspace\\Seleniumproject\\screenshots\\productpage.png");
		sourcefile1.renameTo(targetfile1);*/
		
		//Capture the Screenshot specific WebElement
		
		WebElement ele=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File sf=ele.getScreenshotAs(OutputType.FILE);  // This method from WebElement Interface class
		File tf=new File("C:\\Users\\ramak\\eclipse-workspace\\Seleniumproject\\screenshots\\img.png");
		sf.renameTo(tf);
		
	
		

	}

}
