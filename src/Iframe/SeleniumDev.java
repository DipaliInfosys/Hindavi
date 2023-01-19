package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDev 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//open the URL
	
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	
	//implicity wait (global wait)
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	driver.switchTo().frame("packageListFrame");
	
	//for ur confirmation take any element on 1st frame and print it 
	
	String s1=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.cli']")).getText();
	System.out.println(s1);
	
	
	//switch form 1st frame to main webpage
	driver.switchTo().defaultContent();
	
	
	//now jump frame mainwebpage to 2nd frame
	
	driver.switchTo().frame("packageFrame");
	String s2=driver.findElement(By.xpath("//a[text()='Actions']")).getText();
	
	System.out.println(s2);
	
	////switch form 2nd frame to main webpage
	
	driver.switchTo().defaultContent();
	
	//now jump frame mainwebpage to 3rd frame
	driver.switchTo().frame("classFrame");
	String t1 = driver.findElement(By.xpath("//a[text()='HasAuthentication']")).getText();
	
	System.out.println(t1);
}
}
