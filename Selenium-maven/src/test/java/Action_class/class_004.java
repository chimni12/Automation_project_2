package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass;

public class class_004 extends  Baseclass{

	
	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate_url("https://www.globalsqa.com/demo-site/draganddrop/");
		take_screenshot("Homepage_gloabalsqa");
		
		//locate frame
		//driver.findElement(By.xpath("iframe[@class='demo-frame lazyloaded']"));
		
		//enter inside frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		//locate drag-image-1
		WebElement drag_1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		
		//locate image-2
		WebElement drag_2 = driver.findElement(By.xpath("//img[@alt=\'The chalet at the Green mountain lake\']"));
		
		//locate image-3
		WebElement drag_3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		
		//locate image -4
		WebElement drag_4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		
		//locate drop element
		WebElement drop = driver.findElement(By.xpath("//span[text()='Trash']"));
		
		//Action class
		Actions act = new Actions(driver);
		 
		act.dragAndDrop(drag_1, drop).build().perform();
		act.dragAndDrop(drag_2, drop).build().perform();
		act.dragAndDrop(drag_3, drop).build().perform();
		act.dragAndDrop(drag_4, drop).build().perform();
		
		
		
		
		
		
		
		
		
		
	}

}
				