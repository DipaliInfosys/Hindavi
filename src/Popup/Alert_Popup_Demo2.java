package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_Demo2 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
	
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	//switch control on alertpopup
	Alert alt = driver.switchTo().alert();
	alt.accept();
	
}
}
