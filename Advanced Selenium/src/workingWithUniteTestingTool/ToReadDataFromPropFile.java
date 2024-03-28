package workingWithUniteTestingTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropFile {

	public static void main(String[] args) throws Throwable {

		// Stepl: Create obi for file
		File file = new File("./testData/data.properties");
		
		// step 2: fis obj
		FileInputStream fis = new FileInputStream(file);
		
		// step 3 obj prop file
		Properties prop = new Properties();
		prop.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//driver.get(prop.getProperty("url"));//..to get browser directly
		
		//or
		
		String URL = prop.getProperty("url");
		driver.get(URL);
		driver.quit();
		/*System.out.println(prop.get("url"));
		System.out.println(prop.get("place"));*///this to print in console

	}

}
