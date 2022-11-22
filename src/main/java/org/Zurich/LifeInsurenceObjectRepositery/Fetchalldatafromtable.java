package org.Zurich.LifeInsurenceObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fetchalldatafromtable {

	//there are three stages in the pom
			//1. declaration
			//2.initialization
			//3.Business directory
			
			//Step1:
	@FindBy(xpath="//tbody//tr[last()]//td[1]")
	private WebElement element1;
	@FindBy(xpath="//tbody//tr[last()]//td[2]")
	private WebElement element2;
	@FindBy(xpath="//tbody//tr[last()]//td[3]")
	private WebElement element3;
	@FindBy(xpath="//tbody//tr[last()]//td[4]")
	private WebElement element4;
	@FindBy(xpath="//tbody//tr[last()]//td[5]")
	private WebElement element5;
	@FindBy(xpath="//tbody//tr[last()]//td[6]")
	private WebElement element6;
	@FindBy(xpath="//tbody//tr[last()]//td[1]")
	private WebElement element7;
	@FindBy(xpath="//tbody//tr[last()]//td[2]")
	private WebElement element8;
	@FindBy(xpath="//tbody//tr[last()]//td[3]")
	private WebElement element9;
	@FindBy(xpath="//tbody//tr[last()]//td[4]")
	private WebElement element10;
	@FindBy(xpath="//tbody//tr[last()]//td[5]")
	private WebElement element11;
	@FindBy(xpath="//tbody//tr[last()]//td[6]")
	private WebElement element12;
	
	
	//step2: constructor
	public Fetchalldatafromtable(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step3:
	public String fetchallele1()
	{
		String tbele1 = element1.getText();
		 return tbele1;
	}
	public String fetchallele2()
	{
		String tbele2 = element2.getText();
		 return tbele2;
	}
	public String fetchallele3()
	{
		String tbele3 = element3.getText();
		 return tbele3;
	}
	public String fetchallele4()
	{
		String tbele4 = element4.getText();
		 return tbele4;
	}
	public String fetchallele5()
	{
		String tbele5 = element5.getText();
		 return tbele5;
	}
	public String fetchallele6()
	{
		String tbele6= element6.getText();
		 return tbele6;
	}
	
	
	public String fetchallele7()
	{
		String tbele1 = element7.getText();
		 return tbele1;
	}
	public String fetchallele8()
	{
		String tbele2 = element8.getText();
		 return tbele2;
	}
	public String fetchallele9()
	{
		String tbele3 = element9.getText();
		 return tbele3;
	}
	public String fetchallele10()
	{
		String tbele4 = element10.getText();
		 return tbele4;
	}
	public String fetchallele11()
	{
		String tbele5 = element11.getText();
		 return tbele5;
	}
	public String fetchallele12()
	{
		String tbele6= element12.getText();
		 return tbele6;
	}
	
	
	
	
	
	
	
	

}
