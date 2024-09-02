package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Launch browser (chrome)
 * Open URL(http://demo.opencart.com)
 * Validate title should be "Your store"
 * close browser
 */

public class FirstTestScript {

	public static void main(String[] args) {
		
		//1. Lauch chrome browser
		
		//ChromeDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		WebDriver driver=new FirefoxDriver();
		
		//2. Open URL(http://demo.opencart.com/)
		driver.get("https://demo.opencart.com/");
		
		//3. Validate title should be "Your store"
		
		String act_title=driver.getTitle();
		
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		
		else
		{
			System.out.println("Test Failed");
		}
		
		//4. Close browser
		
		//driver.close();
		driver.quit();

	}

}
