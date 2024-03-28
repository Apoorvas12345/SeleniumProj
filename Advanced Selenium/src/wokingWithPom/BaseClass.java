package wokingWithPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;
	String actualURL ="https://demowebshop.tricentis.com/";
	
	@BeforeSuite
    public void beforeSuite()
    {
    	System.out.println("I am before suite");
    	Reporter.log("data base connection start",true);
    }

    @AfterSuite
    public void afterSuite()
    {
    	System.out.println("I am after suite");
    	Reporter.log("data base connection stop",true);
    }
	
	@BeforeClass
	public void browsersetup() throws Throwable
	{
	    driver=new ChromeDriver();
		Reporter.log("user is able to open empty browser",true);
        driver.get("https://demowebshop.tricentis.com/");
        Reporter.log("user is able to open demowebshop",true);
        String url = driver.getCurrentUrl();
        if(url.equals(actualURL))
        {
        Reporter.log("user is able to land on demoshop welcomepage",true);
        }
        else
        {
        	Reporter.log("user is not able to open demo webshop");
        }
        Thread.sleep(6000);
	}
	
	@AfterClass
	public void toQuitBrowser()
	{
		driver.quit();
		Reporter.log("user is able to close the demowebshop",true);
	}
	
		
	
	
}
