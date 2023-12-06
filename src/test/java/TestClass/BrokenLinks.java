package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class BrokenLinks {


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for(WebElement ele : links) {
			String url = ele.getAttribute("href");
			verifyLink(url);
		}
		driver.quit();
	}


	public static void verifyLink(String url) {
		if (url != null && url.startsWith("http")) {
			try {
				URL link = new URL(url);
				HttpURLConnection connection = (HttpURLConnection)link.openConnection();
				connection.setConnectTimeout(5000); //set timeout because it may take some time for the connection to establish or for the server to respond.
				connection.connect();

				if(connection.getResponseCode() >= 400) {
					System.out.println(url + " - Broken");
				}else {
					System.out.println(url + " - " + connection.getResponseMessage());;
				}
			} catch (Exception e) {
				System.out.println(url + " - " + "is a broken link");
			}
		}
	}
}
