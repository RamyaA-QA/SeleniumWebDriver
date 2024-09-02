package day32_AutoSuggestDropDown_HandlingStaticTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1. Find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//Multiple table
		
		//int rows=driver.findElements(By.tagName("tr")).size(); -- Single table
		System.out.println("Number of rows: "+rows);//7			14
		
		//2. Find total number of columns in a table
		
		//int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();//Multiple table 
		int cols=driver.findElements(By.tagName("th")).size(); //Single table 8
		System.out.println("Number of columns: "+cols);//4
		
		//3. Read data from specific row and column (Ex: 5th row and 1st column)
		//String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(bookName);
		
		//4. Read data from all the rows and columns
		/*
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		
		*/
		
		//5. Print book names whose author is Mukesh
		/*
		for(int r=2;r<=rows;r++)
		{
			String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(authorName.equals("Mukesh"))
			{
				String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			    System.out.println(bookName+"\t"+authorName);
			}
		}
		*/
		//6. Find total price of all the books
		
		int total=0;
		
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			//System.out.println(price);
			total=total+Integer.parseInt(price);
		
		}
		System.out.println("Total price of the books: "+total);//7100
	}

}
