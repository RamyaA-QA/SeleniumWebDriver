package day43_TestNG_Annotations_Soft_Hard_Assertions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 1. Login - @BeforeMethod
 * 2. Search - @Test
 * 3. Logout - @AfterMethod
 * 4. Login
 * 5. AdvancedSearch - @Test
 * 6. Logout
 */

public class _2Annotations {

	@BeforeClass
	void login()
	{
		System.out.println("This is login...");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is logout");
	}
	
	@Test(priority = 1)
	void search()
	{
		System.out.println("This is search...");
	}
	
	@Test(priority = 2)
	void advancedSeach()
	{
		System.out.println("This is advanced search");
	}
	
}
