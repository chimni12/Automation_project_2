package dynamic_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass;

public class class_002 extends Baseclass {

	public static void main(String[] args) {
		
		launch_browser("chrome");
		navigate_url("https://www.redbus.in/");
		scroll_page(100);
		
		//locate from city
		WebElement from_city = driver.findElement(By.xpath("//input[@id=\"src\"]"));
		 from_city.sendKeys("pune");

		//locate from city options
			List<WebElement> from_city_Options = driver.findElements(By.xpath("//i[@class=\"icon icon-ic-area solr-icon\"]"));

			//choose one option
			for (int i=0; i < from_city_Options.size(); i++) {
				if (from_city_Options.get(i).getText().contains("Swargate")) {
				from_city_Options.get(i).click();
				//captured from city name
				System.out.println("Entered from city is:-"+from_city.getAttribute("value"));
	}
			}		
			}
}