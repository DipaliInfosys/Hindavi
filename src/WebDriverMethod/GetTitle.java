package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/shop/men");
	
	String s1=driver.getTitle();
	System.out.println(s1);
	
	
	String s2="Men Shopping Online - Shop for Mens Clothing & Accessories in India | Myntra";
	
	if(s1.equals(s2))
	{
		System.out.println("TC is Pass");
	}
	else
	{
		System.out.println("TC is Fail");
	}
}
}
