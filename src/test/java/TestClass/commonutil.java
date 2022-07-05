package TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonutil {
	
	WebDriver driver;
	JavascriptExecutor js;
	public  void driver_instantiation (String url) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
	    driver = new ChromeDriver(options);
		driver.get(url);      
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
