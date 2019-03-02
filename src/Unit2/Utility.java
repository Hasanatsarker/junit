package Unit2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	public static void click (ChromeDriver x, By by) 
	{
		x.findElement(by).click();
	}
	
	public static void click (ChromeDriver x, By by, String s)
	{
			x.findElement(by).sendKeys(s);
	}
	
	
	public static void tuuuur (ChromeDriver x, By by) 
	{
		boolean u = x.findElement(by).isDisplayed();
	}
	
	
	

}
