package day37_JSExecutor_ScrollingPage_UploadFiles;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");

		//Thread.sleep(5000);
		//driver.manage().window().minimize();
		
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;		
		js.executeScript("document.body.style.zoom='50%'");//set zoom level to 50%
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;		
		js1.executeScript("document.body.style.zoom='80%'");//set zoom level to 80%
		
	}

}
