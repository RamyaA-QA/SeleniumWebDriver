package day29_HandlingCheckboxes_Confirmation_PromptAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4HandleAuthenticatedPopup {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");// Directly giving user name and password
	}

}
