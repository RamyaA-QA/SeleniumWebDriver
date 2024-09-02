package day34_Handling_DatePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1DatePicker {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// Switch to frame
		driver.switchTo().frame(0);
		
		//Method1- Using sendKeys
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024"); // mm/dd/yyyy
		
		//Method2 - Using date picker
		
		String year="2025";
		String month="April";
		String date="10";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//opens date picker
		
		// Select month & year
		
		while (true) 
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// Actual month
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// Actual year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//Previous
			
			// Select the date
			
			List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
			
			for(WebElement dt:allDates)
			{
				if(dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			}
			
		}
		

	}

}
