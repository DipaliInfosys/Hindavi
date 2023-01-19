package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethod1

{
public static void main(String[] args)
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.forvia.com/");
	 
	 driver.manage().window().maximize();
	 String expT="FORVIA, inspiring mobility";
	 String title=driver.getTitle();
	// System.out.println(title);
	 if(expT.equals(title))
	 {
		System.out.println("TC is Pass");
	 }
	 else
	 {
		 System.out.println("TC is Fail");
	 }
	 
	 //driver.close();
	
	 
}
}
