package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_GetText
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	// Enter Customer Id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
	
	//click on submit button
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	//switch control on alert popup
	Alert alt = driver.switchTo().alert();
	
	//gettext by using getText() method
	String txt = alt.getText();
	System.out.println(txt);
	
}
}
