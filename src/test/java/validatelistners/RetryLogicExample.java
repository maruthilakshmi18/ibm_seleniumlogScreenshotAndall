package validatelistners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogicExample implements IRetryAnalyzer{

	int count=0;
	int RetryCount=2;
	

	public boolean retry(ITestResult Result) {
		
		if(count < RetryCount) {
			count++;
			return true;
		}
		
		
			return false;
		
		
	}
}
