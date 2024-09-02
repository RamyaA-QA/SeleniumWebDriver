package day36_KeyboardActions_HandlingSliders;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4TabsAndWindows {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/");
		
		//selenium 4.x
		//driver.switchTo().newWindow(WindowType.TAB);//Opens new tab
		driver.switchTo().newWindow(WindowType.WINDOW);//opens in new window
		
		driver.get("https://orangehrm.com/");
	}

}
