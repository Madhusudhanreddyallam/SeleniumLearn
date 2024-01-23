package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.com");
		WebElement element = getStableElement(By.xpath(""), driver);
		element.click();
	}
	
	public static WebElement getStableElement(By locator , WebDriver driver , int timeOut , int pollingTime) {
		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(timeOut))
		            .pollingEvery(Duration.ofMillis(pollingTime))
		            .ignoring(org.openqa.selenium.NoSuchElementException.class)
		            .withMessage("Custom timeout message: Element not clickable");
		
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static WebElement getStableElement(By locator , WebDriver driver) {
		return new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(org.openqa.selenium.NoSuchElementException.class)
				.ignoring(org.openqa.selenium.StaleElementReferenceException.class)
                .withMessage("Custom timeout message: Element not clickable")
				.until(ExpectedConditions.elementToBeClickable(locator));
	}
	

}

