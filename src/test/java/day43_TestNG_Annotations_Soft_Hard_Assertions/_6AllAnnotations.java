package day43_TestNG_Annotations_Soft_Hard_Assertions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _6AllAnnotations {
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before suite...");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is after suite...");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is Before Test method...");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is After Test method...");
	}

	@BeforeClass
	void bc()
	{
		System.out.println("This is Before class method");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This After Class method");
	}
	
	@Test(priority = 1)
	void tm1()
	{
		System.out.println("This is test method1.....");
	}
	
	@Test(priority = 2)
	
	void tm2()
	{
		System.out.println("This is test method2....");
	}
}
