package day43_TestNG_Annotations_Soft_Hard_Assertions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _9HardVsSoftAssertions {

	//@Test
	void test_hardassertions()
	{
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		Assert.assertEquals(1, 2);// Hard Assertion
		
		System.out.println("Testing....");
		System.out.println("Testing....");
	}
	
	@Test
	void test_softassertions()
	{
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(1, 2);// Soft Assertion
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		sa.assertAll();//Mandatory
	}
}
