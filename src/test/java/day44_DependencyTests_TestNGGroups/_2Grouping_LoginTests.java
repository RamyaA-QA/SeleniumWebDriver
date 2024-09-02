package day44_DependencyTests_TestNGGroups;

import org.testng.annotations.Test;

public class _2Grouping_LoginTests {

	@Test(priority = 1,groups = {"sanity"})
	void loginByEmail()
	{
		System.out.println("This is login by email");
	}
	
	@Test(priority = 2,groups = {"sanity"})
	void loginByFacebook()
	{
		System.out.println("This is login by Facebook");
	}
	
	@Test(priority = 3,groups = {"sanity"})
	void loginByTwitter()
	{
		System.out.println("This is login by Twitter");
	}
}
