package org.Zurich.LifeInsurenceObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  Paymentadditionpage {
	
	@FindBy(xpath="//a[text()='PAYMENTS']")
	private WebElement payments;
	
	@FindBy(xpath="//a[text()='Add Payment']")
	private WebElement addpayments;
	
	@FindBy(name="client_id")
	private WebElement enterclientid;
	
	@FindBy(name="month")
	private WebElement entermonth;
	
	@FindBy(name="amount")
	private WebElement enteramount;
	
	@FindBy(name="due")
	private WebElement enterdue;
	
	@FindBy(name="fine")
	private WebElement enterfine;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbtn;
	
	
	public Paymentadditionpage(WebDriver driver)
	{
	
		PageFactory.initElements(driver,this);
	}
	
	public void paymentdetails()
	{
		payments.click();
		addpayments.click();
	}
	public void paymentaddn(String client_id,String month,String amount, String due, String fine)
	{
		enterclientid.sendKeys(client_id);
		entermonth.sendKeys(month);
		enteramount.sendKeys(amount);
		enterdue.sendKeys(due);
		enterfine.sendKeys(fine);
	}
	public void clickonsubmit()
	{
		submitbtn.click();
	}
	public void paymentaddn1(String month,String amount, String due, String fine)
	{
		entermonth.sendKeys(month);
		enteramount.sendKeys(amount);
		enterdue.sendKeys(due);
		enterfine.sendKeys(fine);
	}
	public void clickonlyonpayments()
	{
		payments.click();
	}
	public void clickonaddpayments()
	{
		addpayments.click();
	}
	
	
	
	
	
	
	
	
}
