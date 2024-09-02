package day31_Select_Bootstrap_Hidden_Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3HandleHiddenDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://openSource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		//Login steps
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// Clicking on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();//PIM
		
		//clicked on dropdown
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]"));
	    Thread.sleep(5000);
		
		//select single option
		///driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		
		//count number of options
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println("Number of options: "+options.size());//29
		
		//Printing options
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	}

}
