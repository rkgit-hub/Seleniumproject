package amazonproj;


import java.io.File;
import java.time.Duration;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class SearchPriceandName {
	WebDriver driver=null;
	
	TakesScreenshot sc=(TakesScreenshot)driver;
	@Test(priority=1)
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	/*@Test(priority=2)
	public void findPrice() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
		// List to store product names and prices
		
	    List<SimpleEntry<String,String>> productList = new ArrayList<>();

			for(int p=1;p<=5;p++)
			{ 
				if(p>1)
				{
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@id='a-autoid-1']")).click();
				}
				
				for(int i=1;i<=4;i++)
				{
					try
					{
				
					String name=driver.findElement(By.xpath("//div[@id='anonCarousel1']//li["+i+"]//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated']")).getText();
					Thread.sleep(1000);
					String price=driver.findElement(By.xpath("//div[@id='anonCarousel1']//li["+i+"]//span[@class='_cDEzb_p13n-sc-price_3mJ9Z']")).getText();
					Thread.sleep(1000);
					//System.out.println(name+"\t"+price);
					//System.out.println("");
				
				productList.add(new SimpleEntry<>(name, price)); // Store in list
					}
	            catch (Exception e) 
					{
	                System.out.println("Error fetching data for item " + i);
					}
				}
			}
	
	    // Sort products alphabetically by name
	    Collections.sort(productList,(p1,p2)->p1.getKey().compareToIgnoreCase(p2.getKey()));

	    // Print sorted product list
	    System.out.println("Sorted Product List:");
	    for (SimpleEntry<String,String> product:productList)
	    {
	        System.out.println(product.getKey()+"\t"+product.getValue()+"\n");

	    }*/
			//Thread.sleep(2000);
			
			// print in sorted order in terms of price/product _> . .. ... .... 
	            
	@Test(priority=2)
	public void findPrice() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
		// List to store product names and prices
	    List<SimpleEntry<String,Double>> productList = new ArrayList<>();

			for(int p=1;p<=5;p++)
			{ 
				if(p>1)
				{
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@id='a-autoid-1']")).click();
				}
				
				for(int i=1;i<=4;i++)
				{
					try
					{
				    
					String name=driver.findElement(By.xpath("//div[@id='anonCarousel1']//li["+i+"]//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated']")).getText();
					Thread.sleep(1000);
					String priceText=driver.findElement(By.xpath("//div[@id='anonCarousel1']//li["+i+"]//span[@class='_cDEzb_p13n-sc-price_3mJ9Z']")).getText();
					Thread.sleep(1000);
					
					//System.out.println(name+"\t"+price);
					//System.out.println("");
				  
					//Convert price text Double
					double price=Double.parseDouble(priceText.replaceAll("[^\\d.]", ""));
				
					productList.add(new SimpleEntry<>(name, price)); // Store in list
					}
					catch (Exception e) 
					{
	                System.out.println("Error fetching data for item " + i);
					}
				}
			}
	
			//Comparable , Compartor
	    // Sort products by price in ascending order
			
			//number , string [id phone name ,salry ]
	    
			Collections.sort(productList,(p1,p2)->Double.compare(p1.getValue(),p2.getValue()));

	    // Print sorted product list
	   
			System.out.println("Sorted Product List By Price List:"+"\n");
	    
			for (SimpleEntry<String,Double> product:productList)
	    {
	        System.out.println(product.getKey()+"\t ₹"+product.getValue()+"\n");

	    }
				
	}
}
