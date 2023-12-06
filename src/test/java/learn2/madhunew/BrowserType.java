package learn2.madhunew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserType  {
	
	public static WebDriver webDriver;

	public void launchBrowser(String broType, String url)
	{
		if(broType.equalsIgnoreCase("chrome"))
		{
			webDriver = new ChromeDriver();
			//webDriver.manage().window().maximize();
			ChromeOptions options = new ChromeOptions();
		}
		else if (broType.equalsIgnoreCase("Edge"))
		{
			EdgeOptions options = new EdgeOptions();
			options.setCapability("InPrivate", true);
			webDriver = new EdgeDriver(options);
			webDriver.manage().window().maximize();
		}
		else if (broType.equalsIgnoreCase("Firefox"))
		{
			webDriver = new FirefoxDriver();
		}
		webDriver.get(url);
		webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		webDriver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
	}
}
