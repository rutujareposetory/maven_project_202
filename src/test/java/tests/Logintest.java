package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Loginpage;

@Listeners(utility.TestListner.class)
public class Logintest extends BaseTest{
	
	
	
	Loginpage lp;
	
	@BeforeClass
	public void initalization()
	{
		
		WebDriverManager.chromedriver().setup();
		
	
	 lp=new Loginpage(driver);
	
	}
	
	@Test (priority=1)
	public void verifytitle()
	{
	Assert.assertFalse(driver.getTitle().contains("Orange"),"page title does not match");	
	}
	
	@Test (priority=2)
	public void login()
	{
		lp.enterusername("Admin");
		
		lp.enterpassword("admin123");
		
		lp.clickloginbutton();
	}
	
	
}
