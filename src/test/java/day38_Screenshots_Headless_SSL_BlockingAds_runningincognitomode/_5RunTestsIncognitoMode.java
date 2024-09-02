package day38_Screenshots_Headless_SSL_BlockingAds_runningincognitomode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _5RunTestsIncognitoMode {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");

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
	
		//driver.quit();

	}

}
