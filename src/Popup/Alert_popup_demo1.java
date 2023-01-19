package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup_demo1
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//switch control on popup
	Alert alt = driver.switchTo().alert();
	alt.accept();
}
}
