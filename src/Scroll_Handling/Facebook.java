package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
  public static void main(String[]args) throws Throwable
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
  
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/login/");
     driver.manage().window().maximize();
     
     Thread.sleep(4000);
     
     JavascriptExecutor jse=(JavascriptExecutor)driver;
     //use scroll down
     jse.executeScript("window.scrollBy(0,2000)");
     Thread.sleep(4000);
     
     //use scrollup
     jse.executeScript("window.scrollBy(0,-1000)");
  
  
  
  }
}
