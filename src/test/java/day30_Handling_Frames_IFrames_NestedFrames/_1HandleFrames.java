package day30_Handling_Frames_IFrames_NestedFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1HandleFrames {

	public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://ui.vision/demo/webtest/frames/");
			driver.manage().window().maximize();
			
			//Frame1
			WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
			driver.switchTo().frame(frame1);// passed frame as a web element - Switch to frame1
			
			driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
			
			driver.switchTo().defaultContent();// Go back to page
			
			//Frame2
			WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
			driver.switchTo().frame(frame2);
			
			driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
			
			driver.switchTo().defaultContent();// Go back to page
			
			//Frame3
			WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
			driver.switchTo().frame(frame3);
			
			driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
			
			//inner iframe - part of frame39
			
			driver.switchTo().frame(0); // Switching to frame using index
			
			//driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
			WebElement rdButton=driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", rdButton);
			
			driver.switchTo().defaultContent();// Go back to page
	}

}
