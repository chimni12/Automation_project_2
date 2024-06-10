package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass;

public class class_001 extends Baseclass {

	private static WebElement date_dropdrown;
	private static String month_year;

	public static void main(String[] args ) {
		
		launch_browser("chrome");
		navigate_url("https://www.railyatri.in/");
		
		//click  on calendar
	 WebElement date_dropdown = driver.findElement(By.xpath("//input[@id=\'datepicker_train\']"));
	date_dropdown.click();
	 
		while(true) {
			
			//capture month and year
		 month_year = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[1]")).getText();
		
		
		if( !(month_year.equalsIgnoreCase("September 2024")) ){
			
			//click  next button
			driver.findElement(By.xpath("(//th[@class=\'next\'])[1]")).click();	
		}
		else {
			break;
		}
		}
//select date
		driver.findElement(By.xpath("//td[text()='23']")).click();
		
		//capture selected Month
		System.out.println("Selected Month is :-"+month_year);
		
		 //capture selected date
		System.out.println("Selected Date is :-"+date_dropdown.getAttribute("value"));
		

	

}
		
}


