package day43_pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class _5C3 {

	@Test
	void pqr()
	{
		System.out.println("This is pqr from C3");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This AfterSuite method");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is BeforeSuite method");
	}
	
}
