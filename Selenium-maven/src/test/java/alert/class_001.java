package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import baseclass.Baseclass;

public class class_001  extends Baseclass{

	public static void main(String[] args) throws InterruptedException {
		
		launch_browser("chrome");
	navigate_url("https://demoqa.com/alerts");
	scroll_page(150);
	
	//click on  button
	driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
	
	
	// switch alert
	Alert Al = driver.switchTo().alert();
	
	// click ok button
	Al.accept();
	
	
	
	
	

	}

}
