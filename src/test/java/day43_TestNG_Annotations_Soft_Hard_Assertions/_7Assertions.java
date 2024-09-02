package day43_TestNG_Annotations_Soft_Hard_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class _7Assertions {

	@Test
	void testTitle()
	{
		String exp_title="Opencart";	
		String act_title="Openshop";
		
		/*
		if(exp_title.equals(act_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		*/
		
		//Assert.assertEquals(exp_title,act_title);
		
		if(exp_title.equals(act_title))
		{
			System.out.println("Test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}
}
