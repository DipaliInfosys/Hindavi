package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;




public class Locator_Method
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//open the url
	driver.get("https://www.google.com/maps/@18.6810368,73.8321726,14z");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//use Id locatoter
	driver.findElement(By.id("searchboxinput")).sendKeys("River Residency moshi Pune");
	driver.findElement(By.id("searchbox-searchbutton")).click();
	
	//use xpath locater
	driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("River Residency moshi Pune",Keys.ENTER);
		
	//use name locater
	driver.findElement(By.xpath("////input[@name='q']']")).sendKeys("River Residency moshi Pune",Keys.ENTER);
	
	

}
}
