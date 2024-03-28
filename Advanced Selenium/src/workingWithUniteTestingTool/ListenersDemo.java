package workingWithUniteTestingTool;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println(result.getName() + "test case is started");	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "test case is success");	
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "test case is fail");	
		
		LocalDateTime systemTime = LocalDateTime.now();
		System.out.println(systemTime);
		String scrnShtNmae = systemTime.toString().replace(":", "-");
		
		
		TakesScreenshot tks = (TakesScreenshot) DemoWebShop.driver;
		File src = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/" + scrnShtNmae + ".png");
        try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		
		
		
		
	
	}

	
	
	
	
	
	
}
