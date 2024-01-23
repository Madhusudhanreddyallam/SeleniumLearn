package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DataProviderTest {
	private By userName = By.id("input-email");
	private By pwd = By.id("input-password");
	
	@Test(dataProvider="loginDataList", dataProviderClass = DataproviderFunctions.class)
	public void TestChrome(String uname,String password){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		driver.findElement(userName).sendKeys(uname);
		driver.findElement(pwd).sendKeys(password);
	}
}