package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Divpopup4 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.lego.com/en-in");
	driver.findElement(By.xpath("//button[text()='Continue']")).click();
}
}
