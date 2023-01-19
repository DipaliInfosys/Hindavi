package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByattribute1
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");

    WebDriver driver=new ChromeDriver();
    //open the browser
    
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
    //maximize browser
    
    driver.manage().window().maximize();
    
    //insert valid user name using xpathby attribute
    
  // driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    driver.findElement(By.name("username")).sendKeys("Admin");
  
    
    //insert valid passward  using xpathby attribute
    
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    
    //click login button
    
    driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
