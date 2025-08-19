package DatadrivenTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FDCalculator 
{
	WebDriver driver;
	@Test
	public void calculate() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		String filepath=System.getProperty("user.dir"+"\\TestData\\Calculator");
		Workbook workbook = new XSSFWorkbook(filepath);
		
		
		
		
		
		
	}
	

}
