package day37_JSExecutor_ScrollingPage_UploadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1JavaScriptExecutor {

	public static void main(String[] args) {

		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		//Passing the text into input box - alternate of sendkeys()
		JavascriptExecutor js=(JavascriptExecutor)driver;//JavaScriptExecutor js=driver;
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		
		//Clicking on element - Alternate of click()
		//driver.findElement(By.xpath("//input[@id='male']")).click();
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radiobtn);
		
	}

}
