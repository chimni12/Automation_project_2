package Different_method_on_web_Element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_004 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		// get current url 
		System.out.println("current url is :-"+driver.getCurrentUrl());
		
		
		//get title of web page
		System.out.println("Title of web page is:-"+driver.getTitle());
		
		
		//locate  email text box
WebElement	email = driver.findElement(By.cssSelector("input#email"));

//pass input 
email.sendKeys("akanshathakre54@gmail.com");  


//capture input
System.out.println("Input Data of EmailTextbox is :-"+email.getAttribute("value"));

		
		 //locate  password
		driver.findElement(By.cssSelector("input#pass")).sendKeys("akankshathare@1234");
		
		
		
		

		
	}

}
