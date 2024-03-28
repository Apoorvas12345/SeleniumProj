package workingWithUniteTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingwithCrossBrowserTestingEx {
public WebDriver driver; 
	
	@Parameters({"browserName","url"})//this pgm can run directly testng
	
	@Test
	public void browser(@Optional("chrome")String browserName,@Optional("https://www.lamborghini.com/en-en")String url) throws Throwable
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
		
		driver.get(url);
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
