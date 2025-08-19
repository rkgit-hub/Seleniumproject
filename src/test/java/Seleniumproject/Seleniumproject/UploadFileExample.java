package Seleniumproject.Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//Upload single file
		/*driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:\\Users\\ramak\\OneDrive\\Desktop\\bank1.jpg");
		
		if(driver.findElement(By.xpath("//li[normalize-space()='bank1.jpg']")).getText().equals("bank1.jpg"))
		{
			System.out.println("File successfully Uploaded");
		}
		else
		{
			System.out.println("File not Uploaded");
		}
	
		}*/
	
		// Upload Multiple files
	
		String s1="C:\\Users\\ramak\\OneDrive\\Desktop\\bank1.jpg";
		String s2="C:\\Users\\ramak\\OneDrive\\Desktop\\BANK212.jpg";
		driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys(s1+"\n"+s2);// \n New Line
		
		
		// Verify the how many files are uploaded
		
		int li=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(li==2)
		{
			System.out.println("All files are uploaded");
		}
		else
		{
			System.out.println("Files are not uploaded");
		}
		
		// Validate the files
		
		if(driver.findElement(By.xpath("//li[normalize-space()='bank1.jpg']")).getText().equals("bank1.jpg") 
			&& (driver.findElement(By.xpath("//li[normalize-space()='BANK212.jpg']")).getText().equals("BANK212.jpg")))
			{
			System.out.println("FileS successfully Uploaded");
			}
			else
			{
				System.out.println("File not Uploaded");
			}
			
		
	}
}
