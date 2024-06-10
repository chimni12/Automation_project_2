package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass;

public class class_003 extends Baseclass {

	public static void main(String[] args) throws Exception {
		
		//drag and drop
		launch_browser("chrome");
		navigate_url("https://jqueryui.com/droppable/");
		take_screenshot("Homepage_Jquery");
		
		//locate frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		
		//To enter inside frame 
		driver.switchTo().frame(frame);
		
		
		// locate drag element
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		
		//locate drop element
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		//Actions class
		Actions act = new Actions(driver);
		
		//perfom drag and drop
		act.dragAndDrop(drag, drop).build().perform();
		take_screenshot("After Performed drag and drop");
		
		
		
		
		
		
		
		

	}

}
