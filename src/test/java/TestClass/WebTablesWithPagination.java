package TestClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesWithPagination {
	static WebDriver driver;
	//https://datatables.net/ practice here

	public static void main(String[] args) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://datatables.net/"); 
		driver.manage().window().maximize();
		boolean continueLoop = true;
		String name = "Zorita Serrano";
		while (continueLoop) {
			boolean isNameFound = findNameInWebTable(name); 
			//checking if the name is found on current page if found the your while loop will be broken
			if(isNameFound) {
				continueLoop = false;
			}
			else { //pagination starts here 
				WebElement nextButton = driver.findElement(By.xpath("//a[text()='Next']"));
				String classAttribute = nextButton.getAttribute("class");
				//if button has class = disabled it means you have reached last page and the element not found
				if (classAttribute.toLowerCase().contains("disabled")) {
					System.out.println("Element not found in table");
					continueLoop = false;
				} else {
					nextButton.click(); //else keep clicking next button
				}
				Thread.sleep(1000);	
			}
		}	
		driver.quit();

	}

	public static boolean findNameInWebTable(String name) {
		List<WebElement> webele = driver.findElements(By.xpath("//table[@id='example']//tr//td[1]"));
		int rowIndex= 1;
		boolean rowfound = false;
		for(WebElement ele : webele) {
			if(ele.getText().equals(name)) {
				rowfound = true;
				List<WebElement> rowValues= driver.findElements(By.xpath("//table[@id='example']//tr["+rowIndex+"]//td"));
				for (WebElement rowValue : rowValues) {
					System.out.println(rowValue.getText());
				}
			}else {
				rowIndex++;
			}
		}
		return rowfound;
	}

}