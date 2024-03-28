package workingWithUniteTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basics1 {
          @Test(invocationCount = 5,threadPoolSize = 4)//invocation runs separately and threadpool runs paralelly.
          public void run() throws Throwable
          {
      		WebDriver driver=new ChromeDriver();
            driver.get("https://www.mercedes-benz.co.in/");
      		Thread.sleep(3000);
      		driver.quit();
      		
      		
      		
      		
      		
      		
    
          }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
