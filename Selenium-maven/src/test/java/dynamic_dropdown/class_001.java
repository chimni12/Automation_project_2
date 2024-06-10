package dynamic_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass;

public class class_001 extends Baseclass {

	public static void main(String[] args) {
		
		
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
		System.out.println("Entered to city is :-"+ to_city.getAttribute("value"));
	}
 
			
	

	
		
	}


