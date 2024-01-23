package TestClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class captureScreenshot {
	
	public void takeScreenshot(WebDriver driver,String filepath) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		try {
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File (filepath+"_"+getCurrentDateTime()+".png");
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getCurrentDateTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String dateTime = dateFormat.format(new Date());
		return dateTime;
        
	}

}
