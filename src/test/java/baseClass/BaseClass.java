package baseClass;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {
	public WebDriver driver;
	public Properties pf;
	
	@Parameters({"os","browser"})
	@BeforeClass
	public void setUp(String os,String br) throws InterruptedException, IOException 
	{
		FileReader file=new FileReader(".\\src\\test\\resources\\config.properties");
		//Loading file properties
		pf=new Properties();
		pf.load(file);
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default:System.out.println("Invalid Browser"); return;
		}
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(pf.getProperty("url"));
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	

}
