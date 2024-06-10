package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass;

public class class_007  extends Baseclass{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		navigate_url("https:www.facebook.com");
		
		// get current url 
				System.out.println("current url is :-"+driver.getCurrentUrl());
				
				
				//get title of web page
				System.out.println("Title of web page is:-"+driver.getTitle());
				
				
				//locate  email text box
		WebElement	email = driver.findElement(By.cssSelector("input#email"));

		//Actions class
		Actions act = new  Actions (driver);
		
		//pass input in uppercase
		act.keyDown(Keys.SHIFT).sendKeys("ashvini").build().perform();
		
		//act.sendKeys(email,Keys.SHIFT).sendKeys("akanksha").build().perform();
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		

	}

}
