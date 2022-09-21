package org.Zurich.LifeInsurenceObjectRepositery;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{

	//declaration
	@FindBy(xpath="//i[@class='fa fa-user fa-5x']/following-sibling::h5")
	private WebElement  getText;
	
	@FindBy(xpath = "//i[@class='fa fa-dollar fa-5x']/following-sibling::h5")
	private WebElement paymentpagetext;
	
	
	//initialization
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String gettextofthelement()
	{
		return getText.getText();
		
	}
	
	public String gettextoftheelementp()
	{
		return paymentpagetext.getText();
	}
	
	
	
}
