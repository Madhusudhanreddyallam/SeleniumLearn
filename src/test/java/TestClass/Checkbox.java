package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		Thread.sleep(2000);
		
		boolean checbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		boolean checbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected();
		
		System.out.println(" checbox1 - " + checbox1);
		System.out.println(" checbox2 - " + checbox2);
		
        String checkedAttribute1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).getAttribute("checked");
        String checkedAttribute2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).getAttribute("checked");
        
        System.out.println(" checkedAttribute1 - " + checkedAttribute1);
		System.out.println(" checkedAttribute2 - " + checkedAttribute2);
		
		 boolean isChecked = checkedAttribute1 != null && !checkedAttribute1.equals("false");

	        // Print the result
	        if (isChecked) {
	            System.out.println("Checkbox is checked.");
	        } else {
	            System.out.println("Checkbox is not checked.");
	        }
		driver.quit();

	}

}
