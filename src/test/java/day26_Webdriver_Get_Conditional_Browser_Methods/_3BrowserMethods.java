package day26_Webdriver_Get_Conditional_Browser_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3BrowserMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();// This will opens new browser window
				
		Thread.sleep(5000);
		//driver.close(); // Close single browser window where ever browser is focused
		driver.quit();//closes multiple browser windows
	}

}
