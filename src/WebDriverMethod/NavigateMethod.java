package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod
{
public static void main(String[] args) throws Throwable 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(8000);
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	Thread.sleep(8000);
	
	//Backward
	driver.navigate().back();
	Thread.sleep(3000);
	
	//forward
	driver.navigate().forward();
	
	//refresh
	driver.navigate().refresh();
	
	
	
}
}
