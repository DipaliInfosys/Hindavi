package ChildBrowser;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser1 
{
public static void main(String[] args)
{
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.amazon.in/");
   driver.manage().window().maximize();
   
   
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Lavia Handbag",Keys.ENTER);
   
 
   driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'][1]")).click();
Set<String> allwindow = driver.getWindowHandles();
//create object arraylist
ArrayList <String> al=new ArrayList<String>(allwindow);

String mainid = al.get(0);
System.out.println(mainid);


//switch to child window
String childwd = al.get(1);
System.out.println(childwd);
//get title
String title = driver.getTitle();
System.out.println(title);

 
   
  // driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("women watches",Keys.ENTER);

}
}
