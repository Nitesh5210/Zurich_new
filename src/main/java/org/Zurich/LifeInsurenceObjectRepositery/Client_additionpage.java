package org.Zurich.LifeInsurenceObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client_additionpage 
{
	
	//there are three stages in the pom
	//1. declaration
	//2.initialization
	//3.Business directory
	
	//Step1:
	@FindBy(name="client_password")
	private WebElement clientpassword;
	@FindBy(name="name")
	private WebElement clientname;
	@FindBy(xpath="//input[@name='fileToUpload']")
	private WebElement clientImage;
	@FindBy(name="sex")
	private WebElement sex;
	@FindBy(name="birth_date")
	private WebElement clientdob;
	@FindBy(name="maritial_status")
	private WebElement clientmarital_status;
	@FindBy(name="nid")
	private WebElement clientnid;
	@FindBy(name="phone")
	private WebElement clientphno;
	@FindBy(name="address")
	private WebElement clientaddress;
	@FindBy(name="policy_id")
	private WebElement clientpolicy_id;
	@FindBy(name="nominee_name")
	private WebElement clientnominee;
	@FindBy(name="nominee_sex")
	private WebElement clientnominee_sex;
	@FindBy(name="nominee_birth_date")
	private WebElement clientnomineedob;
	@FindBy(name="nominee_nid")
	private WebElement nominee_nid;
	@FindBy(name="nominee_relationship")
	private WebElement nominee_relationship;
	@FindBy(name="priority")
	private WebElement client_priority;
	@FindBy(name="nominee_phone")
	private WebElement nominee_phno;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Submitbtn;
	@FindBy(xpath="//i[@class='fa fa-users ']")
	private WebElement Clientpage;
	@FindBy(name="name")
	private WebElement Clienteditname;
	@FindBy(xpath="//input[@value='UPDATE']")
	private WebElement updateclient;
	
	//Step2:
			//Constructor
	public Client_additionpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Business directory
			public void clientdetails(String pass, String client_name, String Image_address,String sexdetails, String dobdetails,String status, String nid,String ph_no,String address, String policy_id)
			{
				clientpassword.sendKeys(pass);
				clientname.sendKeys(client_name);
				clientImage.sendKeys(Image_address);
				sex.sendKeys(sexdetails);
				clientdob.sendKeys(dobdetails);
				clientmarital_status.sendKeys(status);
				clientnid.sendKeys(nid);
				clientphno.sendKeys(ph_no);
				clientaddress.sendKeys(address);
				clientpolicy_id.sendKeys(policy_id);
			}
			public void nomineedetails(String nominee_name, String nominee_sex, String nominee_dob, String nid1, String nomineerelationship, String priority, String nominee_no)
			{
				clientnominee.sendKeys(nominee_name);
				clientnominee_sex.sendKeys(nominee_sex);
				clientnomineedob.sendKeys(nominee_dob);
				nominee_nid.sendKeys(nid1);
				nominee_relationship.sendKeys(nomineerelationship);
				client_priority.sendKeys(priority);
				nominee_phno.sendKeys(nominee_no);
			
			}
			public void clickonsubmit()
			{
				Submitbtn.click();	
			}
			public void clickonclientpage()
			{
				Clientpage.click();
			}
			
			public void clientname(String name)
			{
				Clienteditname.sendKeys(name);
			}
			public void updateclient()
			{
				updateclient.click();
			}
			
			
	
	
	
	
	
	
	

}
