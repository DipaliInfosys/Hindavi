package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://pune.myaudi.in/en");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.navigate().to("https://www.cardekho.com/tata/nexon/pictures");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	//back 
	driver.navigate().back();
	Thread.sleep(3000);
	
	//forward
	driver.navigate().forward();
	//refresh
	driver.navigate().refresh();
	
	
}
}
