package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra
{
	public static void main(String[]args) throws Throwable
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	   
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
       driver.manage().window().maximize();
       
     //use javascript executor interface javascriptExcecutor
       JavascriptExecutor jse=(JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,1000)");
       
       Thread.sleep(4000);
       
      jse.executeScript("window.scrollBy(0,-1000)");
       
	
	
	

	} 
}
