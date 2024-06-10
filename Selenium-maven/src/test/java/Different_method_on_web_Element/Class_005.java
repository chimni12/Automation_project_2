package Different_method_on_web_Element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_005 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		// get current url 
		System.out.println("current url is :-"+driver.getCurrentUrl());
		
		
		//get title of web page
		System.out.println("Title of web page is:-"+driver.getTitle());
		
	WebElement	 searchbox=driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]"));
	
	//get location - x
	System.out.println("location with respect x-axix:-"+searchbox.getLocation().x);
	
	// get location - y
	System.out.println("location with respect y-axix:-"+searchbox.getLocation().y);
	
	//get size of method 
	System.out.println("sixe of searchbox is :-"+searchbox.getSize());

	}

}
