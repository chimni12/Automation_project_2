package Different_method_on_web_Element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Baseclass;

public class pratical_exam extends Baseclass {

	public static void main(String[] args) throws Exception {
		
	launch_browser("chrome");
	navigate_url("https://www.amazon.in/");
	
	//gate title
	System.out.println(driver.getTitle());
	
	//takes screenshot
	take_screenshot("homepage screenshot");
	
	//find Element surch box
	WebElement surchbox=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	
	surchbox.click();
	surchbox.sendKeys("mobile");
	
	System.out.println(surchbox.getAttribute("value"));
	
	driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	
	//takes screenshot
	take_screenshot("screenshot After click surch button");
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.history.back()");
	
	take_screenshot("screenshot After click back button");
	
	//navigate Amazon web apllication and do the following oprtion....
	//1)capture tittle and current url..
	//2)capture the screenshot....
	//3)search any one product and click on the search buton....
	//4)capture input of search box....
	//5)capture the screenshot of it....
	//6)click on the back Arrow of the web page....
	//7)take a screen shot.....
	
	
	
				 		
		
		
		
	

	
		
		
	}

}
