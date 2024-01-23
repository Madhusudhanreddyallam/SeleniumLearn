package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DesiredCapabilities {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("InPrivate");
		options.addArguments("--headless");
		
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--headless");
        
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.google.com/");
	}

}
