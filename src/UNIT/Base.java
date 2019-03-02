package UNIT;


import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

 public class Base {
	static ChromeDriver a;
	
	@BeforeClass
	public void open() {
		
		 a= new ChromeDriver();
		 a.get("https://www.eshopper24.com/");
		 
		 
		
	}
	@AfterClass
	public void close() {
		a.quit();
	}
	
	
	
	

}