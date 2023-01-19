package DropdownLi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    //open url
    driver.get("https://www.facebook.com/");
    
    //click on create button
    
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
    
    
    //click on the day dropdown button
    Thread.sleep(4000);
    WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
    
    //create select class
    Select s=new Select(day);
    
    //use select class method
    s.selectByValue("26");
    
    //click on the month button
    Thread.sleep(4000);
    WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
    Select s1=new Select(month);
    s1.selectByVisibleText("Apr");
    
    //Click on year button
    Thread.sleep(4000);
    WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
    Select s2=new Select(year);
    s2.selectByVisibleText("2019");
    
    
    //click on signup button
    driver.findElement(By.xpath("//button[text()='Sign Up']")).click();



}
}
