package UNIT;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	ChromeDriver a;
	
	Xpath(ChromeDriver a){
		this.a=a;
		
	}
	public void mainfgh() {
		
		Utility.type(a, By.xpath(".//*[@id='small-searchterms']"), "cotton shari");
		Utility.click(a, By.xpath(".//*[@id='small-search-box-form']/input[2]"));
		//Utility.type(a, By.xpath("html/body/div[9]/div[1]/div[2]/div/div[1]/a/img"));
		boolean m=a.findElement(By.xpath("html/body/div[9]/div[1]/div[2]/div/div[1]/a/img")).isDisplayed();
		if(m) {
			System.out.println("logo");
		}
		
	}
}
