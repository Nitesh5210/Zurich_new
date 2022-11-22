package generalUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ListenerImplementation implements ITestListener
{
	private ExtentReports rep;
	private ExtentTest test;
	public static ExtentTest stest;
	@Override // @BM
	public void onTestStart(ITestResult result) {
		test=rep.createTest(result.getMethod().getMethodName()+"testcaseStarted");
		stest = test;
	}

	@Override // @AM
	public void onTestSuccess(ITestResult result) {
		test.pass(result.getMethod().getMethodName()+"pass");
	}

	@Override//@AM
	public void onTestFailure(ITestResult result) {
		WebdriverUtility driver1= new WebdriverUtility();
		test.fail(result.getMethod().getMethodName()+"failed");
		test.fail(result.getThrowable());
		System.out.println(Thread.currentThread().getId());
		String path = driver1.screenshot1(Base_class.Sdriver);
		test.addScreenCaptureFromBase64String(path);	
		//trial method
	//	driver1.Screenshot(Base_class.java,Base_class.Sdriver,result.getMethod().getMethodName());
		
	}

	@Override //@AM
	public void onTestSkipped(ITestResult result) {
		test.skip("Test1 skip");
		test.fail(result.getThrowable());	
	}
	@Override //@AM
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {	
		
	}
	@Override //@BT
	public void onStart(ITestContext context) {
	ExtentSparkReporter sp = new ExtentSparkReporter("./extentReport/extentreport.html");
	sp.config().setDocumentTitle("Document Title- Life_insurance_management");
	sp.config().setReportName("Search module part");
	sp.config().setTheme(Theme.DARK);
	rep=new ExtentReports();
	rep.attachReporter(sp);
	rep.setSystemInfo("author","DIVYASIDDAPPA");
	rep.setSystemInfo("OS","win 10");
	rep.setSystemInfo("browser","chrome");
		
	}
	@Override //@AT
	public void onFinish(ITestContext context) {
		rep.flush();//to save the report generated this flush method is compulsory
	}
}
