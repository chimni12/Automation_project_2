package Different_method_on_web_Element;

import org.openqa.selenium.By;import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass;

public class patical_exam  extends Baseclass{

	public static void main(String[] args) throws Exception {
		
		launch_browser("chrome");
		navigate_url("https://www.netmeds.com/");
		take_screenshot("netmeds homepage");
		
		//Acations class
		Actions act = new Actions (driver);
		
	
		//locate wellness link 
		WebElement link_wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
		
		//mouse Hower_wellness link 
act.moveToElement(link_wellness).build().perform()	;
take_screenshot("After mouse hower");

//locate Beautylink
WebElement link_Beauty_link = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));


//mouse hower_beauty link
act.moveToElement(link_Beauty_link).build().perform();
take_screenshot("Mouse Hoser wellness and Beauty");


//find Element surch box
	WebElement surchbox=driver.findElement(By.xpath("//input[@type=\"text\"]"));
	
	//pass input data
	surchbox.sendKeys("dolo");
	//capture input data
	System.out.println(surchbox.getAttribute("value"));
	 act.keyDown(Keys.ENTER).build().perform();
	
   //  WebElement button = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]"));
   //  Thread.sleep(100);
  	
    // driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
	
	scroll_page(250);
	
	 WebElement button = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]"));
	     Thread.sleep(100);
	  	
	     driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
	
	//locate cart
	     driver.findElement(By.xpath("//div[@class=\"mini-cart\"]")).click();
	
	//screen shot
	     take_screenshot("cart screen shot page");
      

		
		
		
		
		
		
				
				
				
		
		
		
		
				
				
				
		
	}

}
