package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunMunch {

	@Test(groups = "chocolate")
	public void munch() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nestle.in/brands/nestlemunch");
        Thread.sleep(3000);
        driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
