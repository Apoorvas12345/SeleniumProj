package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRuncadbury {
	
	@Test(groups = "chocolate")
	public void cadbury() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cadbury.co.uk/products/cadbury-dairy-milk-chocolate-bar-110g/");
        Thread.sleep(3000);
        driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
