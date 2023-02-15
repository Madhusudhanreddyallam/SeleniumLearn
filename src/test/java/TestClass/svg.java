package TestClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class svg {
	
public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/"); 
		driver.switchTo().frame(0);
		
		List<WebElement> graphList = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='region']"));
		System.out.println(graphList.size());
		Actions act = new Actions(driver);
		for(WebElement e : graphList) {
			//act.moveToElement(e).perform();
			String name = e.getAttribute("id");
			System.out.println(name);
				if(name.equals("wyoming")) {
					act.click(e).perform();
					break;
				}
		}
		
		
	}

}
