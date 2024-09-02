package day36_KeyboardActions_HandlingSliders;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _3OpenTheLinkInNewTab {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act=new Actions(driver);
		
		//control+regLink
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		//Switching to registration page
		List<String> ids=new ArrayList(driver.getWindowHandles());
		
		//Registration
		driver.switchTo().window(ids.get(1));// Switch to registration page
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John Kenedy");
		
		//Home page
		driver.switchTo().window(ids.get(0));// Switch to home page
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");
	}

}
