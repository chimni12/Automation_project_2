package handling_parent_chaild_window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;


import baseclass.Baseclass;

public class class_002  extends Baseclass{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		navigate_url("https://www.naukri.com/");
		scroll_page(250);
		
		//click mnc
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		
		Set<String> window_id = driver.getWindowHandles();
		
		//pull window id 
		Iterator<String> it = window_id.iterator();
		
	String parent_window_id = it.next();
	
	String child_window_id = it.next();
	
	System.out.println("Parent Window id is :-"+parent_window_id);
	System.out.println("Child Window id is :-"+child_window_id);	
	
	//switch parent tab  to child tab
	driver.switchTo().window(child_window_id);
	
	driver.findElement(By.xpath("//a[text()='Login']")).sendKeys("Akanksha");
	
	





	}
}
