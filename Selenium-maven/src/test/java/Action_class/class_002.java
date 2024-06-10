package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass;

public class class_002 extends Baseclass {

	public static void main(String[] args) throws Exception {
		
		launch_browser("chrome");
		navigate_url("https://www.flipkart.com/");
		
		take_screenshot("flipkart_homepage");
		
		//locate search box
		driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("mobile");
		
		//Actions class-double click
		Actions act=new Actions(driver);
		
		act.doubleClick(driver.findElement(By.cssSelector("input.Pke_EE"))).build().perform();
		
		
		
	}

}
