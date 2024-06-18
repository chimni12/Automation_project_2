package file_upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import baseclass.Baseclass;

public class class_001  extends Baseclass{

	public static void main(String[] args) throws AWTException {
		
		launch_browser("Edge");
		navigate_url("https://www.ilovepdf.com/word_to_pdf");
		
		//click on upload file 
		driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
		
		//to select desired file 
		StringSelection s = new StringSelection("\"C:\\Users\\ADMIN\\Downloads\\GitHubDesktopSetup-x64.exe\"");

		//copy file location
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//Robot class
		Robot r = new Robot();
		
		r.delay(300);
		
		//press control v 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		//release control v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//press Enter button
		r.keyPress(KeyEvent.VK_ENTER);
		
		//Release Enter button
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
