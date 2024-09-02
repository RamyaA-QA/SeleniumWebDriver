package day28_Webdriver_Browser_Navigational_Methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3ClosingSpecificBrowserWindow {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		for(String winId:windowIDs)
		{
			String title=driver.switchTo().window(winId).getTitle();// or we can get based on URL
			System.out.println(title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM")||title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
	}

}
