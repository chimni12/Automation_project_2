package Select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass;

public class class_002  extends Baseclass{

	public static void main(String[] args) {
		launch_browser("chrome");
		navigate_url("https://www.jeevansathi.com/");
		
		//click on dropdown
	WebElement dropdown = driver.findElement(By.xpath("//div[@id=\"relationshipBlock\"]"));
		dropdown.click();
		
		//Actions act = new Actions (driver);
		//act.moveToElement(dropdown).click().bulid().perform();
		//locate all options
		List<WebElement> options = driver.findElements(By.xpath("//div[@id=\"relationshipOptions\"]/ul/li"));
		
		
		//find out no of options
		System.out.println(options.size());
		
		//choose one options
		for(int i=0; i<=7; i++) {
			 if(options.get(i).getText().equalsIgnoreCase("Daughter")) {
				options.get(i).click();	
			}
				
				
		}
		
		
		}
		

	}


