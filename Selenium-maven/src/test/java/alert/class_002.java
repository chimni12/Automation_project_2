package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import baseclass.Baseclass;

public class class_002 extends Baseclass {

	public static void main(String[] args) throws InterruptedException {
		
		launch_browser("chrome");
		navigate_url("https://demoqa.com/alerts");
		scroll_page(200);
		
		
		//click on confirm Alert
		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click(); 
		Thread.sleep(300);
		
		// switch alert
			Alert Al = driver.switchTo().alert();
			
			//click on cancel button
			Al.dismiss();
		
	}

}
