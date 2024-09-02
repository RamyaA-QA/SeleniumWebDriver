package day22_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Ramya");
		
		//id
		
		//boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayStatus);
		
		//Linktext & PartialLinkText
		
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//ClassName
		//java.util.List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println("Total number of header links:" +headerLinks.size());
		
		//TagName
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links:" +links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of Links:" +images.size());
	
		
		//driver.quit();
	}

}
