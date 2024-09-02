package day29_HandlingCheckboxes_Confirmation_PromptAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Handle alert without using switchTo().alert()
//by using explicit wait

public class _3HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(10));//Explicit wait declaration
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		
		Alert myalert=myWait.until(ExpectedConditions.alertIsPresent());// Capture alert
		
		//Alert myalert=driver.switchTo().alert();
	
		System.out.println(myalert.getText());
		myalert.accept();

	}

}
