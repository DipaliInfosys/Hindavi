package POM_Designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
  @FindBy(xpath="//input[@id='username']") private WebElement un;//user name 
  @FindBy(xpath="//input[@name='pwd']") private WebElement psw;//passward
  @FindBy(xpath="//div[text()='Login ']") private WebElement loginbtn;//loginButton
  
  //use constructor
  public LoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  //getter and setter 
  public void enterUserName()
  {
	  un.sendKeys("admin");
	  
  }
  public void enterPassward()
  {
	  psw.sendKeys("manager");
  }
  public void loginButton()
  {
	  loginbtn.click();
  }
}
