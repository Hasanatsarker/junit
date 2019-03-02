package UNIT;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	public static void click(ChromeDriver a, By by) {
		a.findElement(by).clear();
		
	}
	public static void type(ChromeDriver a, By by, String z) {
		a.findElement(by).sendKeys(z);
	}

	public static void type(ChromeDriver a, By by) {
		boolean m= a.findElement(by).isDisplayed();
	}
}
