package TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;

public class commonutil {
	
	WebDriver driver;
	JavascriptExecutor js;
	public  void driver_instantiation (String url) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
	    WebDriver driver = new ChromeDriver(options);
		driver.get(url);   Thread.sleep(1000);   
	}
	
	public void jse(WebElement ele)
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(1000);
		js = (JavascriptExecutor) driver;
		js.executeScript("alert('Exceution done Tearing Down Browser')");
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
		driver.quit();
	}
}
