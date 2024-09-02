package day38_Screenshots_Headless_SSL_BlockingAds_runningincognitomode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _3HandleSSL {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);//Accepts SSL certificates

		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println("Title of the page:" +driver.getTitle());//Privacy error 	expired.badssl.com
	}

}
