package day27_WebDriver_Waiting_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _2ExplicitWait {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(10));//Declaration
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtUsername= myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtUsername.sendKeys("Admin");
		
		WebElement txtPassword= myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		txtPassword.sendKeys("admin123");
		
		WebElement loginBtn= myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		loginBtn.click();
		
		driver.close();
		

	}

}
