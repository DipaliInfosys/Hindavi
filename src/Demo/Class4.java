package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://en.wikipedia.org/wiki/Maharashtra");
	 driver.manage().window().maximize();
	// driver.manage().window().minimize();
}
}
