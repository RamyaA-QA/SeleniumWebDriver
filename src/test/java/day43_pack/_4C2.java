package day43_pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _4C2 {

	@Test
	void xyz()
	{
		System.out.println("This is xyz from C1...");
	}
	
	@AfterTest
	void bt()
	{
		System.out.println("This is AfterTest method...");
	}
}
