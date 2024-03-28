package workingWithUniteTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingwithCrossBrowserTesting {

	public WebDriver driver; 
	
	@Parameters("browserName")//add after .xml file
	
	@Test
	public void browser(String browserName) throws Throwable
	{
		if (browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if (browserName.equals("edge")) {
			driver=new EdgeDriver();

		}
		
		else {
			System.out.println("invalid browsername");
		}
		
		driver.get("https://www.lamborghini.com/en-en");
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
