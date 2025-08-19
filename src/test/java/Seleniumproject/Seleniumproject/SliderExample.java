package Seleniumproject.Seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderExample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions act=new Actions(driver);
		
	// Min slider
		WebElement min_slider=driver.findElement(By.xpath("//div/span[@tabindex='0'][1]"));
		
		System.out.println("Defualt value of min_slider is:"+min_slider.getLocation());//(59,293);
		act.dragAndDropBy(min_slider,100 , 293).perform();
		System.out.println("Value of Min_slider after moving:"+"\t"+min_slider.getLocation());//(158,293)
		
	// Max_Slider performance
		
		WebElement max_slider=driver.findElement(By.xpath("//div/span[@tabindex='0'][2]"));
		
		System.out.println("Defualt value of min_slider is:"+max_slider.getLocation());//(612,250);
		act.dragAndDropBy(max_slider,-100 , 293).perform();
		System.out.println("Value of Max_slider after moving:"+"\t"+max_slider.getLocation());//(512,250)
		

	}

}
