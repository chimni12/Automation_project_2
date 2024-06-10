package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass;

public class class_001  extends Baseclass{

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate_url("https://www.flipkart.com/");
		take_screenshot("flipkart_homepage");
		
		//locate Grocery link
		WebElement link = driver.findElement(By.xpath("//span[text()='Grocery']"));
		
		//Actions class
		Actions act = new  Actions(driver);
		
		//click on link Grocery
		//act.click(link).build().perform();
		
		//locate Fashion link 
		WebElement link_fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		
		//mouse  hower-fashion link
		act.moveToElement(link_fashion).build().perform();
		take_screenshot("After mouse hower");
		Thread.sleep(3000) ;
		
		//locate Home&Furniture link
	WebElement	 link_home_Furniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		
		//mouse hower-Home&Furniture
		act.moveToElement(link_home_Furniture).build().perform();
		take_screenshot("Mouse Hoser home and furniture");
		
		//perfom Right click on Home&Furniture
		act.moveToElement(link_home_Furniture).contextClick().build().perform();
		
		//mouse  hower-fashion link
				act.moveToElement(link_fashion).build().perform();
				take_screenshot("After mouse hower");
				Thread.sleep(3000) ;
		
		
		
		
		
		
		
		
		
		
		
	}

}
