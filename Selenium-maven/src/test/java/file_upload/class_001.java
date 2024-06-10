package file_upload;

import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;

import baseclass.Baseclass;

public class class_001  extends Baseclass{

	public static void main(String[] args) {
		
		launch_browser("Edge");
		navigate_url("https://www.ilovepdf.com/word_to_pdf");
		
		//click on upload file 
		driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
		
		//to select desired file 
		//StringSelection s = new StringSelection("");

	}

}
