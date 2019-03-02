package Unit2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Support {
	ChromeDriver x;
	
	Support (ChromeDriver x){
		this.x = x;
	}
	
	public void smokey () {
		Utility.click(x, By.xpath(".//*[@id='small-searchterms']"));
		System.out.println("dfghm");
	
	}

}
