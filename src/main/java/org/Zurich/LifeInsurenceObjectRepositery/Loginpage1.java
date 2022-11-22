package org.Zurich.LifeInsurenceObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1
{
		// TODO Auto-generated method stub
		//there are three stages in the pom
		//1. declaration
		//2.initialization
		//3.Business directory
		
		//Step1:
		@FindBy(xpath="//input[@type='text']")
		private WebElement Username;
		@FindBy(name="username")
		private WebElement element;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement Password;
		
		@FindBy(xpath=("//button[text()=\"login\"]"))
		private WebElement Login;
		
		//Step2:
		//Constructor
		public Loginpage1(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//Business directory
		public void user(String us, String pass)
		{
			if (element.isDisplayed()) {
				System.out.println("element is being displayed");
				element.sendKeys(us);
			}else
			{
				System.out.println("element is  not being displayed");
			}
			if (Password.isDisplayed()) {
				System.out.println("element is being displayed");
				Password.sendKeys(pass);
			}else
			{
				System.out.println("element is  not being displayed");
			}
			Login.click();
		}
		
		
		

}


