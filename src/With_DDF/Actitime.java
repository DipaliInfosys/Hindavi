package With_DDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actitime
{
public static void main(String[] args) throws Throwable 
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Rupali\\Desktop\\selenium\\actiTime.xlsx");
	
	Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	driver.manage().deleteAllCookies();
	
	//open the application
	driver.get("https://demo.actitime.com/login.do");
	
	//Enter userName
	String un = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("un");
	
	//Enter Passward
	String pwd = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("pwd");
	
	//enter click button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	
}
}
