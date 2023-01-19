package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDiv_Popup 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/hidden-division-popup");
	
	//click on viewpopup
	
	driver.findElement(By.xpath("//a[text()='View Pop-up']")).click();
	
	//click on the cross button or close
	driver.findElement(By.xpath("//a[@class='cd-popup-close img-replace']")).click();
}
}
