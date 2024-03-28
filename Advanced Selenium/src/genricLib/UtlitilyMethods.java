package genricLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtlitilyMethods {

	
	public String readingTheDataFromPropFile(String path,String key) throws IOException
	{
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	Properties prop = new Properties();
	prop.load(fis);
	String URL = prop.getProperty(key);
	return URL;
	
	
	}
	
	
	
	
	
	
}
