package Xslxfiles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadData {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");  // Disables all popups
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
		/*WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		
		Thread.sleep(2000);
		ele.click();*/
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		
		Actions action = new Actions(driver);

		action.moveToElement(inputField).perform();
		
		
		//inputField.click();
		 Thread.sleep(2000);
		inputField.sendKeys("Hyderbad");
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Hyderabad(Hyd)')", ele);*/
		
		//ele.sendKeys("Hyderabad");
		
		// Capture suggestions
		Thread.sleep(2000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));

        // Print and click desired suggestion
        for (WebElement suggestion : suggestions) {
            System.out.println("Suggestion: " + suggestion.getText());

            if (suggestion.getText().equalsIgnoreCase("Hyderabad, India (HYD)")); 
            {
                suggestion.click();
                break;
            }
        }
	}

}
