package org.Zurich.LifeInsurenceObjectRepositery;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Common_page
{
	WebDriver driver;
	// there are three stages in the pom
	// 1. declaration
	// 2.initialization
	// 3.Business directory

	// Step1:

	@FindBy(xpath = "//a[text()='CLIENTS']")
	private WebElement client;
	
	@FindBy(xpath = "//a[text()='Add Client']")
	private WebElement addclient;
	
	@FindBy(xpath = "//a[text()='Aegon Life']")
	private  WebElement homepage;

	@FindBy(name = "key")
	private WebElement searchkeys;

	@FindBy(xpath = ("//input[@class='searchBtn']"))
	private WebElement Searchbtn;

	@FindBy(xpath = ("//a[@class='btn btn-danger']"))
	private WebElement logoutbtn;
	
	@FindBy(name = "client_id")
	private List<WebElement> client_id;
	
	@FindBy(name="client_id")
	private WebElement client_id1;
	
	@FindBy(name = "agent_id")
	private WebElement agent_id;
	
	@FindBy(name = "nominee_id")
	private WebElement nominee_id;
	
	@FindBy(xpath= ("//a[text()='Delete Client']"))
	private WebElement deletetab;
	
	@FindBy(xpath = "//a[text()='Edit Client']")
	private WebElement editclient;

	
	
	
	// Step2:
	// Constructor
	public Common_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Business directory
	public void clickonhp() {
		homepage.click();
		searchkeys.click();

	}
	public void clickonlyonhp()
	{
		homepage.click();
	}
	public void clickonsearchbtn() 
	{
		Searchbtn.click();
	}
	public void logoutapp()
	{
		logoutbtn.click();
	}
	public void clickonclient()
	{
		client.click();
		
	}
	public void clickaddclient()
	{
		addclient.click();
	}
	public String clientid()
	{
		 String ele1=client_id1.getDomProperty("value");
		return ele1;
	}
	
	public String agent_iddetails()
	{
		String ele2=agent_id.getText();
		return ele2;
	}
	public String nominee_iddetails()
	{
		String ele3=nominee_id.getText();
		return ele3;
	}
	
public  WebElement returnHome()
{
	return homepage;
}
public WebElement returnsearch()
{
	return  searchkeys;
}
public void clickonedit()
{
	editclient.click();
}
public void deletetab()
{
	deletetab.click();
}

	

}
