package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup3
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeOptions cp=new ChromeOptions();
	cp.addArguments("--disable-notifications");
	cp.addArguments("start maximized");
	WebDriver driver=new ChromeDriver(cp);
	driver.get("https://www.hdfcbank.com/");
}
}
