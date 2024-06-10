package Select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass;

public class class_003 extends Baseclass {

	public static void main(String[] args) {
		
		launch_browser("chrome");
		navigate_url("https://www.jeevansathi.com/");
		
		//click on dropdown
	WebElement dropdown = driver.findElement(By.xpath("//div[@id=\"relationshipBlock\"]"));
		dropdown.click();
		

		//click brother
		driver.findElement(By.xpath("//div[@id=\"relationshipOptions\"]")).click();
		
		System.out.println("selected Option is :-"+dropdown.getAttribute("value"));
	}

}
