package diffrerent_verification;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import baseclass.Baseclass;

public class class_001 extends Baseclass {

	public static void main(String[] args) {
		
		launch_browser("chrome");
		navigate_url("https://www.flipkart.com/");
	
		String link_name_1 = driver.findElement(By.xpath("//span[text()='Grocery']")).getText();
		
		System.out.println("Link Name_1 is :-"+link_name_1);
		
		String link_name_2=driver.findElement(By.xpath("//span[text()='Grocery']")).getAttribute("innerHTML");
		
		System.out.println("Link Name_2 is :-"+link_name_2);

	}

}
