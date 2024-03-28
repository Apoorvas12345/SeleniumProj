package workingwithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataForDemoWebShop {

	public static void main(String[] args) throws Throwable {

		File file = new File("./testData/Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		
		String sheet = workBook.getSheetName(0);
		System.out.println("sheet");
		
		String url = workBook.getSheet(sheet).getRow(1).getCell(0).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get(url);
		
	}

}
