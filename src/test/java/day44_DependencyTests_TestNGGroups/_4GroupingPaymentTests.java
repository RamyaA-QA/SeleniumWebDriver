package day44_DependencyTests_TestNGGroups;

import org.testng.annotations.Test;

public class _4GroupingPaymentTests {
	
	@Test(priority = 1,groups = {"sanity","regression"})
	void paymentRupees()
	{
		System.out.println("Payment in Rupees...");
	}
	
	@Test(priority = 2,groups = {"sanity","regression"})
	void paymentInDollars()
	{
		System.out.println("Payment in Dollars...");
	}

}
