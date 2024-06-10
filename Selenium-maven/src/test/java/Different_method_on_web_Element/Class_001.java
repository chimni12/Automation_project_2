package Different_method_on_web_Element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_001 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/in/ ");
		//capture title
		System.out.println("the title of web Page is :-"+driver.getTitle());
		
		driver.findElement(By.cssSelector("a[aria-label=\"Learn more: Small Business\"]")).click();
		
		

	}

}
