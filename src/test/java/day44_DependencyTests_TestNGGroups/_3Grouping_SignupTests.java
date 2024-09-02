package day44_DependencyTests_TestNGGroups;

import org.testng.annotations.Test;

public class _3Grouping_SignupTests {

	@Test(priority = 1,groups = {"regression"})
	void signupByEmail()
	{
		System.out.println("This is signup by email");
	}
	
	@Test(priority = 1,groups = {"regression"})
	void signupByFacebook()
	{
		System.out.println("This is signup by Facebook");
	}
	
	@Test(priority = 1,groups = {"regression"})
	void signupByTwitter()
	{
		System.out.println("This is signup by Twitter");
	}
}
