package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunSuzuki {

	@Test(groups = "car")
	public void suzuki() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.marutisuzuki.com/brezza");
        Thread.sleep(3000);
        driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
