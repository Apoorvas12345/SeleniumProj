package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunKia {

	@Test(groups = "car")
	public void kia() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kia.com/in/our-vehicles/Carens/showroom.html?utm_source=google&utm_medium=sem&utm_campaign=carens_brand&gad_source=1&gclid=CjwKCAiAi6uvBhADEiwAWiyRdsj1_xHnmygDcqyqce8dG9aaTwJeUxDrHRjAqHg2RWjbVpAb8uru_hoCQLAQAvD_BwE");
        Thread.sleep(3000);
        driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
