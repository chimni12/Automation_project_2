package take_screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class class_001 {

	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		//take screen shot
	TakesScreenshot ts	=(TakesScreenshot) driver;	
	File File = ts.getScreenshotAs(OutputType.FILE);
	 File source_file = new File(projectpath+"\\screenshot\\InsertDatain_Iext.png");
	FileHandler.copy(File, source_file);
	
	//insert email 
	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abc@gmail.com");
	
	//insert password
	driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("abc");
	
//take screen shot 
	TakesScreenshot ts1	=(TakesScreenshot) driver;	
	File File1 = ts1.getScreenshotAs(OutputType.FILE);
	 File source_file1 = new File(projectpath+"\\screenshot\\homepage.png");
	FileHandler.copy(File1, source_file1);
	
	}

}
