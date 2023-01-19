package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rupali\\\\Downloads\\\\cd\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.csjewellers.com/");
	driver.manage().window().maximize();
	
	//search the food item
	driver.findElement(By.className("wishlistIcon mobileProfileShow")).click();
	
}
}
