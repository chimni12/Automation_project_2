package scroll_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.Baseclass;

public class class_003  extends Baseclass{

	public static void main(String[] args) throws Exception {
		
		launch_browser("chrome");
		navigate_url("https://www.salesforce.com/in/");
		take_screenshot("salesforce homepage");
	
		//click on link
		driver.findElement(By.xpath("(//a[@target=\"_blank\" or @class=\"pbc_link--bold\"])[1]"));
		take_screenshot("After click on link");
		
		//press back Arrow
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.history.back()");
		
		Thread.sleep(4000);
		js.executeScript("window.history.forward()");
		
		//refresh
		js.executeScript("window.history.go(0)");
		
		
	}

}
