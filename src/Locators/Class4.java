package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/maps/@18.6773271,73.8301322,15z");
	driver.manage().window().maximize();
	
	//search the location
	
	driver.findElement(By.id("searchboxinput")).sendKeys("River Residency Moshi Pune");
	driver.findElement(By.id("searchbox-searchbutton")).click();
	
}
}
