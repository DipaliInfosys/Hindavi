package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Myntra 
{
	public static void main(String[] args) throws Throwable
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.myntra.com/shop/women");
	    
	     //use typecast TakesScreenshot interface	     
	     TakesScreenshot ts=(TakesScreenshot)driver;
	     
	    //Take the screenshot using getScreenshotAs() method
	     File src=ts.getScreenshotAs(OutputType.FILE);
	     
	     //create object of file class
	     File f=new File("C:\\Users\\Rupali\\Desktop\\Screenshotdeepa\\myntra.jpg");
	     
	     //use copy method
	    Files.copy(src, f) ;
	
	
	}
 
}
