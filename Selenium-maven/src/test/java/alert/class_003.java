package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import baseclass.Baseclass;

public class class_003  extends Baseclass{

	public static void main(String[] args) throws InterruptedException {
		launch_browser("chrome");
		navigate_url("https://demoqa.com/alerts");
		scroll_page(200);
		
		
		//click on button
		driver.findElement(By.cssSelector("button#promtButton")).click();
		 
		Thread.sleep(300);
		// switch alert
			Alert Al = driver.switchTo().alert();
			
		
		//send input
			Al.sendKeys("Akanksha");
			Al.accept();

	}

}
