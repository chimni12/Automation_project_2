package scroll_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.Baseclass;

public class class_001 extends Baseclass {

	public static void main(String[] args) throws Exception {
		
		launch_browser("chrome");
		navigate_url("https://www.jeevansathi.com/");
		take_screenshot("homepage_jeevansathi");
		
		//scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
				
	
		//take screen shot 
		take_screenshot("After pagevscroll");
		
		//click facebook icon
		driver.findElement(By.xpath("//a[@class=\"jsx-6bc99199a158f0c5 footericon footerIconSpriteNew new-facebooksmall\"]")).click();
		
		
	//takescreenshot after click on facebook
		take_screenshot("Afhetr click on facebook link");
		
		
		
	}

}
