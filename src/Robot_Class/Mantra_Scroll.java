package Robot_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mantra_Scroll
{
public static void main(String[] args) throws Throwable 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    //open url
    driver.get("https://www.myntra.com/shop/women");
    
    //use Robot Class for scrll down
    
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(4000);
    
    
    r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(4000);
    
    r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(4000);
    
    r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(4000);
	
	
	
}
}
