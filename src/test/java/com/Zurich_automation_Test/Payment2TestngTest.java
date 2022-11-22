package com.Zurich_automation_Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generalUtility.Base_class;

public class Payment2TestngTest extends Base_class
{
	@Test
	public void payment2() 
	{
		common.clickonlyonhp();
		common.clickonclient();
		page3.clickonrequiredclient(driver,"Aemon Task");
		payment.clickonaddpayments();
		payment.paymentaddn1(month, amount, due, fine);
		payment.clickonsubmit();
		payment.clickonlyonpayments();
		page3.checkingdata(driver, month, fine, amount, due);
		Reporter.log("Testcase4 pass", true);
	}
}
//EDITED CODE BY ENGG-1
