package Iframe;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class VisionFrame
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
	driver.manage().window().maximize();
	
	//switch control webpage to iframe
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.switchTo().frame("globalSqa");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000)");

//switch iframe to webpage
	//driver.switchTo().defaultContent();
	//driver.switchTo().frame("aswift_1");
	//driver.findElement(By.xpath("//div[@class='cbb']")).click();
	
}
}
