package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	public static void capturescreen(WebDriver driver,String name) throws IOException
	{
		//step-1 location to store
		
		//String path = System.getProperty("user.dir")+"\\Screenshots\\"+name+"_" +getcurrentDate()+".png";
		
		//step-2 using take screenshot reference
		TakesScreenshot tss = (TakesScreenshot) driver;
		
		//step-3 
		File sourceFile = tss.getScreenshotAs(OutputType.FILE);
		
		//step-4 Using file object
		File destinationFile = new File ("C:\\Users\\Rutuja Patil\\eclipse-workspace\\maven_project_2023\\Screenshot\\"+name+"_" +getcurrentDate()+".png");
		
		//step-5 Using File handler
		org.openqa.selenium.io.FileHandler.copy(sourceFile, destinationFile);			
	}
	public static String getcurrentDate()
	{
		DateFormat date=new SimpleDateFormat("yyyy-MM-dd-hh-mm");
		
		Calendar cal=Calendar.getInstance();
		String currentDate=date.format(cal.getTime());
		
		return currentDate;
		
	}

	
}
