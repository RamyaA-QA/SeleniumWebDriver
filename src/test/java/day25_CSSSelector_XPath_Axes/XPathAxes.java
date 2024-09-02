package day25_CSSSelector_XPath_Axes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxes {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//Self - Selects the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'Zomato')]/self::a")).getText();
		System.out.println("Self : "+text);//Self : Zomato
		
		//Parent - Selects the parent of the current node (Always One)
		text=driver.findElement(By.xpath("//a[contains(text(),'Zomato')]/parent::td")).getText();
		System.out.println("Parent : "+text);//Parent : Zomato
		
		//Child - Selects all children of the current node (One or many)
		List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements : "+childs.size());//Number of child elements : 6
		
		//Ancestor - Selects all ancestors (Parent,grand parent etc.,)
		text=driver.findElement(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr")).getText();
		System.out.println("Ancestor : "+text);//Ancestor : Zomato A 204.05 205.55 + 0.74 Buy  |  Sell
		
		//Descendent - Selects all Descendents (children, grandchildren etc.,) of the current node
		//List<WebElement> descendents=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/descendents::*"));
		//System.out.println("Number of descendent nodes : "+descendents.size());//Number of child elements : 18
		
		//Following - selects everything in the document after the closing tag of the current node
		List<WebElement> followingNodes=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes : "+followingNodes.size());//Number of following nodes : 219
		
		//Preceding- selects all nodes that appear before the current node in the document
		List<WebElement> precedings=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of preceding nodes : "+precedings.size());//Number of preceding nodes : 174
		
		//Following-sibling : selects all siblings after the current node
		List<WebElement> followingSiblings=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following siblings : "+followingSiblings.size());//Number of following siblings : 217
		
		//preceding-sibling : selects all siblings before the current node
		List<WebElement> precedingSiblings=driver.findElements(By.xpath("//a[contains(text(),'Zomato')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding sibling nodes : "+precedingSiblings.size());//Number of preceding sibling nodes : 173
		
		driver.quit();
		
				
	}

}
