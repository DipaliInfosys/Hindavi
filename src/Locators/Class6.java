package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Rupali\\\\Downloads\\\\cd\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
    WebDriver  driver=new ChromeDriver();
    driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
    
    driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Dipali");
    driver.findElement(By.id("Form_getForm_Email")).sendKeys("departmentalise@gmail.com");
    driver.findElement(By.id("Form_getForm_Country")).sendKeys("India");
    driver.findElement(By.id("Form_getForm_Contact")).sendKeys("8888656525");
    driver.findElement(By.id("recaptcha-anchor")).click();

}
}
