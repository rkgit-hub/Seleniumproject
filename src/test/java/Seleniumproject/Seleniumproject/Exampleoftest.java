package Seleniumproject.Seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exampleoftest {
	WebDriver driver=null;
	public void Setup()
	{
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.letskodeit.com/practice");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
	}
	public void Radiobutton(String radioname)
	{
		List<WebElement> radiolist1=driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement radiolist:radiolist1)
		{
			String value=radiolist.getDomAttribute("id");
			if(value.equals(radioname)) {
				radiolist.click();
				break;
			}
		}
		}
		
	public void Browserquit()
	{
		driver.quit();
	}
	

	public static void main(String[] args) {
		
		Exampleoftest test=new Exampleoftest();
		test.Setup();
		test.Radiobutton("bmwradio");
		test.Browserquit();
	}

}
