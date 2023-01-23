package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	WebDriver driver;
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterusername(String user)
	{
		if(username.isEnabled()) {
			username.sendKeys(user);
		}
	}
	
	public void enterpassword(String pass)
	{
		if(password.isEnabled())
		{
			password.sendKeys(pass);
		}
	}
	
	public void clickloginbutton() 
	{
		if(loginbutton.isEnabled())
		{
			loginbutton.click();
		}
	}
	
}
