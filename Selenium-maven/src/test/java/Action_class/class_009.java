package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

import baseclass.Baseclass;

public class class_009 extends Baseclass {

	

	

	public static void main(String[] args ) throws Exception {
		
		launch_browser("chrome");
		navigate_url("https://jqueryui.com/slider/");
		
		//to enter inside frame 
		driver. switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		//locate slider
		WebElement slider = driver.findElement(By.cssSelector("div#slider"));
		
		Actions act = new Actions (driver);
		
		
		//slider move forward x-axis
		//act.dragAndDropBy(slider, 200, 0).build().perform();
		
		Thread.sleep(2000);
		
		 
		//slider move in backward
		//act.dragAndDropBy(slider, -50, 0).build().perform();
		
		//second way to move slider
		
		act.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();
		
		
		act.clickAndHold(slider).moveByOffset(-50, 0).release().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
