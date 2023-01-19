package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notifications");
	option.addArguments("start-maximized");
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.justdial.com/");
	
}
}
