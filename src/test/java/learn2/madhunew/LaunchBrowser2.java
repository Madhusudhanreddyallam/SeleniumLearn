package learn2.madhunew;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser2  {
	
	//public static WebDriver webDriver;
    
	/*
	 * public void main ( ) throws InterruptedException, IOException {
	 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("https://www.naukri.com/account/createaccount");
	 * //config.screenshot(webDriver); Thread.sleep(1000);
	 * driver.findElement(By.xpath("//button[text()='I am a Professional']")).click(
	 * ); Thread.sleep(1000); WebElement ele =
	 * driver.findElement(By.name("uploadCV"));
	 * 
	 * JavascriptExecutor executor = (JavascriptExecutor) driver;
	 * executor.executeScript("arguments[0].click();", ele); //driver.quit();
	 * Thread.sleep(1000); //Runtime.getRuntime().exec(
	 * "C:\\Users\\madhu\\Downloads\\AutoIT\\fileupload.exe"); new ProcessBuilder(
	 * "C:\\Users\\madhu\\Downloads\\AutoIT\\fileupload.exe","C:\\Users\\madhu\\Downloads\\Allam Madhusudhan Reddy - CV.pdf"
	 * ).start(); }
	 */
	
	@Test(enabled = false)
	public void login()
	{
		System.out.println("-1");
	}
	
	@Test(dependsOnMethods={"login"})
	public void test02 ()
	{
		System.out.println("-3");
	}
	

	
	

}
