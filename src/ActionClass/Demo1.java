package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	//choose the target element
	WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
	
	//Create a object of action class
	
	Actions act=new Actions(driver);
	
	//use movetoelement method
	
	//act.moveToElement(target).perform();
	//right click
	//act.contextClick().perform();
	//lift click
	//act.click().perform();
	
	//act.moveToElement(target).doubleClick().perform();
	act.moveToElement(target).contextClick().doubleClick().perform();
	
}
}
