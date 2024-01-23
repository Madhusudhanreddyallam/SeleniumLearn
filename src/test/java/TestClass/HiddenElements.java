package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {
	
	/* 1)Xpath exists in DOM but the element doesn't appear on UI
	 * 2)org.openqa.selenium.ElementNotInteractableException: element not intractable will appear in this case
	 * 3) Using javaScript even the element is hidden on UI we can interact
	 * */
	 

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		// driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Madhu"); ElementNotInteractableException occurs
		
		//Approach 1
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('displayed-text').value='Madhu';");
		
		//Approach 2
		WebElement ele = driver.findElement(By.xpath("//input[@id='displayed-text']"));		
		js.executeScript("arguments[0].value='visible'",ele );
		
		//Approach 2 (You can also perform click)
		js.executeScript("arguments[0].click();", ele);



	}

}
