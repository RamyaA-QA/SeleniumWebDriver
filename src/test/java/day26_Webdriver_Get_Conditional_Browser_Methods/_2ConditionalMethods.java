package day26_Webdriver_Get_Conditional_Browser_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2ConditionalMethods {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed() - We can check display status of the element
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		System.out.println("Dispaly status of logo: "+logo.isDisplayed());
		
		//boolean status=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
		//System.out.println("Display status: "+status);
		
		//isEnabled() - We can check enable/disable status of the element/operational element
		boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Enable status: "+status);
		
		//isSelected() - We can used to check the element is selected or not
		
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selection....");
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//false
		
		System.out.println("After selecting male radio button....");
		male_rd.click(); // select male radio button
		
		System.out.println(male_rd.isSelected());//true
		System.out.println(female_rd.isSelected());//false
		
		System.out.println("After selecting female radio button....");
		female_rd.click(); // select female radio button
		
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//true
		
		boolean newaLetterStatus=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("News letter check box status: "+newaLetterStatus);

	}

}
