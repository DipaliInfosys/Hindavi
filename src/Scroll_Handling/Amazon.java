package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon
{
public static void main(String[] args) throws Throwable 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//open url
	driver.get("https://www.amazon.in/Home-Kitchen/b/?ie=UTF8&node=976442031&ref_=nav_cs_home");
	
	//use javascript executor interface javascriptExcecutor
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000);");
	Thread.sleep(4000);
	
	
	jse.executeScript("window.scrollBy(0,-2000);");
	Thread.sleep(4000);
	
	
}
}
