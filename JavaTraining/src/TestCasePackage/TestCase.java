package TestCasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestCase {
	
	public void click(String xpath) {
		System.out.println(xpath);
	}
	
public static void main(String[] args) throws Throwable {
		
		
		Properties prop = new Properties();
		FileInputStream fobj = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\object.properties"); 
		prop.load(fobj);
		TestCase obj = new TestCase();
		
System.out.println(System.getProperty("user.dir"));
//		System.out.println(prop.getProperty("rollnum"));
		
		
		String xpath = prop.getProperty("AddToCart");
		obj.click(xpath);
		
		}

}
