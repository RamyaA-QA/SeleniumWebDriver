package day36_KeyboardActions_HandlingSliders;

import org.checkerframework.checker.units.qual.min;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _1HandlingSliders {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//Min slider
		WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Location of the min slider: "+min_slider.getLocation());//(59, 250)(x,y)
		
		act.dragAndDropBy(min_slider, 100, 249).perform();
		System.out.println("Location of the min slider after moving:" +min_slider.getLocation());//(158, 250)
		
		//Max slider
		
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Location of the max slider: "+max_slider.getLocation());//612, 250
		
		act.dragAndDropBy(max_slider, -100, 249).perform();
		System.out.println("Location of the max slider after moving:" +max_slider.getLocation());//(512, 250)
	}

}
