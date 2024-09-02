package day26_Webdriver_Get_Conditional_Browser_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//get(url) - Opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//getTitle() - Returns title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() - Get URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - Returns source code of the page
		System.out.println(driver.getPageSource());
		
		//getWindowHandle() - Returns ID of the single browser window
		String windowID=driver.getWindowHandle();
		System.out.println("Window ID: "+windowID);
		
		//getWindowHandles() - Returns ID's of the Multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // This will open new browser window
		Set<String> windowids=driver.getWindowHandles();
		System.out.println("Window ID's: "+windowids);
		
		//driver.close();
		driver.quit();
	}

}
