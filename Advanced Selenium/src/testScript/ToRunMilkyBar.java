package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunMilkyBar {

	@Test(groups = "chocolate")
	public void milkyBar() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.milkybar.co.uk/products/original");
        Thread.sleep(3000);
        driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
