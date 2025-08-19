package dataDrivenTest;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CalculateFD{

	WebDriver driver;
	@Test
	public void calculate() throws IOException, InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='No thanks']")).click();
		String filepath=System.getProperty("user.dir")+"\\TestData\\calculator.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(filepath);
		
		int rows=ExcelUtils.getRowCount(filepath,"Sheet1");
		for(int r=1;r<rows;r++)
		{
			// getting data from Excel 
			
			String prince=ExcelUtils.getCellData(filepath, "Sheet1",r,0);
			String ri=ExcelUtils.getCellData(filepath, "Sheet1",r,1);
			String period1=ExcelUtils.getCellData(filepath, "Sheet1",r,2);
			String period2=ExcelUtils.getCellData(filepath, "Sheet1",r,3);
			String freq=ExcelUtils.getCellData(filepath, "Sheet1",r,4);
			String exp_mvalue=ExcelUtils.getCellData(filepath, "Sheet1",r,5);
			
			
			// Passing the data into web application
			driver.findElement(By.id("principal")).sendKeys(prince);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(ri);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			Thread.sleep(1000);
			Select se=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			se.selectByVisibleText(period2);
			Thread.sleep(1000);
		
			Select se2=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			se2.selectByVisibleText(freq);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]")).click();
			
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filepath,"Sheet1", r,7,"Passed");
				ExcelUtils.fillGreenColor(filepath,"Sheet1",r,7);
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filepath,"Sheet1", r,7,"Failed");
				ExcelUtils.fillRedColor(filepath,"Sheet1",r,7);
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='CTR PT15']//a//img[@class='PL5']")).click();
		}
		driver.quit();	
	}

}
