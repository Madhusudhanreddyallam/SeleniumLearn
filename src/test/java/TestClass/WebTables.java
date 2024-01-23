package TestClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTables {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/"); 

		//getting all rows of second column assuming first column has check box
		List<WebElement> webele = driver.findElements(By.xpath("//table[@id='customers']//tr//td[2]"));
		//row index 2 because 1st index is always header
		int rowIndex= 2; 
		for(WebElement ele : webele) {
			//Iterating through each row of second column and matching the cell value = java
			if(ele.getText().equals("Java")) {
				//if cell value = java , click check box using first column td[1] and row based on current row as per iteration
				driver.findElement(By.xpath("//table[@id='customers']//tr["+rowIndex+"]//td[1]//input")).click();
				//if row value = java , get all the column values using List of that particular row
				List<WebElement> rowValues= driver.findElements(By.xpath("//table[@id='customers']//tr["+rowIndex+"]//td"));
				//iterate through each element in list & get cell value by ignoring 1st column as it is check box
				for (WebElement rowValue : rowValues.subList(1, rowValues.size())) {
				    System.out.println(rowValue.getText());
				}
			}else {
				rowIndex++;
			}
		}
	}

}
