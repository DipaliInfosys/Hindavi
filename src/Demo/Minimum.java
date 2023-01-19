package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimum 
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rupali\\\\Downloads\\\\cd\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cardekho.com/tata/harrier");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.manage().window().minimize();
	
}
}
