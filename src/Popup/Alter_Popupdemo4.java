package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alter_Popupdemo4
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Customer ID xpath
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		
		//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//switch control alert popup
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		
	}
	
}