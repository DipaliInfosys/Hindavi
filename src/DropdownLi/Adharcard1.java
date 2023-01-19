package DropdownLi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adharcard1 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    //open the url
    driver.get("https://www.uidai.gov.in/en/");
    
    //click on user adhar freely
    WebElement Uadhar=driver.findElement(By.xpath("//a[text()='Use Aadhaar Freely']"));
    Select s=new Select(Uadhar);
    s.selectByVisibleText("Why am asked to verify");
    
}
}
