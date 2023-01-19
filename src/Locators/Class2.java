package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Downloads\\cd\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.youtube.com/");
    //search movie name
    
    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Tanaji bollywood movie");
    
    //click on search button 
    
    driver.findElement(By.xpath("//ytd-masthead/div[@id='container']/div[@id='center']/ytd-searchbox[@id='search']/button[@id='search-icon-legacy']/yt-icon[1]")).click();



}
}
