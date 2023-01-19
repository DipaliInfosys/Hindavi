package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(ele1, ele2).perform();
	
	
	
	
}
}
