package Action_class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass;

public class class_005 extends Baseclass {

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate_url("https://www.netmeds.com/");
		take_screenshot("Netmeds_homepage");
		
		Actions act = new Actions(driver);
		
		//press butoon pagedown 
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		
		//press button pageup
		act.sendKeys(Keys.PAGE_UP).build().perform();
		act.sendKeys(Keys.SHIFT).sendKeys("abs").build().perform();
		
		
		
		
	}

}
