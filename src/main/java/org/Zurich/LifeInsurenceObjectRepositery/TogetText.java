package org.Zurich.LifeInsurenceObjectRepositery;

import org.openqa.selenium.WebDriver;


public class TogetText 
{
	protected Homepage home;
	public int getHomeclientText(WebDriver driver)
	{
		 home = new Homepage(driver);
		String s1=home.gettextofthelement();
		String s2= s1.replaceAll("[^0-9]", "");
		int n1= Integer.parseInt(s2);
		System.out.print(n1);
		return n1;
	}
	
	public int getpaymenttext(WebDriver driver)
	{
		 home = new Homepage(driver);
		String s1 = home.gettextoftheelementp();
		String s2 = s1.replaceAll("[^0-9]", "");
		int n2 = Integer.parseInt(s2);
		System.out.println(n2);
		return n2;
		
	}
	

}
