package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunVolkswagen {

	@Test(groups = "car")
	public void volkswagen() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.volkswagen.co.in/en.html");
        Thread.sleep(3000);
        driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
