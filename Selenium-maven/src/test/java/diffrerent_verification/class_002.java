package diffrerent_verification;

import org.openqa.selenium.By;

import baseclass.Baseclass;

public class class_002 extends Baseclass {

	public static void main(String[] args) {
		
		launch_browser("chrome");
		navigate_url("https://www.flipkart.com/");
		
		String expected_link_name = "Grocery";
		
		String actual_link_name =driver.findElement(By.xpath("//span[text()='Grocery']")).getText();
	if(actual_link_name.equalsIgnoreCase(expected_link_name)) {
		
		System.out.println("Both Links Name is Same");
	}
	else {
		System.out.println("Both Links Name Is Not Same");
	}
	}
	

}
