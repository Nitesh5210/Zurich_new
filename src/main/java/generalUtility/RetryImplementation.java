package generalUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
										//IretryAnalyzer is an inbulit class in testng which helps us to execute the failed testcases
public  class RetryImplementation implements IRetryAnalyzer
{
	int count;
	int maxtries=3;
	@Override
	public boolean retry(ITestResult result) {
		if (count<maxtries)
		{
			count++;
			return true;
		}
		return false;
	}
}
	
	

