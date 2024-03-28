package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunScoda {

	@Test(groups = "car")
	public void scoda() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skoda-auto.co.in/");
        Thread.sleep(3000);
        driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
