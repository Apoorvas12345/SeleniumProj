package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunCreta {
    
	
	@Test(groups = "car")
	public void creta() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyundai.com/in/en/find-a-car/creta/highlights.html?utm_source=Google-Search&utm_medium=CPC&utm_campaign=Always_On_2024_Creta&utm_term=crata&gad_source=1&gclid=CjwKCAiAi6uvBhADEiwAWiyRdt1OaK0miAFR3kd0u0rm0lB0e2kd4YwDmIQoyit9LkIqjEMgL1XI7hoC9LgQAvD_BwE");
        Thread.sleep(3000);
        driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
