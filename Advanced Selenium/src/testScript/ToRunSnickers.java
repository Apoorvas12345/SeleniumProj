package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunSnickers {
	
	@Test(groups = "chocolate")
	public void snickers() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snickers.com/");
        Thread.sleep(3000);
        driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
