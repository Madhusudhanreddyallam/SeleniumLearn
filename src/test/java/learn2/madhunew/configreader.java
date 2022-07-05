package learn2.madhunew;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class configreader  {
	

	public static String readprop (String value) 
	{
		String testdata = null;
		try {
		  Properties prop = new Properties(); 
		  FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\learn2\\madhunew\\config.properties");
		  prop.load(file);
		  testdata = prop.getProperty(value);	 
	      
		}
		catch (Exception e)
		{
			
		}
		return testdata;
		
		
	}
	
	public static void screenshot (WebDriver driver)
	{
		try 
		{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tsrc = new File("C:\\Users\\madhu\\Desktop\\Selenium Learnings\\madhunew_local\\target\\abc.png");
		FileUtils.copyFile(src, tsrc);
		System.out.println(" screenshot is taken");
		} catch (Exception e) 
		{
			System.out.println("No screenshot is taken");
		}
		
	}
	
	
}


