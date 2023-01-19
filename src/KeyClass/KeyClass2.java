package KeyClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyClass2 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	//open url
	driver.get("https://www.saucedemo.com/");
	
	//use key class
	//driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user",Keys.TAB,"secret_sauce",Keys.ENTER);
}
}
