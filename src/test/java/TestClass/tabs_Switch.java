package TestClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class tabs_Switch {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); 

		for(int i=0;i<10 ; i++)
		{
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.google.com/");
		}
        
	    Set<String> tabs = driver.getWindowHandles();    
	    //Internally tabs string are collected into List and then converted into LinkedHashSet and then returns so index is maintained in the Set
	    int j=0;
	    
	    //Method 1
	    for(String tab : tabs)
	    {
	    	if(j==3)
	    	{
	    		driver.switchTo().window(tab); 
	    		break;
	    	}
	    	 j++;	    	
	    }
	    
	    //Method 2
	    Iterator<String> it = tabs.iterator();
	    while(it.hasNext())
	    {
	    	if(j==4)
	    	{
	    		driver.switchTo().window(it.next());
	    		break;
	    	}
	    		    		    	
	    	j++;
	    }
	    
	    //Method 3 (easy method)
	    ArrayList<String> tabs_string = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs_string.get(3));
	}

}
