package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunKitkat {

	@Test(groups = "chocolate")
	public void kitkat() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kitkat.in/");
        Thread.sleep(3000);
        driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
