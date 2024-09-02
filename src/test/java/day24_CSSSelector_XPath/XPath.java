package day24_CSSSelector_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//XPath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");
		
		//XPath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("TShirts");
		
		//XPath with 'and' 'or' opeartors
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("TShirts");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("TShirts");
		
		//XPath with inner text - inner text()
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		/*
		boolean displayStatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displayStatus);
		
		String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(value);
		*/
		
		//Xpath with contains()
		//search
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("TShirts");
		
		//XPath with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("TShirts");
		
		//Chained XPath
		boolean imgStatus=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(imgStatus);

	}

}
