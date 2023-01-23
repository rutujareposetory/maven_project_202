package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;
import pages.Loginpage;

public class Hometest extends BaseTest
{
	
	Loginpage loginpage;
	Homepage homepage;
	
	
	public void initobject(WebDriver driver)
	{
		loginpage=new Loginpage(driver);
		homepage=new Homepage(driver);
		
	}
	
	@BeforeClass
	public void init()
	{
		
		 
		initobject(driver);
	}
	
	@BeforeMethod
	public void precondition()
	{
		loginpage.enterusername("Admin");
		loginpage.enterpassword("admin123");
		loginpage.clickloginbutton();
	}
	
	@Test
	public void logout()
	{
		Assert.assertTrue(homepage.verifyDashBoardMenu());
		
		homepage.clickOnProfile();
		homepage.clickOnLogout();
	}
	
	
}
