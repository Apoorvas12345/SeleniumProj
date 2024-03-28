package workingWithUniteTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group {

	@Test(groups = "payment", dependsOnGroups = "mobile")
	public void payment() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phonepe.com/");
        Thread.sleep(3000);
        driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
