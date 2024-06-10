package Different_method_on_web_Element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_003 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		// get current url 
		System.out.println("current url is :-"+driver.getCurrentUrl());
		
		
		//get title of web page
		System.out.println("Title of web page is:-"+driver.getTitle());
		
		//click on link 
		WebElement link=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		 
		 
		 //capture link name
		 System.out.println("Name of link is :-"+link.getText());
		 //capture  Attribute
		 System.out.println("Attribute of an Element is :-"+link.getAttribute("href"));
		 
		 link.click();
		 
		 
		 
		 
		 
		 
		

	}

}
