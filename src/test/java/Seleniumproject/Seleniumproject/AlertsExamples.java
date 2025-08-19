package Seleniumproject.Seleniumproject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsExamples {
		public WebDriver driver=null;
		public void setup()
		{
			 driver=new ChromeDriver();
			 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		public void normalalert() throws InterruptedException
		{
			driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
			Thread.sleep(10000);
			Alert myalert=driver.switchTo().alert();
			System.out.println(myalert.getText());
			myalert.accept();
			WebElement text1=driver.findElement(By.xpath("//p[@id='result']"));
			System.out.println(text1.getText());
		}
		public void confirmalert() throws InterruptedException
		{
			driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
			Thread.sleep(10000);
			Alert myalert1=driver.switchTo().alert();
			myalert1.dismiss();
		}
		public void promptalert() throws InterruptedException
		{
			driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
			Thread.sleep(15000);
			Alert myalert=driver.switchTo().alert();
			myalert.sendKeys("This ramanasoft");
			myalert.accept();
			WebElement text1=driver.findElement(By.xpath("//p[@id='result']"));
			System.out.println(text1.getText());
		}
		
		//by using explicitwait we can handile the alert windows
		public void explicitwait() throws InterruptedException
		{
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10000));//declaration of Explicit Wait
			driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
			Thread.sleep(10000);
			Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
			System.out.println(myalert.getText());
			myalert.accept();
			
		}
	public static void main(String[] args) throws InterruptedException {
		AlertsExamples obj=new AlertsExamples();
		obj.setup();
		//obj.normalalert();
		//obj.confirmalert();
		obj.promptalert();
		//obj.explicitwait();
		

	}

}
