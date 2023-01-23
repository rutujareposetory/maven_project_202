package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;

	@BeforeSuite
	public void initalization() {
		WebDriverManager.chromedriver().setup();
		
		//step-1
		driver = new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//step-4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@AfterSuite
	
	public void tearDown() {
		
		driver.close();
	}
}
