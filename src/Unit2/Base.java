package Unit2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static ChromeDriver x;
	
	@BeforeClass
	public static void start() 
	{
		x = new ChromeDriver () ;
		x.get("https://www.eshopper24.com/");
	}

	
	@AfterClass
	public static void end () 
	{
		x.close();
	}
}
