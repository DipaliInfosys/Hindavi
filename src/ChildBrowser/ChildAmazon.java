package ChildBrowser;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ChildAmazon 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.in/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("women smart watches latest design",Keys.ENTER);
	   
	   JavascriptExecutor jse=(JavascriptExecutor)driver;
	   jse.executeScript("window.scrollBy(0,1000)");
	   
	   driver.findElement(By.xpath("//span[text()='Noise ColorFit Pulse Grand Smart Watch with 1.69\" HD Display, 60 Sports Modes, 150 Watch Faces, Spo2 Monitoring, Call Notification, Quick Replies to Text & Calls (Rose Pink)']")).click();
	Set<String> win = driver.getWindowHandles();
	ArrayList<String>	al= new ArrayList<String>(win);
	String main = al.get(0);
	String child = al.get(1);
	System.out.println(main);
	System.out.println(child);
	
	//switch window
	driver.switchTo().window(main);
	// driver.get("https://www.amazon.in/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	   
	  WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	  ele.clear();
	  
	 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Girls white Shoes",Keys.ENTER);
	 jse.executeAsyncScript("window.scrollBy(0,1000)");
	 driver.findElement(By.xpath("//span[text()='Women|Girls White Casual Shoes for Girls Stylish']")).click();
	 
	 
	
	
} 
}
