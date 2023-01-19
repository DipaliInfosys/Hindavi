package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod 
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rupali\\\\Downloads\\\\cd\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//getMethod is used to open browser
	driver.get("https://www.selenium.dev/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.close();
	
}
}
