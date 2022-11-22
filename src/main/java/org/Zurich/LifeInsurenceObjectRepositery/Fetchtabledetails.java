package org.Zurich.LifeInsurenceObjectRepositery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Fetchtabledetails
{
	
	private WebDriver driver;
	public void fetchdetails(WebDriver driver, String num1, String num2, String num3, String num4, String num5, String num6)
	{
	Fetchalldatafromtable page2 = new Fetchalldatafromtable(driver);
	String ele1 = page2.fetchallele1();
	String ele2 = page2.fetchallele2();
	String ele3 = page2.fetchallele3();
	String ele4 = page2.fetchallele4();
	String ele5 = page2.fetchallele5();
	String ele6 = page2.fetchallele6();
	 ArrayList<String> list1 = new ArrayList<>(Arrays.asList(ele1, ele2, ele3,ele4, ele5,ele6));
     ArrayList<String> list2 = new ArrayList<>(Arrays.asList(num1,num2,num3,num4,num5,num6));
     if (list1.containsAll(list2) == true) {
         System.out.println(" Array List are equal");
     }
     else
     // else block execute when
     // ArrayList are not equal
     {
         System.out.println(" Array List are not equal  and table not visible");
     }
	}
	
	
	public void deletedetails(String clientname)
	{
		if (driver.findElement(By.xpath("//td[.='"+clientname+"']")).getText().equals(clientname)) 
		{
			System.out.println(" client is not deleted");
			
		} else {
			System.out.println("client is deleted");
			   driver.close();
	}
	}
     public void fetchpayment(String num1, String num2, String num3, String num4)
     {
    	 Fetchalldatafromtable page2 = new Fetchalldatafromtable(driver);
    		String ele1 = page2.fetchallele1();
    		String ele2 = page2.fetchallele2();
    		String ele3 = page2.fetchallele3();
    		String ele4 = page2.fetchallele4();
    		 ArrayList<String> list1 = new ArrayList<>(Arrays.asList(ele1, ele2, ele3,ele4));
    	     ArrayList<String> list2 = new ArrayList<>(Arrays.asList(num1,num2,num3,num4));
    	     if (list1.containsAll(list2) == true) {
    	         System.out.println(" Array List are equal");
    	     }
    	     else
    	     // else block execute when
    	     // ArrayList are not equal
    	     {
    	         System.out.println(" Array List are not equal  and table not visible");
    	     }
    	     
     }
    	     
    	     public void clickonrequiredclient(WebDriver driver,String clientname)
 			{
    	    driver.findElement(By.xpath("//tbody//tr//td[.='"+clientname+"']/following-sibling::td//a")).click();
    	    }
    	     
    	     
    	     public void checkingdata(WebDriver driver,String month, String fine, String amount, String due)
    	     {
    	    	 List<WebElement> list1 = driver.findElements(By.xpath("//table/tbody//tr[last()]//td"));
    	    		ArrayList<String> arry=new ArrayList<String>();
    	    		for (WebElement ele : list1) {
    	    			arry.add(ele.getText());
    	    		}
    	    		Assert.assertTrue(arry.contains(month) && arry.contains(fine) && arry.contains(amount) && arry.contains(due));
    	     }

    	     
    	     
    	     
    	     
}

