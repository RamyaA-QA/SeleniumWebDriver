package day38_Screenshots_Headless_SSL_BlockingAds_runningincognitomode;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _2HeadlessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");//setting for headless mode of execution
		
		//1. Launch browser (chrome)
		ChromeDriver driver=new ChromeDriver(options);
		
		//WebDriver driver=new ChromeDriver();// For chrome driver
		//WebDriver driver=new EdgeDriver();// For Edge driver
		//WebDriver driver=new FirefoxDriver();// For firefox driver
		//WebDriver driver=new ChromeDriver();// for chrome driver
		
		// Open url
		driver.get("https://demo.nopcommerce.com/");


		// Validate title should be "Your Store"
		
		String act_title=driver.getTitle();
		System.out.println(act_title);
		
		if(act_title.equals("nopCommerce demo store"))
		{
			System.out.println("Test passed");
		}

		else
		{
			System.out.println("Test failed");
		}
		
		// 4. close browser
		driver.close();
		//driver.quit();
	}

}
