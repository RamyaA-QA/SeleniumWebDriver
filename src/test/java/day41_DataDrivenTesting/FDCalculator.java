package day41_DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();

		String filePath=System.getProperty("C:\\Users\\abbur\\eclipse-workspace\\SeleniumWebDriver\\testdata\\caldata.xlsx");
				
		int rows=_1ExcelUtils.getRowCount(filePath, "Sheet1");//number of rows in a excel sheet
		
		for(int i=1;i<=rows;i++)
		{
			//1.Read data from excel
			String pric=_1ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rateofInterest=_1ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String per1=_1ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String per2=_1ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String fre=_1ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_mvalue=_1ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			
			//2.Pass above into application
			driver.findElement(By.xpath("//input[@id=='pricipal']")).sendKeys(pric);
			driver.findElement(By.xpath("//input[@id=='interest']")).sendKeys(rateofInterest);
			driver.findElement(By.xpath("//input[@id=='tenure']")).sendKeys(per1);
			
			Select perdrp=new Select(driver.findElement(By.xpath("//select[@id=='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp=new Select(driver.findElement(By.xpath("//select[@id=='frequency']")));
			fredrp.selectByVisibleText(fre);
			
			//Validation
			
			String act_mavalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mavalue))
			{
				System.out.println("Test Passed");
				_1ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
				_1ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
			}
			else
			{
				System.out.println("Test Failed");
				_1ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
				_1ExcelUtils.fillRedColor(filePath,"Sheet1", i, 7);
			}
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//img[@class='PL5']")).click();//clicked on clear button
		}
		driver.quit();
	}

}
