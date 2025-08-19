package ParallelTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class Paralleltests {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})    // taken this parameters from xml file
	void setup(String br,String url1) throws InterruptedException
	{
		switch(br.toLowerCase())      // string converting  upper case to Lower case 
		{
		case "chrome":driver=new ChromeDriver();
		break;
		case "edge":driver=new EdgeDriver();
		break;
		case "firefox":driver=new FirefoxDriver();
		break;
		default:System.out.println("Invalid Browser"); return;   // it retrun from the loop
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url1);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	@Test(priority=1)
	void testLogo()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@Test(priority=3)
	void testURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
