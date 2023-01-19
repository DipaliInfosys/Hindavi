package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1
{
public static void main(String[] args) 
{
	//set the properties
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rupali\\\\Downloads\\\\cd\\\\chromedriver_win32 (1)\\\\chromedriver.exe");

   WebDriver driver=new ChromeDriver();
   
   driver.get("https://www.amazon.in/");
   
   //search beauty product
   driver.findElement(By.name("field-keywords")).sendKeys("Beauty product");
   
   //search button click
   driver.findElement(By.id("nav-search-submit-button")).click();

}
}
