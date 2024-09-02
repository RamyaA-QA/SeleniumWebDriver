package day39_Handling_BrokenLinks_SVGElements_ShadowDOMElements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1BrokenLinks {

	public static void main(String[] args) throws IOException {

		/*
		 * 1. link  href="https://xyz.com"
		 * 
		 * 2. https://xyz.com -> server -> status code
		 * 
		 * 3. status code >=400  Broken link
		 *    status code < 400  Not a broken link
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:" +links.size());
		
		int noOfBrokenLinks=0;
		
		for(WebElement linkElement:links)
		{
			String hrefAttrValue=linkElement.getAttribute("href");
			
			if(hrefAttrValue==null || hrefAttrValue.isEmpty())
			{
				System.out.println("href Attribute valuue is null or empty. So not possible to check");
				
			    continue;
			}
			
			//Hit url to the server
			
			try
			{
			URL linkURL=new URL(hrefAttrValue);// Converted href value from string to URL format
			HttpURLConnection conLinkURL=(HttpURLConnection) linkURL.openConnection();//open connection to the URL
			conLinkURL.connect();// Connect to the server and sent request to the server
			
			if(conLinkURL.getResponseCode()>=400)
			{
				noOfBrokenLinks++;
				System.out.println(hrefAttrValue+"==================> Broken link");
			}
			else
			{
				System.out.println(hrefAttrValue+"==================> Not a Broken link");
			}
			}
			catch (Exception e) {
				
			}
		}
		System.out.println("Number of broken links: "+noOfBrokenLinks);//42
	}

}
