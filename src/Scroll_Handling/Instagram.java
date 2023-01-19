/**
 * 
 */
package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Rupali
 *
 */
public class Instagram 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.digitaltrends.com/computing/how-we-test-laptops/");

    
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000)");




}
}
