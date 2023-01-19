package POM_Designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
    @FindBy(xpath="//td[text()='Enter Time-Track']") private WebElement text;//get the text from url
     //create constructor
    
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void verifyText()
    {
    	String expT="Enter Time-Track";
    	String actT = text.getText();
    	System.out.println(actT);
    	if(actT.equals(expT))
    	{
    		System.out.println("Tc is Pass");
    	}
    	else
    	{
    		System.out.println("Tc is Fail");
    	}
    }

}
