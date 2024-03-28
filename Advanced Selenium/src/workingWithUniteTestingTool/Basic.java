package workingWithUniteTestingTool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic {
	@Test
	public void run()
	{
		//System.out.println("hello testNg");
		Reporter.log("hello testNg",true);
		}

}
