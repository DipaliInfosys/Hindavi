package SingleScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Google {

	public static void main(String[] args) throws Throwable 
	{

     System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rupali\\\\Downloads\\\\cd\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.co.in/");
	 
	 //use single logo screenshot
	 
	WebElement we=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	
	File src=we.getScreenshotAs(OutputType.FILE);
	File f=new File("C:\\Users\\Rupali\\Desktop\\Screenshotdeepa\\google.jpeg");
	Files.copy(src, f);
	}

}
