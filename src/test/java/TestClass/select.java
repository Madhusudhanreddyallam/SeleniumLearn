package TestClass;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class select extends commonutil  {

	
	@Test (priority = 1)
	public void sel_deSel() throws InterruptedException 
	{
		driver_instantiation("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement ele_sel = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		WebElement ele = driver.findElement(By.name("photo"));
		jse(ele);Thread.sleep(1000);
		
		Select sel = new Select(ele_sel);
		sel.selectByIndex(2); Thread.sleep(1000); 
		//sel.selectByIndex(0) ; sel.selectByVisibleText(""); // sel.selectByValue("1") ;
		
		sel.deselectByIndex(2);   
		//sel.deselectByIndex(0) ; sel.deselectByValue("") ; sel.deselectByVisibleText("");
		
		List<WebElement> sel_list= sel.getOptions();
		for(WebElement elew : sel_list)
		{		
			sel.selectByVisibleText(elew.getText());	
		}
		Thread.sleep(1000);
	
		System.out.println(sel.getAllSelectedOptions()); //get the selected options
		
		sel.deselectAll(); //deselectsAll
	}
	
	


}
