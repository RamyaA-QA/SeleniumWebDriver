package day38_Screenshots_Headless_SSL_BlockingAds_runningincognitomode;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _6EnableExtensionsAtRunTime {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		
		File file=new File("C:\\Users\\abbur\\OneDrive\\Desktop\\Ramya\\Programs_Practice\\CRX Files\\SelectorsHub-Chrome-Web-Store.crx");
		options.addExtensions(file);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://text-compare.com/");

	}

}
