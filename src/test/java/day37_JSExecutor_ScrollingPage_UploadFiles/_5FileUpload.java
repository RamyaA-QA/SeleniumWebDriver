package day37_JSExecutor_ScrollingPage_UploadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5FileUpload {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//Single file upload - Sample.txt
	
		/*
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\abbur\\OneDrive\\Desktop\\Ramya\\Programs_Practice\\Sample.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Sample.txt"))
		{
			System.out.println("File is successfully uploaded");
		}
		
		else
		{
			System.out.println("Upload failed");
		}
	*/	
		
		//Multiple file upload
		
		String file1="C:\\Users\\abbur\\OneDrive\\Desktop\\Ramya\\Programs_Practice\\Sample.txt";
		String file2="C:\\Users\\abbur\\OneDrive\\Desktop\\Ramya\\Programs_Practice\\Text1.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		//Validation1 - Number of files
		if(noOfFilesUploaded==2)
		{
			System.out.println("All files are uploaded");
		}
		else
		{
			System.out.println("Files are not uploaded or incorrect files uploaded");
		}
		
		//Validate file names
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Sample.txt") &&
				driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Text1.txt"))
		{
			System.out.println("File names are matched");
		}
		else
		{
			System.out.println("File names are not matched");
		}
	}

}
