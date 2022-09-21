package generalUtility;
import org.Zurich.LifeInsurenceObjectRepositery.Client_additionpage;
import org.Zurich.LifeInsurenceObjectRepositery.Common_page;
import org.Zurich.LifeInsurenceObjectRepositery.Fetchalldatafromtable;
import org.Zurich.LifeInsurenceObjectRepositery.Fetchtabledetails;
import org.Zurich.LifeInsurenceObjectRepositery.Homepage;
import org.Zurich.LifeInsurenceObjectRepositery.Loginpage1;
import org.Zurich.LifeInsurenceObjectRepositery.Paymentadditionpage;
import org.Zurich.LifeInsurenceObjectRepositery.TogetText;

//import java.util.List;
//import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;


public class Base_class {
	protected ExcelUtility excelutility;
	protected FileUtility fileutility;
	protected JavaUtility javautility;
	protected WebdriverUtility driverutility;
	private String Username;
	private String password;
	protected WebDriver driver;
	public Loginpage1 login;
	public Common_page common;
	protected String url;
	protected String browser;
	public String client_password;
	public String client_name;
	public String client_image;
	public String client_gender;
	public String client_dob;
	public String marital_status;
	public String client_nid;
	public String client_phone;
	public String client_address;
	public String policy_id;
	public String nominee_id;
	public String nominee_name;
	public String nominee_gender;
	public String nominee_dob;
	public String nominee_nid;
	public String relationship;
	public String priority;
	public String nominee_phno;
	public String client_edited_name;
	public String client_id;
	public String month;
	public String amount;
	public String due;
	public String fine;
	protected Client_additionpage page1;
	protected Fetchalldatafromtable page2;
	protected Fetchtabledetails page3;
	protected Homepage home;
	protected Paymentadditionpage payment;
	protected TogetText page4;
	public static WebDriver Sdriver;
	public static JavaUtility java;

	/**
	 * steps to be followed to write the baseclass part initialize all the utility
	 * class read the common data from excel launch maximize implicitlywait openapp
	 * create object for common pom object repository
	 * 
	 * 
	 */
	//@Parameters(value="browser") use this for only parallel execution and not for normal execution
	//public void setuppart(String browser)  use this particular method for parallel where browser is taking value from this particular argument
	@BeforeClass
	public void setuppart() {
		// create object for generic utility
		excelutility = new ExcelUtility();
		fileutility = new FileUtility();
		javautility = new JavaUtility();
		javautility=java;
		driverutility = new WebdriverUtility();
		page3 = new Fetchtabledetails();
		page4 = new TogetText();

		// initialize all the utility class
		// excelutility.opentheexcelfile(Iconstants.EXCEL_PATH);

		// fetch the data from excelsheet
		url = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "url");
		browser = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "browser");
		Username = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Username");
		password = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "password");
		client_password = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
				"Clientpassword");
		client_name = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Name");
		client_image = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Image");
		client_gender = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Gender");
		client_dob = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Birth_date");
		marital_status = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
				"Maritalstatus");
		client_nid = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Nid");
		client_phone = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Phone");
		client_address = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Address");
		policy_id = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Policy_id");
		nominee_id = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Nominee_id");
		nominee_name = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Nominee_name");
		nominee_gender = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
				"Nominee_gender");
		nominee_dob = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
				"Nominee_birth_date");
		nominee_nid = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Nominee_nid");
		relationship = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Relationship");
		priority = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Priority");
		nominee_phno = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
				"Nominee_Phone");
		client_edited_name = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1",
				"editedname");
		client_id = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "Client_id");
		month = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1", "month");
		amount = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH,"Lifeinsurancemanagement-1", "amount");
		due = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "due");
		fine = excelutility.excelbasedonkey(Iconstants.EXCEL_PATH, "Lifeinsurancemanagement-1", "fine");

		// launch the browser
		driver = driverutility.starttheapplication(browser, 10, url);
		Sdriver = driver;
		
		// create object for common pom object repository
		login = new Loginpage1(driver);
		common = new Common_page(driver);
		page1 = new Client_additionpage(driver);
		page2 = new Fetchalldatafromtable(driver);
		home = new Homepage(driver);
		payment = new Paymentadditionpage(driver);
		
	}

	@BeforeMethod
	public void setupmethod() {
		login.user(Username, password);
	}

	@AfterMethod
	public void methodteardown() {
		// logout from the application
		common.logoutapp();
	}

	@AfterClass
	public void classteardown() {
		// close browser
		driverutility.closethebrowser();
		// close excel
		excelutility.closetheexcel();
	}

}
