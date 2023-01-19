package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Puma 
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://in.puma.com/in/en/womens/womens-new-arrivals");
    
    //use JavaScriptExecutor interface for  scroll handaling
    JavascriptExecutor jse=(JavascriptExecutor)driver;
    //use executeScir
    jse.executeScript("window.scrollBy(0,2500)");
    
//take screenshot using TakesScreenshot interface
    
    TakesScreenshot ts=(TakesScreenshot)driver;
    File src=ts.getScreenshotAs(OutputType.FILE);
    File f=new File("C:\\Users\\Rupali\\Desktop\\Screenshotdeepa\\puma.jpeg");
    Files.copy(src, f);

}
}
