package workingWithUniteTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithSoftAssert {

	@Test
	public void login() throws Throwable
	{
		String expUrl = "https://www.bmw.in/en/index.html";
		String ExpModelsUrl = "https://www.bmw.in/en/all-models.html";
		SoftAssert sf = new SoftAssert();
		
		WebDriver driver=new ChromeDriver();
        Reporter.log("user is able to open empty browser",true);
		driver.manage().window().maximize();
        Reporter.log("user is able to maximize browser",true);
        driver.get("https://www.bmw.in/en/index.html");
        Reporter.log("user is able to open bmw",true);
        
        Thread.sleep(3000);
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl, expUrl);
        
        driver.findElement(By.xpath("//span[text()=\"Models\"]")).click();
        String actualModelsUrl = driver.getCurrentUrl();
        System.out.println(actualModelsUrl);
        
        sf.assertEquals(actualModelsUrl, ExpModelsUrl);
        Thread.sleep(3000);
        driver.quit();
        sf.assertAll();

        
        
        
        
        
        
        
        
	}
	
	
	
	
	
	
	
}
