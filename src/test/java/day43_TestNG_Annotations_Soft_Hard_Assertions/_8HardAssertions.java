package day43_TestNG_Annotations_Soft_Hard_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _8HardAssertions {

	@Test
	void test()
	{
		//Assert.assertEquals("Ramya","Ramya1");
		//Assert.assertEquals(123,456);
		
		//Assert.assertEquals("Ramya",456);
		//Assert.assertEquals("123",123);
		
		//Assert.assertNotEquals(123,123);//Fail
		//Assert.assertNotEquals(123,345);//Pass
		
		//Assert.assertTrue(true);//Pass
		//Assert.assertTrue(false);//Fail
		
		//Assert.assertTrue(1==2);//fail
		//Assert.assertTrue(1==1);//Pass
		
		//Assert.assertFalse(1==2);//pass
		//Assert.assertFalse(1==1);//Fail
		
		Assert.fail();
	}
}
