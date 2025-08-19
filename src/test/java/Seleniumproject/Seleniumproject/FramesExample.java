package Seleniumproject.Seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {
	WebDriver driver= null;
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void frames()
	{
		//
	WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);//Switch to frame1
	
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("This is Aryan");
	driver.switchTo().defaultContent();// switch Back to page
	
	//Switch to frame2
	WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("This is Adwaith Sai");
	driver.switchTo().defaultContent();
	
	// Switch to frame3
	WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("This is Prasanna");
	
	//Switch to inner frame inside the frame3
	driver.switchTo().frame(0);// Switching to index value due to in frame3 have only one inner frame.
	
	driver.findElement(By.xpath("//div[@id='i12']//div[@class='AB7Lab Id5V1']")).click();
	driver.findElement(By.xpath("//input[@class='Hvn9fb zHQkBf']")).sendKeys("This is Ramakrishna");
	driver.switchTo().defaultContent();
	// Switch to frame5
	WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
	driver.switchTo().frame(frame5);
	
	driver.findElement(By.linkText("https://a9t9.com")).click();
	boolean bool=driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']")).isDisplayed();
	if(bool=true)
	{
		System.out.println("Image is displayed");
	}
	
	}
	public static void main(String[] args) {
		FramesExample obj=new FramesExample();
		obj.setup();
		obj.frames();
	

	}

}
