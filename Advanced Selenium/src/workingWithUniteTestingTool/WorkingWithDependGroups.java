package workingWithUniteTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithDependGroups {

	@Test(groups = "mobile")
	public void motorola() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.motorola.in/");
        Thread.sleep(3000);
        driver.quit();
		
	}
	
	@Test(groups = "mobile")
	public void realme() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.realme.com/in/realme-l");
        Thread.sleep(3000);
        driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
