package scroll_page;

import org.openqa.selenium.JavascriptExecutor;

import baseclass.Baseclass;

public class class_002 extends Baseclass {

	
	public static void main(String[] args) throws Exception {
		
		launch_browser("chrome");
		navigate_url("https://www.railyatri.in/");
		take_screenshot("railyatri_homepage");
		
		//scroll upto bottom
		 JavascriptExecutor js = (JavascriptExecutor ) driver;
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 
		 take_screenshot("after scroll page at bottom");
		
		//click back arrow
		 js.executeScript("window.history.back()");
		 
		 
		 

	}

}
