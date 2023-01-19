package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new  ChromeDriver();
    driver.get("https://practicetestautomation.com/practice-test-login/");
    driver.manage().window().maximize();
    //user name enter
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
   
    // passward enter
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password123");
    
    
    //Enter submit button
    driver.findElement(By.xpath("//button[@id='submit']")).click();
    
    //go to home page
    driver.findElement(By.xpath("//a[text()='Home']")).click();

}

}