package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class page_actions extends commonutil{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/"); 
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		WebElement hover_ele = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		action.moveToElement(hover_ele).perform(); // hoveover
		//we need build() when we perform series of actions but now build() is also included in perform() method
		
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),\"Men's Bottom Wear\")]"));
		action.click(ele).perform(); // click
		//ele.click();
		driver.manage().window().maximize();
		WebElement ele2 = driver.findElement(By.xpath("//div[contains(text(),'Availability')]"));
		action.scrollToElement(ele2).perform();
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
	}

}
