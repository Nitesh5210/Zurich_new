package org.Zurich.LifeInsurenceObjectRepositery;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printreadydata
{
	//there are three stages in the pom
	//1. declaration
	//2.initialization
	//3.Business directory
	
	//Step1:
	@FindBy(name = "client_id")
	private  List<WebElement> client_id;

	@FindBy(name = "agent_id")
	private WebElement agent_id;
	
	@FindBy(name = "nominee_id")
	private WebElement nominee_id;
	
	//Step2:
			//Constructor
			public Printreadydata(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
			
			//Step3
			//business directory
			public String printclient_id()
			{
				 String ele1 = ((WebElement) client_id).getText();
				 return ele1;
			}
			public String printagent_id()
			{
				String ele2 = agent_id.getText();
				 return ele2;
			}
			public String printnominee_id()
			{
				String ele3 = nominee_id.getText();
				 return ele3;
			}
			
			
	
	
	
	

}
