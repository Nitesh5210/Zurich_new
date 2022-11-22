package com.Zurich_automation_Test;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generalUtility.Base_class;

public class DeleteTestngpartTest extends Base_class
{
	@Test
	public void Searchdelete()
	{
		 common.clickonclient();
		common.clickaddclient();
		String ele100= common.clientid();
		page1.clientdetails(client_password, client_name, client_image, client_gender, client_dob, marital_status,
				client_nid, client_phone, client_address, policy_id);
		page1.nomineedetails(nominee_name, nominee_gender, nominee_dob, nominee_nid, relationship, priority,
				nominee_phno);
		page1.clickonsubmit();
		page1.clickonclientpage();
		page3.fetchdetails(driver, ele100, client_name, client_dob, client_nid, client_phone, client_address);
		WebElement ele10 = common.returnHome();
		driverutility.mousehoveraction(driver, ele10);
		ele10.click();
		WebElement ele11 = common.returnsearch();
		driverutility.mousehoveraction(driver, ele11);
		ele11.sendKeys(client_name);
		common.clickonsearchbtn();
		page3.clickonrequiredclient(driver,client_name);
		common.clickonedit();
		common.deletetab();
		WebElement ele101 = common.returnHome();
		driverutility.mousehoveraction(driver, ele101);
		ele101.click();
		WebElement ele112 = common.returnsearch();
		driverutility.mousehoveraction(driver, ele112);
		ele112.sendKeys(client_name);
		common.clickonsearchbtn();
		page3.fetchdetails(driver, ele100, client_name, client_dob, client_nid, client_phone, client_address);
		Reporter.log("Testcase2 pass",true);	
	}			
	}




