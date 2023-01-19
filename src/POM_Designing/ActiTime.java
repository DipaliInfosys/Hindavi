package POM_Designing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//call the first pom class
	LoginPage l=new LoginPage(driver);
	
	l.enterUserName();
	l.enterPassward();
	l.loginButton();
	
	
	//call the second pom class
	HomePage h=new HomePage(driver);
	h.verifyText();
}
}
