package Select_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseclass.Baseclass;

public class class_001  extends Baseclass{

	public static void main(String[] args) throws Exception {
		
		launch_browser("chrome");
		navigate_url("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQiA3uGqBhDdARIsAFeJ5r3RO2qNWn6_s_r7NbIB2IEkDpyX7kEBaI1EXWc7JIH6RBfQ7glo6rEaAoU-EALw_wcB");
		take_screenshot("homepage_jeevansathi");
		
		
	WebElement profile_dropdown = driver.findElement(By.xpath("//select[@name='reg[relationship]']"));
		
		//select class
	    Select s= new Select(profile_dropdown);
	    s.selectByVisibleText("Self");
	    
		
		

	}

}
