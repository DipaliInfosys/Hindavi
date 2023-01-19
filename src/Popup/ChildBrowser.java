package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Search Baby clothes",Keys.ENTER);
  
  //select 1st dress
  driver.findElement(By.xpath("//a[text()='Baby Boys & Baby Girls Casual Dungaree and Romper Rompe...']")).click();
  
  //switch the control
  Set<String> allwindow = driver.getWindowHandles();
  
  //create object arraylist
  ArrayList <String> al=new ArrayList<String>(allwindow);
  //print main window id
  String mainid = al.get(0);
  System.out.println(mainid);

  
  //switch to child window
  String childwd = al.get(1);
  System.out.println(childwd);
  //get title
  String title = driver.getTitle();
  System.out.println(title);
}
}
