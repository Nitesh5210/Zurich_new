package com.Zurich_automation_Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generalUtility.Base_class;

public class PaymenttestngTest extends Base_class {
	@Test
	public void payment1() {
		int ele1 = page4.getpaymenttext(driver);
		payment.paymentdetails();
		payment.paymentaddn(client_id, month, amount, due, fine);
		payment.clickonsubmit();
		common.clickonhp();
		int ele2 = page4.getpaymenttext(driver);
		Assert.assertTrue(ele2 == ele1 + 1);
		Reporter.log("Testcase3 pass",true);
	}
}

