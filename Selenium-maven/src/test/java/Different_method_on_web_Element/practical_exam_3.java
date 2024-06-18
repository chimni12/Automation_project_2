package Different_method_on_web_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass;

public class practical_exam_3 extends Baseclass {

	public static void main(String[] args) throws Exception {
		
		launch_browser("chrome");
		navigate_url("https://www.railyatri.in/");
		
		scroll_page(150);
		//locate from city
		WebElement from_city = driver.findElement(By.xpath("//input[@id=\"from_stn_input\"]"));
		 from_city.sendKeys("Mumbai");
		 
		//locate from city options
			List<WebElement> from_city_Options = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li"));
			//choose one option
			for (int i=0; i < from_city_Options.size(); i++) {
				if (from_city_Options.get(i).getText().contains("MUMBAI CSMT | CSMT")) {
				from_city_Options.get(i).click();
				 
				}
				}			
			//captured from city name
			System.out.println("Entered from city is:-"+from_city.getAttribute("value"));
			
			//locate to city dropdown and pass  city name
			WebElement to_city = driver.findElement(By.xpath("(//input[@name=\"boarding_to\"])[1]"));
			to_city.sendKeys("bangalore");
			
			//locate to city options/
			List<WebElement> to_city_options = driver.findElements(By.xpath("//input[@placeholder=\"Boarding To\"]"));
			
			//choose  one options
			for (int x = 0; x < to_city_options.size();x++) {
				if (to_city_options.get(x).getText().contains("BANGALORE CANT | BNC")) {
					to_city_options.get(x).click();
				}	
				}
			//captured to city name 
			System.out.println("Entered to city is :-"+ to_city
					.getAttribute("value"));	
			
			//click  on calendar
			 WebElement date_dropdown = driver.findElement(By.xpath("//input[@id=\'datepicker_train\']"));
			date_dropdown.click();
			
			//capture month and year
			 String month_year = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[1]")).getText();
			
			
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
				
				//locate search box button and click on it
				 driver.findElement(By.xpath("//button[@id=\"search_btn_dweb\"]")).click();
				 
				 Thread.sleep(250);
				 
				 //take screenshot
				 take_screenshot("After search the train");
				 
				 //scroll the page
				 scroll_page(300);
		
				 // locate book now button and click on it 
				 driver.findElement(By.xpath("(//button[text()='Book Now'])[1]")).click();
				 
				 Thread.sleep(400);
				 
				 //take screenshot
				 take_screenshot("After click on book now button");
				 
				 //locate gender and click on it
				 driver.findElement(By.xpath("//li[text()='Female']")).click();
				 
				 //locate full name and send data in it
				 driver.findElement(By.cssSelector("input#adult_add_fullname")).sendKeys("Akanksha Vinod Thakare");
				 
				 
				 //locate age and send data in it
				 driver.findElement(By.cssSelector("input#adult_add_age")).sendKeys("23");
				 
				 //locate birth and click on it 
				 driver.findElement(By.cssSelector("input#adult_add_berth")).click();
				 
				 //locate  Middle birth and click on it 
				 driver.findElement(By.xpath("//li[text()='Middle']")).click();
				 
				 //locate button save and next and click on it 
				 driver.findElement(By.xpath("(//button[text()='Save & Add next'])[1]")).click();
				 
				 //take screen shot
				 take_screenshot("After click on save and next button");
				 
				scroll_page(300);
				// locate email textbox and send data in it 
				driver.findElement(By.cssSelector("input#user_email")).sendKeys("akankshathakare54@gmail.com");
				
				//locate phone number and send data in it
				driver.findElement(By.cssSelector("input#user_phone")).sendKeys("9322542906");
				
				//locate  IRCTC user id and send data in it 
				driver.findElement(By.xpath("input#no_call_irctc")).sendKeys("maheshkhere11");
				
				//locate verify button and click on it
				driver.findElement(By.cssSelector("button#verifyIdBtn")).click();
				
				// take screen shot 
				take_screenshot("After click on verified button ");
				
				//locate  continue button and click on it 
				driver.findElement(By.xpath("//div[text()='continue']")).click();
				
				Thread.sleep(2000);
				//take screenshot
				take_screenshot("After click on  continue button");
				
				
				 
				 
				 
				 
				}
			
			}
