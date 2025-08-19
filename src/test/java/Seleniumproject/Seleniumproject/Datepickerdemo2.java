package Seleniumproject.Seleniumproject;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickerdemo2 {
	static Month convertmonth(String month)
	{
		HashMap<String,Month> monthmap= new HashMap<String,Month>();
		
		monthmap.put("January",Month.JANUARY );
		monthmap.put("February",Month.FEBRUARY);
		monthmap.put("March",Month.MARCH);
		monthmap.put("April",Month.APRIL);
		monthmap.put("May", Month.MAY);
		monthmap.put("June",Month.JUNE);
		monthmap.put("July",Month.JULY);
		monthmap.put("August",Month.AUGUST);
		monthmap.put("September",Month.SEPTEMBER);
		monthmap.put("October",Month.OCTOBER);
		monthmap.put("November",Month.NOVEMBER);
		monthmap.put("December",Month.DECEMBER);
		
		Month vmonth=monthmap.get(month);
		if(vmonth==null)
		{
			System.out.println("Invalid month");
		}
		return vmonth;
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

	}

}
