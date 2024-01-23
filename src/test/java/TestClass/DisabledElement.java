package TestClass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class DisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		WebElement disEle = driver.findElement(By.id("but1"));
		WebElement enEle = driver.findElement(By.id("but2"));

		String disabledAttributeValue = disEle.getAttribute("disabled");
		String enabledAttributeValue = enEle.getAttribute("disabled");

		boolean disboolean = disEle.isEnabled();
		boolean enboolean = enEle.isEnabled();

		System.out.println("disabledAttributeValue - "+ disabledAttributeValue);
		System.out.println("enabledAttributeValue - "+ enabledAttributeValue);
		System.out.println("disboolean - "+ disboolean);
		System.out.println("enboolean - "+ enboolean);


	}

}
