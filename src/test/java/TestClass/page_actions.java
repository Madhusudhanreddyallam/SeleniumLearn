package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class page_actions extends commonutil{
	
	@Test
	public void move_ele() throws InterruptedException
	{
		
		driver_instantiation("https://the-internet.herokuapp.com/hovers"); 
		WebElement hover_ele = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		WebElement ele = driver.findElement(By.xpath("//h5[text()='name: user1']/following-sibling::a"));
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		action.moveToElement(hover_ele).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
		//we need build() when we perform series of actions but now build() is also included in perform() method
		//movetoelement has min of 1 parm or maximum of 3param
		Thread.sleep(1000);
		
		ele.click();
		
	}

}
