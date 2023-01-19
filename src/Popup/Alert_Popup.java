package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	//enter cust id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12354");
	
	//click on the submit button
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//first of all we need to switch the control of selenium from webpage to popup
	
	Alert al=driver.switchTo().alert();
	//al.accept();
	//al.dismiss();
	String text = al.getText();
	System.out.println(text);
	
	
	
}
}
